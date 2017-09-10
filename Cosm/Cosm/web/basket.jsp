<%-- 
    Document   : basket
    Created on : 16.05.2015, 17:54:26
    Author     : Home
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="connection.DBCon"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<?xml version="1.0" encoding="UTF-8"?>
<?xml-stylesheet href="menu.xsl" type="text/xsl" ?>
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
                <div id="text">
                <br>
                <p id="p1"><i><b>Интернет-магазин косметики </b></i></p>
                 <p id="p2"><i><b>Sharmi</b></i></p>
                <h3 id="h3">Sharmi - ангел-хранитель Вашей красоты!</h3>
            </div>
        </div>
        <div id="menu">
            <ul id="nav">
                <li><a href="work.jsp">Главная</a></li>
                <li><a href="Servlet?command=menu"> Товары </a></li>
                <li><a href="Servlet?command=basket"> Корзина </a></li>
                <li><a href="events.jsp"> Акции </a></li>
                <li><a href="Servlet?command=showcomm">  Комментарии </a></li>
            </ul>
        </div>
        <div id="content">
            <div id="sidebar">
                <p align = "right"><font size="+1" color="#a9320d"> Здравствуйте, </font><font size="+2" color="#A52A2A"><i><%= (String) request.getSession().getAttribute("Login")%><font size="+1" color="#a9320d">!</font></i></font></p>
                <br><a href = "index.jsp">Завершить работу</a>
                <div id="box">
                    <br><p align = "center"><font size="+1" color="#cf0a0a"> Корзина: </font><font size="+2"><i><%= (String) request.getSession().getAttribute("SUM")%></i></font><font size="+1" color="#cf0a0a">&nbsp;руб.</font></p>
                    <p align="center"><a href="order.jsp">Оформить заказ<img src="images/order.png" width="50"></a></p>
                </div>
            </div>
            <div id="welcome">
              <br>    <br>   <h2 align ="center"><i>Корзина</i></h2>
                <table class="" width="750">                        
                    <c:forEach items="${requestScope.basket}" var="value">                        
                        <tr>
                            <td width="370" align="left"><img src="${value.image}" width="350" ><br><br><br></td>
                            <td width="300" align="center"><p><font size="+1" color="#000000"><i>${value.food}</i></font><font color="#000000"><br><br>
                                    ${value.cost} руб.</font></p></td>
                            <td width="80" align="right">
                                <form  action="/Cosm/Servlet" method="POST">
                                    <input type="hidden" name="command" value="delete"/>
                                    <input type="hidden" name="idFood" value="${value.idFood}"/>
                                    <input type="image"  src="images/delete.png" name="delete">
                                </form>
                            </td>
                        </tr>
                    </c:forEach>
                </table>     
            </div>            
        </div>
    </div>
</body>
</html>