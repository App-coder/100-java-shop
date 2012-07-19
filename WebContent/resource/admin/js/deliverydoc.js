$(function() {
    $('#deliverydoc_list').datagrid({
	url : 'admin/deliverydoc/list',
	fit : 'true',
	nowrap : true,
	striped : true,
	collapsible : false,
	idField : 'id',
	singleSelect : true,
	rownumbers : true,
	pagination:true,
	fitColumns:true,
	queryParams:{if_del:0},
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
	}, {
	    field : 'name',
	    title : '收货人',
	    width : 100
	},{
	    field : 'deliveryCode',
	    title : '物流单号',
	    width : 150
	},{
	    field : 'pname',
	    title : '物流公司',
	    width : 120
	},{
	    field : 'freight',
	    title : '运费',
	    width : 100
	},{
	    field : 'username',
	    title : '会员名',
	    width : 120
	},{
	    field : 'time',
	    title : '完成时间',
	    width :120
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