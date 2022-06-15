package tr.com.hattap.domain;

import java.sql.Date;

import tr.com.hattap.db.AracKayitDb;
import tr.com.hattap.db.MusteriKayitDb;

public class KiralaDomain {

	
	private int id;
	private int Kkisi;
	private Date Vtarih;
	private Date Atarih;
	private int Aplaka;
	private String fiyat;
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Aplaka;
		result = prime * result + ((Atarih == null) ? 0 : Atarih.hashCode());
		result = prime * result + Kkisi;
		result = prime * result + ((Vtarih == null) ? 0 : Vtarih.hashCode());
		result = prime * result + ((fiyat == null) ? 0 : fiyat.hashCode());
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
		KiralaDomain other = (KiralaDomain) obj;
		if (Aplaka != other.Aplaka)
			return false;
		if (Atarih == null) {
			if (other.Atarih != null)
				return false;
		} else if (!Atarih.equals(other.Atarih))
			return false;
		if (Kkisi != other.Kkisi)
			return false;
		if (Vtarih == null) {
			if (other.Vtarih != null)
				return false;
		} else if (!Vtarih.equals(other.Vtarih))
			return false;
		if (fiyat == null) {
			if (other.fiyat != null)
				return false;
		} else if (!fiyat.equals(other.fiyat))
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




	public int getKkisi() {
		return Kkisi;
	}




	public void setKkisi(int kkisi) {
		Kkisi = kkisi;
	}




	public Date getVtarih() {
		return Vtarih;
	}




	public void setVtarih(Date vtarih) {
		Vtarih = vtarih;
	}




	public Date getAtarih() {
		return Atarih;
	}




	public void setAtarih(Date atarih) {
		Atarih = atarih;
	}




	public int getAplaka() {
		return Aplaka;
	}




	public void setAplaka(int aplaka) {
		Aplaka = aplaka;
	}




	public String getFiyat() {
		return fiyat;
	}




	public void setFiyat(String fiyat) {
		this.fiyat = fiyat;
	}




	@Override
	public String toString() {

		
		return MusteriKayitDb.bul(Kkisi).getAdi()+" "+MusteriKayitDb.bul(Kkisi).getSoyadi()+" // "+ Vtarih + " // " + Atarih + " // " +AracKayitDb.bul(Aplaka).getPlaka()+ " // " + fiyat;
	}
}
