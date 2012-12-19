<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${webtitle}</title>
<!--[if lt IE 8]> 
<script src="http://ie7-js.googlecode.com/svn/version/2.1(beta4)/IE8.js"></script> 
<![endif]-->
<link rel="stylesheet" type="text/css" href="../../resource/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="../../resource/easyui/themes/icon.css">
<script type="text/javascript" src="../../resource/easyui/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="../../resource/easyui/jquery.easyui.min.js"></script>
