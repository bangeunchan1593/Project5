 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>맛집 추가</h1>
<form action="addok" method="post">
<table id="edit">
    <tr><td>식당 이름:</td><td><input type="text" name="restaurant"/></td></tr>
    <tr><td>메뉴 이름:</td><td><input type="text" name="menu"/></td></tr>
    <tr><td>가격:</td><td><input type="text" name="price"/></td></tr>
    <tr><td>오픈시간:</td><td><input type="time" name="open_time"/></td></tr>
    <tr><td>마감시간:</td><td><input type="time" name="close_time"/></td></tr>
    <tr><td>위치:</td><td><input type="text" name="location"/></td></tr>
    <tr><td>별점:</td>
        <td><input type="radio" id="five" name="star_point" value="5점"/>
            <label for="five">5점</label><br>
            <input type="radio" id="four" name="star_point" value="4점"/>
            <label for="four">4점</label><br>
            <input type="radio" id="three" name="star_point" value="3점"/>
            <label for="three">3점</label><br>
            <input type="radio" id="two" name="star_point" value="2점"/>
            <label for="two">2점</label><br>
            <input type="radio" id="one" name="star_point" value="1점"/>
            <label for="one">1점</label>
        </td></tr>
    <tr><td>간단리뷰:</td><td><textarea cols="50" rows="5" name="review"></textarea></td></tr>
    <tr>
        <td><a href="list">View All Records</a></td>
        <td align="right"><input type="submit" value="Add Post"/></td>
    </tr>
</table>
</form>

</body>
</html>