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
                <h2 align ="center"><i>Регистрация нового пользователя:</i></h2>
                <br><br>    
                <table width="700">
                    <tr>
                    <form action="/Cosm/Servlet" method="POST">
                        <input type="hidden" name="command" value="reg"/>
                        <td width = "400" align = right>
                            Фамилия: <input type = text name = surname id="surname" width = 50 > <br><br>
                            Имя: <input type = text name = name id="name" width = 50 > <br><br>
                            Отчество: <input type = text name = lastname id="lastname" width = 50 > <br><br>
                            Телефон: <input type = text name = phone id="phone" width = 50 > <br><br>
                            Логин:&nbsp;&nbsp; <input type = text name = loginUser id = "loginUser" width = 50> <br><br>
                            Пароль: <input type = password name = passUser id="passUser" width = 50 > <br><br>
                            <p align = right><input type="submit" value="Регистрация" onclick="reg();"></form></p>
                    </td>
                    <td width = "300" align = center><img src = "images/of.jpg" width = "280" ></td>
                    </tr>
                </table>
            </div>
        </div>
</body>
</html>