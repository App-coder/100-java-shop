$(function() {
    
    $('#search_list')
    .datagrid(
	    {
		url : 'admin/search/list',
		fit : 'true',
		nowrap : true,
		method : 'get',
		striped : true,
		singleSelect : true,
		rownumbers : true,
		idField : 'id',
		queryParams : {
		    isdel : 0
		},
		frozenColumns : [ [ {
		    field : 'ck',
		    checkbox : true
		} ] ],
		columns : [ [
			{
			    field : 'keyword',
			    title : '搜索关键字',
			    width : 150
			},
			{
			    field : 'num',
			    title : '统计次数',
			    width : 100
			} ] ],
		toolbar : [ {
		    text : '删除',
		    iconCls : 'icon-remove',
		    handler : function() {

		    }
		} ]
	    });
    
});