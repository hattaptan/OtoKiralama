package tr.com.hattap.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import tr.com.hattap.domain.KiralaDomain;



public class KiralaDb {
	
	public static void initTable() {
		
		try {
			Connection conn = ConnectionToDb.getConnection();
			Statement stmt = conn.createStatement();
			
			stmt.executeUpdate("CREATE TABLE kirala(id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY(START WITH 1, INCREMENT BY 1), Kkisi VARCHAR(500), Vtarih DATE, Atarih DATE, Aplaka VARCHAR(150), fiyat VARCHAR(50))");
		
			
		} catch (SQLException e) {

		//e.printStackTrace();
		}
	}

	public static void ekle(KiralaDomain kiralaDomain){
		
		try {
			
			Connection conn = ConnectionToDb.getConnection();
			Statement stmt = conn.createStatement();
			
			stmt.executeUpdate("INSERT INTO kirala(Kkisi,Vtarih,Atarih,Aplaka,fiyat) VALUES('"
					+kiralaDomain.getKkisi()
					+"','"
					+kiralaDomain.getVtarih()
					+"','"
					+kiralaDomain.getAtarih()
					+"','"
					+kiralaDomain.getAplaka()
					+"','"
					+kiralaDomain.getFiyat()
					+"')");
			
				stmt.close();
				conn.close();
		} catch (SQLException e) {
			// TODO: handle exception
		e.printStackTrace();
		}	
			
		}
		
		public static void sil(KiralaDomain silinecekDomain) {
			try {
				Connection conn = ConnectionToDb.getConnection();
				Statement stmt = conn.createStatement();

				stmt.executeUpdate("DELETE FROM kirala WHERE id = "
						+ silinecekDomain.getId());

				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		public static void duzenle(KiralaDomain duzenlenecekKayýtDomain) {
			try {
				Connection conn = ConnectionToDb.getConnection();
				Statement stmt = conn.createStatement();
				
				stmt.executeUpdate("UPDATE kirala SET Kkisi = '"
						+duzenlenecekKayýtDomain.getKkisi() 
						+ "', Vtarih ='"
						+duzenlenecekKayýtDomain.getVtarih() 
						+ "', Atarih ='"
						+duzenlenecekKayýtDomain.getAtarih()
						+ "', Aplaka ='"
						+duzenlenecekKayýtDomain.getAplaka()
						+ "', fiyat ='"
						+duzenlenecekKayýtDomain.getFiyat()
						+ "' WHERE id ="
						+duzenlenecekKayýtDomain.getId());
				
				
				stmt.close();
				conn.close();
				
			} catch (SQLException e) {
	           e.printStackTrace();		
			}
			
			
		}
		
		
		public static List<KiralaDomain> listele() {
			List<KiralaDomain> kiralama = new ArrayList<KiralaDomain>();

			try {
				Connection conn = ConnectionToDb.getConnection();
				Statement stmt = conn.createStatement();

				ResultSet rs = stmt.executeQuery("SELECT * FROM kirala ORDER BY id DESC");

				while (rs.next()) {
					KiralaDomain kiralamaDomain = new KiralaDomain();
					kiralamaDomain.setId(rs.getInt("id"));
					kiralamaDomain.setKkisi(rs.getInt("Kkisi"));
					kiralamaDomain.setVtarih(rs.getDate("Vtarih"));
					kiralamaDomain.setAtarih(rs.getDate("Atarih"));
					kiralamaDomain.setAplaka(rs.getInt("Aplaka"));
					kiralamaDomain.setFiyat(rs.getString("fiyat"));
					

					kiralama.add(kiralamaDomain);
				}
	           
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return kiralama;
			

		}
	
}
