<%-- 
    Document   : work
    Created on : 06.05.2015, 22:35:06
    Author     : HomeВАШЕМУ
--%>

<!--%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


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
        </div
        
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
           
            <br><br><br><br><br>   
                <p align="center"><font color = "#862909" face="sans-serif" size = "+3"><i><b>Ваш товар успешно добавлен!</b></i></font></p>
                <br><br> 
                <!--p align="center"><font color = "#862909" face="sans-serif" size = "+3"><i>  <li><a href="printkredit.jsp">Печать чека</a></li><br><br><br></i></font></p-->
                
               <!--br><br><br><br><br>     <br><br><br><br><br>     <br><br><br>
            </div>
        </div>


    </body>
</html-->



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
            <li><a href="welcomAdmin.jsp">Главная</a></li>
                <li><a href="Servlet?command=menuAdmin"> Товары </a></li>
                <li><a href="Servlet?command=showcommAdmin"> Комментарии </a></li>
            </ul>
        </div>
        <div id="content">
          <div id="welcome">
            <div id="sidebar">
                <p align = "right"><font size="+1" color="#a9320d"> Здравствуйте, </font><font size="+2" color="#A52A2A"><i><%= (String) request.getSession().getAttribute("Login")%><font size="+1" color="#a9320d">!</font></i></font></p>
                <br><a href = "index.jsp">Завершить работу</a>
            </div>
                <br><br><br><br><br>   
                <p align="center"><font color = "#862909" face="sans-serif" size = "+3"><i><b><br><br><br>Параметры товара успешно изменены!<br><br><br><br></b></i></font></p<br><br><br>
                <br><br> 
                            
            </div>
        </div>


    </body>
</html>