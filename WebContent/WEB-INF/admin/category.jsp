<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="common/config.jsp" %>
<script type="text/javascript" src="resource/admin/js/category.js"></script>
<style>
</style>
<div class="container">
<div class="hidden" >
<div id="category_add" class="easyui-window" <%=win_topbar %> style="width:500px;" title="添加分类">
<div region="center"  border="false"  class="p10"  >
<form id="form_category_add" method="post">
<table class="tab_form">
	<tr>
		<td class="edittd">分类名称：</td>
		<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
	</tr>
	<tr>
		<td class="edittd">上级分类：</td>
		<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
	</tr>
	<tr>
		<td class="edittd">商品模型：</td>
		<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
	</tr>
	<tr>
		<td class="edittd">是否首页显示：</td>
		<td><input type="radio" >是&nbsp;&nbsp;<input type="radio" >否</td>
	</tr>
		<tr>
		<td class="edittd">排序：</td>
		<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
	</tr>
	<tr>
		<td class="edittd">SEO标题：</td>
		<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
	</tr>
	<tr>
		<td class="edittd">SEO关键词：</td>
		<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
	</tr>
	<tr>
		<td class="edittd">SEO描述：</td>
		<td><textarea class="textborder"></textarea></td>
	</tr>
</table>
</form>
</div>
<div region="south" class="btnbar" border="false">
		<a class="easyui-linkbutton" iconCls="icon-ok"
			href="javascript:void(0)" onclick="formsubmit('form_goods_add')">保存分类</a> <a
			class="easyui-linkbutton" iconCls="icon-cancel"
			href="javascript:void(0)" onclick="closeWin('goods_add')">取消</a>
</div>
</div>
</div>
<table id="category_list" ></table>
</div>
