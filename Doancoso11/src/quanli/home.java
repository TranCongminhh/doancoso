package quanli;

import java.awt.EventQueue;
import java.awt.Image;
import java.sql.Connection;
import java.sql.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class home extends JFrame {

    private static final long serialVersionUID = 1L;
    connect cn=new connect();
    Connection conn;
    private JPanel contentPane;
    private String user,pass,quyen;
	byte[] anh;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;
	private JLabel anhl;

    public home(String user, String pass, String quyen ,byte[] anh) {
        this(); 
        this.user=user;
        this.pass=pass;
        this.quyen=quyen;
        this.anh=anh;
        conn=cn.getConnection();
        
        try {
            String sql="Select * from quyen where maquyen = ?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setString(1, quyen);
            ResultSet rs=pst.executeQuery();
            if(rs.next()) {
                lblNewLabel.setText("tên tk"+user);
                lblNewLabel_1.setText("mk"+pass);
                lblNewLabel_2.setText(rs.getString("tenquyen"));
                
                ImageIcon imageIcon = new ImageIcon(anh);
  			  Image scaledIcon1 = imageIcon.getImage().getScaledInstance(107, 101, Image.SCALE_SMOOTH);
  			  
  			anhl.setIcon(new ImageIcon(scaledIcon1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public home() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 590, 398);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        lblNewLabel = new JLabel("New label");
        lblNewLabel.setBounds(48, 34, 235, 36);
        contentPane.add(lblNewLabel);
        
        lblNewLabel_1 = new JLabel("New label");
        lblNewLabel_1.setBounds(48, 120, 235, 23);
        contentPane.add(lblNewLabel_1);
        
        lblNewLabel_2 = new JLabel("New label");
        lblNewLabel_2.setBounds(50, 193, 235, 23);
        contentPane.add(lblNewLabel_2);
        
         anhl = new JLabel("");
        anhl.setBounds(349, 45, 107, 101);
        contentPane.add(anhl);
    }


}
