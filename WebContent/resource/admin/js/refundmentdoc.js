$(function() {
    $('#refundmentdoc_list').datagrid({
	url : 'admin/refundmentdoc/list',
	fit : 'true',
	nowrap : true,
	striped : true,
	collapsible : false,
	idField : 'id',
	singleSelect : true,
	rownumbers : true,
	queryParams:{if_del:0},
	pagination:true,
	fitColumns:true,
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
	    field : 'orderno',
	    title : '订单号',
	    width : 200
	},{
	    field : 'amount',
	    title : '退款原因',
	    width : 200
	},{
	    field : 'amount',
	    title : '退款类型',
	    width : 200
	},
	{
	    field : 'amount',
	    title : '退款状态',
	    width : 200
	},
	{
	    field : 'amount',
	    title : '申请时间',
	    width : 200
	},
	{
	    field : 'id',
	    title : '操作',
	    width : 200,
	    formatter : function(val, rowdata, rowindex) {
		return "<span class=\"iconsp icon-edit\" title=\"编辑\" ></span><span class=\"iconsp icon-remove\" title=\"删除\" ></span>";
	    }
	}] ],
    });
});