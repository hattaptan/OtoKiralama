package tr.com.hattap.domain;

public class AracKayitDomain {

	private int id;
	private String plaka;
	private String MarkaBox;
	private String Model;
	private String Renk;
	private String VitesBox;
	private String Yakit;
	private String Tip;
	private String MotorGucu;
	private String Gunluk;
	private String Haftalik;
	private String Aylik;
	
	
		
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Aylik == null) ? 0 : Aylik.hashCode());
		result = prime * result + ((Gunluk == null) ? 0 : Gunluk.hashCode());
		result = prime * result
				+ ((Haftalik == null) ? 0 : Haftalik.hashCode());
		result = prime * result
				+ ((MarkaBox == null) ? 0 : MarkaBox.hashCode());
		result = prime * result + ((Model == null) ? 0 : Model.hashCode());
		result = prime * result
				+ ((MotorGucu == null) ? 0 : MotorGucu.hashCode());
		result = prime * result + ((Renk == null) ? 0 : Renk.hashCode());
		result = prime * result + ((Tip == null) ? 0 : Tip.hashCode());
		result = prime * result
				+ ((VitesBox == null) ? 0 : VitesBox.hashCode());
		result = prime * result + ((Yakit == null) ? 0 : Yakit.hashCode());
		result = prime * result + id;
		result = prime * result + ((plaka == null) ? 0 : plaka.hashCode());
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
		AracKayitDomain other = (AracKayitDomain) obj;
		if (Aylik == null) {
			if (other.Aylik != null)
				return false;
		} else if (!Aylik.equals(other.Aylik))
			return false;
		if (Gunluk == null) {
			if (other.Gunluk != null)
				return false;
		} else if (!Gunluk.equals(other.Gunluk))
			return false;
		if (Haftalik == null) {
			if (other.Haftalik != null)
				return false;
		} else if (!Haftalik.equals(other.Haftalik))
			return false;
		if (MarkaBox == null) {
			if (other.MarkaBox != null)
				return false;
		} else if (!MarkaBox.equals(other.MarkaBox))
			return false;
		if (Model == null) {
			if (other.Model != null)
				return false;
		} else if (!Model.equals(other.Model))
			return false;
		if (MotorGucu == null) {
			if (other.MotorGucu != null)
				return false;
		} else if (!MotorGucu.equals(other.MotorGucu))
			return false;
		if (Renk == null) {
			if (other.Renk != null)
				return false;
		} else if (!Renk.equals(other.Renk))
			return false;
		if (Tip == null) {
			if (other.Tip != null)
				return false;
		} else if (!Tip.equals(other.Tip))
			return false;
		if (VitesBox == null) {
			if (other.VitesBox != null)
				return false;
		} else if (!VitesBox.equals(other.VitesBox))
			return false;
		if (Yakit == null) {
			if (other.Yakit != null)
				return false;
		} else if (!Yakit.equals(other.Yakit))
			return false;
		if (id != other.id)
			return false;
		if (plaka == null) {
			if (other.plaka != null)
				return false;
		} else if (!plaka.equals(other.plaka))
			return false;
		return true;
	}





	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public String getPlaka() {
		return plaka;
	}





	public void setPlaka(String plaka) {
		this.plaka = plaka;
	}





	public String getMarkaBox() {
		return MarkaBox;
	}





	public void setMarkaBox(String markaBox) {
		MarkaBox = markaBox;
	}





	public String getModel() {
		return Model;
	}





	public void setModel(String model) {
		Model = model;
	}





	public String getRenk() {
		return Renk;
	}





	public void setRenk(String renk) {
		Renk = renk;
	}





	public String getVitesBox() {
		return VitesBox;
	}





	public void setVitesBox(String vitesBox) {
		VitesBox = vitesBox;
	}





	public String getYakit() {
		return Yakit;
	}





	public void setYakit(String yakit) {
		Yakit = yakit;
	}





	public String getTip() {
		return Tip;
	}





	public void setTip(String tip) {
		Tip = tip;
	}





	public String getMotorGucu() {
		return MotorGucu;
	}





	public void setMotorGucu(String motorGucu) {
		MotorGucu = motorGucu;
	}





	public String getGunluk() {
		return Gunluk;
	}





	public void setGunluk(String gunluk) {
		Gunluk = gunluk;
	}





	public String getHaftalik() {
		return Haftalik;
	}





	public void setHaftalik(String haftalik) {
		Haftalik = haftalik;
	}





	public String getAylik() {
		return Aylik;
	}





	public void setAylik(String aylik) {
		Aylik = aylik;
	}





	public String toString() {

		
		return plaka + " " + MarkaBox + " " + Model + " " + Renk + " " + VitesBox + " " + Yakit + " " + Tip + " " + MotorGucu + " " + Gunluk + " " + Haftalik + " " + Aylik;
	}
	
	
}
