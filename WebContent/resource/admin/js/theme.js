$(function(){
	//导航设置
	$('#theme_list').datagrid({
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
			text:'添加主题',
			iconCls:'icon-add',
			handler:function(){
				
			}
		},
		{
			id:'update',
			text:'设置主题',
			iconCls:'icon-edit',
			handler:function(){
				
			}
		},{
			id:'update',
			text:'预览主题',
			handler:function(){
				
			}
		}
		],
		columns:[[
			{field:'name',title:'名称',width:200},
			{field:'link',title:'目录',width:250},
			{field:'operation',title:'描述',width:200,formatter:function(val,rowdata,rowindex){
				 return "<a class=\"green\" onclick=\"up("+rowindex+")\" >上移</a>&nbsp;&nbsp;<a class=\"green\" onclick=\"down("+rowindex+")\">下移</a>&nbsp;&nbsp;<a class=\"red\" onclick=\"deleteGuide("+rowdata.order+",'"+rowdata.name+"')\">删除</a>";
			}}
		]],
	});
});