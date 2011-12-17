$(function() {

    $('#keyword_list').datagrid({
	url : 'admin/keyword/list',
	fit : 'true',
	nowrap : false,
	method : 'get',
	striped : true,
	singleSelect : true,
	rownumbers : true,
	idField : 'id',
	pagination:true,
	frozenColumns : [[{
		field : 'ck',
		checkbox : true
	}]],
	columns : [[{
		field : 'word',
		title : '关键词',
		width : 200
	}, {
		field : 'goodsNums',
		title : '关联商品数量',
		width : 200
	}, {
		field : 'hot',
		title : '是否热门',
		width : 100,
		formatter : function(val, rowdata, rowindex) {
		    if(val == 'true'){
			return "是";
		    }else{
			return "否";
		    }
		}
		
	}, {
		field : 'order',
		title : '排序',
		width : 80
	}, {
		field : 'currentTheme',
		title : '操作',
		width : 200,
		formatter : function(val, rowdata, rowindex) {
		    return "<span class=\"iconsp icon-reload\" title=\"同步\" ></span><span class=\"iconsp icon-remove\" title=\"删除\" ></span>";
		}
	}]],
	toolbar : [{
		id : 'add',
		text : '添加关键字',
		iconCls : 'icon-add',
		handler : function() {
		    $("#keyword_add").window("open");
		}
	}, {
		text : '删除',
		iconCls : 'icon-remove',
		handler : function() {
		}
	}, {
		id : 'update',
		text : '批量同步',
		iconCls : 'icon-reload',
		handler : function() {
		    
		}
	}]
});


});