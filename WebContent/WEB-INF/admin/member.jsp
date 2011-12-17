<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="common/config.jsp" %>
<script type="text/javascript" src="resource/admin/js/member.js"></script>
<div class="container">
<div class="hidden">
<div id="member_add" class="easyui-window" <%=win_topbar %> style="width:600px;" title="添加商品">  
		<div region="center"  border="false" class="p10">
		<form id="form_member_add" method="post" >
		<table class="tab_form">
				<tr>
					<td class="edittd">用户名：</td>
					<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
				</tr>
				<tr>
					<td class="edittd">Email：</td>
					<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
				</tr>
				<tr>
					<td class="edittd">密码：</td>
					<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
				</tr>
				<tr>
					<td class="edittd">确认密码：</td>
					<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
				</tr>
				<tr>
					<td class="edittd">会员组：</td>
					<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
				</tr>
				<tr>
					<td class="edittd">姓名：</td>
					<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
				</tr>
				<tr>
					<td class="edittd">性别：</td>
					<td><input type="radio" />男&nbsp;&nbsp;<input type="radio"/>女</td>
				</tr>
				<tr>
					<td class="edittd">电话：</td>
					<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
				</tr>				
				<tr>
					<td class="edittd">手机：</td>
					<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
				</tr>			
				<tr>
					<td class="edittd">地区：</td>
					<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
				</tr>					
				<tr>
					<td class="edittd">地址：</td>
					<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
				</tr>				
				<tr>
					<td class="edittd">邮编：</td>
					<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
				</tr>			
				<tr>
					<td class="edittd">QQ：</td>
					<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
				</tr>	
				<tr>
					<td class="edittd">MSN：</td>
					<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
				</tr>
				<tr>
					<td class="edittd">经验值：</td>
					<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
				</tr>
				<tr>
					<td class="edittd">积分：</td>
					<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
				</tr>								
		</table>
		</form>
		</div>
		<div region="south" class="btnbar" border="false">
				<a class="easyui-linkbutton" iconCls="icon-ok"
					href="javascript:void(0)" onclick="formsubmit('form_member_add')">保存商品</a> <a
					class="easyui-linkbutton" iconCls="icon-cancel"
					href="javascript:void(0)" onclick="closeWin('member_add')">取消</a>
		</div>
</div>
</div>
<table id="member_list" title="配送方式列表" fit="true"></table>
</div>		