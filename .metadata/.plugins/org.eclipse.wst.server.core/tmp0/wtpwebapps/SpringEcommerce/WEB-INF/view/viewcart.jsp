<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
         <%@ page isELIgnored="false" %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.carthome{
display:flex;
flex-direction:row;
flex-wrap:wrap;

}
.childcart a img{
width:250px;
height:350px;

}
.childcart{
padding-left:50px;
}
.orders {
 padding: 1em;
 font-size: 12px;
 text-transform: uppercase;
 letter-spacing: 2.5px;
 font-weight: 500;
 color: #000;
 background-color: #fff;
 border: none;
 border-radius: 45px;
 box-shadow: 0px 8px 15px rgba(0, 0, 0, 0.1);
 transition: all 0.3s ease 0s;
 cursor: pointer;
 outline: none;
}

.orders:hover {
 background-color: #2EE59D;

 color: #fff;
 transform: translateY(-7px);
}

.orders:active {
 transform: translateY(-1px);
}

.cancel {
 padding: 1em;
 font-size: 12px;
 text-transform: uppercase;
 letter-spacing: 2.5px;
 font-weight: 500;
 color: #000;
 background-color: #fff;
 border: none;
 border-radius: 45px;
 box-shadow: 0px 8px 15px rgba(0, 0, 0, 0.1);
 transition: all 0.3s ease 0s;
 cursor: pointer;
 outline: none;
}

.cancel:hover {
 background-color: #2EE59D;

 color: #fff;
 transform: translateY(-7px);
}

.cancel:active {
 transform: translateY(-1px);
}


</style>
</head>
<body>
<div class="carthome">
<c:forEach items="${carts}" var="ct">
<div class="childcart">
<img alt="image" src="${ct.getProducturl()}">
${ct.getProductprice()}
${ct.getProductname()}
<button class="orders"><a href ="/SpringEcommerce/order/${ct.getId()}">Order</a></button>
<button class="cancel"><a href ="/SpringEcommerce/remove/${ct.getId()}">Cancel</a></button>
</div>
</c:forEach>
</body>
</html>