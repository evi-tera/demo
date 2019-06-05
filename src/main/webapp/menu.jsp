<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>

<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>

<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Hello</title>
<link href="css/styles.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/common.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
</head>

<div class="title">Demo</div>
<form:form method = "GET" action='result-data-import'>
	<div class="menu-button"><input type="button" value="Data Import" onclick="openPage('result-data-import');"></div>
	<div class="menu-button"><input type="button" value="Recursive" onclick="openPage('recursive');"></div>
</form:form>
</html>