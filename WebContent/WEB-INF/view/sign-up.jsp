<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
	<head>
		<meta charset="utf-8" />
		<title>Join Us!</title>
        <meta name="description" content = "Log into the system"/>
        <meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1"/>
        <link rel='stylesheet' type='text/css' href="${pageContext.request.contextPath}/resources/css/style-login.css">
	</head>
	
	<body>
		<div id="container">
			<div id="signin-page">
				<div id="signin-title"> Registration form </div>
				
					<form:form action="user-confirmation" modelAttribute="user" method="POST">
						<div id="signin-left">
							First Name:
							<br><br>
							<input type="text" name="firstName" placeholder="Enter your first name"/><br/><br/>  
							Last Name:
							<br><br>
							<input type="text" name="lastName" placeholder="Enter your last name"/><br/><br/>  					
							Email:
							<br><br> 
							<input type="text" name="email" placeholder="Enter your email"/><br/><br/>
						</div> 
							
						<div id="signin-right">
							Login:
							<br><br> 
							<input type="text" name="login" placeholder="Enter your username"/><br/><br/>
							Password:
							<br><br> 
							<input type="password" name="password" placeholder="Enter your password"/><br/><br/>
							Confirm password:
							<br><br> 
							<input type="password" name="confirmPassword" placeholder="Confirm password"/><br/><br/>
							<input type="submit" value="Sign Up"/>  
						</div>
					</form:form>  
				</div>
			</div>
	</body>
</html>