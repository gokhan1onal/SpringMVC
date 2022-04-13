<%@ page pageEncoding="UTF-8"%>
<%@include file="tiles/header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="alert alert-dark" role="alert" align="center">
	<h2>Kullanıcılar</h2>
</div>

<div class="d-flex justify-content-center">
		<table class="table">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">Adı</th>
					<th scope="col">Soyadı</th>
					<th scope="col">Kan Grubu</th>
					<th scope="col">Cep Tel</th>
					<th scope="col">Adres</th>
					<th scope="col"></th>
				</tr>
			</thead>
			<tbody>
				<c:if test="${!empty userList}">
					<c:forEach items="${userList}" var="user">
						<tr>
							<th scope="row">${user.id}</th>
							<td>${user.ad}</td>
							<td>${user.soyad}</td>
							<td>${user.kanGrubu}</td>
							<td>${user.cepTel}</td>
							<td>${user.adres}</td>
							<td><a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button"
								aria-haspopup="true" style="margin-top:-3px;">İşlem</a>
								<div class="dropdown-menu">
									<a class="dropdown-item" href="ModifyUser?id=${user.id}">Düzenle</a>
									<div class="dropdown-divider"></div>
									<a class="dropdown-item" href="DeleteUser?id=${user.id}">Sil</a>
								</div></td>
						</tr>
					</c:forEach>
				</c:if>
			</tbody>
		</table>
</div>

<%@include file="tiles/footer.jsp"%>