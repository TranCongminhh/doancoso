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

public class Sqluser {
private Baigiuxe baigiuxe;

public Sqluser(Baigiuxe baigiuxe) {
	this.baigiuxe = baigiuxe;
}

public void insetuser() {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String formattedDateTime = dateFormat.format(new Date());
    String sql = "INSERT INTO tableuser(Hovaten, Biensoxe, Mave, Loaixe, Thoigiandangky, Thoigiahethang) VALUES (?, ?, ?, ?, ?, ?)";
    Connection connection = connect.getConnection();

    try {
        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setString(1, baigiuxe.Textfieldten.getText()); 
        ps.setString(2, baigiuxe.Textfieldbsxuser.getText()); 
        ps.setString(3, baigiuxe.Textfieldmaveuser.getText()); 
        
     ps.setString(4, baigiuxe.comboBox_3.getSelectedItem()+"");
        Timestamp timestamp = Timestamp.valueOf(formattedDateTime);
        
        ps.setTimestamp(5, timestamp); 
        int numberOfMonths = Integer.parseInt(baigiuxe.textField_13.getText()); 
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(timestamp);
        calendar.add(Calendar.MONTH, numberOfMonths);
        Timestamp expirationTimestamp = new Timestamp(calendar.getTimeInMillis());
        
        ps.setTimestamp(6, expirationTimestamp);

        
        int rowsAffected = ps.executeUpdate();
        System.out.println(rowsAffected + " row(s) inserted successfully.");

    } catch (SQLException e) {
        e.printStackTrace();
    }
}
public void showduleuser() {
  	 DefaultTableModel model1 = (DefaultTableModel) baigiuxe.tableuser.getModel();
  	try {
  		model1.setRowCount(0);
  		 String[] arr = {"Họ và tên", "Biển số xe", "Mã vé", "Loại xe", "Thời gian đăng ký", "Thời gian hết hạn"};
  		DefaultTableModel modle=new DefaultTableModel(arr, 0 );
  		Connection connection=connect.getConnection();
  		String query="SELECT *FROM dbo.[tableuser]";
  		PreparedStatement ps=connection.prepareStatement(query);
  		ResultSet rs=ps.executeQuery();
  		while (rs.next()) {
  			
  			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
  		   	Timestamp timestamp = rs.getTimestamp("Thoigiandangky");
  		   	Timestamp timestamp1 = rs.getTimestamp("Thoigiahethang");
  		   	String formattedDateTime = dateFormat.format(timestamp);
  			String formattedDateTime1 = dateFormat.format(timestamp1);
  			
  		Vector vector=new Vector();
  		vector.add(rs.getString("Hovaten"));
  		vector.add(rs.getString("Biensoxe"));
  		vector.add(rs.getString("Mave"));
  		vector.add(rs.getString("Loaixe"));
  		vector.add(formattedDateTime);
  		vector.add(formattedDateTime1);
  			modle.addRow(vector);
  		}
  		baigiuxe.tableuser.setModel(modle);
  	} catch (SQLException e) {
  		Logger.getLogger(Sqluser.class.getName()).log(Level.SEVERE, null,e);;
  	}
  	
   }

public void xoauser()
{
	try {
		connect a=new connect();
		Connection connection=a.getConnection();
		PreparedStatement comm=connection.prepareStatement("Delete tableuser where Mave=?");
		comm.setString(1,baigiuxe.tableuser.getValueAt(baigiuxe.tableuser.getSelectedRow(), 2).toString());
		comm.executeUpdate();
		if(JOptionPane.showConfirmDialog(baigiuxe, "Bạn có muốn khách hoàng này không này không","Confirm",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION	)
		{
			comm.executeUpdate();
		}
	} catch (Exception e) {
		System.out.println(e.toString());
	}
}
}
