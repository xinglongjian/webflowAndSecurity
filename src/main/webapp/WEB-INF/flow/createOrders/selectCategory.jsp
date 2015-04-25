<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form modelAttribute="orderForm" action="${flowExecutionUrl }">
   <table style="width: 100%">
     <tr>
        <td>
           <form:select path="categoryId" items="${selectableCategories }"/>
        </td>
     </tr>
     <tr>
       <td>
          <input type="submit" id="cancel" name="_eventId_cancel" value="Back"/>
        <input type="submit" id="next" name="_eventId_next" value="Next"/>
       </td>
     </tr>
   </table>
</form:form>
</body>
</html>