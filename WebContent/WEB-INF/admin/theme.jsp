<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="common/config.jsp" %>
<script>
var current_theme = "${system_config['theme']}";
</script>
<script type="text/javascript" src="resource/admin/js/theme.js"></script>
<table id="theme_list"></table>
<div class="hidden">
<div id="wind_theme_edit" <%=win_topbar %> style="width:500px;"  >  
<div region="center"  border="false" class="bdcenter">
<form method="post" id="form_theme_edit" >
<input type="hidden" name="id" />
<table class="tab_form">
	<tr>
		<td class="edittd">名称：</td>
		<td><input type="text" class="text easyui-validatebox"
			name="name"  required="true" validType="length[1,50]" /></td>
	</tr>
	<tr>
		<td class="edittd">目录：</td>
		<td><input type="text" class="text easyui-validatebox"
			name="catalog"  required="true" validType="length[1,50]" /></td>
	</tr>
	<tr>
		<td class="edittd" valign="top">描述：</td>
		<td><textarea rows="3" name="description" class="textborder" cols="43" required="true" validType="length[1,250]"  ></textarea></td>
	</tr>
	</table>
</form>
</div>
<div region="south" class="btnbar" border="false">
	<a class="easyui-linkbutton" iconCls="icon-ok"
		href="javascript:void(0)" onclick="formsubmit('form_theme_edit')">编辑</a> <a
		class="easyui-linkbutton" iconCls="icon-cancel"
		href="javascript:void(0)" onclick="closeWin('wind_theme_edit')">取消</a>
</div>
</div>
</div>
