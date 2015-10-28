<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Spring MVC Demo</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css"
	integrity="sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ=="
	crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"
	integrity="sha512-K1qjQ+NcF2TYO/eI3M6v8EiNYZfA95pQumfvcVrTHtwQVDG+aHRqLi/ETn2uB+1JqwYqVG3LIvdm9lj6imS/pQ=="
	crossorigin="anonymous"></script>
</head>
<body>
	<div class="container-fluid">
		<h4>Change Password</h4>
		<form:form action="changePassword" class="change-password"
			method="post" modelAttribute="changePasswordForm" role="form">
			<spring:bind path="currentPassword">
				<div
					class="form-group form-group-sm ${status.error ? 'has-error' : ''}">
					<label class="control-label" for="currentPassword">Current
						password</label>
					<form:input path="currentPassword" type="password"
						class="form-control" id="currentPassword" />
					<form:errors path="currentPassword" class="control-label" />
				</div>
			</spring:bind>
			<spring:bind path="newPassword">
				<div
					class="form-group form-group-sm ${status.error ? 'has-error' : ''}">
					<label class="control-label" for="newPassword">New password</label>
					<form:input path="newPassword" type="password" class="form-control"
						id="newPassword" />
					<form:errors path="newPassword" class="control-label" />
				</div>
			</spring:bind>
			<spring:bind path="confirmPassword">
				<div
					class="form-group form-group-sm ${status.error ? 'has-error' : ''}">
					<label class="control-label" for="confirmPassword">Confirm
						password</label>
					<form:input path="confirmPassword" type="password"
						class="form-control" id="confirmPassword" />
					<form:errors path="confirmPassword" class="control-label" />
				</div>
			</spring:bind>
			<div class="form-group form-group-sm">
				<button type="submit" class="btn btn-primary">Change</button>
				<button type="reset" class="btn btn-default"
					onClick="window.close();">Cancel</button>
			</div>
		</form:form>
	</div>
</body>
</html>