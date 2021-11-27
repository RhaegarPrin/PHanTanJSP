<%-- 
    Document   : Home
    Created on : Nov 27, 2021, 9:40:52 AM
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
            <form action="Home" method="Post">
                <span>ID</span><input type="text" name="id"><br>
                <span>NAME</span><input type="text" name="name"><br>
                <span>ADDR</span><input type="text" name="Addr"><br>
                <span>Hot Line</span><input type="text" name="Hotline"><br>
                <span>Description</span><input type="text" name="Description"><br>
                <span>Mail</span><input type="text" name="Mail"><br>
                <button>Insert</button>
            </form>
        </div>
        
        <div>
            <form action="Home" method="GET">
                <span>Search BY ID</span><br>
                <input name="id" type="text" placeholder="Blank mean find all records in CoffeBar Table"><br>
                <input name="msg" type="text" value="Search" hidden="1">
                <button>Search</button>
            </form>
        </div>
    </body>
</html>
