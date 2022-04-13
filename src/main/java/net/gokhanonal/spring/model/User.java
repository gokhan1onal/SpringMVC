package net.gokhanonal.spring.model;

public class User {
	
	private int id;
	private String ad;
	private String soyad;
	private String kanGrubu;
	private String cepTel;
	private String adres;
	
	public User() {
		id = 0;
		this.ad="";
		this.soyad="";
		this.kanGrubu="";
		this.cepTel="";
		this.adres="";
	}
	
	public User(int pId, String pAd, String pSoyad, String pKanGrubu, String pCepTel, String pAdres) {
		this.id=pId;
		this.ad=pAd;
		this.soyad=pSoyad;
		this.kanGrubu=pKanGrubu;
		this.cepTel=pCepTel;
		this.adres=pAdres;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public String getKanGrubu() {
		return kanGrubu;
	}
	public void setKanGrubu(String kanGrubu) {
		this.kanGrubu = kanGrubu;
	}
	public String getCepTel() {
		return cepTel;
	}
	public void setCepTel(String cepTel) {
		this.cepTel = cepTel;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	
	@Override
	public String toString() {
		return "User [ad=" + ad + ", soyad=" + soyad + ", kanGrubu=" + kanGrubu + ", cepTel=" + cepTel + ", adres="
				+ adres + "]";
	}
	
}
