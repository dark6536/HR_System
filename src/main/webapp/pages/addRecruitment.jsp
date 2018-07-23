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
				<td id="td_add">添加系统&nbsp;&#10148
					<ul id = "ul_add">
						<li><a href = "insertDepartment">添加部门信息</a></li>
						<li>添加岗位信息</li>
						<li>添加员工信息</li>
						<li>添加培训信息</li>
						<li><a href= "insertRecruitment">添加招聘信息</a></li>
						<li>添加奖惩信息</li>
					</ul>
				</td>
				<td id = "td_delete">删除系统&nbsp;&#10148
					<ul id = "ul_delete">
						<li><a href = "deleteDepartment">删除部门信息</a></li>
						<li>删除岗位信息</li>
						<li>删除员工信息</li>
						<li>删除培训信息</li>
						<li>删除招聘信息</li>
						<li>删除奖惩记录</li>
					</ul></td>
				<td><div id = "cycle">
					<p>欢迎您</p>
					<p>管理员</p>
					<a href="/logout" id = "logout">注销</a>
				</div></td>
				<td id = "td_update">修改系统&nbsp;&#10148
					<ul id = "ul_update">
						<li><a href = "updateDepartment">修改部门信息</a></li>
						<li>修改岗位信息</li>
						<li>修改员工信息</li>
						<li>修改培训信息</li>
						<li>修改招聘信息</li>
						<li>修改奖惩信息</li>
					</ul></td>
				<td id = "td_query">查看系统&nbsp;&#10148
					<ul id = "ul_query">
						<li><a href = "queryDepartment">查询部门信息</a></li>
						<li>查询岗位信息</li>
						<li>查询员工信息</li>
						<li>查询培训信息</li>
						<li>查询招聘信息</li>
						<li>查询奖惩信息</li>
						<li>查询考勤信息</li>
					</ul></td>
			</tr>
		</table>
	</div>
	<div id = "div_main">
		<div id = "div_left">
			<table >
				<tr>
					<td id="div_left_td_add">添加系统&nbsp;&#10148
					<ul id = "ul_add">
						<li><a href = "insertDepartment">添加部门信息</a></li>
						<li>添加岗位信息</li>
						<li>添加员工信息</li>
						<li>添加培训信息</li>
						<li><a href= "insertRecruitment">添加招聘信息</a></li>
						<li>添加奖惩信息</li>
					</ul>
				</td>
				</tr>
				<tr>
					<td id = "div_left_td_delete">删除系统&nbsp;&#10148
					<ul id = "ul_delete">
						<li><a href = "deleteDepartment">删除部门信息</a></li>
						<li>删除岗位信息</li>
						<li>删除员工信息</li>
						<li>删除培训信息</li>
						<li>删除招聘信息</li>
						<li>删除奖惩记录</li>
					</ul></td>
				</tr>
				<tr>
					<td id = "div_left_td_update">修改系统&nbsp;&#10148
					<ul id = "ul_update">
						<li><a href = "updateDepartment">修改部门信息</a></li>
						<li>修改岗位信息</li>
						<li>修改员工信息</li>
						<li>修改培训信息</li>
						<li>修改招聘信息</li>
						<li>修改奖惩信息</li>
					</ul></td>
				</tr>
				<tr>
					<td id = "div_left_td_query">查看系统&nbsp;&#10148
					<ul id = "ul_query">
						<li><a href = "queryDepartment">查询部门信息</a></li>
						<li>查询岗位信息</li>
						<li>查询员工信息</li>
						<li>查询培训信息</li>
						<li>查询招聘信息</li>
						<li>查询奖惩信息</li>
						<li>查询考勤信息</li>
					</ul></td>
				</tr>
			</table>
		</div>
		<div id = "div_right">
				<form action = "addRecruitmentInput" id = "addRecruitment">
					<table>
						<tr>
							<td><select name = "chooseDepartment">
								<option>选择部门</option>
								<c:forEach items="${sessionScope.departments}" var="departments">
								<option value = "${departments.id}">${departments.name}</option>
								</c:forEach>
								</select>
								<select>
								<option>选择职位</option>
								<c:forEach items="${sessionScope.positions}" var="positions">
								<option value = "${positions.id}">${positions.name}</option>
								</c:forEach>
							</select></td>
						</tr>
						<tr>
							<td>职位介绍：<input type = "text" name = "recruitment_detail" disabled="disabled"></td>
						</tr>
						<tr>
							<td>职位要求<input type = "text" name = "recruitment_require" disabled="disabled"></td>
						</tr>
						<tr>
							<td>薪资：<input type = "number" name = "salary" id = "salary"></td>
						</tr>
						<tr>
							<td><button id = "addRecrument">新增</button><button id = "addRecruitment_apply">提交</button></td>
						</tr>
					</table>
				</form>
			</div>
	</div>
	<div id = "div_bottom">
		
	</div>
</body>
</html>