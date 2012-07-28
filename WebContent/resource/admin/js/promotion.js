$(function() {
    $('#promotion_list').datagrid({
	url : 'admin/promotion/list',
	fit : 'true',
	nowrap : true,
	striped : true,
	collapsible : false,
	idField : 'id',
	singleSelect : true,
	rownumbers : true,
	pagination:true,
	fitColumns:true,
	queryParams:{type:0},
	toolbar : [ {
	    text : '预览',
	    iconCls:'icon-view',
	    handler : function() {

	    }
	}],
	frozenColumns : [[{
		field : 'ck',
		checkbox : true
	}]],
	columns : [ [ {
	    field : 'name',
	    title : '名称',
	    width : 200
	},{
	    field : 'name',
	    title : '活动时间',
	    width : 200
	},
	{
	    field : 'name',
	    title : '状态',
	    width : 200
	},
	{
	    field : 'name',
	    title : '介绍',
	    width : 200
	},
	{
	    field : 'id',
	    title : '操作',
	    width : 200,
	    formatter : function(val, rowdata, rowindex) {
		return "<span class=\"iconsp icon-edit\" title=\"编辑\" ></span><span class=\"iconsp icon-remove\" title=\"删除\" ></span>";
	    }
	}] ]
    });
});