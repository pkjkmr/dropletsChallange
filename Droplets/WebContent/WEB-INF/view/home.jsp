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
	Welcome
	<b> ${ userID } </b>
	<br>
	<BR> Create Droplet

	<br>
	<br> Select OS
	<br>
	<form action="createDroplet" method="post">
		<input type="hidden" name="userId" value="${ userID }">
		<table border="1">
			<tr>
				<c:forEach var="distribution" items="${distributionData}">
					<td><input type="radio" name="os" id="os"
						value="${distribution.name}" /> ${distribution.name}<br> <select
						name="${distribution.name}version" title="Select Version">
							<option value="0">Select Version</option>
							<c:forEach var="version" items="${distribution.versions}">
								<option value="${ version }">${ version }</option>
							</c:forEach>
					</select></td>
				</c:forEach>
			</tr>
		</table>
		<br> <br> Select Size
		<table border="1">
			<tr>
				<c:forEach var="distributionSize" items="${distributionSizeList}">
					<td><input type="radio" name="sizePrize"
						value="${distributionSize.prizePerMonth}"> <c:out
							value="$ ${distributionSize.prizePerMonth}" />/Month<br> <c:out
							value="${distributionSize.gb_cpu}" /><br> <c:out
							value="${distributionSize.ssd}" /><br> <c:out
							value="${distributionSize.transferCap}" /></td>
				</c:forEach>
			</tr>
		</table>

		<br> <br> Select Data Centre
		<table border="1">
			<tr>
				<c:forEach var="dataCenter" items="${dataCenterList}">
					<td><c:out value=" ${dataCenter.name}" /><br> <c:forEach
							var="id" items="${dataCenter.id}">
							<input type="radio" name="dataCenter" value="${ id }"
								onclick="hostName()">${ id }</<input>
						</c:forEach></td>
				</c:forEach>
			</tr>
		</table>
		<br>
		<br> <br> Additional Details <br> <input
			type="checkbox" name="pn" />Private Networking &nbsp;&nbsp; <input
			type="checkbox" name="bkp" />Backup &nbsp;&nbsp; <input
			type="checkbox" name="ipv6" />IPv6 &nbsp;&nbsp; <input
			type="checkbox" name="mo" />Monitoring &nbsp;&nbsp; <br> <br>
		<table>
			<thead>
				<tr>
					<td>How Many Droplets</td>
					<td>Choose a Host Name</td>
				</tr>
			</thead>
			<tr>
				<td><input type="button" value="-" onclick="count(-1)" /> <input
					type="text" id="dropletCount" size="5" value=1 /> <input
					type="button" value="+" onclick="count(1);" /></td>
				<td>
					<div id="hosts">
						<input type="text" name="hostName[]" id="hostName[]" value="" />
					</div>
				</td>
			</tr>
		</table>
		<br> <br> <input type="submit" value="Create">
	</form>
</body>
<script type="text/javascript">
	var name;
	function count(x) {
		var y = parseInt(document.getElementById('dropletCount').value) + x;

		if (y > 0) {
			if (x == 1) {
				var name2 = name + "-" + y;
				var element = document.createElement("input");
				//Assign different attributes to the element. 
				element.type = "text";
				element.value = name2; 
				element.name = "hostName[]";

				var foo = document.getElementById("hosts");
				var elementBR = document.createElement("br");
				foo.appendChild(elementBR);
				foo.appendChild(element);

			} else {
				var hostName = document.getElementsByName('hostName[]');
				var foo = document.getElementById("hosts");
				foo.removeChild(hostName[y]);
			}
			document.getElementById('dropletCount').value = y;
		}
	}

	function hostName() {
		name = "";
		var os = document.getElementsByName('os');
		for ( var i = 0; i < os.length; i++) {
			if (os[i].checked) {
				name = os[i].value;
			}
		}
		var sizePrize = document.getElementsByName('sizePrize');
		for ( var i = 0; i < sizePrize.length; i++) {
			if (sizePrize[i].checked) {
				name = name + "-" + sizePrize[i].value;
			}
		}
		var dataCenter = document.getElementsByName('dataCenter');
		for ( var i = 0; i < dataCenter.length; i++) {
			if (dataCenter[i].checked) {
				name = name + "-" + dataCenter[i].value;
			}
		}
		document.getElementById('hostName[]').value = name + "-1";
	}
</script>
</html>