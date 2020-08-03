<%@page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Money Transfer Page</title>
</head>
<body>
	<center>
		<div style="color: teal; font-size: 30px">Money Transfer Form</div>
	<br>
  <c:url var="moneyTransfer" value="moneyTransfer.html" />
  <form:form id="moneyTransfer" modelAttribute="moneyTransfer" method="post"
   action="moneyTransfer">
   <table width="400px" height="400px" frame="box">
    <tr>
     <td><form:label path="accountNo">Account Number</form:label></td>
     <td><form:input path="accountNo"/></td>
    </tr>
    <tr>
     <td><form:label path="debitAmount">Entry Amount</form:label>
     </td>
     <td><form:input path="debitAmount"/>
     </td>
    </tr>
    <tr>
     <td></td>
     <td><input type="submit" value="Submit" />&nbsp;&nbsp;&nbsp;<input type="reset" value="ReSet" /></td>
    </tr>
   </table>
  </form:form>
<br></br>

  <a href="showLedgerDetails">Click Here to see Ledger List</a>
 </center>
	
</body>
</html>