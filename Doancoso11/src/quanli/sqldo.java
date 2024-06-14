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

public class sqldo {
Baigiuxe baigiuxe;

public sqldo(Baigiuxe baigiuxe) {
	this.baigiuxe = baigiuxe;
}
public void insetdoxe() {
	 SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	   String formattedDateTime = dateFormat.format(new Date());
    String sql = "INSERT INTO tabledo(Mave, Biensoxe, Loaixe, Tenxe, Vitri, Loaive, Thoigianvaoben) VALUES (?, ?, ?, ?, ?, ?, ?)";
    Connection connection = connect.getConnection();

    try {
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, baigiuxe.textmvdx.getText()); 
        ps.setString(2, baigiuxe.textbsx.getText()); 
        ps.setString(3, baigiuxe.comboBox.getSelectedItem()+""); 
        
     ps.setString(4, baigiuxe.textlx.getText());
     ps.setString(5, baigiuxe.comboBox_1.getSelectedItem()+""); 
     boolean a=false;
     for(int i=0;i<baigiuxe.tableuser.getRowCount();i++)
     {
    	 Object data=baigiuxe.tableuser.getValueAt(i, 2);
    	 if(data.equals( baigiuxe.textmvdx.getText()))
    	 {
    		a=true; 
    	 }
    
     }
if(a)
{
	 ps.setString(6,"Vé tháng"); 
}
else
{
	 ps.setString(6,"Vé lượt"); 
}
        ps.setString(7,formattedDateTime);
        int rowsAffected = ps.executeUpdate();
        System.out.println(rowsAffected + " row(s) inserted successfully.");

    } catch (SQLException e) {
        e.printStackTrace();
    }
}
public void showdulieudoxe() {
 	 DefaultTableModel model1 = (DefaultTableModel) baigiuxe.tabledoxe.getModel();
 	try {
 		model1.setRowCount(0);
 		 String[] arr = {  "Mã vé", "Biển số xe", "Loại xe", "Tên xe", "Vị trí", "Loại vé", "Thời gian vào bến "};
 		DefaultTableModel modle=new DefaultTableModel(arr, 0 );
 		Connection connection=connect.getConnection();
 		String query="SELECT *FROM dbo.[tabledo]";
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
 		
 			modle.addRow(vector);
 		}
 		baigiuxe.tabledoxe.setModel(modle);
 	} catch (SQLException e) {
 		Logger.getLogger(sqldo.class.getName()).log(Level.SEVERE, null,e);;
 	}
 	
  }
public void xoadoxe()
{
	try {
		connect a=new connect();
		Connection connection=a.getConnection();
		PreparedStatement comm=connection.prepareStatement("Delete tabledo where Mave=?");
		comm.setString(1,baigiuxe.tabledoxe.getValueAt(baigiuxe.tabledoxe.getSelectedRow(), 0).toString());
		comm.executeUpdate();
		if(JOptionPane.showConfirmDialog(baigiuxe, "Bạn có muốn cho xe này rời bãi","Confirm",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION	)
		{
			comm.executeUpdate();
		}
	} catch (Exception e) {
		System.out.println(e.toString());
	}
}

}
