package tr.com.hattap.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import tr.com.hattap.domain.AracKayitDomain;





public class AracKayitDb {

	
	public static void initTable() {

		try {
			Connection conn = ConnectionToDb.getConnection();
			Statement stmt = conn.createStatement();

			stmt.executeUpdate("CREATE TABLE araba(id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY(START WITH 1, INCREMENT BY 1), Plaka VARCHAR(50), MarkaBox VARCHAR(50), Model VARCHAR(50), Renk VARCHAR(15), VitesBox VARCHAR(50), Yakit VARCHAR(50), Tip VARCHAR(50), MotorGucu VARCHAR(50), Gunluk VARCHAR(50), Haftalik VARCHAR(50), Aylik VARCHAR(50))");

			stmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}

	}
	
public static void ekle(AracKayitDomain aracBilgiDomain) {
		
		try {
		
			Connection conn = ConnectionToDb.getConnection();
			Statement stmt = conn.createStatement();
			
			stmt.executeUpdate("INSERT INTO araba(Plaka,MarkaBox,Model,Renk,VitesBox,Yakit,Tip,MotorGucu,Gunluk,Haftalik,Aylik) VALUES('"
					+aracBilgiDomain.getPlaka()
					+"','"
					+aracBilgiDomain.getMarkaBox()
					+"','"
					+aracBilgiDomain.getModel()
					+"','"
					+aracBilgiDomain.getRenk()
					+"','"
					+aracBilgiDomain.getVitesBox()
					+"','"
					+aracBilgiDomain.getYakit()
					+"','"
					+aracBilgiDomain.getTip()
					+"','"
					+aracBilgiDomain.getMotorGucu()
					+"','"
					+aracBilgiDomain.getGunluk()
					+"','"
					+aracBilgiDomain.getHaftalik()
					+"','"
					+aracBilgiDomain.getAylik() + "')");
			
			stmt.close();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void sil(AracKayitDomain silAracBilgiDomain) {
		
		try {
			
			Connection conn = ConnectionToDb.getConnection();
			Statement stmt = conn.createStatement();
			
			stmt.executeUpdate("DELETE FROM araba WHERE id = "
					+ silAracBilgiDomain.getId());
			
			stmt.close();
			conn.close();
			
		} catch (SQLException e) {
		}
		
	}
	
	public static void duzenle(AracKayitDomain duzenleBilgiDomain) {
		
		try {
			
			Connection conn = ConnectionToDb.getConnection();
			Statement stmt = conn.createStatement();
			
			stmt.executeUpdate("UPDATE araba SET Plaka = '"
				+duzenleBilgiDomain.getPlaka()
				+ "', MarkaBox ='"
				+duzenleBilgiDomain.getMarkaBox()
				+ "', Model ='"
				+duzenleBilgiDomain.getModel()
				+ "', Renk ='"
				+duzenleBilgiDomain.getRenk()
				+ "', VitesBox ='"
				+duzenleBilgiDomain.getVitesBox()
				+ "', Yakit ='"
				+duzenleBilgiDomain.getYakit()
				+ "', Tip ='"
				+duzenleBilgiDomain.getTip()
				+ "', MotorGucu ='"
				+duzenleBilgiDomain.getMotorGucu()
				+ "', Gunluk ='"
				+duzenleBilgiDomain.getGunluk()
				+ "', Haftalik ='"
				+duzenleBilgiDomain.getHaftalik()
				+ "', Aylik ='"
				+duzenleBilgiDomain.getAylik()
				+ "' WHERE id ="
				+duzenleBilgiDomain.getId());
			
			stmt.close();
			conn.close();
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public static ArrayList<AracKayitDomain> listele() {
		ArrayList<AracKayitDomain> aracbilgi = new ArrayList<AracKayitDomain>();
		
		try {
			
			Connection conn = ConnectionToDb.getConnection();
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM araba");
			
			while (rs.next()) {

				AracKayitDomain eklenecekarac = new AracKayitDomain();
				
				eklenecekarac.setId(rs.getInt("id"));
				eklenecekarac.setPlaka(rs.getString("Plaka"));
				eklenecekarac.setMarkaBox(rs.getString("MarkaBox"));
				eklenecekarac.setModel(rs.getString("Model"));
				eklenecekarac.setRenk(rs.getString("Renk"));
				eklenecekarac.setVitesBox(rs.getString("VitesBox"));
				eklenecekarac.setYakit(rs.getString("Yakit"));
				eklenecekarac.setTip(rs.getString("Tip"));
				eklenecekarac.setMotorGucu(rs.getString("MotorGucu"));
				eklenecekarac.setGunluk(rs.getString("Gunluk"));
				eklenecekarac.setHaftalik(rs.getString("Haftalik"));
				eklenecekarac.setAylik(rs.getString("Aylik"));
				
				aracbilgi.add(eklenecekarac);
				
			}
			
			stmt.close();
			conn.close();
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return aracbilgi;
		
	}
	
	public static AracKayitDomain bul(int id) {
		AracKayitDomain bulplakaDomain = new AracKayitDomain();
	
	try {
		
		Connection conn = ConnectionToDb.getConnection();
		Statement stmt = conn.createStatement();
		
		
		ResultSet rs = stmt.executeQuery("SELECT * FROM araba WHERE id = " + id);
		
		while (rs.next()) {

			
			bulplakaDomain.setId(rs.getInt("id"));
			bulplakaDomain.setPlaka(rs.getString("Plaka"));
			bulplakaDomain.setMarkaBox(rs.getString("MarkaBox"));
			bulplakaDomain.setModel(rs.getString("Model"));
			bulplakaDomain.setRenk(rs.getString("Renk"));
			bulplakaDomain.setVitesBox(rs.getString("VitesBox"));
			bulplakaDomain.setYakit(rs.getString("Yakit"));
			bulplakaDomain.setTip(rs.getString("Tip"));
			bulplakaDomain.setMotorGucu(rs.getString("MotorGucu"));
			bulplakaDomain.setGunluk(rs.getString("Gunluk"));
			bulplakaDomain.setHaftalik(rs.getString("Haftalik"));
			bulplakaDomain.setAylik(rs.getString("Aylik"));
			
		}
		
		stmt.close();
		conn.close();
		
	} catch (SQLException e) {

		e.printStackTrace();
	}
	return bulplakaDomain;
	
	}
	
	public static ArrayList<AracKayitDomain> bul(String aranan) {
		
		
		ArrayList<AracKayitDomain> arananlist = new ArrayList<AracKayitDomain>();
		
	
	try {
		
		Connection conn = ConnectionToDb.getConnection();
		Statement stmt = conn.createStatement();
		
		
		ResultSet rs = stmt.executeQuery("SELECT * FROM araba WHERE Plaka LIKE  '" 
		+ aranan + "%'");
		
		while (rs.next()) {

			AracKayitDomain bulplakaAranan = new AracKayitDomain();
			
			bulplakaAranan.setId(rs.getInt("id"));
			bulplakaAranan.setPlaka(rs.getString("Plaka"));
			bulplakaAranan.setMarkaBox(rs.getString("MarkaBox"));
			bulplakaAranan.setModel(rs.getString("Model"));
			bulplakaAranan.setRenk(rs.getString("Renk"));
			bulplakaAranan.setVitesBox(rs.getString("VitesBox"));
			bulplakaAranan.setYakit(rs.getString("Yakit"));
			bulplakaAranan.setTip(rs.getString("Tip"));
			bulplakaAranan.setMotorGucu(rs.getString("MotorGucu"));
			bulplakaAranan.setGunluk(rs.getString("Gunluk"));
			bulplakaAranan.setHaftalik(rs.getString("Haftalik"));
			bulplakaAranan.setAylik(rs.getString("Aylik"));
			arananlist.add(bulplakaAranan);
			
		}
		
		stmt.close();
		conn.close();
		
	} catch (SQLException e) {

		e.printStackTrace();
	}
	return arananlist;
	
	}
	
}
