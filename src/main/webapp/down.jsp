<%@ page language="java" pageEncoding="UTF-8" session="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ page import="ru.job4j.dream.model.Candidate" %>
<%@ page import="ru.job4j.dream.store.Store" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Upload</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script
            src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script
            src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<%
    String id = request.getParameter("id");
    Candidate candidate = new Candidate(0, "");
    if (id != null) {
        candidate = Store.instOf().findByIdCandidate(Integer.valueOf(id));
    }
%>
<body>
    <div class="container">
        </table>
        <h2>Загрузка фото для <b><%=candidate.getName()%></b> </h2>
        <form action="<c:url value='/upload?id=${param.id}'/>" method="post" enctype="multipart/form-data">
            <div class="checkbox">
                <input type="file" name="file">
            </div>
            <button type="submit" class="btn btn-default">Загрузить</button>
        </form>
    </div>
</body>
</html>
