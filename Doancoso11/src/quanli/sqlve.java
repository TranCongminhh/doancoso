package quanli;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class sqlve {
private Baigiuxe baigiuxe;

public sqlve(Baigiuxe baigiuxe) {
	this.baigiuxe = baigiuxe;
}
public void showve() {
	 DefaultTableModel model1 = (DefaultTableModel) baigiuxe.tableve.getModel();
	  	try {
	  		model1.setRowCount(0);
	  		 String[] arr = {"Mã vé", "Biển số xe", "Loại xe"};
	  		DefaultTableModel modle=new DefaultTableModel(arr, 0 );
	  		Connection connection=connect.getConnection();
	  		String query="SELECT *FROM dbo.[tableve]";
	  		PreparedStatement ps=connection.prepareStatement(query);
	  		ResultSet rs=ps.executeQuery();
	  		while (rs.next()) {
	  			
	  			
	  		Vector vector=new Vector();
	  		vector.add(rs.getString("Mave"));
	  		vector.add(rs.getString("Biensoxe"));
	  		vector.add(rs.getString("Loaixe"));
	  			modle.addRow(vector);
	  		}
	  		baigiuxe.tableve.setModel(modle);
	  	} catch (SQLException e) {
	  		Logger.getLogger(sqlve.class.getName()).log(Level.SEVERE, null,e);;
	  	}
	  	
}

public void insertve() {
  
    String sql = "INSERT INTO tableve(Mave, Biensoxe, Loaixe) VALUES (?, ?, ?)";
    Connection connection = connect.getConnection();

    try {
        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setString(1, baigiuxe.textField_11.getText()); 
        ps.setString(2, ""); 
        ps.setString(3, ""); 
 
        int rowsAffected = ps.executeUpdate();
        System.out.println(rowsAffected + " row(s) inserted successfully.");

    } catch (SQLException e) {
        e.printStackTrace();
    }
}

public void xoave()
{
	try {
		connect a=new connect();
		Connection connection=a.getConnection();
		PreparedStatement comm=connection.prepareStatement("Delete tableve where Mave=?");
		comm.setString(1,baigiuxe.tableve.getValueAt(baigiuxe.tableve.getSelectedRow(), 0).toString());
		comm.executeUpdate();
		if(JOptionPane.showConfirmDialog(baigiuxe, "Bạn có muốn xóa vé xe này","Confirm",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION	)
		{
			comm.executeUpdate();
		}
	} catch (Exception e) {
		System.out.println(e.toString());
	}
}
public void xoa1(int x)
{
	
	try {
		connect a=new connect();
		Connection connection=a.getConnection();
		PreparedStatement comm=connection.prepareStatement("Delete tableve where Mave=?");
		comm.setString(1,baigiuxe.tableve.getValueAt(x, 0).toString());
		comm.executeUpdate();
	} catch (Exception e) {
		System.out.println(e.toString());
	}
}
public void themve1() {
	  
    String sql = "INSERT INTO tableve(Mave, Biensoxe, Loaixe) VALUES (?, ?, ?)";
    Connection connection = connect.getConnection();

    try {
        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setString(1, baigiuxe.textmvdx.getText()); 
        ps.setString(2, baigiuxe.textbsx.getText()); 
        ps.setString(3, baigiuxe.comboBox.getSelectedItem()+""); 
        int rowsAffected = ps.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
public void themve2(String x) {
	  
    String sql = "INSERT INTO tableve(Mave, Biensoxe, Loaixe) VALUES (?, ?, ?)";
    Connection connection = connect.getConnection();

    try {
        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setString(1, x); 
        ps.setString(2, ""); 
        ps.setString(3, ""); 
        int rowsAffected = ps.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
}
