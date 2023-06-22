<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<html>

<head>
	<title>Teachie Company Home Page</title>
</head>

<body>
	<h2>This is  Zemoso Home Page !!!!!Csk</h2>
	<hr>

	Welcome to the Zemoso company home page!

	<hr>

	<!-- display user name and role -->

	<p>
	    <!--Will give the userId and authorities/roles for the loggedin user-->

		User: <security:authentication property="principal.username" />
		<br><br>
		Role(s): <security:authentication property="principal.authorities" />
	</p>

	<security:authorize access="hasRole('MANAGER')">

		<!-- Add a link to point to /leaders ... this is for the managers -->

		<p>
			<a href="${pageContext.request.contextPath}/leaders">Leadership Meeting</a>
			(Only for Manager peeps)
		</p>

	</security:authorize>


	<security:authorize access="hasRole('ADMIN')">

		<!-- Add a link to point to /systems ... this is for the admins -->

		<p>
			<a href="${pageContext.request.contextPath}/systems">IT Systems Meeting</a>
			(Only for Admin peeps)
		</p>

	</security:authorize>


	<!-- Add a logout button -->
	<form:form action="${pageContext.request.contextPath}/logout"
			   method="POST">

		<input type="submit" value="Logout" />

	</form:form>
</body>

</html>