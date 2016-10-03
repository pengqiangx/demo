<%@ page pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
<head>
    <base href="<%=basePath%>">
    <title>XSS跨站脚本测试</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
</head>


<body >
    <form action="<%=path %>/helloSubmit" method="post" >
        用户名:<input type="text" name="name"><br>
        <input type="submit" value="提交">
        <input type="reset" value="重置">
    </form>
</body>
</html>