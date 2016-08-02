<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>添加商品</title>
</head>
<body>
	<form action="<c:url value='/product/add' />" method="post">
		restaurantId<input name="restaurantId" value="1"/><br />
		categoryId<input name="categoryId" value="1"/><br />
		name<input name="name" value="好吃2"/><br />
		price<input name="price" value="12.36"/><br />
		createDate<input name="createDate" value="2015-12-26 12:13:14"/><br />
		foodConverPicUrl<input name="foodConverPicUrl" value="http://qq..com" /><br />
		saleStatus<input name="saleStatus" value="1" /><br />
		foodStatus<input name="foodStatus" value="1"/><br />
		saleStatus<input name="saleStatus" value="1"/><br />
		saleStatus<input name="saleStatus" value="1"/><br />
		unit<input name="unit" value="1"/><br />
		sort<input name="sort" value="1"/><br />
		<input type="submit" value="提交" />
	</form>
</body>
</html>