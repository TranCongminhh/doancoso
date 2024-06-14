package quanli;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.swing.ButtonModel;
import javax.swing.JOptionPane;

public class sqllogin {
	
	    private Baigiuxe baigiuxe;
		private Statement statement;

	    public sqllogin(Baigiuxe baigiuxe) {
	        this.baigiuxe = baigiuxe;
	    }
	    public void Insertnv()
	    {
	    	 Connection connection = connect.getConnection();
	 		try {
	 			 statement = connection.createStatement();
	 		 
	 		    

	 		  
	 		    statement.executeUpdate("INSERT INTO login VALUES (N'" + baigiuxe.textmanv.getText() + "', '" + baigiuxe.textsdt.getText() + "', '" + "nv" +  "', (SELECT BulkColumn FROM OPENROWSET(BULK N'" + baigiuxe.anh + "', SINGLE_BLOB) image))");
	 		    System.out.println("thêm thành công");
	 		} catch (Exception e2) {
	 		    e2.printStackTrace();
	 		}

	    }
	    public void xoanv()
	    {
	    	try {
	    		connect a=new connect();
	    		Connection connection=a.getConnection();
	    		PreparedStatement comm=connection.prepareStatement("Delete login where uit=?");
	    		comm.setString(1,baigiuxe.tablenv.getValueAt(baigiuxe.tablenv.getSelectedRow(), 0).toString());
	    		comm.executeUpdate();
	    	} catch (Exception e) {
	    		System.out.println(e.toString());
	    	}
	    }
	
}
