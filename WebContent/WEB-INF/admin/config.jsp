<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="common/config.jsp" %>
<script type="text/javascript" src="resource/admin/js/config.js"></script>
	<div class="easyui-tabs" fit="true">
		<div title="基本设置" class="p10" >
		<form method="post" id="form_config_basic" url="admin/config/config_basic_do" enctype="multipart/form-data" >	
<table class="tab_form">
	<tr>
		<td class="edittd">商店名称：</td>
		<td><input type="text" class="text easyui-validatebox" name="name" value="${system_config['name']}" required="true" validType="length[1,50]" />* 网店名称</td>
	</tr>
	<tr>
		<td class="edittd">商店网址：</td>
		<td><input type="text" class="text easyui-validatebox" name="url" value="${system_config['url']}" required="true"  />* 网站完整的URL访问地址</td>
	</tr>
	<tr>
		<td class="edittd">商店LOGO：</td>
		<td>
		<img id="logo" src="${system_config['url']}/resource/front/${system_config['theme']}/images/logo.gif" onload="if(this.height>50)this.height=50" height="50"/>
		<br>
		<input type="file" value="上传" class="text" size="30" name="logo" />
			直接从本地上传图片覆盖原有的网站logo</td>
	</tr>
	<tr>
		<td class="edittd">联系人：</td>
		<td><input type="text" class="text easyui-validatebox" value="${system_config['master']}" name="master" required="true" /></td>
	</tr>
	<tr>
		<td class="edittd">QQ：</td>
		<td><input type="text" class="text easyui-validatebox" value="${system_config['qq']}" name="qq" required="true" /></td>
	</tr>
	<tr>
		<td class="edittd">Email：</td>
		<td><input type="text" class="text easyui-validatebox" value="${system_config['email']}" name="email" required="true" validType="email" /></td>
	</tr>
	<tr>
		<td class="edittd">手机：</td>
		<td><input type="text" class="text easyui-validatebox" value="${system_config['mobile']}" name="mobile" required="true"/></td>
	</tr>
	<tr>
		<td class="edittd">固定电话：</td>
		<td><input type="text" class="text easyui-validatebox" value="${system_config['phone']}" name="phone" required="true"/></td>
	</tr>
	<tr>
		<td class="edittd">具体地址：</td>
		<td><input type="text" class="text easyui-validatebox" value="${system_config['address']}" name="address" required="true"/></td>
	</tr>
	<tr>
		<td class="edittd">商品货号前缀：</td>
		<td><input type="text" class="text easyui-validatebox" value="${system_config['goods_no_pre']}" name="goods_no_pre" required="true"/>只取前两位</td>
	</tr>
	<tr>
		<td class="edittd">首页TITLE前缀：</td>
		<td><input type="text" class="text easyui-validatebox" value="${system_config['index_seo_title']}" name="index_seo_title" required="true"/></td>
	</tr>
	<tr>
		<td class="edittd">首页关键字：</td>
		<td><input type="text" class="text easyui-validatebox" value="${system_config['index_seo_keywords']}" name="index_seo_keywords" required="true"/></td>
	</tr>
	<tr>
		<td class="edittd">首页描述：</td>
		<td><input type="text" class="text easyui-validatebox" value="${system_config['index_seo_description']}" name="index_seo_description" required="true"/></td>
	</tr>
	<tr>
		<td></td>
		<td>
		<a href="javascript:config_basic_submit()" class="easyui-linkbutton" >保存基本配置</a></td>
	</tr>
