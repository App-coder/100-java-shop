$(function() {
    $('#usergroup_list').datagrid({
	url : 'admin/usergroup/list',
	fit : 'true',
	nowrap : false,
	striped : true,
	method : 'get',
	collapsible : false,
	idField : 'id',
	singleSelect : true,
	rownumbers : true,
	pagination : true,
	toolbar : [ {
	    id : 'add',
	    text : '添加用户组',
	    iconCls : 'icon-add',
	    handler : function() {

	    }
	}, {
	    id : 'delete',
	    text : '删除',
	    iconCls : 'icon-remove',
	    handler : function() {

	    }
	} ],
	columns : [ [ {
	    field : 'groupName',
	    title : '会员组',
	    width : 200
	}, {
	    field : 'discount',
	    title : '折扣率',
	    width : 250
	}, {
	    field : 'minexp',
	    title : '最小经验',
	    width : 250
	}, {
	    field : 'maxexp',
	    title : '最大经验',
	    width : 250
	},{
	    field : 'id',
	    title : '操作',
	    width : 200,
	    formatter : function(val, rowdata, rowindex) {
		return "<span class=\"iconsp icon-edit\" title=\"编辑\" ></span><span class=\"iconsp icon-remove\" title=\"删除\" ></span>";
	    }
	} ] ]
    });
});