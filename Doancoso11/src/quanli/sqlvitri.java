package quanli;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class sqlvitri {
private Baigiuxe baigiuxe;

public sqlvitri(Baigiuxe baigiuxe) {
	this.baigiuxe = baigiuxe;
}
public void showVitri() {
	 DefaultTableModel model1 = (DefaultTableModel) baigiuxe.tablevitri.getModel();
	  	try {
	  		model1.setRowCount(0);
	  		 String[] arr = {"Mã vị trí", "Loại xe", "Biển số xe"};
	  		DefaultTableModel modle=new DefaultTableModel(arr, 0 );
	  		Connection connection=connect.getConnection();
	  		String query="SELECT *FROM dbo.[tablevitri]";
	  		PreparedStatement ps=connection.prepareStatement(query);
	  		ResultSet rs=ps.executeQuery();
	  		while (rs.next()) {
	  			
	  			
	  		Vector vector=new Vector();
	  		vector.add(rs.getString("Mavitri"));
	  		vector.add(rs.getString("Loaixe"));
	  		vector.add(rs.getString("Biensoxe"));
	  			modle.addRow(vector);
	  		}
	  		baigiuxe.tablevitri.setModel(modle);
	  	} catch (SQLException e) {
	  		Logger.getLogger(sqlvitri.class.getName()).log(Level.SEVERE, null,e);;
	  	}
	  	
}

public void insertvitri() {
  
    String sql = "INSERT INTO tablevitri(Mavitri, Loaixe, Biensoxe) VALUES (?, ?, ?)";
    Connection connection = connect.getConnection();

    try {
        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setString(1, baigiuxe.textField_9.getText()); 
        ps.setString(2, baigiuxe.comboBox_2.getSelectedItem()+""); 
        ps.setString(3, ""); 
 
        int rowsAffected = ps.executeUpdate();
        System.out.println(rowsAffected + " row(s) inserted successfully.");

    } catch (SQLException e) {
        e.printStackTrace();
    }
}
public void xoavitri1(int x)
{
	
	try {
		connect a=new connect();
		Connection connection=a.getConnection();
		PreparedStatement comm=connection.prepareStatement("Delete tablevitri where Mavitri=?");
		comm.setString(1,baigiuxe.tablevitri.getValueAt(x, 0).toString());
		comm.executeUpdate();
	} catch (Exception e) {
		System.out.println(e.toString());
	}
}
public void them1() {
	  
    String sql = "INSERT INTO tablevitri(Mavitri, Loaixe, Biensoxe) VALUES (?, ?, ?)";
    Connection connection = connect.getConnection();

    try {
        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setString(1, baigiuxe.comboBox_1.getSelectedItem()+""); 
        ps.setString(2, baigiuxe.comboBox.getSelectedItem()+""); 
        ps.setString(3, baigiuxe.textbsx.getText()); 
 
        int rowsAffected = ps.executeUpdate();
        System.out.println(rowsAffected + " row(s) inserted successfully.");

    } catch (SQLException e) {
        e.printStackTrace();
    }
}
public void them2(String a, String b) {
	  
    String sql = "INSERT INTO tablevitri(Mavitri, Loaixe, Biensoxe) VALUES (?, ?, ?)";
    Connection connection = connect.getConnection();

    try {
        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setString(1,a); 
        ps.setString(2,b); 
        ps.setString(3, ""); 
 
        int rowsAffected = ps.executeUpdate();
        System.out.println(rowsAffected + " row(s) inserted successfully.");

    } catch (SQLException e) {
        e.printStackTrace();
    }
}

}
