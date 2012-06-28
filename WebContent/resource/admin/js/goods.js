$(function(){
    $('#goods_list').datagrid({
	url : '',
	fit : 'true',
	nowrap : false,
	striped : true,
	collapsible : true,
	idField : 'id',
	rownumbers : true,
	queryParams:{is_del:0},
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
	    field : 'name',
	    width : 200
	}, {
	    title : '销售价',
	    field : 'name',
	    width : 200
	}, {
	    title : '库存',
	    field : 'name',
	    width : 200
	}, {
	    title : '上架',
	    field : 'name',
	    width : 200
	}, {
	    title : '市场价',
	    field : 'name',
	    width : 200
	}, {
	    title : '品牌',
	    field : 'name',
	    width : 200
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