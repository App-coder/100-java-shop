<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="common/config.jsp" %>
<script type="text/javascript" src="resource/admin/js/specphoto.js"></script>
<div class="container">
<div class="hidden" >
<div id="specphoto_add" class="easyui-window" <%=win_topbar %> style="width:500px;" title="添加模型" >  
		<div region="center"  border="false" >
			<form id="form_specphoto_add" method="post" >
				<table class="tab_form">
						<tr>
							<td class="edittd">规格名称：</td>
							<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
						</tr>
						<tr>
							<td class="edittd">显示类型：</td>
							<td><input type="radio"/>文字&nbsp;&nbsp;<input type="radio"/>图片</td>
						</tr>
						<tr>
							<td class="edittd">显示备注：</td>
							<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
						</tr>
 				</table>
			</form>
		</div>
		<div region="south" class="btnbar" border="false">
				<a class="easyui-linkbutton" iconCls="icon-ok"
					href="javascript:void(0)" onclick="formsubmit('form_specphoto_add')">保存</a> <a
					class="easyui-linkbutton" iconCls="icon-cancel"
					href="javascript:void(0)" onclick="closeWin('specphoto_add')">取消</a>
		</div>
    </div>
</div>
<table id="specphoto_list"></table>
</div>