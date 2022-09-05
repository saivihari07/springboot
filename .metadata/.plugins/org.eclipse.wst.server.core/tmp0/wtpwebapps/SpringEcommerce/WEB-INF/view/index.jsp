<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width; initial-scale=1.0">
<link rel="StyleSheet" href="header1.css">
<title>Fashion Way</title>
<style type="text/css">
.himg{
	width: 50%;
	height: 30%;
}





#fname {
	height: 25px;
	width: 150px;
	background-color: rgb(255, 255, 255);
	margin-right: inherit;
}

.shirt-one a {
	text-align: center;
	padding: 10px;
	line-height: 15px;
}

#T-shirt img {
	width: 240px;
	height: 300px;
	box-sizing: inherit;
}

.shirts-one {
	display: flex;
	justify-content: space-around;
}

#T-shirt img {
	border-radius: 20px;
}
/* From uiverse.io */
button {
	padding: 0.6em;
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

button:hover {
	background-color: #2EE59D;
	box-shadow: 0px 15px 20px rgba(46, 229, 157, 0.4);
	color: #fff;
	transform: translateY(-7px);
}

button:active {
	transform: translateY(-1px);
}
</style>
</head>
<body>
	<div class="himg">
	<a href="#"><img src="https://www.freepik.com/free-psd/landing-page-online-fashion-sale_8915381.htm#query=e%20commerce%20website&position=23&from_view=keyword"></a>
	</div>
	<div class="shirts-one">
		<a id="T-shirt"><img
			src="https://assets.myntassets.com/h_720,q_90,w_540/v1/assets/images/8889597/2019/4/8/8dc49bf7-181d-4d8d-80d7-e624ef85e3651554718288714-Roadster-Men-Navy-Blue--Grey-Regular-Fit-Checked-Casual-Shir-1.jpg"></a>
		<a id="T-shirt"> <img
			src="https://assets.myntassets.com/h_720,q_90,w_540/v1/assets/images/8255317/2019/3/1/7a3ad498-4188-4139-ae72-22a88f0f49df1551416489701-Vishudh-Women-Olive-Green-Printed-Kurta-with-Palazzos-545155-1.jpg">
			<a id="T-shirt"> <img
				src="https://assets.ajio.com/medias/sys_master/root/20201225/YxT9/5fe4eb40aeb2694fd3fe6cbb/-473Wx593H-460801469-green-MODEL.jpg"></a>
	</div>
	<br>
	<br>
	<br>
	<div class="shirts-one">
		<a id="T-shirt"> <img
			src="https://rukminim2.flixcart.com/image/800/960/kxrvi4w0/kids-lehenga-choli/g/l/x/8-9-years-kd-supriya-kedar-fab-original-imaga5zwzny9tk3t.jpeg?q=50"></a>
		<a id="T-shirt"> <img
			src="data:image/jpeg;base64,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"></a>
		<a id="T-shirt"> <img
			src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSVeqCE0LrcCl0y9looCcyOqY3-hJFP0P2flQ&usqp=CAU"></a>
	</div>
	<br>
	<br>
	<br>

</body>
</html>
