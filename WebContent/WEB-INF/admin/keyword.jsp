<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="common/config.jsp" %>
<script type="text/javascript" src="resource/admin/js/keyword.js"></script>
<div class="container">
<div class="hidden" >
<div id="keyword_add" class="easyui-window" <%=win_topbar %> style="width:500px;" title="添加模型" >  
		<div region="center"  border="false" >
			<form id="form_keyword_add" method="post" >
				<table class="tab_form">
						<tr>
							<td class="edittd">关键词：</td>
							<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
						</tr>
						<tr>
							<td class="edittd">是否为热门词：</td>
							<td><input type="radio"/>是&nbsp;&nbsp;<input type="radio"/>否</td>
						</tr>
						<tr>
							<td class="edittd">排序：</td>
							<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
						</tr>
 				</table>
			</form>
		</div>
		<div region="south" class="btnbar" border="false">
				<a class="easyui-linkbutton" iconCls="icon-ok"
					href="javascript:void(0)" onclick="formsubmit('form_keyword_add')">保存</a> <a
					class="easyui-linkbutton" iconCls="icon-cancel"
					href="javascript:void(0)" onclick="closeWin('keyword_add')">取消</a>
		</div>
</div>
</div>
<table id="keyword_list"></table>
</div>