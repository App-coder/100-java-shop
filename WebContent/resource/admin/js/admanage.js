$(function() {
    $('#admanage_list').datagrid({
	url : 'admin/admanage/list',
	fit : 'true',
	method:'get',
	nowrap : false,
	striped : true,
	collapsible : false,
	idField : 'id',
	singleSelect : true,
	rownumbers : true,
	toolbar : [ {
	    text : '添加',
	    iconCls : 'icon-add',
	    handler : function() {

		var selected = $('#admanage_list').datagrid('getSelected');
		if (selected) {

		} else {
		    message("请选择一行记录！");
		}

	    }
	} , {
	    text : '删除',
	    iconCls : 'icon-remove',
	    handler : function() {


	    }
	}],
	columns : [ [ {
	    field : 'name',
	    title : '名称',
	    width : 250
	},{
	    field : 'type',
	    title : '显示类别',
	    width : 100
	},{
	    field : 'positionId',
	    title : '广告位',
	    width : 100
	},{
	    field : 'order',
	    title : '排序',
	    width : 60
	},{
	    field : 'width',
	    title : '宽高',
	    width : 60
	},{
	    field : 'startTime',
	    title : '开始时间~结束时间',
	    width : 300
	}, {
	    field : 'id',
	    title : '操作',
	    width : 250,
	    formatter:function(value,rowdata,rowindex){
		return "<span class=\"iconsp icon-edit\" title=\"修改\" ></span><span class=\"iconsp icon-remove\" title=\"删除\" ></span>";
	    }
	} ] ],
    });
});