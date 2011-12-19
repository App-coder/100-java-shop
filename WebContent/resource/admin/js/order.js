$(function() {
    $('#order_list').datagrid({
	url : 'admin/order/filter',
	fit : 'true',
	nowrap : true,
	striped : true,
	collapsible : false,
	idField : 'id',
	singleSelect : true,
	rownumbers : true,
	pagination:true,
	fitColumns:true,
	queryParams:{pay_status:0,distribution_status:0,status:0,if_del:0},
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
	    field : 'orderNo',
	    title : '订单号',
	    width : 180
	},{
	    field : 'accept_name',
	    title : '收货人',
	    width : 120
	},
	{
	    field : 'pay_status',
	    title : '支付状态',
	    width : 100
	},
	{
	    field : 'distribution_status',
	    title : '发货状态',
	    width : 100
	},
	{
	    field : 'dname',
	    title : '配送方式',
	    width : 100
	},
	{
	    field : 'ifPrint',
	    title : '打印',
	    width : 100
	},
	{
	    field : 'pname',
	    title : '支付方式',
	    width : 100
	},
	{
	    field : 'username',
	    title : '用户名',
	    width : 100
	},
	{
	    field : 'createTime',
	    title : '下单时间',
	    width : 100
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