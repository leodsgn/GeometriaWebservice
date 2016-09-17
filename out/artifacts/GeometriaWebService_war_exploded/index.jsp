<%--
  Created by IntelliJ IDEA.
  User: leodsgn
  Date: 9/15/16
  Time: 17:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Eng. de Software</title>
    <link rel="stylesheet" href="lib/bootstrap/dist/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <div class="col-md-6">
        <form id="form_canvas">
            <div class="form-group col-md-6">
                <label for="x1">X</label>
                <input type="number" class="form-control" id="x1" placeholder="X">
            </div>
            <div class="form-group col-md-6">
                <label for="y1">Y</label>
                <input type="number" class="form-control" id="y1" placeholder="Y">
            </div>
            <div class="col-md-12">
                <button id="submit_canvas" type="submit" class="btn btn-success">Submit</button>
            </div>
        </form>

    </div>
    <div class="col-md-6">
        <div class="col-md-6">
            <canvas id="canvas" width="100%" height="500px"></canvas>
        </div>
        <div id="answer" class="col-md-6">
            <h3>A resposta é:</h3>
        </div>
    </div>
</div>

<script src="lib/jquery/dist/jquery.min.js"></script>
<script src="lib/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="src/service.js"></script>
</body>
</html>
