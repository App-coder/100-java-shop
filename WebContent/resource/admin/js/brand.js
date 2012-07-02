$(function() {
    
    $('#brand_list').datagrid({
	url : 'admin/brand/list',
	fit : 'true',
	method:'get',
	nowrap : false,
	striped : true,
	collapsible : false,
	idField : 'id',
	singleSelect : true,
	rownumbers : true,
	pagination:true,
	toolbar : [ {
	    text : '添加品牌',
	    iconCls : 'icon-add',
	    handler : function() {

		var selected = $('#brand_list').datagrid('getSelected');
		if (selected) {

		} else {
		    message("请选择一行记录！");
		}

	    }
	} ],
	columns : [ [ {
	    field : 'name',
	    title : '品牌名称',
	    width : 250
	},{
	    field : 'url',
	    title : '网址',
	    width : 250
	},{
	    field : 'categoryname',
	    title : '品牌分类',
	    width : 200
	},{
	    field : 'sort',
	    title : '排序',
	    width : 100
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