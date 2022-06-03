<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
body {font-family: Arial, Helvetica, sans-serif;}
form {border: 3px solid #f1f1f1;}

input[type=text], input[type=password] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

button {
  background-color: #04AA6D;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

button:hover {
  opacity: 0.8;
}

.cancelbtn {
  width: auto;
  padding: 10px 18px;
  background-color: #f44336;
}

.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
}

img.avatar {
  width: 40%;
  border-radius: 50%;
}

.container {
  padding: 16px;
}

span.psw {
  float: right;
  padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
  span.psw {
     display: block;
     float: none;
  }
  .cancelbtn {
     width: 100%;
  }
}
</style>
<title>Spring 4 Example</title>
</head>
<body>
<h3>Login Form</h3>
<FONT color="blue">
User Name="UserName" and password="password"
</FONT>

<form:form action="loginform.html"  commandName="loginForm">
	
	<div>
	 <label for="uname"><b>Username:<FONT color="red"><form:errors path="userName" /></FONT></b></label>
	 <form:input path="userName" />
	<label for="psw"><b>Password:<FONT color="red"><form:errors	path="password" /></FONT></b></label>
	<form:password path="password" />
	 <button type="submit">Login</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
	</div>
	
	<%-- <table>
		<tr>
			<td>User Name:<FONT color="red"><form:errors path="userName" /></FONT></td>
		</tr> --%>
		<%-- <tr>
			<td><form:input path="userName" /></td>
		</tr> --%>
		<%-- <tr>
			<td>Password:<FONT color="red"><form:errors	path="password" /></FONT></td>
		</tr> --%>
		<%-- <tr>
			<td><form:password path="password" /></td>
		</tr> --%>
		<!-- <tr>
			<td><input type="submit" value="Submit" /></td>
		</tr>
	</table> -->
</form:form>
</body>
</html>