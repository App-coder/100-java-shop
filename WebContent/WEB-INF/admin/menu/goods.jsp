<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<ul class="easyui-tree" animate="true" lines="true" >

	<li><span>商品管理</span>
	<ul>
			<li><a
				href="javascript:tab('商品列表','admin/goods/index');">商品列表</a></li>
		</ul></li>
		
	<li><span>商品分类</span>
	<ul>
			<li><a
				href="javascript:tab('分类列表','admin/category/index');">分类列表</a></li>
		</ul></li>
	<li><span>品牌</span>
	<ul>
			<li><a
				href="javascript:tab('品牌分类','admin/brandcategory/index');">品牌分类</a></li>
			<li><a
				href="javascript:tab('品牌列表','admin/brand/index');">品牌列表</a></li>
		</ul></li>
	<li><span>模型</span>
	<ul>
			<li><a
				href="javascript:tab('模型列表','admin/model/index');">模型列表</a></li>
			<li><a
				href="javascript:tab('规格列表','admin/spec/index');">规格列表</a></li>
			<li><a
				href="javascript:tab('规格图库','admin/specphoto/index');">规格图库</a></li>
		</ul></li>
	<li><span>热门搜索</span>
	<ul>
			<li><a
				href="javascript:tab('关键词列表','admin/keyword/index');">关键词列表</a></li>
			<li><a
				href="javascript:tab('搜索统计','admin/search/index');">搜索统计</a></li>
		</ul></li>
</ul>