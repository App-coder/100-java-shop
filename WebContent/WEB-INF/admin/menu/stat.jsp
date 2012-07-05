<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<ul class="easyui-tree" animate="true" lines="true">
	<li><span>基础数据统计</span>
	<ul>
			<li><a
				href="javascript:tab('用户注册统计','admin/stat/userreg')">用户注册统计</a></li>
			<li><a
				href="javascript:tab('人均消费统计','admin/stat/spandingavg')">人均消费统计</a></li>
			<li><a
				href="javascript:tab('销售金额统计','admin/stat/amount')">销售金额统计</a></li>
		</ul></li>
	<li><span>日志操作记录</span>
	<ul>
			<li><a
				href="javascript:tab('资金操作记录','admin/accountlog/index')">资金操作记录</a></li>
			<li><a
				href="javascript:tab('后台操作记录','admin/logoperation/index')">后台操作记录</a></li>
		</ul></li>
</ul>