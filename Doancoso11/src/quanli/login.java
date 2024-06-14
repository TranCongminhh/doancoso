package quanli;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Timer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Button;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.CardLayout;
public class login extends JFrame {
private int width=370;
private int height=406;
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JPasswordField passwordField;
    private JLabel lblNewLabel_2;
    private JPanel panel;
    private JLabel lblNewLabel_3;
    private JLabel lblNewLabel_4;
    private JLabel lblNewLabel_5;
    private JLabel lblNewLabel_6;
    private JLabel lblNewLabel_7;

  
    private void performLogin() {
        Connection connection = null;
        try {
            connect cn = new connect();
            connection = cn.getConnection();
            char[] passChars = passwordField.getPassword();
            String user = textField.getText().trim();
            String passw = new String(passChars).trim();

            StringBuffer sb = new StringBuffer();
            if (user.equals("")) {
                sb.append("Tài khoản không được để trống!\n");
            }
            if (passw.equals("")) {
                sb.append("Mật khẩu không được để trống!\n");
            }
            if (sb.length() > 0) {
                JOptionPane.showMessageDialog(this, sb.toString());
                return;
            }

            String sql = "Select * from login where uit = ? and pass = ?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, user);
            pst.setString(2, passw);
            
            ResultSet rs = pst.executeQuery();
          
            if (rs.next()) {
                String quyen = rs.getString("maquyen");
byte[] anh=rs.getBytes("anh");
                JOptionPane.showMessageDialog(this, "Đăng nhập thành công");
                new Baigiuxe( quyen,anh).setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Sai tài khoản hoặc mật khẩu");
            }
        } catch (Exception ex) {
            ex.printStackTrace(); 
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    login frame = new login();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public login() {
    	setBackground(new Color(255, 255, 255));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 786, 445);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        panel = new JPanel();
        panel.setBackground(new Color(0, 128, 255));
        panel.setBounds(370, 0, 400, 406);
        contentPane.add(panel);
        panel.setLayout(null);
        
        lblNewLabel_2 = new JLabel("Login");
        lblNewLabel_2.setForeground(new Color(255, 255, 255));
        lblNewLabel_2.setBounds(125, 11, 82, 19);
        panel.add(lblNewLabel_2);
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
        
                JLabel lblNewLabel = new JLabel("Username");
                lblNewLabel.setForeground(new Color(255, 255, 255));
                lblNewLabel.setBounds(31, 48, 90, 19);
                panel.add(lblNewLabel);
                lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
                
                        textField = new JTextField();
                        textField.setForeground(new Color(255, 255, 255));
                        textField.setBackground(new Color(0, 128, 255));
                        textField.setBounds(31, 67, 265, 30);
                        panel.add(textField);
                        textField.setColumns(10);
                        
                        lblNewLabel_3 = new JLabel("____________________________________");
                        lblNewLabel_3.setForeground(new Color(255, 255, 255));
                        lblNewLabel_3.setBounds(31, 78, 357, 30);
                        panel.add(lblNewLabel_3);
                        
                        lblNewLabel_4 = new JLabel("____________________________________");
                        lblNewLabel_4.setForeground(new Color(255, 255, 255));
                        lblNewLabel_4.setBounds(31, 153, 357, 30);
                        panel.add(lblNewLabel_4);
                        
                                JLabel lblNewLabel_1 = new JLabel("Password");
                                lblNewLabel_1.setForeground(new Color(255, 255, 255));
                                lblNewLabel_1.setBounds(31, 125, 90, 17);
                                panel.add(lblNewLabel_1);
                                lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
                                
                                passwordField = new JPasswordField();
                                passwordField.setForeground(new Color(255, 255, 255));
                                passwordField.setBackground(new Color(0, 128, 255));
                                passwordField.setBounds(31, 142, 265, 30);
                                panel.add(passwordField);
                                
                                lblNewLabel_5 = new JLabel("");
                                lblNewLabel_5.setIcon(new ImageIcon("E:\\icons8-username-30.png"));
                                lblNewLabel_5.setBounds(299, 67, 30, 30);
                                panel.add(lblNewLabel_5);
                                
                                lblNewLabel_6 = new JLabel("");
                                lblNewLabel_6.addMouseListener(new MouseAdapter() {
                                	@Override
                                	public void mouseClicked(MouseEvent e) {
                                		passwordField.setEchoChar((char)8226);
                                		lblNewLabel_6.setVisible(false);
                                		lblNewLabel_7.setVisible(true);
                                		
                                	}
                                });
                                
                                ImageIcon iconnv= new ImageIcon("E:\\\\icons8-eyes-64.png");
                                Image scaledIconnv = iconnv.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                                lblNewLabel_6.setIcon(new ImageIcon(scaledIconnv));
                              
                                
                                lblNewLabel_6.setBounds(299, 142, 30, 30);
                                panel.add(lblNewLabel_6);
                                
                                lblNewLabel_7 = new JLabel("New label");
                                lblNewLabel_7.addMouseListener(new MouseAdapter() {
                                	@Override
                                	public void mouseClicked(MouseEvent e) {
                                		passwordField.setEchoChar((char)0);
                                		lblNewLabel_6.setVisible(true);
                                		lblNewLabel_7.setVisible(false);
                                	}
                                });
                                ImageIcon iconnv1= new ImageIcon("E:\\\\icons8-eyes-32.png");
                                Image scaledIconnv1 = iconnv1.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                                lblNewLabel_7.setIcon(new ImageIcon(scaledIconnv1));
                             
                                lblNewLabel_7.setBounds(299, 142, 30, 30);
                                panel.add(lblNewLabel_7);
                                lblNewLabel_6.setVisible(false);
                                textField.setBorder(null);
                                passwordField.setBorder(null);
                                
                                        JButton btnNewButton = new JButton("Login");
                                        btnNewButton.setForeground(new Color(0, 128, 255));
                                        btnNewButton.setBackground(new Color(255, 255, 255));
                                        btnNewButton.setBounds(31, 249, 315, 31);
                                        panel.add(btnNewButton);
                                        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
                                        
                                        panel_1 = new JPanel();
                                        panel_1.setBackground(new Color(0, 255, 0));
                                        panel_1.setBounds(0, 0, 370, 406);
                                        contentPane.add(panel_1);
                                        panel_1.setLayout(null);
                                        
                                        lblNewLabel_8 = new JLabel("");
                                        lblNewLabel_8.setBounds(0, 0, 370, 406);
                                        ImageIcon iconnv2= new ImageIcon("E:\\\\password.jpg");
                                        Image scaledIconnv2 = iconnv2.getImage().getScaledInstance(373, 406, Image.SCALE_SMOOTH);
                                        lblNewLabel_8.setIcon(new ImageIcon(scaledIconnv2));
                                        panel_1.add(lblNewLabel_8);
                                        
                                        panel_2 = new JPanel();
                                        panel_2.setBackground(new Color(255, 0, 0));
                                        panel_2.setBounds(186, 0, 0, 406);
                                        contentPane.add(panel_2);
                                        panel_2.setLayout(null);
                                        
                                        lblNewLabel_9 = new JLabel("");
                                        ImageIcon iconnv3= new ImageIcon("E:\\\\carpark.jpg");
                                        Image scaledIconnv3 = iconnv3.getImage().getScaledInstance(370, 406, Image.SCALE_SMOOTH);
                                        lblNewLabel_9.setIcon(new ImageIcon(scaledIconnv3));
                                        lblNewLabel_9.setBounds(0, 0, 370, 406);
                                        panel_2.add(lblNewLabel_9);
//                                        Border roundedBorder = BorderFactory.createLineBorder(Color.blue, 1, true);
//                                        btnNewButton.setBorder(roundedBorder);
                                        btnNewButton.addActionListener(new ActionListener() {
                                            public void actionPerformed(ActionEvent e) {
                                                performLogin(); 
                                            }
                                        });
                                        slide();
    }
    Timer timer = new Timer();
    private JPanel panel_1;
    private JPanel panel_2;
    boolean home=true;
    private JLabel lblNewLabel_8;
    private JLabel lblNewLabel_9;
    public void slide() {
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
            
                try {
                	if(home) {
                	int x=0;
                	Thread.sleep(5000);
                	for(int i=width;i>=0;i=i-2)
                	{
                		panel_1.setSize(i,height);
                		panel_1.setLocation(x, 0);
                		x++;
                	
                    Thread.sleep(5); 
                	}
                	for(int i=0;i<width;i=i+2)
                	{
                		panel_2.setSize(i,height);
                		panel_2.setLocation(x, 0);
                		x--;
                		
                    Thread.sleep(5); 
                	}
                	home=false;
                	}
                	else
                	{
                		int x=0;
                    	Thread.sleep(5000);
                    	for(int i=width;i>=0;i=i-2)
                    	{
                    		panel_2.setSize(i,height);
                    		panel_2.setLocation(x, 0);
                    		x++;
                    		
                        Thread.sleep(5); 
                    	}
                    	for(int i=0;i<width;i=i+2)
                    	{
                    		panel_1.setSize(i,height);
                    		panel_1.setLocation(x, 0);
                    		x--;
                    	
                        Thread.sleep(5); 
                    	}
                    	home=true;
                	}
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, 0, 5000);
    }
}