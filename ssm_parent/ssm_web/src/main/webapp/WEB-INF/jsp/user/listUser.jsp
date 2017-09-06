<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../common/path.jsp"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${title}</title>
<script type="text/javascript" src="${basePath}/js/jquery-3.2.1.js"></script>
<script type="text/javascript">
	var basePath='${basePath}';
</script>
</head>
<body>
  	<h3>UserList</h3>
  	<a href="${basePath}/jsp/user/addUser.jsp">Add User</a><br/>
	<table border="1">
   		<tr>
   			<td>Id</td>
   			<td>Name</td>
   			<td>Age</td>
   			<td>Address</td>
   			<td>Delete</td>
   			<td>Update</td>
   		</tr>
   		<c:forEach items="${userlist}" var="user">
   		<tr>
   			<td>${user.id }</td>
   			<td>${user.name }</td>
   			<td>${user.age }</td>
   			<td>${user.address }</td>
   			<td><a href="${basePath}/muserController/deleteUser.do?id=${user.id }">Delete</a></td>
   			<td><a href="${basePath}/muserController/updateUserUI.do?id=${user.id }">Update</a></td>
   		</tr>
   		</c:forEach>
   </table>
   
</body>
<script type="text/javascript">
	$(function(){
		$.ajax({
			type: "POST",
			url: basePath + "/muserController/test.do",
			dataType: "json",
			success: function (result) {
				if(result.statusCode == 1) {
					console.log(result.data);
				}else{
					console.log("error");
				}
			}
		});
	})
</script>
</html>