</table>
</form>
		</div>
		<div title="导航设置" class="p10">
			<div class="hidden">
				<div id="config_guide" class="easyui-window" <%=win_topbar %> title="添加导航">  
					<div region="center"  border="false" class="bdcenter">
							<form method="post" id="form_config_guide" >
								<input type="hidden" name="action" /> <input type="hidden"
									name="order"  />
								<table class="tab_form">
									<tr>
										<td class="edittd">名称：</td>
										<td><input type="text" class="text easyui-validatebox"
											name="name"  required="true" validType="length[1,50]" /></td>
									</tr>
									<tr>
										<td class="edittd">链接地址：</td>
										<td><input type="text" class="text easyui-validatebox"
											name="link" required="true" validType="length[1,100]" />
											</td>
									</tr>
								</table>
							</form>
						</div>
						<div region="south" class="btnbar" border="false">
							<a class="easyui-linkbutton" iconCls="icon-ok"
								href="javascript:void(0)" onclick="config_guide()">编辑</a> <a
								class="easyui-linkbutton" iconCls="icon-cancel"
								href="javascript:void(0)" onclick="closeWin('config_guide')">取消</a>
						</div>
 				</div>  
			</div>
			<table id="guidelist" title="导航列表" fit="true"></table>
		</div>
		<div title="首页幻灯设置" class="p10">
			<div class="hidden">
				<div id="wind_config_indexSlide" class="easyui-window" <%=win_topbar %>  title="添加幻灯">
					<div region="center"  border="false" class="bdcenter">
							<form method="post" id="form_config_indexSlide" enctype="multipart/form-data" >
								<input type="hidden" name="rowindex" value="-1" />
								<input type="hidden" name="action" /> 
								<input type="hidden" name="savepath" value="resource/upload/indexslide/" />
								<table class="tab_form">
									<tr>
										<td class="edittd">名称：</td>
										<td><input type="text" class="text easyui-validatebox"
											name="title"  required="true" validType="length[1,50]" /></td>
									</tr>
									<tr>
										<td class="edittd">链接地址：</td>
										<td><input type="text" class="text easyui-validatebox"
											name="url" required="true" validType="length[1,100]" /></td>
									</tr>
									<tr>
										<td class="edittd">图片：</td>
										<td><input type="file" value="上传" class="text" size="30" name="imgFile" /></td>
									</tr>
								</table>
							</form>
						</div>
						<div region="south" class="btnbar" border="false">
							<a class="easyui-linkbutton" iconCls="icon-ok"
								href="javascript:void(0)" onclick="formsubmit('form_config_indexSlide')">编辑</a> <a
								class="easyui-linkbutton" iconCls="icon-cancel"
								href="javascript:void(0)" onclick="closeWin('wind_config_indexSlide')">取消</a>
						</div>
				</div>
			</div>
			<table id="config_indexSlide" title="首页幻灯列表" fit="true"></table>		
		</div>
		<div title="站点底部信息" class="p10">
			<iframe src="admin/config/config_footer" frameborder="0"  width="100%" height="600"  ></iframe>
		</div>
		<div title="购物设置" class="p10">
			<form  method="post" id="form_config_shopcfg" >
				<table class="tab_form">
					<tr>
						<td class="edittd">税率：</td>
						<td><input type="text" class="text easyui-validatebox" name="tax" value="${system_config['tax']}"  required="true" validType="length[1,50]" /></td>
					</tr>
					<tr>
						<td class="edittd">默认备货时间：</td>
						<td><input type="text" class="text easyui-validatebox" name="stockup_time" value="${system_config['stockup_time']}"  required="true" validType="length[1,50]" />天 &nbsp;&nbsp;*订单确认后需要备货的时间</td>
					</tr>
					<tr>
						<td class="edittd">团购过期时间：</td>
						<td><input type="text" class="text easyui-validatebox" name="regiment_time_limit" value="${system_config['regiment_time_limit']}"  required="true" validType="length[1,50]" />分钟 &nbsp;&nbsp;*报名参加团购后多长时间不付款则视为过期，默认为60分钟</td>
					</tr>
					<tr>
						<td></td>
						<td>
						<a href="javascript:formsubmit('form_config_shopcfg')" class="easyui-linkbutton" >保存购物设置</a></td>
					</tr>
				</table>
			</form>
		</div>
		<div title="显示设置" class="p10">
			<form  method="post" id="form_config_viewcfg" >
				<table class="tab_form">
						<tr>
							<td class="edittd">默认的排序依据：</td>
							<td><select class="text" name="order_by" >
								<option value="new" 
								<c:if test="${system_config['order_by'] == 'new'}">
								selected="selected"
								</c:if> >上架时间</option>
								<option value="price"
								<c:if test="${system_config['order_by'] == 'price'}">
								selected="selected"
								</c:if>
								>价格</option>
								<option value="sale"
								<c:if test="${system_config['order_by'] == 'sale'}">
								selected="selected"
								</c:if>
								>销量</option>
								<option value="cpoint"
								<c:if test="${system_config['order_by'] == 'cpoint'}">
								selected="selected"
								</c:if>
								>评分</option>
							</select>* 在商品列表页中商品的排序依据条件</td>
						</tr>
						<tr>
							<td class="edittd">默认的排序方式： 	</td>
							<td><select class="text" name="order_type">
								<option value="desc"
								<c:if test="${system_config['order_type'] == 'desc'}">
								selected="selected"
								</c:if>
								>降序</option>
								<option value="asc"
								<c:if test="${system_config['order_type'] == 'asc'}">
								selected="selected"
								</c:if>
								>升序</option>
							</select>* 在商品列表页中商品的排序方式</td>
						</tr>
						<tr>
							<td class="edittd">列表默认展示方式：</td>
							<td><select class="text" name="list_type">
								<option value="list" 
								<c:if test="${system_config['list_type'] == 'list'}">
								selected="selected"
								</c:if> >普通列表</option>
								<option value="win"
								<c:if test="${system_config['list_type'] == 'win'}">
								selected="selected"
								</c:if>
								>橱窗形式</option>
							</select>* 在商品列表页中商品的展示样式</td>
						</tr>
						<tr>
							<td class="edittd">列表展示商品数量：</td>
							<td><input type="text" class="text easyui-validatebox" name="list_num" value="${system_config['list_num']}" required="true" validType="length[1,50]" />* 在商品列表页中商品的展示数量</td>
						</tr>
						<tr>
							<td class="edittd">智能提示开启字数：</td>
							<td><input type="text" class="text easyui-numberbox" name="auto_finish" value="${system_config['auto_finish']}"  required="true" min="0" max="100" />当输入若干个字符后，会出现智能提示信息</td>
						</tr>
						<tr>
							<td></td>
							<td>
							<a href="javascript:formsubmit('form_config_viewcfg')" class="easyui-linkbutton" >保存显示设置</a></td>
						</tr>
				</table>
			</form>
		</div>
		<div title="图片设置" class="p10">
			<form  method="post" id="form_config_image" >
				<table class="tab_form">
						<tr>
							<td class="edittd">列表页缩略图：</td>
							<td>宽：<input type="text" class="text easyui-numberbox" name="list_thumb_width" value="${system_config['list_thumb_width']}"   required="true" min="0" max="500" />* 在商品列表页中商品的排序依据条件</td>
						</tr>
						<tr>
							<td class="edittd"></td>
							<td>高：<input type="text" class="text easyui-numberbox" name="list_thumb_height" value="${system_config['list_thumb_height']}"  required="true" min="0" max="500" />* 在商品列表页中商品的排序依据条件</td>
						</tr>
						<tr>
							<td class="edittd">详细页缩略图：</td>
							<td>宽：<input type="text" class="text easyui-numberbox" name="show_thumb_width" value="${system_config['show_thumb_width']}"  required="true" min="0" max="500" />* 在商品列表页中商品的排序依据条件</td>
						</tr>
						<tr>
							<td class="edittd"></td>
							<td>高：<input type="text" class="text easyui-numberbox" name="show_thumb_height" value="${system_config['show_thumb_height']}"  required="true" min="0" max="500" />* 在商品列表页中商品的排序依据条件</td>
						</tr>
						<tr>
							<td></td>
							<td>
							<a href="javascript:formsubmit('form_config_image')" class="easyui-linkbutton" >保存图片设置</a></td>
						</tr>
				</table>
			</form>
		</div>
		<div title="邮箱设置" class="p10">
			<form  method="post" id="form_config_email" >
				<table class="tab_form">
						<tr>
							<td class="edittd">发送Email方式：</td>
							<td><input type="radio" value="1" name="email_type"
							<c:if test="${system_config['email_type'] == 1}">
							checked="checked"
							</c:if>
							 />第三方SMTP方式&nbsp;&nbsp;<input type="radio" value="2" name="email_type"
							<c:if test="${system_config['email_type'] == 2}">
							checked="checked"
							</c:if>
							 />本地mail邮箱&nbsp;&nbsp;* 如果本地已经搭建好邮件服务，请选择 "本地mail邮箱"，否则选择" 第三方SMTP方式 "来发送邮件</td>
						</tr>
						<tr>
							<td class="edittd">发送邮件的地址：</td>
							<td><input type="text" class="text easyui-validatebox" name="mail_address" value="${system_config['mail_address']}" required="true" validType="length[1,200]" />* 发送邮件所使用的email地址，邮件内容中的收件人信息就是显示此信息</td>
						</tr>
						<tr>
							<td class="edittd">SMTP地址：</td>
							<td><input type="text" class="text easyui-validatebox" name="smtp" value="${system_config['smtp']}" required="true" validType="length[1,200]" />第三方的SMTP的URL地址</td>
						</tr>
						<tr>
							<td class="edittd">用户名：</td>
							<td><input type="text" class="text easyui-validatebox" name="smtp_user" value="${system_config['smtp_user']}"  required="true" validType="length[1,50]" />SMTP用户名</td>
						</tr>
						<tr>
							<td class="edittd">密码：</td>
							<td><input type="text" class="text easyui-validatebox" name="smtp_pwd" value="${system_config['smtp_pwd']}" required="true" validType="length[1,50]" />SMTP密码</td>
						</tr>
						<tr>
							<td class="edittd">端口号：</td>
							<td><input type="text" class="text easyui-numberbox" name="smtp_port"  value="${system_config['smtp_port']}" required="true" min="1" max="9999" />SMTP端口号(默认：25)</td>
						</tr>
						<tr>
							<td class="edittd">测试邮件地址：</td>
							<td><input type="text" class="text easyui-validatebox" name="test_address" value="${system_config['test_address']}" required="true" validType="length[1,200]" />用于测试邮件发送的功能【可选】</td>
						</tr>
						<tr>
							<td></td>
							<td>
							<a href="javascript:formsubmit('form_config_email')" class="easyui-linkbutton" >保存邮箱设置</a></td>
						</tr>
				</table>
			</form>			
		</div>
		<div title="系统设置" class="p10">
			<table class="tab_form">
						<tr>
							<td class="edittd">清理缓存：</td>
							<td><a href="javascript:clearCache()" class="easyui-linkbutton" >开始清理</a>&nbsp;&nbsp;清理系统编译生成的缓存文件</td>
						</tr>
			</table>
		</div>
	</div>
