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

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class sqlthongke {
Baigiuxe baigiuxe;

public sqlthongke(Baigiuxe baigiuxe) {
	this.baigiuxe = baigiuxe;
}
public void insetthongke(String a, String b,String c,String d,String f,String h, String o) {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    String formattedDateTime = dateFormat.format(new Date());
    String sql = "INSERT INTO tablethongke(Mave, Biensoxe, Loaixe, Tenxe, Vitri, Loaive, Thoigianvaoben, Thoigianxuatben) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    Connection connection = connect.getConnection();

    try {
        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setString(1, a); 
        ps.setString(2, b); 
        ps.setString(3, c); 
        ps.setString(4, d);
        ps.setString(5, f); 
        ps.setString(6, h); 
        ps.setString(7, o); 
     ps.setString(8, formattedDateTime);
        int rowsAffected = ps.executeUpdate();
      

    } catch (SQLException e) {
        e.printStackTrace();
    }
}
public void showdulieu() {
	 DefaultTableModel model1 = (DefaultTableModel) baigiuxe.table_1.getModel();
	try {
		model1.setRowCount(0);
		 String[] arr = {  "Mã vé", "Biển số xe", "Loại xe", "Tên xe", "Vị trí", "Loại vé", "Thời gian vào bến", "Thời gian xuất bến"};
		DefaultTableModel modle=new DefaultTableModel(arr, 0 );
		Connection connection=connect.getConnection();
		String query="SELECT *FROM dbo.[tablethongke]";
		PreparedStatement ps=connection.prepareStatement(query);
		ResultSet rs=ps.executeQuery();
		while (rs.next()) {
		Vector vector=new Vector();
		vector.add(rs.getString("Mave"));
		vector.add(rs.getString("Biensoxe"));
		vector.add(rs.getString("Loaixe"));
		vector.add(rs.getString("Tenxe"));
		vector.add(rs.getString("Vitri"));
		vector.add(rs.getString("Loaive"));
		vector.add(rs.getString("Thoigianvaoben"));
		vector.add(rs.getString("Thoigianxuatben"));
			modle.addRow(vector);
		}
		baigiuxe.table_1.setModel(modle);
	} catch (SQLException e) {
		Logger.getLogger(sqlthongke.class.getName()).log(Level.SEVERE, null,e);;
	}
	
 }
public void xoa()
{
	try {
		connect a=new connect();
		Connection connection=a.getConnection();
		PreparedStatement comm=connection.prepareStatement("Delete tablethongke where Mave=?");
		for(int i=0;i<baigiuxe.table_1.getRowCount();i++)
		{
		comm.setString(1,baigiuxe.table_1.getValueAt(i, 0).toString());
		comm.executeUpdate();
		}
		
	} catch (Exception e) {
		System.out.println(e.toString());
	}
}
}
