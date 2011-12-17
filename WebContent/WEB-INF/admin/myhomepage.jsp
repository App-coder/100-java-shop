<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<script type="text/javascript" src="resource/admin/js/myhomepage.js"></script>
<div class="container">
<table style="width:100%;">
	<tr>
		<td width="50%" valign="top">
		<table class=" tb_list" fit="true" style="border:1px solid #AED0EA;border-collapse: collapse;" >
			<thead>
				<tr >
					<td colspan="2" >
					<div class="panel-header" style="border:none;" ><div class="panel-title">概况</div></div>
					</td>
				</tr>
			</thead>
					<tbody>
					<tr>
						<td class="lefttd">销售总额</td>
						<td class="righttd" >${grossSales}元</td>
					</tr>
					<tr>
						<td class="lefttd">今年销售总额</td>
						<td class="righttd" >${yearGrossSales}元</td>
					</tr>
					<tr>
						<td class="lefttd">客户</td>
						<td class="righttd" >${countOfCustomer}个</td>
					</tr>
					<tr>
						<td class="lefttd">产品</td>
						<td class="righttd" >${countOfProduct}个</td>
					</tr>
					<tr>
						<td class="lefttd">咨询</td>
						<td class="righttd" >总共：<a class="a" href="javascript:tab('咨询管理','admin/refer/index');">${countOfRefer}</a>个&nbsp;&nbsp;未处理：<a class="a" href="javascript:tab('咨询管理','admin/refer/index');">${countOfNotDealRefer}</a></td>
					</tr>
					<tr>
						<td class="lefttd">评论</td>
						<td class="righttd" >总共：<a class="a" href="javascript:tab('评价管理','admin/comment/index');">${countOfCommentAll}</a>个&nbsp;&nbsp;未处理：<a class="a" href="javascript:tab('评价管理','admin/comment/index');">${countOfNotDealComment}</a></td>
					</tr>
					</tbody>
				</table>
		</td>
		<td width="50%" valign="top">
		<table class=" tb_list" style="border:1px solid #AED0EA;border-collapse: collapse;">
			<thead>
				<tr >
					<td colspan="2" >
					<div class="panel-header" style="border:none;" ><div class="panel-title">订单信息</div></div>
					</td>
				</tr>
			</thead>
			<tbody>
			<tr><td class="lefttd">总订单</td>
							<td class="righttd" >${orderAll}个</td>
						</tr>
						<tr>
							<td class="lefttd">新订单</td>
							<td class="righttd" >${newOrder}个</td>
						</tr>
						<tr>
							<td class="lefttd">未付款订单</td>
							<td class="righttd" >${orderNotPay}个</td>
						</tr>
						<tr>
							<td class="lefttd">未发货订单</td>
							<td class="righttd" >${orderHasDistr}个</td>
						</tr>
						<tr>
							<td class="lefttd">七天未确认订单</td>
							<td class="righttd" >${orderHasConfirm}个</td>
						</tr>
						<tr>
							<td class="lefttd">完成订单</td>
							<td class="righttd" >${orderHasFinish}个</td>
						</tr>
			</tbody>				
		</table>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<table id="orderlist" title="最新10条订单" fit="true"></table>
		</td>
	</tr>
</table>
</div>