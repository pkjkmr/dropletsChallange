<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Droplet</title>
</head>
<body>
	<table border="1">

		<c:forEach var="droplet" items="${dropletList}">
			<tr>
				<td>${ droplet.hostName }</td>
				<td>${ droplet.os }</td>
				<td>${ droplet.version }</td>
				<td>${ droplet.dataCenter }</td>
				<td>${ droplet.privateNetworking }</td>
				<td>${ droplet.backup }</td>
				<td>${ droplet.ipv6 }</td>
				<td>${ droplet.monitoring }</td>
				<td>${ droplet.date }</td>
				<td>${ droplet.user }</td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>