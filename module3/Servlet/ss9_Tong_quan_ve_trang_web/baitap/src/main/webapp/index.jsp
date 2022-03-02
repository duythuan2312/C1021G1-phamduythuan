<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 1/25/2022
  Time: 5:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <div>
      <h1 style="background-color: orangered">Product Discount Calculator</h1>
    </div>
      <div>
        <form action="/CalculateDiscount" method="post">
          <div>
            <label>Product Description</label>
            <textarea id="description" placeholder="Mô tả của sản phẩm" name="description"></textarea>
          </div>
          <div>
            <label>List Price</label>
            <input type="text"  id="price" placeholder="Giá niêm yết của sản phẩm" name="price">
          </div>
          <div>
            <label>Discount Percent</label>
            <input type="text" class="form-control" id="discountPercent" placeholder="Tỷ lệ chiết khấu (phần trăm)" name="discount">
          </div>
          <button style="background-color: blue" type="submit">Submit</button>
        </form>
      </div>
  </body>
</html>
