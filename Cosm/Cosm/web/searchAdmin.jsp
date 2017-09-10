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

            <div id="welcome">
                <h2 align ="center"><i>Товары</i></h2>
                <table class="" width="750">

                    <form action="/Cosm/Servlet" method="POST">                 
                        <label for="id"><i>Введите название товара:</i></label>
                        <input type="text" name="name" placeholder="поиск"/>
                        <input type="hidden" name="command" value="searchadmin"/>

                        <br/>
                        <input type="submit" value="Искать"/>
                    </form>
                    <br/>
                        <br/>
                        <br/>

                    <form  action="add.jsp">
                                                <label for="id"><i>Добавить новый товар:</i></label>
                                            <br/>

                                    <input type="hidden" name="command" value="addfood"/>
                                    <input type="hidden" name="idFood" value="${value.idFood}"/>
                                    <input type="image"  src="images/add.png" name="add">
                                </form>
 
                    <c:forEach items="${requestScope.search}" var="value">    
                        <tr>
                            <td width="370" align="left"><img src="${value.image}" width="350" ><br><br><br></td>
                            <td width="300" align="center"><p><font size="+1" color="#000000"><i>${value.food}</i></font><br><br>
                                    ${value.dose} гр &nbsp;&nbsp;&nbsp;&nbsp;${value.cost} руб.<br><br>
                                </p></td>
                            <td width="80" align="right">
                                <form  action="/Cosm/Servlet" method="POST">
                                    <input type="hidden" name="command" value="deletefood"/>
                                    <input type="hidden" name="idFood" value="${value.idFood}"/>
                                    <input type="image"  src="images/delete.png" name="delete">
                                </form>
                            </td>
                            <td width="80" align="right">
                                <form  action="/Cosm/Servlet" method="POST">
                                    <input type="hidden" name="command" value="editfood"/>
                                    <input type="hidden" name="idFood" value="${value.idFood}"/>
                                    <input type="image"  src="images/edit3.png" name="edit">

                                </form>
                            </td>
                            <td width="80" align="right">
                          
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