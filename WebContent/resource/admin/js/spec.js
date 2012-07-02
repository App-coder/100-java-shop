$(function() {

    $('#spec_list')
	    .datagrid(
		    {
			url : 'admin/spec/list',
			fit : 'true',
			nowrap : false,
			method : 'get',
			striped : true,
			singleSelect : true,
			rownumbers : true,
			idField : 'id',
			pagination : true,
			queryParams:{isdel:0},
			frozenColumns : [ [ {
			    field : 'ck',
			    checkbox : true
			} ] ],
			columns : [ [
				{
				    field : 'name',
				    title : '规格名称',
				    width : 200
				},
				{
				    field : 'type',
				    title : '显示方式',
				    width : 200
				},
				{
				    field : 'value',
				    title : '规格数据',
				    width : 200
				},
				{
				    field : 'catalog',
				    title : '操作',
				    width : 250,
				    formatter : function(value, rowdata,
					    rowindex) {
					return "<span class=\"iconsp icon-edit\" title=\"修改\" ></span><span class=\"iconsp icon-remove\" title=\"删除\" ></span>";
				    }
				} ] ],
			toolbar : [ {
			    id : 'add',
			    text : '添加模型',
			    iconCls : 'icon-add',
			    handler : function() {

			    }
			}, {
			    text : '删除',
			    iconCls : 'icon-remove',
			    handler : function() {

			    }
			}, {
			    text : '回收站',
			    iconCls : 'icon-recycle',
			    handler : function() {

			    }
			} ]
		    });

});