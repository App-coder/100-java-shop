$(function() {
    $('#brandcategory_list').datagrid({
	url : 'admin/brandcategory/list',
	fit : 'true',
	method:'get',
	nowrap : false,
	striped : true,
	collapsible : false,
	idField : 'id',
	singleSelect : true,
	rownumbers : true,
	toolbar : [ {
	    text : '添加',
	    iconCls : 'icon-add',
	    handler : function() {

		$("#brandcategory_add").window("open");
		
	    }
	} ],
	columns : [ [ {
	    field : 'name',
	    title : '名称',
	    width : 250
	}, {
	    field : 'id',
	    title : '操作',
	    width : 250,
	    formatter:function(value,rowdata,rowindex){
		return "<span class=\"iconsp icon-edit\" title=\"修改\" ></span><span class=\"iconsp icon-remove\" title=\"删除\" ></span>";
	    }
	} ] ],
    });
});