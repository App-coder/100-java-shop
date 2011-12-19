$(function() {
    $('#emailregistry_list').datagrid({
	url : 'admin/emailregistry/list',
	fit : 'true',
	nowrap : true,
	striped : true,
	collapsible : false,
	idField : 'id',
	rownumbers : true,
	pagination:true,
	toolbar : [ {
	    text : '删除',
	    iconCls:'icon-remove',
	    handler : function() {

	    }
	}],
	frozenColumns : [[{
		field : 'ck',
		checkbox : true
	}]],
	columns : [ [ {
	    field : 'email',
	    title : 'Email',
	    width : 200
	}] ],
    });
});