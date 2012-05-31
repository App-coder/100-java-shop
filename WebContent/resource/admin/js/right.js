$(function(){
	$('#rightlist').treegrid({
		url:'admin/right/list',
		method:'get',
		nowrap: false,
		striped: true,
		collapsible:true,
		idField:'id',
		treeField:'name',
		fitColumns:true,
        frozenColumns:[[
          {field:'id',checkbox:true}
    	]],
		columns:[[
			{field:'name',title:'名称',width:200},
			{field:'right',title:'权限URL',width:200},
			{field:'sno',title:'排序ID',width:200}
		]],
		toolbar:[
		{
			text:'添加主权限',
			iconCls:'icon-add',
			handler:function(){
				$("#wind_add_right").window({title:"添加主权限"});
				$("#wind_add_right").window("open");
				
			}
		},
		{
			text:'添加子权限',
			iconCls:'icon-edit',
			handler:function(){
				$("#wind_add_right").window({title:"添加子权限"});
				$("#wind_add_right").window("open");
			}
		},
		{
			text:'修改',
			iconCls:'icon-edit',
			handler:function(){
				
			}
		},
		{
			text:'删除',
			iconCls:'icon-cut',
			handler:function(){
				
			}
		}
		]
	});
});