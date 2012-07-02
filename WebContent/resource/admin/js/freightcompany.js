$(function() {
    $('#freightcompany_list').datagrid({
	url : 'admin/freightcompany/list',
	fit : 'true',
	nowrap : true,
	striped : true,
	collapsible : false,
	idField : 'id',
	singleSelect : true,
	rownumbers : true,
	queryParams:{isdel:0},
	frozenColumns : [[{
		field : 'ck',
		checkbox : true
	}]],
	toolbar : [ {
	    id : 'add',
	    text : '添加物流公司',
	    iconCls : 'icon-add',
	    handler : function() {

	    }
	}, {
	    id : 'recyclebin',
	    text : '回收站',
	    iconCls : 'icon-recycle',
	    handler : function() {

	    }
	} ],
	columns : [ [ {
	    field : 'freightName',
	    title : '物流名称',
	    width : 200
	}, {
	    field : 'url',
	    title : 'URL网址',
	    width : 250
	} ,{
	    field : 'id',
	    title : '操作',
	    width : 200,
	    formatter:function(value,rowdata,rowindex){
		return "<span class=\"iconsp icon-edit\" title=\"修改\" ></span><span class=\"iconsp icon-remove\" title=\"删除\" ></span>";
	    }
	} ] ],
    });
});