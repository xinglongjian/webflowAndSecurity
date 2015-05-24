<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:url value="/login" var="loginurl"/>
<form action="${loginurl}" method="post">
  <c:if test="${param.error }">
  <p>
    Invalid username and password.
  </p>
  </c:if>
  <c:if test="${param.logout }">
  You have been logged out.
  </c:if>

  <div><label>User Name:<input type="text" name="username"/></label></div>
  <div><label>Password:<input type="text" name="password"/></label></div>
  <div><input type="submit" value="Sign IN"/> </div>
  <input type="hidden"                        
        name="${_csrf.parameterName}"
        value="${_csrf.token}"/>
</form>
</body>
</html>