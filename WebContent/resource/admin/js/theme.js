$(function(){
	
	//主题设置
	$('#theme_list').datagrid({
		url:'admin/theme/list',
		fit:'true',
		nowrap: false,
		method:'get',
		striped: true,
        singleSelect:true,
        rownumbers:true,
		idField:'id',
        toolbar:[{
			id:'add',
			text:'添加主题',
			iconCls:'icon-add',
			handler:function(){
				
//				$("#wind_theme_edit").window({title:"添加主题"});
				$("#theme_Edit").window("open");
			}
		},
		{
			id:'update',
			text:'修改主题',
			iconCls:'icon-edit',
			handler:function(){
				//修改
				var selected = $('#theme_list').datagrid('getSelected');
				if(selected){
					
					$("#form_theme_edit").find("input[name=id]").val(selected.id);
					$("#form_theme_edit").find("input[name=name]").val(selected.name);
					$("#form_theme_edit").find("input[name=catalog]").val(selected.catalog);
					$("#form_theme_edit").find("input[name=description]").val(selected.description);
					
					$("#theme_Edit").window({title:"修改主题",
						onClose:function(){
							$("#form_theme_edit").find("input[name=id]").val("");
							$("#form_theme_edit").find("input[name=name]").val("");
							$("#form_theme_edit").find("input[name=catalog]").val("");
							$("#form_theme_edit").find("input[name=description]").val("");
							
							
						}	
					});
					$("#theme_Edit").window("open");
					
				}else{
					message("请选择一行记录！");
				}
			}
		},{
			id:'config',
			text:'设置主题',
			iconCls:'icon-save',
			handler:function(){
				var selected = $('#theme_list').datagrid('getSelected');
				if(selected){
					
					$.get('admin/theme/cfg_theme',{theme:selected.name},function(data){
						if(data.type == 'true'){
							$('#theme_list').datagrid("reload")
							message("主题设置成功！");
						}
					},'json');
					
				}else{
					message("请选择一行记录！");
				}
			}
		},{
            text:'删除',
            iconCls:'icon-remove',
            handler:function(){
            	var selected = $('#theme_list').datagrid('getSelected');
				if(selected){
					
					confirm('确定删除主题：'+selected.name,function(b){
						if(b){
							$.get('admin/theme/delete',{id:selected.id},function(data){
								if(data.type == 'true'){
									$('#theme_list').datagrid("reload")
								}
							},'json');
						}
					});
					
				}else{
					message("请选择一行记录！");
				}
            }
        }
		],
		frozenColumns:[[
		    {field:'ck',checkbox:true}
		]],
		columns:[[
			{field:'name',title:'名称',width:200},
			{field:'catalog',title:'目录',width:250},
			{field:'description',title:'描述',width:250}
		]],
	});
	
	
	//主题添加
	$('#form_theme_edit').form({
		url : "admin/theme/config_theme_do",
		onSubmit : function() {
			if($('#form_theme_edit').form("validate")){
				return true;
			}else{
				return false;
			}
		},
		success : function(data) {
			try{
				data = eval("(" + data + ")");
				if(data.type=="true"){
					closeWin('theme_Edit');
					$("#theme_list").datagrid('reload')
				}else{
					error(data.message);
				}
			}catch(e){
				exception();
			}
		}
	});
	
	
});

