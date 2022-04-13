<%@ page pageEncoding="UTF-8"%>
<%@include file="tiles/header.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="alert alert-dark" role="alert" align="center">
	<h2>Kullanıcı Bilgisi</h2>
</div>

<div class="d-flex justify-content-center">
	<div class="w-50 p-3">
		<form:form action="AddUser" method="post" modelAttribute="user">
			<div class="form-group">
				<input id="id" name="id" type="text" hidden="hidden"
					value="${user.id}"> <input id="ad" name="ad" type="text"
					class="form-control" placeholder="Ad" aria-label="Ad"
					aria-describedby="basic-addon2" required="required"
					value="${user.ad}">
			</div>
			<div class="form-group">
				<input id="soyad" name="soyad" type="text" class="form-control"
					placeholder="Soyad" aria-label="Soyad"
					aria-describedby="basic-addon2" required="required"
					value="${user.soyad}">
			</div>
			<div class="form-group">
				<select class="custom-select" id="kanGrubu" name="kanGrubu"
					required="required">
					<option value="A Rh+">A Rh+</option>
					<option value="A Rh-">A Rh-</option>
					<option value="B Rh+">B Rh+</option>
					<option value="B Rh-">B Rh-</option>
					<option value="AB Rh+">AB Rh+</option>
					<option value="AB Rh-">AB Rh-</option>
					<option value="0 Rh+">0 Rh+</option>
					<option value="0 Rh-">0 Rh-</option>
				</select>
			</div>
			<div class="form-group">
				<input id="cepTel" name="cepTel" type="number" class="form-control"
					min="0" step="1" data-bind="value:cepTel"
					placeholder="Cep telefonu" aria-label="Cep telefonu"
					aria-describedby="basic-addon2" required="required"
					value="${user.cepTel}">
			</div>
			<div class="form-group">
				<textarea id="adres" name="adres" class="form-control"
					aria-label="Adres" placeholder="Adres" required="required">${user.adres}</textarea>
			</div>
			<div class="form-group" align="center">
				<button type="submit" class="btn btn-primary">Kaydet</button>
			</div>
		</form:form>
	</div>
</div>


<%@include file="tiles/footer.jsp"%>