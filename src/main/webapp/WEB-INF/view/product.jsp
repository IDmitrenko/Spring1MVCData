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
        <td>Price</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="item" items="${products}">
        <tr>
            <td>${item.id}</td>
            <td>${item.title}</td>
            <td>${item.price}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>

