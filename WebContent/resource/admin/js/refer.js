$(function() {
    
    $('#refer_list').datagrid({
    	url : 'admin/refer/list',
    	fit : 'true',
    	nowrap : true,
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
    		field : 'goodsname',
    		title : '咨询商品',
    		width : 200
    	}, {
    		field : 'username',
    		title : '咨询人',
    		width : 100
    	},  {
    		field : 'time',
    		title : '咨询时间',
    		width : 120
    	},{
    		field : 'adminname',
    		title : '最后回复人',
    		width : 100
    	},{
    		field : 'replyTime',
    		title : '回复时间',
    		width : 120
    	},{
    	    field : 'id',
    	    title : '操作',
    	    width : 200,
    	    formatter : function(val, rowdata, rowindex) {
    		return "<span class=\"iconsp icon-edit\" title=\"编辑\" ></span><span class=\"iconsp icon-remove\" title=\"删除\" ></span>";
    	    }
    	}]],
    	toolbar : [ {
    		text : '删除',
    		iconCls : 'icon-remove',
    		handler : function() {
    		    
    		}
    	}]
    });   
    
    
});