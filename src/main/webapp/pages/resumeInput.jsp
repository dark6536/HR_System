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
			<div id = "div_myresume">
				<c:if test="${!empty sessionScope.resume}">
					<a>查看简历</a>
					<a>修改简历</a>
				</c:if>
				<c:if test = "${empty sessionScope.resume}">
					<a>新建简历</a>
				</c:if>
			</div>
			<form action = "resumeInput" method="post" id = "resume">
				<h1>创建简历</h1>
				<br><br>
				<table border="1px">
					<tr>
						<td>姓名：</td>
						<td><input type = "text" name = "name" required="required" class = "input"></td>
						<td>性别：</td>
						<td><input type = "radio" name = "gender" value = "男" checked>男
							<input type = "radio" name = "gender" value = "女">女
						</td>
					</tr>
					<tr>
						<td>年龄：</td>
						<td><input type = "number" name = "age" required="required" class = "input"></td>
						<td>生日：</td>
						<td><input type = "date" name = "birthday" required="required" class = "input"></td>
					</tr>
					<tr>
						<td>学历：</td>
						<td><select name = "education_background" class = "input">
							<option value = "1">大学本科</option>
							<option value = "2">硕士</option>
							<option value = "3">博士</option>
							<option value = "4">大专</option>
							<option value = "5">中专</option>
						</select></td>
						<td>毕业院校：</td>
						<td><input type = "text" name = "graduate_school" required ="required" class = "input"></td>
					</tr>
					<tr>
						<td>专业:</td>
						<td><input type = "text" name = "major" required="required" class = "input"></td>
						<td>毕业时间</td>
						<td><input type = "date" name = "graduate_time" required="requeired" class = "input"></td>
					</tr>
					<tr>
						<td>手机：</td>
						<td><input type = "number" name = "phone" required= "required" class = "input"></td>
						<td>邮箱</td>
						<td><input type = "email" name = "email" required= "required" class = "input"></td>
					</tr>
					<tr>
						<td>政治面貌：</td>
						<td><select name = "politics_status" class = "input">
							<option value = "1">群众</option>
							<option value = "2">党员</option>
							<option value = "3">团员</option>
							<option value = "4">其它党派</option>
						</select></td>
						<td>所在城市：</td>
						<td><input type = "text" name = "city" required="required" class = "input"></td>
					</tr>
					<tr>
						<td colspan="2"><button id = "save">保存</button></td>
						<td colspan="2"><button id = "reload">重置</button></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<div id = "div_bottom">
		
	</div>
</body>
</html>