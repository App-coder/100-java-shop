$(function() {

    $('#helpcategory_list')
	    .datagrid(
		    {
			url : 'admin/helpcategory/list',
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
				    title : '分类名称',
				    width : 200
				},
				{
				    field : 'position_foot',
				    title : '页面底部显示',
				    width : 200
				},
				{
				    field : 'position_left',
				    title : '帮助页左侧显示',
				    width : 100

				},
				{
				    field : 'currentTheme',
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
			}]
		    });

});