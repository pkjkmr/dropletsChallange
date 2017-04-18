<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome <b> ${ userID } </b>
<BR>
Create Droplet
<br>
Select OS
<table border="1" >
<tr>
<c:forEach var="distribution" items="${distributionData}">
<td>
 <input type="radio" name="os" value="${distribution.name}"><c:out value="${distribution.name}" /> </input>
 <br>
 <select name="version" title="Select Version"> 
 <option value="0">Select Version</option>
   <c:forEach var="version" items="${distribution.versions}">
   	<option value="${ version }">${ version }</option>
   </c:forEach>
</select>
 </td>
</c:forEach>
</tr>
</table>
Select Size
<table border="1" >
<tr>
<c:forEach var="distributionSize" items="${distributionSizeList}">
<td>
 <input type="radio" name="sizePrize" value="${distributionSize.prizePerMonth}">
 	<c:out value="$ ${distributionSize.prizePerMonth}" />/Month<br> 
 	<c:out value="${distributionSize.gb_cpu}" /><br>
 	<c:out value="${distributionSize.ssd}" /><br>
 	<c:out value="${distributionSize.transferCap}" /> 
 </input>

 </td>
</c:forEach>
</tr>
</table>


Select Data Center
<table border="1" >
<tr>
<c:forEach var="dataCenter" items="${dataCenterList}">
<td>
 	<c:out value=" ${dataCenter.name}" /><br> 
 	<c:forEach var="id" items="${dataCenter.id}">
   	<input type="radio" name="dataCenter" value="${ id }">${ id }</<input>
   </c:forEach>
 </td>
</c:forEach>
</tr>
</table>
<br><br>
Additinal Details
<br>
<input type="checkbox" name="pn" />Private Netowrking &nbsp;&nbsp;
<input type="checkbox" name="bkp" />Backup &nbsp;&nbsp;
<input type="checkbox" name="ip" />IPv6 &nbsp;&nbsp;
<input type="checkbox" name="mo" />Monitoring &nbsp;&nbsp;

<br><br>
How Many Droplets
<br>
<input type="button" value="-" onclick="count(-1)"/>
<input type="text" id="dropletCount" size="5" value=5 />
<input type="button" value="+" onclick="count(1);"/>

</body>
<script type="text/javascript">
function count(x){
	var y = parseInt(document.getElementById('dropletCount').value)+x;
	if(y>0)
	document.getElementById('dropletCount').value=y;
}
</script>
</html>