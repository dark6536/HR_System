<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix = "c" 	uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel = "stylesheet" href= "${pageContext.request.contextPath}/css/page.css">
</head>
<body>
	<div id = "div_top">
		<table id = "table_title" >
			<tr>
				<td><a>公司简介</a></td>
				<td><a>加入我们</a></td>
				<td><div id = "cycle">
					<p>欢迎您${sessionScope.visitor.name}</p>
					<a href="/logout" id = "logout">注销</a>
				</div></td>
				<td><a href = "myresume">我的简历</a></td>
				<td><a>消息通知</a></td>
			</tr>
		</table>
	</div>
	<div id = "div_main">
		<div id = "div_left">
			<table >
				<tr>
					<td><a>公司简介</a></td>
				</tr>
				<tr>
					<td><a>加入我们</a></td>
				</tr>
				<tr>
					<td><a href = "myresume">我的简历</a></td>
				</tr>
				<tr>
					<td><a>消息通知</a></td>
				</tr>
			</table>
		</div>
		<div id = "div_right">
			<div id = "div_inform"></div>
			<div id = "div_recruitment"></div>
			<div id = "div_resume"></div>
		</div>
	</div>
	<div id = "div_bottom">
		
	</div>
</body>
</html>