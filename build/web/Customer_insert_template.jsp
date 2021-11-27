<%-- 
    Document   : Customer_insert_template
    Created on : Nov 27, 2021, 4:46:27 PM
    Author     : hoa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <div>
            <form action="Customer_view" method="Post">
                <span>ID</span><input type="text" name="id"><br>
                <span>NAME</span><input type="text" name="fullName"><br>
                <span>ADDR</span><input type="text" name="Addr"><br>
                <span>Hot Line</span><input type="text" name="Mobile"><br>
                <span>Description</span><input type="text" name="Note"><br>
                <button>Insert</button>
            </form>
        </div>
    </body>
</html>
