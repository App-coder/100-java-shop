<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="common/config.jsp" %>
<script type="text/javascript" src="resource/admin/js/brandcategory.js"></script>
<div class="container">
<div class="hidden" >
	<div id="brandcategory_add" class="easyui-window" <%=win_topbar %> style="width:500px;" title="添加商品">  
		<div region="center"  border="false" class="p10" >
		<form id="form_brandcategory_add" method="post">
		<table class="tab_form">
		<tr>
			<td class="edittd">分类名称：</td>
			<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
		</tr>
		</table>
		</form>
		</div>
		<div region="south" class="btnbar" border="false">
		<a class="easyui-linkbutton" iconCls="icon-ok"
			href="javascript:void(0)" onclick="formsubmit('form_brandcategory_add')">保存分类</a> <a
			class="easyui-linkbutton" iconCls="icon-cancel"
			href="javascript:void(0)" onclick="closeWin('goods_add')">取消</a>
		</div>
	</div>
</div>


<table id="brandcategory_list"></table>
</div>