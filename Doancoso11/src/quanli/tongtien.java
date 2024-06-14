package quanli;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.table.DefaultTableModel;

public class tongtien {
	private Baigiuxe baigiuxe;

	public tongtien(Baigiuxe baigiuxe) {
		this.baigiuxe = baigiuxe;
	}
	public void insert(int x,String y) {
		  
	    String sql = "INSERT INTO tabletien(Tongtien, Loaixe) VALUES (?, ?)";
	    Connection connection = connect.getConnection();

	    try {
	        PreparedStatement ps = connection.prepareStatement(sql);

	        ps.setInt(1, x); 
	        ps.setString(2, y); 
	        int rowsAffected = ps.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	public void showVitri() {
	    try {
	        Connection connection = connect.getConnection();
	        String query = "SELECT * FROM dbo.[tabletien]";
	        PreparedStatement ps = connection.prepareStatement(query);
	        ResultSet rs = ps.executeQuery();

	        
	        while (rs.next()) {
	           
	            String loaixe = rs.getString(2);

	            if ("Ô tô".equals(loaixe)) {
	                baigiuxe.thangoto += rs.getInt(1); 
	            } else {
	                baigiuxe.thangxemay += rs.getInt(1);
	            }
	        }

	        rs.close();
	        ps.close();
	        connection.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

	public void deleteAllData() {
	    String sql = "DELETE FROM tabletien";

	    Connection connection = connect.getConnection();

	    try {
	        PreparedStatement ps = connection.prepareStatement(sql);
	        int rowsAffected = ps.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

}
