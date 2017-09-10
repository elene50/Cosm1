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
                <li><a href="work.jsp"> Главная </a></li>
                <li><a href="Servlet?command=menu"> Товары </a></li>
                <li><a href="Servlet?command=basket"> Корзина </a></li>
                <li><a href="events.jsp"> Акции </a></li>
                     <li><a href="Servlet?command=showcomm"> Комментарии </a></li>
            </ul>
        </div>
         <div id="content">            
            <div id="sidebar">
                <p align = "right"><font size="+1" color="#a9320d"> Здравствуйте, </font><font size="+2" color="#A52A2A"><i><%= (String) request.getSession().getAttribute("Login")%><font size="+1" color="#a9320d">!</font></i></font></p>
                <br><a href = "index.jsp">Завершить работу</a>
                <div id="box" align="center">
                    <p align="center"><a href="Servlet?command=sort"><br><br>Вывести товары по убыванию цены</a></p>
                </div>
                   <div id="box2" align="center">
                    <p align="center"><a href="Servlet?command=sort2"><br><br>Вывести товары в алфавитном порядке</a></p>
                </div>
            </div>
            <div id="welcome">
             <br>    <br>    <h2 align ="center"><i>Товары</i></h2>
                </div>            
                <table class="" width="750">
                    <c:forEach items="${requestScope.sort}" var="value">                        
                        <tr>
                            <td width="370" align="left"><img src="${value.image}" width="350" ><br><br><br></td>
                            <td width="300" align="center"><p><font size="+1" color="#000000"><i>${value.food}</i></font><font color="#000000"><br><br>
                                    ${value.dose} гр &nbsp;&nbsp;&nbsp;&nbsp;${value.cost} руб.<br><br>
                            <td width="80" align="right">
                                <form  action="/Cosm/Servlet" method="POST">
                                    <input type="hidden" name="command" value="inbasket"/>
                                    <input type="hidden" name="idFood" value="${value.idFood}"/>
                                    <input type="image"  src="images/korzina1.png" name="inbasket">
                                </form>
                            </td>
                        </tr>
                    </c:forEach>
                    </form>
                </table>     
            </div>
        </div>
    </div>
</body>
</html>