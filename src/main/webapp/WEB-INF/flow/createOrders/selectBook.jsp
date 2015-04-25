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
           SelectableBooks:
        </td>
        <td>
           <form:select path="bookId" items="${selectableBooks }"/>
        </td>
     </tr>
       <tr>
        <td>
           Quantity:
        </td>
        <td>
           <form:input path="quantity"/>
        </td>
     </tr>
     <tr>
       <td>
          <input type="submit" id="add" name="_eventId_add" value="Add"/>
        <input type="submit" id="reset" name="_eventId_reset" value="Reset"/>
       </td>
     </tr>
   </table>
   <p/>
   <h3>Selected Books</h3>
   <div style="margin-top: 10px;margin-bottom: 10px">
      <table style="width: 100%" rules="groups">
          <thead>
            <tr>
              <th>
                 Book ID
              </th>
              <th>
                 Quantity
              </th>
            </tr>
          </thead>
          <tbody>
             <tr height="10px"/>
             <c:forEach items="${orderForm.selectBookes }" var="book">
               <tr>
                 <td>${book.key.id }</td>
                 <td>${book.value}</td>
               </tr>
             </c:forEach>
          </tbody>
      </table>
   </div>
   <div align="left" style="margin-bottom: 20px">
     <button type="submit" id="previous" name="_eventId_previous">previous</button>
     <button type="submit" id="cancel" name="_eventId_cancel">Cancel</button>
     <button type="submit" id="next" name="_eventId_next">Next</button>
   </div>
</form:form>
</body>
</html>