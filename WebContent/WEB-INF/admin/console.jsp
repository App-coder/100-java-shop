<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="header.jsp" %>
<script type="text/javascript" src="resource/admin/top.js"></script>
<script type="text/javascript" src="resource/admin/js/index.js"></script>
</head>
<body id="bodycontainer" class="easyui-layout">
		<div region="north" style="height:85px;overflow:hidden;" class="headerNav">
			<a class="logo"></a>
            <ul class="nav">
                <li><a>修改密码</a></li>
                <li><a>修改资料</a></li>
                <li><a href="admin/webmaster/loginout">退出</a></li>
            </ul>
            <div id="navMenu">
				<ul>
					<li><a id="nav_goods" href="javascript:menuList('admin/webmaster/goods')"><span>商品</span></a></li>
					<li><a id="nav_member" href="javascript:menuList('admin/webmaster/member')"><span>会员</span></a></li>
					<li><a id="nav_order" href="javascript:menuList('admin/webmaster/order')"><span>订单</span></a></li>
					<li><a id="nav_market" href="javascript:menuList('admin/webmaster/market')"><span>营销</span></a></li>
					<li><a id="nav_stat" href="javascript:menuList('admin/webmaster/stat')"><span>统计</span></a></li>
					<li><a id="nav_system" href="javascript:menuList('admin/webmaster/system')"  class="selected" ><span>系统</span></a></li>
                    <li><a id="nav_tool" href="javascript:menuList('admin/webmaster/tool')"><span>工具</span></a></li>
				</ul>
			</div>
		</div>
		<div region="south" style="height:30px;background:#efefef;text-align: center;padding-top:5px;">
		中国百分百商城系统
		</div>
		<div region="west" split="true" style="width:150px;overflow:hidden;">
			<div id="lefttree" fit="true" class="easyui-panel" border="false">
			</div>
		</div>
		<div region="center" style="overflow:hidden;"  >
			<div id="tabs" tools="#tab-tools" fit="true" border="false" >
			</div>
		</div>
		
		<div id="tab-tools">
			<a class="easyui-linkbutton" plain="true" title="页面重载" iconCls="icon-reload" onclick="javascript:reloadTab()"></a>
		</div>
		
		<div id="mm" class="easyui-menu" style="width:150px;">
			<div id="mm-tabclose">关闭</div>
			<div id="mm-tabcloseall">全部关闭</div>
			<div id="mm-tabcloseother">除此之外全部关闭</div>
			<div class="menu-sep"></div>
			<div id="mm-tabcloseright">当前页右侧全部关闭</div>
			<div id="mm-tabcloseleft">当前页左侧全部关闭</div>
			<div class="menu-sep"></div>
			<div id="mm-exit">退出</div>
		</div>
</body>
</html>