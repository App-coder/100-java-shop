<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="common/config.jsp" %>
<script type="text/javascript" src="resource/admin/js/model.js"></script>
<div class="container">
<div class="hidden" >
	<div id="model_add" class="easyui-window" <%=win_topbar %> style="width:500px;" title="添加模型" >  
		<div region="center"  border="false" >
		<form id="form_model_add" method="post" >
			<div class="easyui-tabs"  border="false" style="height:300px;"  >
				<div title="基本信息" class="p10" >
					<table class="tab_form">
						<tr>
							<td class="edittd">模型名称：</td>
							<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
						</tr>
 					</table>
				</div>
				<div title="规格" class="p10" >
					<table class="tab_form">
							<tr>
								<td colspan="2">规格列表</td>
							</tr>
					</table>
				</div>
			</div>
		</form>
		</div>
		<div region="south" class="btnbar" border="false">
				<a class="easyui-linkbutton" iconCls="icon-ok"
					href="javascript:void(0)" onclick="formsubmit('form_model_add')">保存</a> <a
					class="easyui-linkbutton" iconCls="icon-cancel"
					href="javascript:void(0)" onclick="closeWin('model_add')">取消</a>
		</div>
    </div>
</div>
<table id="model_list"></table>
</div>