<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="common/config.jsp" %>
<script type="text/javascript" src="resource/admin/js/goods.js"></script>
<div class="container">
<div class="hidden" >
	<div id="goods_add" class="easyui-window" <%=win_topbar %> style="width:600px;" title="添加商品">  
		<div region="center"  border="false" >
			<form id="form_goods_add" method="post" >
				<div class="easyui-tabs"  border="false" style="height:350px;"  >
					<div title="商品信息" class="p10" >
						<table class="tab_form">
						<tr>
							<td class="edittd">商店名称：</td>
							<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" />* <a href="#" class="easyui-linkbutton" >添加关键词</a></td>
						</tr>
						<tr>
							<td class="edittd">商店货号：</td>
							<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" />*</td>
						</tr>
						<tr>
							<td class="edittd">所属分类：</td>
							<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" />*</td>
						</tr>
						<tr>
							<td class="edittd">商店模型：</td>
							<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" />*</td>
						</tr>
						<tr>
							<td class="edittd">商店标签：</td>
							<td><input type="checkbox"/>最新商品&nbsp;&nbsp;<input type="checkbox"/>特价商品&nbsp;&nbsp;<input type="checkbox"/>推荐商品&nbsp;&nbsp;<input type="checkbox"/>热卖排行</td>
						</tr>
						<tr>
							<td class="edittd">商品品牌：</td>
							<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
						</tr>
						<tr>
							<td class="edittd">是否上架：</td>
							<td><input type="radio" />是&nbsp;&nbsp;<input type="radio" />否</td>
						</tr>
						<tr>
							<td class="edittd">销售价格：</td>
							<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
						</tr>
						<tr>
							<td class="edittd">市场价格：</td>
							<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
						</tr>
						<tr>
							<td class="edittd">库存：</td>
							<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
						</tr>
						<tr>
							<td class="edittd">重量：</td>
							<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
						</tr>
						<tr>
							<td class="edittd">积分：</td>
							<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
						</tr>
												<tr>
							<td class="edittd">排序：</td>
							<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
						</tr>
						<tr>
							<td class="edittd">计量单位：</td>
							<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
						</tr>
						<tr>
							<td class="edittd">经验值：</td>
							<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
						</tr>
						<tr>
							<td class="edittd">产品相册：</td>
							<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
						</tr>
						<tr>
							<td class="edittd">规格：</td>
							<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
						</tr>
						<tr>
							<td class="edittd">扩展属性：</td>
							<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
						</tr>
						</table>
					</div>
					<div title="描述" class="p10" >
					<iframe src="admin/goods/content" frameborder="0"  width="99%" height="250"  ></iframe>
					</div>
					<div title="营销选项" class="p10" >
					<table class="tab_form">
						<tr>
							<td class="edittd">SEO关键词：</td>
							<td><input type="text" class="text easyui-validatebox" name="name" required="true" validType="length[1,50]" /></td>
						</tr>
						<tr>
							<td class="edittd">SEO描述：</td>
							<td>
								<textarea validtype="length[1,250]" required="true" cols="50" class="textborder" name="description" rows="3"></textarea>
							</td>
						</tr>
					</table>
					</div>
				</div>
			</form>
		</div>
		<div region="south" class="btnbar" border="false">
				<a class="easyui-linkbutton" iconCls="icon-ok"
					href="javascript:void(0)" onclick="formsubmit('form_goods_add')">保存商品</a> <a
					class="easyui-linkbutton" iconCls="icon-cancel"
					href="javascript:void(0)" onclick="closeWin('goods_add')">取消</a>
		</div>
 	</div>  
</div>
<table id="goods_list" ></table>
</div>