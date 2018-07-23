<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Login Page</title>
<script type="text/javascript" src = "${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
<script type="text/javascript">
	$(function(){
		$("#visitor").click(function(){
			$("form").attr("action","visitor/visitorLogin");
			$("form").submit();
		})
		$("#employee").click(function(){
			$("form").attr("action","employee/employeeLogin");
			$("form").submit();
		})
		$("#admin").click(function(){
			$("form").attr("action","admin/adminLogin");
			$("form").submit();
		})
	})
</script>
<style>
	*{
		padding:0;
		margin:0;
	}
	#img_index{
		width:100%;
	}
	form{
		margin-top:-100px;
		margin-left:1100px;
	}
	button{
		width:400px;
		height:60px;
		font-size:40px;
		color:gray;
	}
	div{
		text-align: center;
		color:white;
		font-size: 50px;
		font-weight: bold;
		margin-top:-500px;
		margin-left:300px;
		width:450px;
		
	}
</style>
</head>
<body>
	<img src="${pageContext.request.contextPath}/images/star2.gif" id = "img_index">
	<div>
		死要钱信息有限公司登录系统
	</div>
	<form action = "">
		<button id = "visitor">游客入口</button><br><br><br>
		<button id = "employee">员工入口</button><br><br><br>
		<button id = "admin">管理员入口</button>
	</form>
</body>
</html>