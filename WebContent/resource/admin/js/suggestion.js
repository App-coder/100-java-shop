$(function() {
    
$('#suggestion_list').datagrid({
	url : 'admin/suggestion/list',
	fit : 'true',
	nowrap : true,
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
		field : 'username',
		title : '建议人',
		width : 200
	}, {
		field : 'content',
		title : '建议内容',
		width : 200
	},  {
		field : 'time',
		title : '添加时间',
		width : 200
	},{
	    field : 'id',
	    title : '操作',
	    width : 200,
	    formatter : function(val, rowdata, rowindex) {
		return "<span class=\"iconsp icon-edit\" title=\"编辑\" ></span><span class=\"iconsp icon-remove\" title=\"删除\" ></span>";
	    }
	}]],
	toolbar : [ {
		text : '删除',
		iconCls : 'icon-remove',
		handler : function() {
		    
		}
	}]
});   
    
    
});