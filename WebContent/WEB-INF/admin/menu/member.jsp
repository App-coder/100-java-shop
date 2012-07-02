<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<ul class="easyui-tree" animate="true" lines="true">
	<li><span>会员管理</span>
	<ul>
			<li><a 
				href="javascript:tab('会员列表','admin/member/index');">会员列表</a></li>
			<li><a
				href="javascript:tab('会员组列表','admin/usergroup/index');">会员组列表</a></li>
			<li><a
				href="javascript:tab('会员提现管理','admin/withdraw/index');">会员提现管理</a></li>
		</ul></li>
	<li><span>信息处理</span>
	<ul>
			<li><a
				href="javascript:tab('建议管理','admin/suggestion/index');">建议管理</a></li>
			<li><a
				href="javascript:tab('咨询管理','admin/refer/index');">咨询管理</a></li>
			<li><a
				href="javascript:tab('讨论管理','admin/discussion/index');">讨论管理</a></li>
			<li><a
				href="javascript:tab('评价管理','admin/comment/index');">评价管理</a></li>
			<li><a
				href="javascript:tab('站内消息','admin/message/index');">站内消息</a></li>
			<li><a
				href="javascript:tab('到货通知','admin/notifyregistry/index');">到货通知</a></li>
		</ul></li>
	<li><span>邮件短信设置</span>
	<ul>
			<li><a
				href="javascript:tab('模板管理','admin/msgtemplate/index');">模板管理</a></li>
			<li><a
				href="javascript:tab('邮件订阅','admin/emailregistry/index');">邮件订阅</a></li>
		</ul></li>
</ul>

