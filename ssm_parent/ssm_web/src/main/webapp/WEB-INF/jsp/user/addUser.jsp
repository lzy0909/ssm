<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../common/path.jsp"%>

<html>
	<head>
		<title>My JSP 'addUser.jsp' starting page</title>
	</head>

	<body>
		<form action="${basePath}/muserController/addUser.do" method="POST">
			<table>
				<tr>
					<td>name:</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>age:</td>
					<td><input type="text" name="age"></td>
				</tr>
				<tr>
					<td>address:</td>
					<td><input type="text" name="address"></td>
				</tr>
				<tr>
					<td>
						<input type="submit" value="Save">
					</td>
					<td>
						<input type="reset" value="Reset">
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>