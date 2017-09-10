<%-- 
    Document   : work
    Created on : 06.05.2015, 22:35:06
    Author     : Home
--%>

<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


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
        </div>
        <div id="content">
           <div id="welcome">
            <div id="sidebar">
                <p align = "right"><font size="+1" color="#a9320d"> Здравствуйте, </font><font size="+2" color="#A52A2A"><i><%= (String) request.getSession().getAttribute("Login")%><font size="+1" color="#a9320d">!</font></i></font></p>
                <br><a href = "index.jsp">Завершить работу</a>
            </div>         <br><br>  <br><br>         <h2 align ="center"><i>Оформление заказа:</i></h2>
                <br><br>    
                <table width="700">
                    <tr>
                        <td width = "400" align = right>
                            <form  action="/Cosm/Servlet" method="POST">
                                <input type="hidden" name="command" value="order"/> 
                                <p><font color = "#862909" face="brush script mt" size = "+1"><i>Выберите дату и время доставки вашего заказа:</i></font></p>
                                Дата: <input type="date" max="2017-06-01" id="data" name="datamine" value="davaToday">
                                <script>
                                    document.getElementById('davaToday').valueAsDate = new Date();
                                </script>
                                <br><br>
                                Время: <input type="time" min="10:00:00" max="21:00:00" id="time" name="time" value="10:00:00"><br><br>
                                ФИО: <input type="text" name="name" id="name"><br><br>
                                <p align = right><input type="submit" value="Оформить" name="order" onclick="name()"></p>
                            </form>
                            <br><br><br>
                        </td>
                        <td width = "300" align = center><img src = "images/of.jpg" width = "250" ></td>
                    </tr>
                </table>
            </div>
        </div>
</body>
</html>