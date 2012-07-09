$(function() {

    $('#order_info_goods').datagrid({
    	url : 'admin/order/info_goods',
    	fit : 'true',
    	nowrap : false,
    	method : 'get',
    	striped : true,
    	singleSelect : true,
    	rownumbers : true,
    	columns : [[{
    		field : 'word',
    		title : '商品名称',
    		width : 300
    	}, {
    		field : 'goodsNums',
    		title : '商品价格',
    		width : 100
    	}, {
    		field : 'hot',
    		title : '优惠价格',
    		width : 100
    		
    	}, {
    		field : 'order',
    		title : '商品数量',
    		width : 80
    	}, {
    		field : 'currentTheme',
    		title : '合计',
    		width : 200
    	}]]
    });
    
    $('#order_info_goods_1').datagrid({
	url : 'admin/order/info_goods',
    	fit : 'true',
    	nowrap : false,
    	method : 'get',
    	striped : true,
    	singleSelect : true,
    	rownumbers : true,
    	columns : [[{
    		field : 'word',
    		title : '商品名称',
    		width : 300
    	}, {
    		field : 'goodsNums',
    		title : '商品价格',
    		width : 100
    	}, {
    		field : 'hot',
    		title : '优惠价格',
    		width : 100
    		
    	}, {
    		field : 'order',
    		title : '商品数量',
    		width : 80
    	}, {
    		field : 'currentTheme',
    		title : '合计',
    		width : 200
    	}]]
    });


});