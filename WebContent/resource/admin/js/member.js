$(function() {
    $('#member_list')
	    .datagrid(
		    {
			url : 'admin/member/list',
			fit : 'true',
			nowrap : false,
			striped : true,
			collapsible : false,
			method : 'get',
			idField : 'order',
			queryParams : {
			    status : 1
			},
			pagination : true,
			singleSelect : true,
			rownumbers : true,
			toolbar : [ {
			    id : 'add',
			    text : '添加会员',
			    iconCls : 'icon-add',
			    handler : function() {
				$("#member_add").window("open");
			    }
			}, {
			    id : 'delete',
			    text : '编辑',
			    iconCls : 'icon-edit',
			    handler : function() {

			    }
			}, {
			    id : 'delete',
			    text : '批量编辑',
			    iconCls : 'icon-edit',
			    handler : function() {

			    }
			}, {
			    id : 'recyclebin',
			    text : '回收站',
			    iconCls : 'icon-recycle',
			    handler : function() {

			    }
			}, {
			    id : 'recyclebin',
			    text : '筛选',
			    iconCls : 'icon-search',
			    handler : function() {

			    }
			}, {
			    id : 'recyclebin',
			    text : '预付款管理',
			    iconCls : 'icon-money',
			    handler : function() {

			    }
			} ],
			columns : [ [
				{
				    field : 'username',
				    title : '用户名',
				    width : 120
				},
				{
				    field : 'group_name',
				    title : '会员组',
				    width : 80
				},
				{
				    field : 'true_name',
				    title : '姓名',
				    width : 120
				},
				{
				    field : 'sex',
				    title : '性别',
				    width : 80
				},
				{
				    field : 'email',
				    title : 'Email',
				    width : 120
				},
				{
				    field : 'balance',
				    title : '余额',
				    width : 100
				},
				{
				    field : 'point',
				    title : '积分',
				    width : 100
				},
				{
				    field : 'regtime',
				    title : '注册日期',
				    width : 100
				},
				{
				    field : 'mobile',
				    title : '手机',
				    width : 100
				},
				{
				    field : 'userId',
				    title : '操作',
				    width : 200,
				    formatter : function(val, rowdata, rowindex) {
					return "<span class=\"iconsp icon-edit\" title=\"编辑\" ></span><span class=\"iconsp icon-remove\" title=\"删除\" ></span>";
				    }
				} ] ],
		    });
});