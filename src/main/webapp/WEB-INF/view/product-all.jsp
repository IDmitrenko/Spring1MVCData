<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
<body>
<h1>All products list:</h1>
<table>
    <thead>
    <tr>
        <td>Id</td>
        <td>Title</td>
        <td>Cost</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="item" items="${products}">
        <tr>
            <td>${item.id}</td>
            <td>${item.title}</td>
            <td>${item.cost}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<%--
<ul>
    <c:forEach var="item" items="${products}">
        <li>${item.title}</li>
    </c:forEach>
</ul>
--%>
</body>
</html>

