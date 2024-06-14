package quanli;

import java.awt.EventQueue;

import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseEvent;

public class Hoadon extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private Baigiuxe baigiuxe;
	private JLabel Tongtien;
	private JLabel labelthoigianhet;
	private JLabel labelthoigiandk;
	private JLabel labelloaixe;
	private JLabel labelve;
	private JLabel labelbien;
	private JLabel labelten;

	public Hoadon()
	{
		 	init();

			Toancuc tc=new Toancuc();
			labelten.setText(tc.getHovaten()+"");
			labelbien.setText(tc.getBiensoxe()+"");
			labelve.setText(tc.getMave()+"");
			labelloaixe.setText(tc.getLoaixe()+"");

			    labelthoigiandk.setText(tc.getThoigiandk()+"");
			  
			    labelthoigianhet.setText(tc.getThoigianhethan()+"");
			   
			    	Tongtien.setText(tc.getTongtien()+"VNĐ");
			    	
			    	JLabel lblNewLabel_2 = new JLabel("");
			    	ImageIcon iconvt= new ImageIcon("E:\\printer.png");
			         Image scaledIconvt = iconvt.getImage().getScaledInstance(33, 30, Image.SCALE_SMOOTH);
			         lblNewLabel_2 .setIcon(new ImageIcon(scaledIconvt));
			    	lblNewLabel_2.addMouseListener(new MouseAdapter() {
			    		@Override
			    		public void mouseClicked(MouseEvent e) {
			    			 new Inhoadon();
			    			 JOptionPane.showMessageDialog(null, "In hóa đơn thành công");
			    		}
			    	});
			    	lblNewLabel_2.setBounds(398, 11, 33, 30);
			    	contentPane.add(lblNewLabel_2);
	}
	public void init() {
		
		  
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 457, 429);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HÓA ĐƠN ĐĂNG KÝ VÉ THÁNG");
		lblNewLabel.setForeground(new Color(255, 128, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(96, 11, 228, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Họ và tên khách");
		lblNewLabel_1.setForeground(new Color(255, 128, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 54, 113, 14);
		contentPane.add(lblNewLabel_1);
		
		 labelten = new JLabel("");
		 labelten.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelten.setBounds(183, 55, 181, 14);
		contentPane.add(labelten);
		
		JLabel lblNewLabel_3 = new JLabel("Biển số xe");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setForeground(new Color(255, 128, 0));
		lblNewLabel_3.setBounds(10, 94, 99, 14);
		contentPane.add(lblNewLabel_3);
		
		 labelbien = new JLabel("");
		 labelbien.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelbien.setBounds(183, 95, 181, 14);
		contentPane.add(labelbien);
		
		JLabel lblNewLabel_5 = new JLabel("Mã vé");
		lblNewLabel_5.setForeground(new Color(255, 128, 0));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(10, 134, 113, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Thời gian đăng ký vé");
		lblNewLabel_6.setForeground(new Color(255, 128, 0));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(10, 214, 128, 14);
		contentPane.add(lblNewLabel_6);
		
		 labelve = new JLabel("");
		 labelve.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelve.setBounds(183, 135, 181, 14);
		contentPane.add(labelve);
		
		JLabel lblNewLabel_8 = new JLabel("Loại xe");
		lblNewLabel_8.setForeground(new Color(255, 128, 0));
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_8.setBounds(10, 174, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		 labelloaixe = new JLabel("");
		 labelloaixe.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelloaixe.setBounds(183, 175, 128, 14);
		contentPane.add(labelloaixe);
		
		JLabel Thoigianhethan = new JLabel("Thời gian hết hạn");
		Thoigianhethan.setForeground(new Color(255, 128, 0));
		Thoigianhethan.setFont(new Font("Tahoma", Font.BOLD, 12));
		Thoigianhethan.setBounds(10, 254, 128, 14);
		contentPane.add(Thoigianhethan);
		
		 labelthoigiandk = new JLabel("");
		 labelthoigiandk.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelthoigiandk.setBounds(183, 215, 181, 14);
		contentPane.add(labelthoigiandk);
		
		 labelthoigianhet = new JLabel("");
		 labelthoigianhet.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelthoigianhet.setBounds(183, 255, 141, 14);
		contentPane.add(labelthoigianhet);
		
		JLabel labeltongtien = new JLabel("Tổng tiên");
		labeltongtien.setFont(new Font("Tahoma", Font.BOLD, 12));
		labeltongtien.setForeground(new Color(255, 128, 0));
		labeltongtien.setBounds(10, 338, 80, 14);
		contentPane.add(labeltongtien);
		
		 Tongtien = new JLabel("");
		 Tongtien.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Tongtien.setBounds(183, 339, 99, 14);
		contentPane.add(Tongtien);
	}
}
