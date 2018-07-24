<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix = "c" 	uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel = "stylesheet" href= "${pageContext.request.contextPath}/css/page.css">
<script type="text/javascript" src = "${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
	<script type="text/javascript">
	var ctx = "${ctx}";
	$(function(){
		windowInit();
	});
	function windowInit(){
	        
	        var today = new Date();
	        var year = today.getFullYear();
	        var month = today.getMonth()+1;
	        document.getElementById("year").value = year;
	        document.getElementById("month").value = month;
	        
	        showCalender();
	    }
	    
	    function showCalender(){
	        var year = document.getElementById("year").value;
	        var month = document.getElementById("month").value;
	       
	        myCalender(year,month,"cla");
	    }


	   function myCalender(year,month,tbId){
	var oTable = document.getElementById(tbId);//取得table
	 var oTBody = oTable.tBodies[1];
	var row_length = oTBody.rows.length;
	 for(var rows = 0 ; rows < row_length; rows ++){


	     oTBody.deleteRow(0);
	 }
	 var crrentDay = new Date();
	 crrentDay.setYear(year);
	 crrentDay.setMonth(month);
	 var maxIndex = new Date(crrentDay.getFullYear(),crrentDay.getMonth(),0).getDate();


	 var firstIndex = new Date(crrentDay.getFullYear(),crrentDay.getMonth()-1,1).getDay();
	 if(firstIndex==0){
	firstIndex=6;
	 }else{
	firstIndex-=1;
	 }


	 var days = new Array(42);
	 
	 for(var d = 0 ; d < maxIndex ; d ++){
	     days[firstIndex+d] = d+1;
	 }
	 
	 for(var d = 0 ; d < 42 ; d ++){
	     if(days[d] == null || days[d] == ""){
	         days[d] = "&nbsp;";
	     }
	 }
	 for(var j=0; j<6 ; j++) { 
	    var newTr = document.createElement("TR");
	    for(var i=j*7 ; i< (j+1)*7 ;i++) { 
	        var newTd = document.createElement("TD");
	        if(days[i] == "&nbsp;"){
	            newTd.innerHTML = days[i];
	        }else{
	            var v_date = year+"-"+month+"-"+days[i];
	            newTd.innerHTML = "<font size='5' style='color: #149ac1;cursor:pointer'>"+days[i]+"</font>";
	        }
	        
	        newTd.setAttribute("width","100px");
	        newTd.setAttribute("height","80px");
	        newTr.appendChild(newTd);
	    }
	    oTBody.appendChild(newTr); 
	}
	}
	</script>
</head>
<body>
	<div id = "div_top">
		<table id = "table_title" >
			<tr>
				<td id="td_add">添加系统&nbsp;&#10148
					<ul id = "ul_add">
						<li><a href = "insertDepartment">添加部门信息</a></li>
						<li><a href = "insertPosition">添加岗位信息</a></li>
						<li><a href = "insertEmployee">添加员工信息</a></li>
						<li><a href = "insertTrain">添加培训信息</a></li>
						<li><a href= "insertRecruitment">添加招聘信息</a></li>
						<li><a href = "insertRewardAndPunishment">添加奖惩信息</a></li>
					</ul>
				</td>
				<td><div id = "cycle">
					<p>欢迎您</p>
					<p>管理员</p>
					<a href="/logout" id = "logout">注销</a>
				</div></td>
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
			<div id = "admin_inform"></div>
			<table id="calendar" border="0" cellspacing="0" cellpadding="0">
                <tr>
                    <td valign="top" style="padding-right: 5px; padding-bottom: 10px">                     
                        <table border="0" cellspacing="0" cellpadding="0">                        
                            <tr>
                                <td>
                                    <table border="0" cellspacing="0" cellpadding="0"
                                        class="black12_18 tab_line" id="cla">
                                        <tr>
                                            <td colspan="7" align="center" height="50">
                                                <select id="year" onchange="showCalender();">
                                                    <option value="2017">2017</option>
                                                    <option value="2018">2018</option>
                                                    <option value="2019">2019</option>
                                                    <option value="2020">2020</option>
                                                    <option value="2021">2021</option>
                                                    <option value="2022">2022</option>
                                                    <option value="2023">2023</option>
                                                </select>&nbsp;年&nbsp;
                                                <select id="month" onchange="showCalender();">
                                                    <option value="1">1</option>
                                                    <option value="2">2</option>
                                                    <option value="3">3</option>
                                                    <option value="4">4</option>
                                                    <option value="5">5</option>
                                                    <option value="6">6</option>
                                                    <option value="7">7</option>
                                                    <option value="8">8</option>
                                                    <option value="9">9</option>
                                                    <option value="10">10</option>
                                                    <option value="11">11</option>
                                                    <option value="12">12</option>
                                                </select>&nbsp;月&nbsp;&nbsp;
                                               
                                            </td>
                                        </tr>
                                        <tr>
                                        
                                            <th width="100px" height="60px">
                                                <font size="size="5">一</font>
                                            </th>
                                            <th width="100px" height="60px">
                                                <font size="size="5">二</font>
                                            </th>
                                            <th width="100px" height="60px">
                                                <font size="size="5">三</font>
                                            </th>
                                            <th width="100px" height="60px">
                                                <font size="size="5">四</font>
                                            </th>
                                            <th width="100px" height="60px">
                                                <font size="size="5">五</font>
                                            </th>
                                            <th width="100px" height="60px">
                                                <font color="red" size="5">六</font>
                                            </th>
                                            <th width="100px" height="60px">
                                                <font color="red" size="5">日</font>
                                            </th>
                                        </tr>
                                        <TBODY align="center">                                            
                                        </TBODY>
                                    </table>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
            </table>
		</div>
		<div id = "div_right">
				<form action = "addTrainInput" id = "addTrain" >
					<table border="1px" cellpadding="0" cellspacing="0">
						<tr>
							<td>培训名称：<input type = "text" name = "name" required="required" id = "name"></td>
						</tr>
						<tr>
							<td>培训导师：<input type = "text" name = "teacher" required="required" id = "teacher"></td>
						</tr>
						<tr>	
							<td>培训时间：<input type = "date" name = "time" required="required" id = "time"></td>
						</tr>
						<tr>
							<td>参加部门<select name = "chooseDepartment">
								<option value = "0">请选择</option>
								<c:forEach items="${sessionScope.departments}" var="departments">
								<option value = "${departments.id}">${departments.name}</option>
								</c:forEach>
								</select>
								<textarea></textarea>
							</td>
						</tr>
						<tr>
							<td>参加个人<select name = "chooseEmployee">
								<option value = "0">请选择</option>
								<c:forEach items="${sessionScope.employees}" var="employees">
								<option value = "${employees.id}">${employees.name}</option>
								</c:forEach>
								</select>
								<textarea></textarea>
							</td>
						</tr>
						<tr>	
							<td><button id = "addTrain_apply">提交</button></td>
						</tr>
					</table>
				</form>
			</div>
	</div>
	<div id = "div_bottom">
		
	</div>
</body>
</html>