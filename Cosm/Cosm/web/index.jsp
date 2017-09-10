
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
            <div id="main">
                <div id="welcome">

                    <h3><font size="+3" face="brush script mt" color="#800000"><b>Добро пожаловать на сайт интернет-магазина косметики <i>Sharmi!</i></font></h3>

                    <ul>
                        <p align = "justify"> <font color = "#8B0000" size = "+1">
                        <li>
                            Мы стремимся сделать процесс заказа косметики 
                            максимально быстрым и комфортным для наших 
                            клиентов. 
                            <br><br>
                        <li>
                            Интернет-магазин косметики Sharmi – служба
                            заказа товаров прямо из дома!
                            Мы стараемся предоставить нашим клиентам 
                            максимально широкий ассортимент, чтобы 
                            удовлетворить Вас как по уровню цен, так и по 
                            качеству предлагаемых товаров.</li>
                        </font>
                        </p>
                    </ul>
                </div>
            </div>

            <div id="sidebar">
                <p align="right">Для начала работы введите, пожалуйста, свой логин и пароль или зарегистрируйтесь</p>
                <br><h2 class="title" align="center">Вход</h2>
                <div class="content">
                    <form  action="/Cosm/Servlet" method="POST" align="center">
                        <input type="hidden" name="command" value="login"/>
                        <label for="inputtext1">&nbsp;&nbsp;Логин:</label>
                        <input type="text" name="loginUser" id=loginUser>
                        <br><br>
                        <label for="inputtext2">Пароль:</label>
                        <input type="password" name="passUser" id=passUser>
                        <br><br>
                        <input type="submit" value="  Войти  " onclick="log();">
                        &nbsp;&nbsp;&nbsp;<a href="registration.jsp">Регистрация</a>
                    </form>
                </div>
            </div>
        </div>
    </div>
</body>
</html>