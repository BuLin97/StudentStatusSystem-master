<%--
  Created by IntelliJ IDEA.
  User: Keen
  Date: 2020/7/17
  Time: 12:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <script src="js/jquery-3.4.1.min.js"></script>
</head>
<body>
<input type="submit" value="测试" onclick="test()">
<script>
    function test() {
        $.ajax({
                url: "selectEletRs",
            type: "post",
            data: {"sno":'1813004103'},
            dataType: "json",
            success: function (result) {
                console.log(result)
            }
        })
    }
</script>
</body>
</html>
