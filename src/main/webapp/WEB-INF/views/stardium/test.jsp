<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>


<div class="container">
	<table class="">
		<thead>
		<tbody>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>개장일</th>
				<th>삭제</th>
			</tr>
			<c:forEach var="stardium" items="$(stardiymList)">
				<tr>
					<td>${stardium.name}</td>
					<td>${stardium.createDate}</td>
				</tr>
			</c:forEach>
		</tbody>
		</thead>
	</table>

</div>

<%@ include file="../layout/footer.jsp"%>