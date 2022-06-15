package tr.com.hattap.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import tr.com.hattap.domain.MusteriKayitDomain;



public class MusteriKayitDb {
	
public static void initTable() {
		
		
		try {
			
			Connection conn = ConnectionToDb.getConnection();
			Statement stmt = conn.createStatement();
			
			stmt.executeUpdate("CREATE TABLE kisiler(id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY(START WITH 1, INCREMENT BY 1), Tcno VARCHAR(30), Adi VARCHAR(50), Soyadi VARCHAR(11), Dogumtarih DATE, Telefon VARCHAR(50), Adres VARCHAR(200), Ehliyetno VARCHAR(30), Verilenyer VARCHAR(50), Etarih DATE, Kefilbilgi VARCHAR(80), Kefiltelefon VARCHAR(50), cinsiyet VARCHAR(30))");
		
			stmt.close();
			conn.close();
			
		} catch (SQLException e) {

		   //e.printStackTrace();
		}
		
	}
	
	public static void ekle(MusteriKayitDomain musteriSatisDomain) {
		
		
		try {
			
			Connection conn = ConnectionToDb.getConnection();
			Statement stmt = conn.createStatement();
			
			stmt.executeUpdate("INSERT INTO kisiler(Tcno,Adi,Soyadi,Dogumtarih,Telefon,Adres,Ehliyetno,Verilenyer,Etarih,Kefilbilgi,Kefiltelefon,cinsiyet) VALUES('"
					+musteriSatisDomain.getTcno()
					+ "','"
					+musteriSatisDomain.getAdi()
					+ "','"
					+musteriSatisDomain.getSoyadi()
					+ "','"
					+musteriSatisDomain.getDogumtarih()
					+ "','"
					+musteriSatisDomain.getTelefon()
					+ "','"
					+musteriSatisDomain.getAdres()
					+ "','"
					+musteriSatisDomain.getEhliyetno()
					+ "','"
					+musteriSatisDomain.getVerilenyer()
					+ "','"
					+musteriSatisDomain.getEtarih()
					+ "','"
					+musteriSatisDomain.getKefilbilgi()
					+ "','"
					+musteriSatisDomain.getKefiltelefon()
					+ "','"
					+musteriSatisDomain.getCinsiyet()
					+ "')");
			
			stmt.close();
			conn.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void sil(MusteriKayitDomain silDomain) {
		try {
			Connection conn = ConnectionToDb.getConnection();
			Statement stmt = conn.createStatement();

			stmt.executeUpdate("DELETE FROM kisiler WHERE id = "
					+ silDomain.getId());

			stmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void duzenle(MusteriKayitDomain duzenleDomain) {
		
		try {
			
			Connection conn = ConnectionToDb.getConnection();
			Statement stmt = conn.createStatement();
	
			
			stmt.executeUpdate("UPDATE kisiler SET Tcno = '"
					+duzenleDomain.getTcno()
					+ "', Adi ='"
					+ duzenleDomain.getAdi()
					+ "', Soyadi ='"
					+ duzenleDomain.getSoyadi()
					+ "', Dogumtarih ='"
					+ duzenleDomain.getDogumtarih()
					+ "', Telefon ='"
					+ duzenleDomain.getTelefon()
					+ "', Adres ='"
					+ duzenleDomain.getAdres()
					+ "', Ehliyetno ='"
					+ duzenleDomain.getEhliyetno()
					+ "', Verilenyer ='"
					+ duzenleDomain.getVerilenyer()
					+ "', Etarih ='"
					+ duzenleDomain.getEtarih()
					+ "', Kefilbilgi ='"
					+ duzenleDomain.getKefilbilgi()
					+ "', Kefiltelefon ='"
					+ duzenleDomain.getKefiltelefon()
					+ "', cinsiyet ='"
					+ duzenleDomain.getCinsiyet()
					+ "' WHERE id ="
					+duzenleDomain.getId());
			
			stmt.close();
			conn.close();
					
					
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}
	
	public static ArrayList<MusteriKayitDomain> listele() {
		
		ArrayList<MusteriKayitDomain> musteri = new ArrayList<MusteriKayitDomain>();
	
	try {
		
		Connection conn = ConnectionToDb.getConnection();
		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery("SELECT * FROM kisiler");
		
		while (rs.next()) {
			
			MusteriKayitDomain musteriSatisDomain = new MusteriKayitDomain();
			
			musteriSatisDomain.setId(rs.getInt("id"));
			musteriSatisDomain.setTcno(rs.getString("Tcno"));
			musteriSatisDomain.setAdi(rs.getString("Adi"));
			musteriSatisDomain.setSoyadi(rs.getString("Soyadi"));
			musteriSatisDomain.setDogumtarih(rs.getDate("Dogumtarih"));
			musteriSatisDomain.setTelefon(rs.getString("Telefon"));
			musteriSatisDomain.setAdres(rs.getString("Adres"));
			musteriSatisDomain.setEhliyetno(rs.getString("Ehliyetno"));
			musteriSatisDomain.setVerilenyer(rs.getString("Verilenyer"));
			musteriSatisDomain.setEtarih(rs.getDate("Etarih"));
			musteriSatisDomain.setKefilbilgi(rs.getString("Kefilbilgi"));
			musteriSatisDomain.setKefiltelefon(rs.getString("Kefiltelefon"));
			musteriSatisDomain.setCinsiyet(rs.getString("cinsiyet"));
			musteri.add(musteriSatisDomain);
			
		}
		
		stmt.close();
		conn.close();
		
	} catch (SQLException e) {

	
	}
	return musteri;
	
	}
	
public static ArrayList<MusteriKayitDomain> bul(String aranan) {
		
		ArrayList<MusteriKayitDomain> aramusteri = new ArrayList<MusteriKayitDomain>();
	
	try {
		
		Connection conn = ConnectionToDb.getConnection();
		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery("SELECT * FROM kisiler WHERE Tcno LIKE '"
				+ aranan + "%'");
		
		while (rs.next()) {
			
			MusteriKayitDomain musteriAraDomain = new MusteriKayitDomain();
			
			musteriAraDomain.setId(rs.getInt("id"));
			musteriAraDomain.setTcno(rs.getString("Tcno"));
			musteriAraDomain.setAdi(rs.getString("Adi"));
			musteriAraDomain.setSoyadi(rs.getString("Soyadi"));
			musteriAraDomain.setDogumtarih(rs.getDate("Dogumtarih"));
			musteriAraDomain.setTelefon(rs.getString("Telefon"));
			musteriAraDomain.setAdres(rs.getString("Adres"));
			musteriAraDomain.setEhliyetno(rs.getString("Ehliyetno"));
			musteriAraDomain.setVerilenyer(rs.getString("Verilenyer"));
			musteriAraDomain.setEtarih(rs.getDate("Etarih"));
			musteriAraDomain.setKefilbilgi(rs.getString("Kefilbilgi"));
			musteriAraDomain.setKefiltelefon(rs.getString("Kefiltelefon"));
			musteriAraDomain.setCinsiyet(rs.getString("cinsiyet"));
			aramusteri.add(musteriAraDomain);
			
		}
		
		stmt.close();
		conn.close();
		
	} catch (SQLException e) {

	
	}
	return aramusteri;
	
	}


public static MusteriKayitDomain bul(int id) {
	
	MusteriKayitDomain musteriAraDomain = new MusteriKayitDomain();
try {
	
	Connection conn = ConnectionToDb.getConnection();
	Statement stmt = conn.createStatement();
	
	ResultSet rs = stmt.executeQuery("SELECT * FROM kisiler WHERE id = "
			+ id);
	
	while (rs.next()) {
		
		
		
		musteriAraDomain.setId(rs.getInt("id"));
		musteriAraDomain.setTcno(rs.getString("Tcno"));
		musteriAraDomain.setAdi(rs.getString("Adi"));
		musteriAraDomain.setSoyadi(rs.getString("Soyadi"));
		musteriAraDomain.setDogumtarih(rs.getDate("Dogumtarih"));
		musteriAraDomain.setTelefon(rs.getString("Telefon"));
		musteriAraDomain.setAdres(rs.getString("Adres"));
		musteriAraDomain.setEhliyetno(rs.getString("Ehliyetno"));
		musteriAraDomain.setVerilenyer(rs.getString("Verilenyer"));
		musteriAraDomain.setEtarih(rs.getDate("Etarih"));
		musteriAraDomain.setKefilbilgi(rs.getString("Kefilbilgi"));
		musteriAraDomain.setKefiltelefon(rs.getString("Kefiltelefon"));
		musteriAraDomain.setCinsiyet(rs.getString("cinsiyet"));
		
	}
	
	stmt.close();
	conn.close();
	
} catch (SQLException e) {

	e.printStackTrace();
}
return musteriAraDomain;

}

}
