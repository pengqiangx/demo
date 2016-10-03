<!DOCTYPE HTML>
<html>
    <head>
        <title>XSS跨站脚本测试 - DOM Based XSS</title>
        <meta http-equiv="pragma" content="no-cache">
        <meta http-equiv="cache-control" content="no-cache">
        <meta http-equiv="expires" content="0">
    </head>
    <body >
        <div id="t"></div>
        <input type="text" id = "text" value="" />
        <input type="button" value="write" onclick="test()" />

     <script>
         function test() {
             var str = document.getElementById("text").value;
             document.getElementById("t").innerHTML="<a href='"+str+"' > test Link </a>";
         }
     </script>
    </body>
</html>