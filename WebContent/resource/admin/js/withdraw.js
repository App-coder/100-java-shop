$(function() {
    
$('#withdraw_list').datagrid({
	url : 'admin/withdraw/list',
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
		field : 'name',
		title : '收款人姓名',
		width : 200
	}, {
		field : 'amount',
		title : '金额',
		width : 200
	},  {
		field : 'time',
		title : '申请时间',
		width : 200
	},{
		field : 'status',
		title : '状态',
		width : 100,
		formatter : function(val, rowdata, rowindex) {
		    if(val == 'true'){
			return "是";
		    }else{
			return "否";
		    }
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