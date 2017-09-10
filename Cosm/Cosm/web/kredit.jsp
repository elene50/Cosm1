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
            <ul id="nav">
                <li><a href="work.jsp">Главная</a></li>
                <li><a href="Servlet?command=menu"> Товары </a></li>
                <li><a href="Servlet?command=basket"> Корзина </a></li>
                <li><a href="events.jsp"> Акции </a></li>
                <li><a href="Servlet?command=showcomm">  Комментарии </a></li>
            </ul>
        </div>
        <div id="content">
            <div id="welcome">
                <br><br>
                <p align="center"><font color = "#862909" face="sans-serif" size = "+3"><i><b>Оплата заказа Вами будет произведена в кредит.<br><br><br>Спасибо, что воспользовались нашими услугами!</b></i></font></p>
                <br>
 <p align="center"><font color = "#862909" face="sans-serif" size = "+3"><i>  <li><a href="Servlet?command=printkredit">Печать договора об ежемесячном погашении кредита</a></li></i></font></p>
              <br><br>
                </div>
        </div>
    </body>
</html>