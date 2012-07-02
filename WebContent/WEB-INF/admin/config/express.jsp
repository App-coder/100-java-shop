<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../common/config.jsp" %>
<script type="text/javascript" src="resource/admin/js/config/express.js"></script>
<form method="get" id="form_config_express" url="admin/config/config_express_do" >
<table class="tab_form">
	<tr>
		<td class="edittd">快递跟踪ID：</td>
		<td><input type="text" class="text easyui-validatebox" name="express_key" value="${express_key }" required="true" validType="length[1,50]" /></td>
	</tr>
		<tr>
		<td class="edittd">开启：</td>
		<td><input type="radio" name="express_open" value="0" ${express_open eq 0?"checked='checked'":"" }  />开启&nbsp;&nbsp;<input type="radio" name="express_open"  value="1" ${express_open eq 1?"checked='checked'":"" } />关闭</td>
	</tr>
	<tr>
		<td></td>
		<td>查询数据由：KuaiDi100.Com （快递100） 网站提供，请到快递100前去申请ID！</td>
	</tr>
	<tr>
		<td></td>
		<td>
		<a href="javascript:formsubmit('form_config_express')" class="easyui-linkbutton" >保存</a></td>
	</tr>
</table>
</form>	
	