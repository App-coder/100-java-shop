$(function() {

    $('#spec_list')
	    .datagrid(
		    {
			url : 'admin/spec/list',
			fit : 'true',
			nowrap : true,
			method : 'get',
			striped : true,
			singleSelect : true,
			rownumbers : true,
			idField : 'id',
			pagination : true,
			queryParams : {
			    isdel : 0
			},
			frozenColumns : [ [ {
			    field : 'ck',
			    checkbox : true
			} ] ],
			columns : [ [
				{
				    field : 'name',
				    title : '规格名称',
				    width : 150
				},
				{
				    field : 'type',
				    title : '显示方式',
				    width : 100
				},
				{
				    field : 'value',
				    title : '规格数据',
				    width : 350
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
			    text : '添加规格',
			    iconCls : 'icon-add',
			    handler : function() {
				$("#spec_add").window("open");
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