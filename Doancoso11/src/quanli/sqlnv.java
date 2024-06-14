package quanli;

import java.awt.Component;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class sqlnv {
    private Baigiuxe baigiuxe;
	private Statement statement;

    public sqlnv(Baigiuxe baigiuxe) {
        this.baigiuxe = baigiuxe;
    }

    public void showNhanVien() {
        DefaultTableModel model = (DefaultTableModel) baigiuxe.tablenv.getModel();
        model.setRowCount(0);

        try (Connection connection = connect.getConnection();
             PreparedStatement ps = connection.prepareStatement("SELECT * FROM dbo.[tablenv]");
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Vector<Object> rowData = new Vector<>();
                rowData.add(rs.getString("Manv"));
                rowData.add(rs.getString("Tennv"));
                rowData.add(rs.getString("Ngaysinh"));
                rowData.add(rs.getString("Gioitinh"));
                rowData.add(rs.getString("Cccd"));
                rowData.add(rs.getString("Sdt"));
                byte[] imageBytes = rs.getBytes("Anh");
                if (imageBytes != null) {
                    ImageIcon imageIcon = new ImageIcon(imageBytes);
                    Image image = imageIcon.getImage();
                    Image scaledImage = image.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                    ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
                    rowData.add(scaledImageIcon);
                } else {
                    rowData.add(null);
                }
                model.addRow(rowData);
            }
        } catch (SQLException e) {
            Logger.getLogger(sqlnv.class.getName()).log(Level.SEVERE, null, e);
        }

        baigiuxe.tablenv.setRowHeight(100);
        baigiuxe.tablenv.getColumnModel().getColumn(6).setCellRenderer(new ImageRenderer());
    }

    public void Insertnv()
    {
    	 Connection connection = connect.getConnection();
 		try {
 			 statement = connection.createStatement();
 		    ButtonModel selectedButton = baigiuxe.buttonGroup.getSelection();
 		    String a = "";
 		    if (selectedButton != null) {
 		        if (selectedButton.equals(baigiuxe.rdbtnNewRadioButton.getModel())) {
 		            a = "Nam";
 		        } else if (selectedButton.equals(baigiuxe.rdbtnNewRadioButton_1.getModel())) {
 		            a = "Nữ";
 		        }
 		    } else {
 		        
 		    }

 		  
 		    statement.executeUpdate("INSERT INTO tablenv VALUES (N'" + baigiuxe.textmanv.getText() + "', '" + baigiuxe.texttennv.getText() + "', '" + baigiuxe.textngaysinh.getText() + "', '" + a + "', '" + baigiuxe.textcccd.getText() + "', '" + baigiuxe.textsdt.getText() + "', (SELECT BulkColumn FROM OPENROWSET(BULK N'" + baigiuxe.anh + "', SINGLE_BLOB) image))");
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
    		PreparedStatement comm=connection.prepareStatement("Delete tablenv where Manv=?");
    		comm.setString(1,baigiuxe.tablenv.getValueAt(baigiuxe.tablenv.getSelectedRow(), 0).toString());
    		comm.executeUpdate();
    		if(JOptionPane.showConfirmDialog(baigiuxe, "Bạn có muốn xóa nhân viên này không","Confirm",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION	)
    		{
    			comm.executeUpdate();
    		}
    	} catch (Exception e) {
    		System.out.println(e.toString());
    	}
    }

    private class ImageRenderer extends DefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            if (value instanceof ImageIcon) {
                JLabel label = new JLabel((ImageIcon) value);
                label.setOpaque(true);

                return label;
            }
            return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        }
    }
}
