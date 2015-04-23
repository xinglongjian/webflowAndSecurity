<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${flowExecutionUrl}">
  <table>
    <tr>
      <td>
        <select id="selectCategory" name="selectCategory">
           <#list selectableCategories?keys as key>
             <option value="${key}">${selectableCategories.get(key)}</option>
           </#list>
        </select>
      </td>
    </tr>
    <tr>
      <td>
        <input type="submit" id="cancel" name="_eventId_cancel" value="è¿å"/>
        <input type="submit" id="next" name="_eventId_next" value="æäº¤"/>
      </td>
    </tr>
  </table>
</form>
</body>
</html>