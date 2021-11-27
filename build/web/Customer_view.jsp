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
                    <th  class="text-center">MOBILE</th> 
                    <th  class="text-center">Note</th> 
                    <th style="width:8%"> </th> 
                </tr> 
            </thead> 
            <tbody>
                <c:forEach items="${list_cus}" var="s">
                    <tr>
                        <td>${s.id}</td>
                        <td>${s.fullName}</td>
                        <td>${s.address}</td>
                        <td>${s.mobile}</td>
                        <td>${s.note}</td>
                        <td>
                            <form action="Customer_delete_update" method="Get">
                                <input type="text" name="id" value="${s.id}" hidden="1">
                                <button>Delete</button>
                            </form>
                        </td>    
                    </tr>
                    <tr>
                <form action="Customer_delete_update" method="Post">
                    <td><input type="text" name="id" value="${s.id}"></td>
                    <td><input type="text" name="fullName" value="${s.fullName}"></td>
                    <td><input type="text" name="address" value="${s.address}"></td>
                    <td><input type="text" name="mobile" value="${s.mobile}"></td>
                    <td><input type="text" name="note" value="${s.note}"></td>
                    <td><button>UPDATE</button></td>
                </form>
            </tr>
        </c:forEach>
    </tbody>
</table>

<a href="Customer_insert_template.jsp">Insert Customer</a>
</body>
</html>
