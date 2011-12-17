<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="common/config.jsp" %>
<script type="text/javascript" src="resource/admin/js/brand.js"></script>
<div class="container">
<div class="hidden" >
<div id="brand_add" class="easyui-window" <%=win_topbar %> style="width:500px;" title="添加品牌">  
		<div region="center"  border="false" class="p10" >
		<form id="form_brand_add" method="post">
		<table class="tab_form">
		<tr>
			<td class="edittd">品牌名称：</td>
			<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
		</tr>
		<tr>
			<td class="edittd">排序：</td>
			<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
		</tr>
		<tr>
			<td class="edittd">网址：</td>
			<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
		</tr>
		<tr>
			<td class="edittd">LOGO：</td>
			<td><input type="file" value="上传"  size="25" name="logo" /></td>
		</tr>
		<tr>
			<td class="edittd">所有分类：</td>
			<td></td>
		</tr>
		<tr>
			<td class="edittd" valign="top">描述：</td>
			<td><textarea class="textborder"></textarea></td>
		</tr>
		</table>
		</form>
		</div>
		<div region="south" class="btnbar" border="false">
		<a class="easyui-linkbutton" iconCls="icon-ok"
			href="javascript:void(0)" onclick="formsubmit('form_brand_add')">保存品牌</a> <a
			class="easyui-linkbutton" iconCls="icon-cancel"
			href="javascript:void(0)" onclick="closeWin('brand_add')">取消</a>
		</div>
</div>
</div>
<table id="brand_list"></table>
</div>