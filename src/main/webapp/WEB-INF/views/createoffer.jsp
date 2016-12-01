<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<form method="get"
		action="${pageContext.request.contextPath }/docreate">
		<table class ="formtable">
			<tr>
				<td class ="label">Name:</td>
				<td><input name="name" type="text" /></td>
			</tr>
			<tr>
				<td class ="label">Email:</td>
				<td><input name="email" type="text" /></td>
			</tr>
			<tr>
				<td class ="label">text:</td>
				<td><textarea name="text" rows="10" cols="10"> </textarea></td>
			</tr>
			<tr>
				<td class ="label "></td>
				<td><input value="Create offer" type="submit" /></td>
			</tr>

		</table>

	</form>
</body>
</html>