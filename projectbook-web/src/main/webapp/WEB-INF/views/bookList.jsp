<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div class="mt-5">
	<div>
		<div>
			<div>
				<table class="table">
					<thead>
						<tr>
							<th>NO</th>
							<th>이미지</th>
							<th>제목</th>
							<th>저자</th>
							<th>출판사</th>
							<th>출판일</th>
							<th>가격</th>
							<th>할인율</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<c:if test="${ not empty bookList }">
								<c:forEach var="bookList" items="${ bookList }">
								
									<td>${ bookList.no }</td>
									<td><a href="bookDetail?no=${ bookList.no }" class="text-decoration-none link-dark">${ bookList.no }</a></td>
									<td><a href="bookDetail?no=${ bookList.no }" class="text-decoration-none link-dark"> ${ bookList.title }</a></td>
									<td>${ bookList.author }</td>
									<td>${ bookList.publisher }</td>
									<td>${ bookList.publicationDate }</td>
									<td>${ bookList.price }</td>
									<td>${ bookList.discount }</td>			
								</c:forEach>
							</c:if>
							<c:if test="${ empty bookList }">
								<tr>
									<td class="text-center">
										현재 등록된 책이 없습니다
									</td>
								</tr>
							</c:if>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>
