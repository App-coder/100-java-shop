$(function() {
    
	$('#model_list').datagrid({
		url : 'admin/model/list',
		fit : 'true',
		nowrap : false,
		method : 'get',
		striped : true,
		singleSelect : true,
		rownumbers : true,
		idField : 'id',
		pagination:true,
		frozenColumns : [[{
			field : 'ck',
			checkbox : true
		}]],
		columns : [[{
			field : 'name',
			title : '模型名称',
			width : 200
		}, {
			field : 'catalog',
			title : '操作',
			width : 250,
			formatter:function(value,rowdata,rowindex){
				return "<span class=\"iconsp icon-edit\" title=\"修改\" ></span><span class=\"iconsp icon-remove\" title=\"删除\" ></span>";
			}
		}]],
		toolbar : [{
			id : 'add',
			text : '添加模型',
			iconCls : 'icon-add',
			handler : function() {

			}
		}, {
			text : '删除',
			iconCls : 'icon-remove',
			handler : function() {
			    
			}
		}]
	});
    
});