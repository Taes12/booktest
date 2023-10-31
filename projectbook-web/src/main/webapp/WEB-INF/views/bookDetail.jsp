<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div class="mt-5">
	<!-- 중앙 상단 책 제목 -->
	<div class="fs-2 text-center fw-bold">
		${book.title }
	</div>
	
	<div class="mt-4">
		<!-- 왼쪽 텍스트 -->
		<div class="row">
			<div class="col-4 text-left">
				<div class="mt-5 fs-6 fw-bold">
					${ book.author }
				</div>
				<div class="mt-2 fs-6 fw-bold text-secondary">
					${ book.publisher } - ${book.publicationDate}
				</div>
			</div>
			<!-- 중앙 이미지 -->
			<div class="col-4">
				<img src="https://via.placeholder.com/400x500" class="img-fluid">
			</div>
			<!-- 오른쪽 텍스트 -->
			<div class="col-4 text-left">
				<div class="mt-5 fs-6 fw-bold">
					<span class="text-success">할인율</span> - 할인금액 <span class="fs-8 text-secondary text-decoration-line-through">(금액)</span>
				</div><hr "height: 2px; background-color: #000;">
				<div class="mt-2 fs-6 fw-bold">
					적립금
				</div>
			</div>
		</div>
	</div>
	
</div>