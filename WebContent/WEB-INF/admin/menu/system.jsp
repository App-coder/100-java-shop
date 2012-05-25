<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<ul class="easyui-tree" animate="true" lines="true">
	<li><span>后台首页</span>
		<ul>
			<li><a
				href="javascript:tab('我的主页','admin/webmaster/myhomepage');">后台首页</a></li>
		</ul></li>
	<li><span>网站管理</span>
		<ul>
			<li><a href="javascript:tab('网站设置','admin/config/index')">网站设置</a></li>
			<li><a href="javascript:tab('主题设置','admin/theme/index')">主题设置</a></li>
		</ul></li>
	<li><span>支付管理</span>
		<ul>
			<li><a href="admin/payment/index">支付方式</a></li>
		</ul></li>
	<li><span>多平台登入</span>
		<ul>
			<li><a href="javascript:tab('主题设置','admin/theme/index')">平台列表</a></li>
		</ul></li>
	<li><span>配送管理</span>
		<ul>
			<li><a href="admin/delivery/index">配送方式</a></li>
			<li><a href="admin/areas/index">地区管理</a></li>
			<li><a href="admin/freightcompany/index">物流公司</a></li>
			<li><a href="admin/config/express">快递跟踪</a></li>
		</ul></li>
	<li><span>权限管理</span>
	<ul>
			<li><a href="javascript:tab('管理员','admin/admin/index')">管理员</a></li>
			<li><a
				href="javascript:tab('角色','admin/adminrole/index')">角色</a></li>
			<li><a
				href="javascript:tab('权限资源','admin/right/index')">权限资源</a></li>
		</ul></li>
	<li><span>系统升级</span>
	<ul>
			<li><a href="http://www.100-china.com/index.php/javashop/upgrade">系统升级</a></li>
		</ul></li>
</ul>