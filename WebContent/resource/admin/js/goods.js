$(function(){
    $('#goods_list').datagrid({
	url : 'admin/goods/filter',
	fit : 'true',
	nowrap : false,
	striped : true,
	collapsible : true,
	idField : 'id',
	rownumbers : true,
	queryParams:{categoryid:0,isdel:0,storenums:0,commend:0},
	pagination:true,
	frozenColumns : [ [ {
	    field : 'ck',
	    checkbox : true
	} ] ],
	columns : [ [ {
	    title : '商品名称',
	    field : 'name',
	    width : 200
	}, {
	    title : '分类',
	    field : '',
	    width : 100
	}, {
	    title : '销售价',
	    field : 'selltPrice',
	    width : 80
	}, {
	    title : '库存',
	    field : 'storeNums',
	    width : 80
	}, {
	    title : '上架',
	    field : '',
	    width : 80
	}, {
	    title : '市场价',
	    field : 'marketPrice',
	    width : 80
	}, {
	    title : '品牌',
	    field : '',
	    width : 200
	}, {
	    title : '重量',
	    field : 'weight',
	    width : 80
	}, {
	    title : '排序',
	    field : 'sort',
	    width : 50
	}, {
	    title : '操作',
	    field: 'id',
	    width : 250,
	    formatter:function(value,rowdata,rowindex){
		return "<span class=\"iconsp icon-edit\" title=\"修改\" ></span><span class=\"iconsp icon-remove\" title=\"删除\" ></span>";
	    }	
	}] ],
	toolbar : [ {
	    text : '添加角色',
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