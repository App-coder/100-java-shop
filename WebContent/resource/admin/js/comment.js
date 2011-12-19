$(function() {
    $('#comment_list').datagrid({
	url : 'admin/comment/filter',
	fit : 'true',
	nowrap : true,
	striped : true,
	collapsible : false,
	idField : 'order',
	singleSelect : true,
	rownumbers : true,
	pagination:true,
	toolbar : [ {
	    id : 'delete',
	    text : '预览',
	    handler : function() {

	    }
	}, {
	    id : 'delete',
	    text : '删除',
	    handler : function() {

	    }
	} ],
	columns : [ [ {
	    field : 'username',
	    title : '评价人',
	    width : 200
	}, {
	    field : 'goodsname',
	    title : '评价商品',
	    width : 200
	}, {
	    field : 'time',
	    title : '评价时间',
	    width : 200
	},{
	    field : 'id',
	    title : '操作',
	    width : 200,
	    formatter : function(val, rowdata, rowindex) {
		return "<span class=\"iconsp icon-edit\" title=\"编辑\" ></span><span class=\"iconsp icon-remove\" title=\"删除\" ></span>";
	    }
	} ] ],
    });
});