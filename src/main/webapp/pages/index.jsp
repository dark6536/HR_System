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
					<a href="login">登录</a>
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
			<div id = "div_info">
			<h2>公司简介</h2>
			<p>&nbsp;&nbsp;死要钱信息有限公司位于上海漕河泾高新技术开发区，是在高新技术应用领域中专业从事应用系统开发、信息安全服务的高新技术企业。死要钱长期专注于物业管理、房地产、市政运营管理等相关行业信息化领域，凭借多年在应用系统开发以及信息安全服务的积累的经验，公司信息已经成为该领域内著名的应用系统解决方案提供商</p>
			<p>&nbsp;&nbsp;死要钱倡导“专业、务实、高效、创新”的企业精神，具有良好的内部机制。优良的工作环境以及良好的激励机制，吸引了一批年轻的、有学识的、具有实干精神的人才。高素质、高水平、高效率的人才是死要钱信息在当今激烈的市场中立于不败之地的保障。</p>
			<div id = "div_info_detail"><a href = "#">详情&nbsp;&nbsp;</a></div>
			</div>
			<div id = "div_recruitment">
			<table>
				<tr>
					<td><h2>招贤纳士</h2></td>
					<c:forEach items="${sessionScope.recruitments}" var="recruitments">
					<td>${recruitments.positions.name}</td>
					</c:forEach>
				</tr>
			</table>
			</div>
			<div id = "div_news">
				<div id = "div_news1">
				<h1>震惊！！！</h1>
				<br>
				<h1>28岁的死要钱董事长十年前竟然18岁！</h1>
				</div>
				<div id = "div_news2">
				<h1>喜报！！恭贺死要钱有限公司荣获2018年度Top100最具潜力公司。据悉，参加评选的只有100家公司</h1>
				</div>
				</div>		
		</div>
	</div>
	<div id = "div_bottom">
		
	</div>
</body>
</html>