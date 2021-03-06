<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
	<head>
		<title>Join Us!</title>
		<meta charset="utf-8" />
        <title>TuDu List</title>
        <meta name="description" content = "Log into the system"/>
        <meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1"/>
        <link rel='stylesheet' type='text/css' href="${pageContext.request.contextPath}/resources/css/style-login.css">
	</head>
	
	<body>
		<div id="container">
			<div id="login-page">
				<div id="login-left">
					<img src="${pageContext.request.contextPath}/resources/images/TuDuLogo.png"/>
				</div>
				<div id="login-right">
					<div id="login-form">
						<form:form action="user-confirmation" modelAttribute="user" method="POST">  
							First Name:
							<br><br> 
							<input type="text" name="firstName"/><br/><br/>  
							Last Name:
							<br><br>
							<input type="text" name="LastName"/><br/><br/>  
							<input type="submit" value="login"/>  
						</form:form>  
					</div>
				</div>
			</div>
		</div>
	</body>


</html>