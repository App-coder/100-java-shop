<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<ul class="easyui-tree" animate="true" lines="true">
	<li><span>会员管理</span>
	<ul>
			<li class="selected"><a href="javascript:tab('会员列表','admin/member/list');" >会员列表</a></li>
			<li><a href="javascript:tab('会员组列表','admin/usergroup/list');">会员组列表</a></li>
			<li><a
				href="/iwebshop/index.php?controller=member&amp;action=withdraw_list">会员提现管理</a></li>
		</ul></li>
	<li><span>信息处理</span>
	<ul>
			<li><a
				href="/iwebshop/index.php?controller=comment&amp;action=suggestion_list">建议管理</a></li>
			<li><a
				href="/iwebshop/index.php?controller=comment&amp;action=refer_list">咨询管理</a></li>
			<li><a
				href="/iwebshop/index.php?controller=comment&amp;action=discussion_list">讨论管理</a></li>
			<li><a
				href="/iwebshop/index.php?controller=comment&amp;action=comment_list">评价管理</a></li>
			<li><a
				href="/iwebshop/index.php?controller=comment&amp;action=message_list">站内消息</a></li>
			<li><a
				href="/iwebshop/index.php?controller=message&amp;action=notify_list">到货通知</a></li>
		</ul></li>
	<li><span>邮件短信设置</span>
	<ul>
			<li><a
				href="/iwebshop/index.php?controller=message&amp;action=tpl_list">模板管理</a></li>
			<li><a
				href="/iwebshop/index.php?controller=message&amp;action=registry_list">邮件订阅</a></li>
		</ul></li>
</ul>

