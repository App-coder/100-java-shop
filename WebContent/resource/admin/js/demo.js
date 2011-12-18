$(function() {
    $('#demo_list').datagrid({
	url : '',
	fit : 'true',
	nowrap : true,
	striped : true,
	collapsible : false,
	idField : 'id',
	singleSelect : true,
	rownumbers : true,
	toolbar : [ {
	    text : '预览',
	    iconCls:'icon-view',
	    handler : function() {

	    }
	}],
	columns : [ [ {
	    field : 'name',
	    title : '姓名',
	    width : 200
	}] ],
    });
});