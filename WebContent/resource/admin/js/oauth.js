$(function(){
	$('#oauth_list').datagrid({
	    url:'admin/oauth/list',
		fit:'true',
		nowrap: false,
		striped: true,
		collapsible:false,
		idField:'order',
        singleSelect:true,
        rownumbers:true,
        toolbar:[
		{
			id:'update',
			text:'配置',
			iconCls:'icon-edit',
			handler:function(){
				
				var selected = $('#oauth_list').datagrid('getSelected');
				if(selected){
					
				}else{
					message("请选择一行记录！");
				}
				
			}
		}
		],
		columns:[[
			{field:'logo',title:'图标',width:200,
				formatter:function(value,rowdata,rowindex){
					return '<img src="resource/plugins/'+value+'" width="20" height="20"/>';
				}	
			},
			{field:'name',title:'名称',width:250},
			{field:'description',title:'描述',width:250},
			{field:'isClose',title:'开启状态',width:250,
				formatter:function(value,rowdata,rowindex){
					if(value==1){
						return "<span class=\"iconsp icon-ok\" ></span>";
					}else{
						return "<span class=\"iconsp icon-stop\" ></span>";
					}
				}		
			}
		]],
	});
});