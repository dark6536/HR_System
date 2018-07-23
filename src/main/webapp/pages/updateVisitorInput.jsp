<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action = "updateVisitorInput">
		<table>
			<tr>
				<td><input type = "hidden" name = "id" value = "${sessionScope.visitor.id}" ></td>
				<td><input type = "text" name = "name" id = "name" placeholder = "${sessionScope.visitor.name}"></td>
				<td><input type = "password" name = "password" id = "password" placeholder = "${sessionScope.visitor.password}"></td>
				<td><input type = "number" name = "phone" id = "phone" value = "${sessionScope.visitor.phone}" disabled="disabled"></td>
				<td><button>提交</button></td>
			</tr>
		</table>
	</form>
</body>
</html>