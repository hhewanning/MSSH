<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>删除分类</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
	body {background: rgb(254,238,189);}
</style>
  </head>
  
  <body>
    <h1>删除出版社</h1>
    <form action="${pageContext.request.contextPath}/publish/delPublish" method="post" target="body">
    	<input type="hidden" name="pid" value="${publish.pid }" />
    	
    	出版社名称：<input type="text" name="pname" value="${publish.pname }" disabled="disabled"/>
    	<input type="submit" value="删除出版社"/>
    </form>
  </body>
</html>
