<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="submitadmissionform.html" method="post">
		<h1>Student Admission Form</h1>

		<p>
			Student name : <input type="text" name="studentName" />
		</p>
		<p>
			Date of birth : <input type="date" name="studentDOB" />
		</p>
		<p>
			Gender : <input type="radio" name="gender">Female</input> <input
				type="radio" name="gender">Male</input>
		<p>
			Address :
			<textarea name="address" rows="4" cols="20"></textarea>
		</p>
		<p>
			<input type="submit" name="submit" value="Submit" />
		</p>
	</form>

</body>
</html>