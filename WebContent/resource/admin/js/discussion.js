$(function() {
    $('#discussion_list').datagrid({
	url : 'admin/discussion/filter',
	fit : 'true',
	method:'post',
	nowrap : true,
	striped : true,
	collapsible : false,
	idField : 'id',
	singleSelect : true,
	rownumbers : true,
	pagination:true,
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
	    field : 'username',
	    title : '讨论人',
	    width : 200
	},{
	    field : 'goodsname',
	    title : '讨论商品',
	    width : 200
	},{
	    field : 'time',
	    title : '讨论时间',
	    width : 200
	},{
	    field : 'id',
	    title : '操作',
	    width : 200,
	    formatter : function(val, rowdata, rowindex) {
		return "<span class=\"iconsp icon-edit\" title=\"编辑\" ></span><span class=\"iconsp icon-remove\" title=\"删除\" ></span>";
	    }
	}] ],
    });
});