<%-- 
    Document   : comm
    Created on : 26.04.2017, 18:28:16
    Author     : Elena
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="connection.DBCon"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/style.css" />
        <script language="javascript" src="js/enter&check.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <xml id="menu" src="menu.xml"></xml>
    <title>Интернет-магазин косметики Sharmi</title>
</head>
<body>
    <div id="body1">
        <div id="header">
            <div id="header">
                <div id="text">
                    <br>
                    <p id="p1"><i><b>Интернет-магазин косметики </b></i></p>
                    <p id="p2"><i><b>Sharmi</b></i></p>
                    <h3 id="h3">Sharmi - ангел-хранитель Вашей красоты!</h3>
                </div>
            </div>
            <div id="menu">
                <ul id="nav">
                    <li><a href="welcomAdmin.jsp">Главная</a></li>
                    <li><a href="Servlet?command=menuAdmin"> Товары </a></li>
                    <li><a href="Servlet?command=showcommAdmin"> Комментарии </a></li>
                </ul>
            </div>
            <div id="content">            
                <div id="sidebar">
                    <p align = "right"><font size="+1" color="#a9320d"> Здравствуйте, </font><font size="+2" color="#A52A2A"><i><%= (String) request.getSession().getAttribute("Login")%><font size="+1" color="#a9320d">!</font></i></font></p>
                    <br><a href = "index.jsp">Завершить работу</a>
                </div>  
                        <br>    <div id="welcome"> <h2 align ="center"><i>Комментарии</i></h2>

<br><br><br>
<table class="" width="750">
                        <tr>
                            <th width="100px">Логин пользователя</th>
                            <th width="300px">Комментарий</th>
                            <th width="80px"> </th>
                        </tr> 
                        <tr>
                            <c:forEach items="${requestScope.allcomm}" var="allcomm">   
                            <tr >
                                <td width="100px" align="center">${allcomm.login}</td>
                                <td width="300px" align="center">${allcomm.text}</td>
                                <td width="80px" align="center">
                                    <form  action="/Cosm/Servlet" method="POST">
                                        <input type="hidden" name="command" value="deletecomm"/>
                                        <input type="hidden" name="idComm" value="${allcomm.idComm}"/>
                                        <input type="image"  src="images/delete.png" name="delete">
                                    </form>
                                </td>
                            </tr>
                            </c:forEach>
                    </table>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
