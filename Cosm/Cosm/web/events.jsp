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
            </div>
            <div id="welcome">
          <br>    <br>       <h2 align ="center"><i>Акции</i></h2>                
                <table class="" width="700" >                      
                        <tr>
                            <td width="400" align="left"><br><img src="image/kosm.jpg" width="350" ><br><br></td>
                            <td width="300" align="center">
                                <p><font size="+1" color="#000000"><i>Сделайте заказ на сумму от 12,99 руб. до 12 мая
и получите скидку -50% на любой продукт при заказе с 13 мая по 1 июня.
<br>
<font color="#930d0d"><b>Скидка выдаётся за каждые полные 12,99 руб. в заказе. </b></font><br> <br>
Чем больше сумма заказа, тем больше продуктов со скидкой!</i></font>
                                </p>
                            </td>
                        </tr>
                        <tr>
                            <td width="400" align="left"><br><br><img src="images/music.jpg" width="350" ><br><br></td>
                            <td width="300" align="center">
                                <p><font size="+1" color="#000000"><i>Каждый четверг в 20:00 Sharmi приглашает Вас принять участие в бесплатных вебинарах.
                                        Профессиональные визажисты расскажут о различных техниках нанесения макияжа. 
                                        Тема ближайшего вебинара, который состоится 4 мая, - <b>"Освежающий макияж за 15 минут".</b> Ждём Вас!
                                        
                                        
                                      </i></font></p>
                            </td>
                        </tr>                        
                    </form>
                </table>    
            </div>

        </div>
    </div>
</body>
</html>