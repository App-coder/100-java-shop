$(function() {
    $('#collectiondoc_list').datagrid({
	url : 'admin/collectiondoc/list',
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
	    title : '收款金额',
	    width : 200
	},
	{
	    field : 'truename',
	    title : '付款人',
	    width : 200
	},{
	    field : 'pname',
	    title : '支付方式',
	    width : 200
	},{
	    field : 'collectionAccount',
	    title : '收款帐号',
	    width : 200
	},{
	    field : 'payStatus',
	    title : '支付状态',
	    width : 200
	},{
	    field : 'time',
	    title : '完成时间',
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