
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
                    <div id="welcome"><br><br><br>
                    <h2 align ="center"><i>Изменение параметров товара:</i></h2>
                    <br><br>    
                    <table width="700">
                        <tr>
                            <td width = "400" align = right>
                                <form  action="/Cosm/Servlet" method="POST">
                                    <input type="hidden" name="command" value="editfood"/> 
                                    Название товара:<input type="text" name="food" id="food">
                                    <br><br>
                                    Вес: <input type="text" id="dose" name="dose"><br><br>
                                    Стоимость: <input type="text" name="cost" id="cost"><br><br>
                                   Фото товара: <input type="file" name="image" id="image"><br><br>
 
                                    <p align = right><input type="submit" value="Изменить" name="editadmin"></p>
                                </form>
                            </td>
                            <td width = "300" align = center><img src = "images/of.jpg" width = "250" ></td>
                        </tr>
                    </table>
                </div>
            </div>
        </div>        </div>

</body>
</html>