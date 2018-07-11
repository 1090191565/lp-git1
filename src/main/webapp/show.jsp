<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/8
  Time: 9:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <Table width="60%">
            <c:forEach items="${requestScope.list}" var="k">
                <Tr align="center">
                    <Td>${k.id}</Td>
                    <Td>${k.name}</Td>
                    <Td>${k.age}</Td>
                </Tr>
            </c:forEach>
        </Table>
</body>
</html>
