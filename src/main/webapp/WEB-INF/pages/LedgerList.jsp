<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ledger Details</title>
</head>
<body>
	<center>
		<div style="color: teal; font-size: 30px">LedgerDetails</div>
	<table width="1000px">
	<tr style="text-align: left;">
	<td><a href="MoneyTransfer">Click Here To Money Transfer</a></td>
	<td></td>
	</tr>
	</table>
  <c:if test="${!empty ledgerList}">
   <table border="1" bgcolor="black" width="1000px">
    <tr
     style="background-color: teal; color: white; text-align: center;"
     height="40px">
     
     <td>ID</td>
     <td>Account Number</td>
     <td>CreditAmount</td>
     <td>DebitAmount</td>
     <td>BalanceAmount</td>
     <td>CreatedDate</td>
     <td>UpdatedDate</td>
    </tr>
    <c:forEach items="${ledgerList}" var="ledger">
     <tr
      style="background-color: white; color: black; text-align: center;"
      height="30px">
      
      <td><c:out value="${ledger.id}" />
      </td>
      <td><c:out value="${ledger.accountNo}" />
      </td>
      <td><c:out value="${ledger.creditAmount}" />
      </td>
      <td><c:out value="${ledger.debitAmount}" />
      </td>
      <td><c:out value="${ledger.balanceAmount}" />
      </td>
      <td><c:out value="${ledger.createdDate}" />
      </td>
      <td><c:out value="${ledger.updatedDate}" />
      </td>
     </tr>
    </c:forEach>
   </table>
  </c:if>
 </center>
</body>
</html>