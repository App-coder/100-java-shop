<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../common/config.jsp"%>
<script type="text/javascript" src="resource/admin/js/order/info.js"></script>
<div id="layout_order_info" class="easyui-layout" fit="true" >  
<div region="center"  border="false" class="pt_10">
<div class="easyui-tabs" fit="true">
	<div title="基本信息" class="p10">
		<table id="order_info_goods"></table>
	</div>
	<div title="商品" class="p10">
		<table id="order_info_goods_1"></table>
	</div>
	<div title="收退款记录" class="p10">dsds</div>
	<div title="收发货记录" class="p10"></div>
	<div title="优惠方案" class="p10"></div>
	<div title="订单备注" class="p10"></div>
	<div title="订单附言" class="p10"></div>
</div>
</div>
<div region="south" class="btnbar" border="false">
	<a class="easyui-linkbutton" iconCls="icon-ok"
		href="javascript:void(0)" onclick="config_guide()">编辑</a> <a
		class="easyui-linkbutton" iconCls="icon-cancel"
		href="javascript:void(0)" onclick="closeWin('config_guide')">取消</a>
</div>
</div>  

