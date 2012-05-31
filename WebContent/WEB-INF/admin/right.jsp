<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="common/config.jsp" %>	
<script type="text/javascript" src="resource/admin/js/right.js"></script>
<div class="hidden">
<div id="wind_add_right" class="easyui-window" <%=win_topbar %> >  
<div region="center"  border="false" class="bdcenter">
<form method="post" id="form_add_right" >
<table class="tab_form">
	<tr>
		<td class="edittd">父权限：</td>
		<td><input id="item" class="easyui-combotree" url="admin/right/rightComboTree" method="get"  required="true" style="width:200px;"></td>
	</tr>
	<tr>
		<td class="edittd">名称：</td>
		<td><input type="text" class="text easyui-validatebox"
			name="name"  required="true" validType="length[1,50]" /></td>
	</tr>
	<tr>
		<td class="edittd">权限：</td>
		<td><input type="text" class="text easyui-validatebox"
			name="right"  required="true" validType="length[1,50]" /></td>
	</tr>
	<tr>
		<td class="edittd">排序：</td>
		<td><input type="text" class="text easyui-numberbox"
			name="sno"  required="true" min="0" max="9999" /></td>
	</tr>
	</table>
</form>
</div>
<div region="south" class="btnbar" border="false">
	<a class="easyui-linkbutton" iconCls="icon-ok"
		href="javascript:void(0)" onclick="formsubmit('form_add_right')">编辑</a> <a
		class="easyui-linkbutton" iconCls="icon-cancel"
		href="javascript:void(0)" onclick="closeWin('wind_add_right')">取消</a>
</div>
</div>
</div>
<table id="rightlist" title="权限列表" fit="true"></table>