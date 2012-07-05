$(function() {

    $('#help_list')
	    .datagrid(
		    {
			url : 'admin/help/list',
			fit : 'true',
			nowrap : false,
			method : 'get',
			striped : true,
			singleSelect : true,
			rownumbers : true,
			idField : 'id',
			pagination : true,
			frozenColumns : [ [ {
			    field : 'ck',
			    checkbox : true
			} ] ],
			columns : [ [
				{
				    field : 'name',
				    title : '标题',
				    width : 200
				},
				{
				    field : 'categoryname',
				    title : '帮助分类',
				    width : 200
				},
				{
				    field : 'sort',
				    title : '排序',
				    width : 100

				},
				{
				    field : 'id',
				    title : '操作',
				    width : 200,
				    formatter : function(val, rowdata, rowindex) {
					return "<span class=\"iconsp icon-edit\" title=\"同步\" ></span><span class=\"iconsp icon-remove\" title=\"删除\" ></span>";
				    }
				} ] ],
			toolbar : [ {
			    id : 'add',
			    text : '添加分类',
			    iconCls : 'icon-add',
			    handler : function() {

			    }
			},{
			    id : 'delete',
			    text : '删除',
			    iconCls : 'icon-remove',
			    handler : function() {

			    }
			}]
		    });

});