<%-- 
    Document   : CoffeBar_List_View
    Created on : Nov 27, 2021, 12:47:08 PM
    Author     : hoa
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table> 
            <thead> 
                <tr> 
                    <th  class="text-center">ID</th> 
                    <th  class="text-center">Name</th> 
                    <th class="text-center">ADDR</th> 
                    <th  class="text-center">Hotline</th> 
                    <th  class="text-center">DESCRIPTION</th> 
                    <th  class="text-center">MAIL</th> 
                    <th style="width:8%"> </th> 
                </tr> 
            </thead> 
            <tbody>
                <c:forEach items="${coffs}" var="s">
                    <tr>
                        <td>${s.id}</td>
                        <td>${s.name}</td>
                        <td>${s.address}</td>
                        <td>${s.hotLine}</td>
                        <td>${s.description}</td>
                        <td>${s.mail}</td>
                        <td>
                            <form action="CoffeBar_Select" method="POST">
                                <input type="text" name="id" value="${s.id}" hidden="1">
                            <button>Delete</button>
                            </form>
                        </td>    
                    </tr>
                </c:forEach>
            </tbody>
        </table>
</body>
</html>
