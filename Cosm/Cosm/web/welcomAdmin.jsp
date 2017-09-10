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
        </div> 
                            <div id="welcome">

                <p><font size="+1" color="#000000"><i>
<br>
<br><br>
<font color="#930d0d" align = "justify"><b>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspЗдравствуйте, администратор! Вы можете удалять, редактировать существующие товары и добавлять новые, доступные для заказа в интернет-магазине косметики Sharmi. 
                    Также Вы можете удалять комментарии, содержащие ненормативную лексику.</i></font>
                <p align = "justify"> </p>   
                           </div>      <br><br><br><br><br>     <br><br><br>
</html>