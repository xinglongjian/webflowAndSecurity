<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- <script type="text/javascript" src="<c:url value="/resources/dojo/dojo.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/spring/Spring.js" />"> </script>
<script type="text/javascript" src="<c:url value="/resources/spring/Spring-Dojo.js" />"> </script> -->
</head>
<body>
<form:form modelAttribute="orderForm" action="${flowExecutionUrl}">
   <table style="width: 100%">
     <tr>
        <td>
           Order Date:
        </td>
        <td>
           <form:input path="orderDate" disabled="true"/>
        </td>
     </tr>
    <!-- -->  <tr>
        <td>
           DeliveryDate:
        </td>
        <td>
           <form:input path="deliveryDate"/>
        </td>
     </tr>
     <tr>
     <td></td>
      <td>
      <input type="submit" id="previous" name="_eventId_previous" value="Previous"/>
      <input type="submit" id="cancel" name="_eventId_cancel" value="Cancel"/>
      <input type="submit" id="finish" name="_eventId_ok" value="Finish"/>
      </td>
     </tr>
   </table>
   <p/>
</form:form>
</body>
</html>