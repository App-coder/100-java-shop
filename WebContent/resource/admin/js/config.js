$(function() {
	$('#form_config_basic').form({
		url : "admin/config/config_basic_do",
		onSubmit : function() {
			if($('#form_config_basic').form("validate")){
				return true;
			}else{
				return false;
			}
		},
		success : function(data) {
			try{
				data = eval("(" + data + ")");
				if(data.type=="true"){
					top.success(data.message);
					$("#logo").attr("src",$("#logo").attr("src")+"?"+rdnum);
				}else{
					top.error(data.message);
				}
			}catch(e){
				top.error('系统异常，上传文件太大！最大为4M！');
			}
		}
	});
	
	//导航设置
	$('#guidelist').datagrid({
		url:'admin/guide/loadAll',
		fit:'true',
		nowrap: false,
		striped: true,
		collapsible:false,
		idField:'order',
        singleSelect:true,
        rownumbers:true,
        toolbar:[{
			id:'add',
			text:'添加导航',
			iconCls:'icon-add',
			handler:function(){
				$("#config_guide").window({
					onOpen:function(){
						$("#form_config_guide").find("input[name=action]").val("add");
					},
					onClose:function(){
						$("#form_config_guide").find("input[name=name]").val("");
						$("#form_config_guide").find("input[name=name]").val("");
						$("#form_config_guide").find("input[name=link]").val("");
					}
				});
				$("#config_guide").window("open");
			}
		},
		{
			id:'update',
			text:'修改导航',
			iconCls:'icon-edit',
			handler:function(){
				
				var selected = $('#guidelist').datagrid('getSelected');
				if(selected){
					
					$("#form_config_guide").find("input[name=order]").val(selected.order);
					$("#form_config_guide").find("input[name=name]").val(selected.name);
					$("#form_config_guide").find("input[name=link]").val(selected.link);
					
					$("#config_guide").window({
						onOpen:function(){
							$("#form_config_guide").find("input[name=action]").val("update");
						}
					});
					$("#config_guide").window("open");
					
					
				}else{
					message("请选择一行记录！");
				}
				
			}
		}
		],
		columns:[[
			{field:'name',title:'名称',width:200},
			{field:'link',title:'链接地址',width:250},
			{field:'operation',title:'操作',width:200,formatter:function(val,rowdata,rowindex){
				 return "<a class=\"green\" onclick=\"up("+rowindex+")\" >上移</a>&nbsp;&nbsp;<a class=\"green\" onclick=\"down("+rowindex+")\">下移</a>&nbsp;&nbsp;<a class=\"red\" onclick=\"deleteGuide("+rowdata.order+",'"+rowdata.name+"')\">删除</a>";
			}}
		]],
	});
	
	$('#form_config_guide').form({
		url:"admin/guide/config_guide_do",
		onSubmit : function() {
			if($('#form_config_guide').form("validate")){
				return true;
			}else{
				return false;
			}
		},
		success : function(data) {
			try{
				data = eval("(" + data + ")");
				if(data.type=="true"){
					closeWin('config_guide');
					$("#guidelist").datagrid('reload')
				}else{
					error(data.message);
				}
			}catch(e){
				exception();
			}
			
		}
	});
	

	//幻灯片列表
	$('#config_indexSlide').datagrid({
		fit:'true',
		nowrap: false,
		striped: true,
		collapsible:false,
		idField:'order',
        singleSelect:true,
        rownumbers:true,
        toolbar:[{
			id:'add',
			text:'添加幻灯',
			iconCls:'icon-add',
			handler:function(){
				$("#wind_config_indexSlide").window("open");
			}
		},
		{
			id:'update',
			text:'修改幻灯',
			iconCls:'icon-edit',
			handler:function(){
				
				var selected = $('#config_indexSlide').datagrid('getSelected');
				if(selected){
					
				}else{
					message("请选择一行记录！");
				}
				
			}
		}
		],
		columns:[[
			{field:'title',title:'名称',width:200},
			{field:'url',title:'链接地址',width:250},
			{field:'image',title:'图片文件',width:250},
			{field:'operation',title:'操作',width:200,formatter:function(val,rowdata,rowindex){
				 return "<a class=\"green\" onclick=\"up("+rowindex+")\" >上移</a>&nbsp;&nbsp;<a class=\"green\" onclick=\"down("+rowindex+")\">下移</a>&nbsp;&nbsp;<a class=\"red\" onclick=\"deleteGuide("+rowdata.order+","+rowdata.name+")\">删除</a>";
			}}
		]],
	});
	
	
	$("#form_config_indexSlide").form({
		url:"admin/guide/config_guide_do",
		onSubmit : function() {
			if($('#form_config_indexSlide').form("validate")){
				return true;
			}else{
				return false;
			}
		},
		success : function(data) {
			
		}
	});
	
	
	
	
	
	
	
	
	
	
	
	
});

//基本配置
function config_basic_submit(){
	$('#form_config_basic').submit();
}

//导航设置
//添加修改导航
function config_guide(){
	$('#form_config_guide').submit();
}
function deleteGuide(order,name){
	top.confirm('确定删除导航：'+name,function(b){
		if(b){
			$.post('admin/guide/deleteGuide',{order:order},function(data){
				if(data.type == 'true'){
					$('#guidelist').datagrid("reload")
				}
			},'json');
		}
	});
}
function up(rowindex){
	if(rowindex!=0){
		//进行上移
		$.post('admin/guide/updateOrder',{order:rowindex,neworder:rowindex-1},function(data){
			if(data.type == 'true'){
				$('#guidelist').datagrid("reload");
			}
		},'json');
	}
}
function down(rowindex){
	var rows = $('#guidelist').datagrid("getRows");
	if(rowindex!=rows.length-1){
		$.post('admin/guide/updateOrder',{order:rowindex,neworder:rowindex+1},function(data){
			if(data.type == 'true'){
				$('#guidelist').datagrid("reload");
			}
		},'json');
	}
}
