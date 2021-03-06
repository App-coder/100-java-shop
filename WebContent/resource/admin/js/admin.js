$(function() {
    $('#adminlist').datagrid({
	url : 'admin/admin/list',
	fit : 'true',
	nowrap : false,
	striped : true,
	collapsible : true,
	idField : 'id',
	rownumbers : true,
	frozenColumns : [ [ {
	    field : 'id',
	    checkbox : true
	} ] ],
	columns : [ [ {
	    field : 'adminName',
	    title : '用户',
	    width : 200
	}, {
	    field : 'roleName',
	    title : '角色',
	    width : 200
	}, {
	    field : 'email',
	    title : 'Email',
	    width : 150
	}, {
	    field : 'lastIp',
	    title : '上次登入IP',
	    width : 100
	}, {
	    field : 'lastTime',
	    title : '上次登入时间',
	    width : 200
	} ] ],
	toolbar : [ {
	    text : '添加管理员',
	    iconCls : 'icon-add',
	    handler : function() {
		$("#admin_add").window({});
		$("#admin_add").window("open");
	    }
	}, {
	    text : '修改',
	    iconCls : 'icon-edit',
	    handler : function() {

	    }
	}, {
	    text : '删除',
	    iconCls : 'icon-cut',
	    handler : function() {
	    }
	}, {
	    text : '回收站',
	    handler : function() {

	    }
	} ]
    });
});