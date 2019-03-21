<%--
  Created by IntelliJ IDEA.
  User: cq421
  Date: 2019/3/12
  Time: 5:50
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table cellpadding="1px" >
        <tr>
            <th>
                ${account[0].id}
            </th>
            <th>
                ${account[0].name}
            </th>
            <th>
                ${account[0].money}
            </th>
        </tr>

        <tr>
            <th>
                ${account[1].id}
            </th>
            <th>
                ${account[1].name}
            </th>
            <th>
                ${account[1].money}
            </th>
        </tr>
    </table>
</body>
</html>
