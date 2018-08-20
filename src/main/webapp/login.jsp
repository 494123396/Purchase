<%--
  Created by IntelliJ IDEA.
  User: 49412
  Date: 2018/8/17
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript">

    $(function () {
        if(${erro}=null){
           return;
        }else {
            alert("${erro}");
        }

    })
   function login() {

       var username=$("#name").val();
        var pwd=$("#pwd").val();
        if(username==null||username==""){
            alert("用户名不能为空")
            return false;
        }
        if (pwd==null||pwd==""){
            alert("密码不能为空")
            return false;
        }


   }

</script>

<head>
    <title>登录</title>
</head>
<body>

<div style="background-color: aquamarine;width: 600px;height: 300px">
        <div style="margin: 20px auto">
            <h1>小型进销存系统</h1>
            <form method="post" action="/login" onsubmit="return login()">
                用户名:<input type="text" name="userName" id="name" >
                密  码:<input type="password" name="password" id="pwd"><br>
                <input type="submit" value="登录" >
            </form>
        </div>
</div>


</body>
</html>
