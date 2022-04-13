<%@ page pageEncoding="UTF-8"%>
<%@include file="tiles/header.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="alert alert-success alert-dismissible fade show"
	role="alert">
	<strong>İşlem başarılı!</strong> Kullanıcı başarıyla kaydedildi.
	<button type="button" class="close" data-dismiss="alert"
		aria-label="Close">
		<span aria-hidden="true">&times;</span>
	</button>
</div>

<div class="jumbotron">
	<div class="alert alert-secondary" role="alert" align="center">
		Kaydedilen Kullanıcı Bilgileri</div>
	<div class="d-flex justify-content-center">

		<div class="container">
			<table class="table">
				<tbody>
					<tr>
						<th scope="row">Ad</th>
						<td>${user.ad}</td>
					</tr>
					<tr>
						<th scope="row">Soyad</th>
						<td>${user.soyad}</td>
					</tr>
					<tr>
						<th scope="row">Kan Grubu</th>
						<td>${user.kanGrubu}</td>
					</tr>
					<tr>
						<th scope="row">Cep Tel</th>
						<td>${user.cepTel}</td>
					</tr>
					<tr>
						<th scope="row">Adres</th>
						<td>${user.adres}</td>
					</tr>
				</tbody>
			</table>
		</div>

	</div>
	<p class="lead" align="center">
		<a class="btn btn-primary btn-lg" href="UserList" role="button">Kulllanıcılar</a>
	</p>
</div>


<%@include file="tiles/footer.jsp"%>