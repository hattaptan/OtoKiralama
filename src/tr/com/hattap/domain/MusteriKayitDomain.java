package tr.com.hattap.domain;

import java.sql.Date;



public class MusteriKayitDomain {

	private int id;
	private String Tcno;
	private String Adi;
	private String Soyadi;
	private Date Dogumtarih;
	private String Telefon;
	private String Adres;
	private String Ehliyetno;
	private String Verilenyer;
	private Date Etarih;
	private String Kefilbilgi;
	private String Kefiltelefon;
	private String cinsiyet;
	
	
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Adi == null) ? 0 : Adi.hashCode());
		result = prime * result + ((Adres == null) ? 0 : Adres.hashCode());
		result = prime * result
				+ ((Dogumtarih == null) ? 0 : Dogumtarih.hashCode());
		result = prime * result
				+ ((Ehliyetno == null) ? 0 : Ehliyetno.hashCode());
		result = prime * result + ((Etarih == null) ? 0 : Etarih.hashCode());
		result = prime * result
				+ ((Kefilbilgi == null) ? 0 : Kefilbilgi.hashCode());
		result = prime * result
				+ ((Kefiltelefon == null) ? 0 : Kefiltelefon.hashCode());
		result = prime * result + ((Soyadi == null) ? 0 : Soyadi.hashCode());
		result = prime * result + ((Tcno == null) ? 0 : Tcno.hashCode());
		result = prime * result + ((Telefon == null) ? 0 : Telefon.hashCode());
		result = prime * result
				+ ((Verilenyer == null) ? 0 : Verilenyer.hashCode());
		result = prime * result
				+ ((cinsiyet == null) ? 0 : cinsiyet.hashCode());
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MusteriKayitDomain other = (MusteriKayitDomain) obj;
		if (Adi == null) {
			if (other.Adi != null)
				return false;
		} else if (!Adi.equals(other.Adi))
			return false;
		if (Adres == null) {
			if (other.Adres != null)
				return false;
		} else if (!Adres.equals(other.Adres))
			return false;
		if (Dogumtarih == null) {
			if (other.Dogumtarih != null)
				return false;
		} else if (!Dogumtarih.equals(other.Dogumtarih))
			return false;
		if (Ehliyetno == null) {
			if (other.Ehliyetno != null)
				return false;
		} else if (!Ehliyetno.equals(other.Ehliyetno))
			return false;
		if (Etarih == null) {
			if (other.Etarih != null)
				return false;
		} else if (!Etarih.equals(other.Etarih))
			return false;
		if (Kefilbilgi == null) {
			if (other.Kefilbilgi != null)
				return false;
		} else if (!Kefilbilgi.equals(other.Kefilbilgi))
			return false;
		if (Kefiltelefon == null) {
			if (other.Kefiltelefon != null)
				return false;
		} else if (!Kefiltelefon.equals(other.Kefiltelefon))
			return false;
		if (Soyadi == null) {
			if (other.Soyadi != null)
				return false;
		} else if (!Soyadi.equals(other.Soyadi))
			return false;
		if (Tcno == null) {
			if (other.Tcno != null)
				return false;
		} else if (!Tcno.equals(other.Tcno))
			return false;
		if (Telefon == null) {
			if (other.Telefon != null)
				return false;
		} else if (!Telefon.equals(other.Telefon))
			return false;
		if (Verilenyer == null) {
			if (other.Verilenyer != null)
				return false;
		} else if (!Verilenyer.equals(other.Verilenyer))
			return false;
		if (cinsiyet == null) {
			if (other.cinsiyet != null)
				return false;
		} else if (!cinsiyet.equals(other.cinsiyet))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTcno() {
		return Tcno;
	}
	public void setTcno(String tcno) {
		Tcno = tcno;
	}
	public String getAdi() {
		return Adi;
	}
	public void setAdi(String adi) {
		Adi = adi;
	}
	public String getSoyadi() {
		return Soyadi;
	}
	public void setSoyadi(String soyadi) {
		Soyadi = soyadi;
	}
	public Date getDogumtarih() {
		return Dogumtarih;
	}
	public void setDogumtarih(Date dogumtarih) {
		Dogumtarih = dogumtarih;
	}
	public String getTelefon() {
		return Telefon;
	}
	public void setTelefon(String telefon) {
		Telefon = telefon;
	}
	public String getAdres() {
		return Adres;
	}
	public void setAdres(String adres) {
		Adres = adres;
	}
	public String getEhliyetno() {
		return Ehliyetno;
	}
	public void setEhliyetno(String ehliyetno) {
		Ehliyetno = ehliyetno;
	}
	public String getVerilenyer() {
		return Verilenyer;
	}
	public void setVerilenyer(String verilenyer) {
		Verilenyer = verilenyer;
	}
	public Date getEtarih() {
		return Etarih;
	}
	public void setEtarih(Date etarih) {
		Etarih = etarih;
	}
	public String getKefilbilgi() {
		return Kefilbilgi;
	}
	public void setKefilbilgi(String kefilbilgi) {
		Kefilbilgi = kefilbilgi;
	}
	public String getKefiltelefon() {
		return Kefiltelefon;
	}
	public void setKefiltelefon(String kefiltelefon) {
		Kefiltelefon = kefiltelefon;
	}
	public String getCinsiyet() {
		return cinsiyet;
	}
	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
	
	
	
public String toString() {

		
		return Tcno + " " + Adi + " " + Soyadi + " " + Dogumtarih + " " + Telefon + " " + Adres + " " + Ehliyetno + " " + Verilenyer + " " + Etarih + " " + Kefilbilgi + " " + Kefiltelefon + " " + cinsiyet;
	}
	
	
}
