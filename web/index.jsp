<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport"
        content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Product Discount Calculator</title>
  <style>
    body {
      text-align: center;
    }
  </style>
</head>
<body>
<h1>Product Discount Calculator</h1>
<form method="post" action="/display-discount">
  <label>Product Description:</label><br>
  <input type="text" name="nameProduct" placeholder="What's Product Description?"><br>
  <label>List Price:</label><br>
  <input type="text" name="price" placeholder="What's List Price?"><br>
  <label>Discount Percent:</label><br>
  <input type="text" name="discount" placeholder="What's Discount Price?"><br>
  <input type="submit" value="Calculate Discount">
</form>
</body>
</html>
