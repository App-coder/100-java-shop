<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="common/config.jsp" %>	
<script type="text/javascript" src="resource/admin/js/admin.js"></script>
<div class="hidden">
	<div id="admin_add" class="easyui-window" <%=win_topbar %> title="添加管理员">  
					<div region="center"  border="false" class="bdcenter">
							<form method="post" id="form_admin_edit" >
								<input type="hidden" name="action" /> <input type="hidden"
									name="order"  />
								<table class="tab_form">
									<tr>
										<td class="edittd">用户名：</td>
										<td><input type="text" class="text easyui-validatebox"
											name="adminName"  required="true" validType="length[1,50]" /></td>
									</tr>
									<tr>
										<td class="edittd">密码：</td>
										<td><input type="text" class="text easyui-validatebox"
											name="password" required="true" validType="length[1,100]" />
											</td>
									</tr>
									<tr>
										<td class="edittd">重复密码：</td>
										<td><input type="text" class="text easyui-validatebox"
											name="re_password" required="true" validType="length[1,100]" />
											</td>
									</tr>
									<tr>
										<td class="edittd">角色：</td>
										<td><select name="roleId" id="admin_roleId">
										</select>
											</td>
									</tr>
									<tr>
										<td class="edittd">Email：</td>
										<td><input type="text" class="text easyui-validatebox"
											name="email" required="true" validType="length[1,100]" />
											</td>
									</tr>
								</table>
							</form>
						</div>
						<div region="south" class="btnbar" border="false">
							<a class="easyui-linkbutton" iconCls="icon-ok"
								href="javascript:void(0)" onclick="formsubmit('form_admin_edit')">编辑</a> <a
								class="easyui-linkbutton" iconCls="icon-cancel"
								href="javascript:void(0)" onclick="closeWin('admin_add')">取消</a>
						</div>
 				</div>  
</div>
<table id="adminlist" title="管理员列表" fit="true"></table>