$(function() {
    $('#notifyregistry_list').datagrid({
	url : 'admin/notifyregistry/list',
	fit : 'true',
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
	    field : 'goodsname',
	    title : '缺货商品名称',
	    width : 200
	},{
	    field : 'storenums',
	    title : '库存',
	    width : 50
	},{
	    field : 'email',
	    title : 'Email',
	    width : 200
	},{
	    field : 'registerTime',
	    title : '登记时间',
	    width : 140
	},{
	    field : 'notifyTime',
	    title : '通知时间',
	    width : 140
	},{
	    field : 'notifyStatus',
	    title : '通知状态',
	    width : 140
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