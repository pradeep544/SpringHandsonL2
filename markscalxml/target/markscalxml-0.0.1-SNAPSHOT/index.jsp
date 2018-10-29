<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Enter Marks for each subject</title>
</head>
<body>
	<form action="welcome" method="get">
		Maths:<input type = "text" name="maths" required><br>
		Science:<input type = "text" name="science" required><br>
		English: <input type = "text" name="english" required><br>
		<input type = "submit" value = "calculate">
	</form>
</body>
</html>