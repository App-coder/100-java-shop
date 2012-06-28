<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<ul class="easyui-tree" animate="true" lines="true">
	<li><span>促销活动</span>
	<ul>
			<li><a href="javascript:tab('促销活动列表','admin/promotion/index');">促销活动列表</a></li>
		</ul></li>
	<li><span>营销活动</span>
	<ul>
			<li><a
				href="javascript:tab('限时抢购','admin/promotion/speed');">限时抢购</a></li>
			<li><a
				href="javascript:tab('团购','admin/regiment/index');">团购</a></li>
		</ul></li>
	<li><span>代金券管理</span>
	<ul>
			<li><a href="javascript:tab('代金券列表','admin/ticket/index');">代金券列表</a></li>
			<li><a href="javascript:tab('代金券文件列表','admin/ticketexcel/index');">代金券文件列表</a></li>
		</ul></li>
</ul>