$(function() {

    $('#specphoto_list')
	    .datagrid(
		    {
			url : 'admin/specphoto/list',
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
				    title : '图片名称',
				    width : 200
				},
				{
				    field : 'src',
				    title : '图片',
				    width : 100
				},
				{
				    field : 'address',
				    title : '图片路径',
				    width : 200
				},{
				    field : 'createTime',
				    title : '创建时间',
				    width : 200
				},
				{
				    field : 'catalog',
				    title : '操作',
				    width : 250,
				    formatter : function(value, rowdata,
					    rowindex) {
					return "<span class=\"iconsp icon-remove\" title=\"删除\" ></span>";
				    }
				} ] ],
			toolbar : [ {
			    id : 'add',
			    text : '添加规格',
			    iconCls : 'icon-add',
			    handler : function() {

			    }
			}, {
			    text : '删除',
			    iconCls : 'icon-remove',
			    handler : function() {

			    }
			} ]
		    });

});