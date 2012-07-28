$(function() {
    $('#merchshipinfo_list').datagrid({
	url : 'admin/merchshipinfo/list',
	fit : 'true',
	nowrap : true,
	striped : true,
	collapsible : false,
	idField : 'id',
	singleSelect : true,
	rownumbers : true,
	pagination:true,
	fitColumns:true,
	queryParams:{if_del:1},
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
	    field : 'shipName',
	    title : '发货点',
	    width : 200
	}, {
	    field : 'area',
	    title : '地区',
	    width : 100
	}, {
	    field : 'address',
	    title : '地址',
	    width : 200
	}, {
	    field : 'postcode',
	    title : '邮编',
	    width : 100
	}, {
	    field : 'telphone',
	    title : '电话',
	    width : 100
	}, {
	    field : 'shipUserName',
	    title : '发货人',
	    width : 100
	}, {
	    field : 'name',
	    title : '默认',
	    width : 80
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