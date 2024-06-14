package quanli;

import java.awt.Color;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.JTable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;



import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.Panel;
import java.awt.Label;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;
import java.awt.Rectangle;
import javax.swing.border.MatteBorder;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JSpinner;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Baigiuxe extends JFrame {
	  private ArrayList<JPanel> roomPanels;
    private int height = 500;
    private int width = 155;
    private JPanel panelmenu;
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private  JPanel panelnv,panelkhachhang,panelvitri,paneldoxe,panelvexe,panelthongke;
private JLabel lbnhanvien,lbtrangchu,lbvitri,lbdoxe,lbvexe,lbthongke;
 JScrollPane scrollPane;
 JTextField textbsx;
 JLabel lblNewLabel_4;
 JTextField textmvdx;
 JLabel lblNewLabel_5;
 JTextField textlx;
 JLabel lablegio;
 JLabel lblNewLabel_7;
 JTextField textField_3;
 JLabel lblNewLabel_8;
 JComboBox comboBox_1;
 JTable table_1;
JRadioButton rdbtnNewRadioButton;
JRadioButton rdbtnNewRadioButton_1;
 JTextField textmanv;
 JTextField texttennv;
 JTextField textngaysinh;
 JTextField textcccd;
 JTextField textsdt;
   JLabel labelanh;
 JTable tablenv;
 JLabel lblNewLabel_20;
 JButton btnNewButton_4;
 JScrollPane scrollPane_4;
 JTable tablevitri;
 JLabel lblNewLabel;
 JLabel lblNewLabel_24;
 JTextField textField_9;
 JLabel lblNewLabel_25;
 JTable tableve;
 JLabel lblNewLabel_33;
 JTextField textField_11;
 JTextField textField_12;
 JTable tableuser;
 JLabel lblNewLabel_40;
 JTextField Textfieldten;
 JLabel lblNewLabel_41;
 JTextField Textfieldbsxuser;
 JLabel lblNewLabel_42;
 JTextField Textfieldmaveuser;
private final JLabel lblNewLabel_43 = new JLabel("Tổng số xe đã đăng ký vé tháng\r\n");
 JLabel lblNewLabel_44;
 JLabel lblNewLabel_45;
 JLabel labelxemayuser;
 JLabel labelotouser;
 JLabel labelxemay2;
 JLabel lblNewLabel_48;
 JTextField textField_16;
 JButton btnNewButton_8;
 JButton btnNewButton_9;
 JButton btnNewButton_10;
 JLabel lblNewLabel_49;
 JLabel lblNewLabel_50;
 JLabel lblNewLabel_51;
 JLabel lblNewLabel_52;
 JLabel lblNewLabel_53;
 JLabel lblNewLabel_54;
 JLabel lblNewLabel_55;
 JLabel lblNewLabel_56;
 JLabel lblNewLabel_57;
 JLabel lblNewLabel_58;
 JLabel lblNewLabel_59;
 JTextField textField_17;
 JTextField textField_13;
 String anh;
 sqlvitri vitri=new sqlvitri(this);
 sqlnv sqlnvHandler = new sqlnv(this);
 Sqluser sqluser=new Sqluser(this);
 sqlve ve=new sqlve(this);
 sqllogin login=new sqllogin(this);
 sqldo doxe=new sqldo(this);
 sqlthongke thongke=new sqlthongke(this);
public static Statement statement=null;
ButtonGroup buttonGroup;
private JLabel labeloto2;
 JComboBox comboBox_3;
 connect cn=new connect();
 Connection conn;
 private JLabel lblNewLabel_46;
 private JLabel lblNewLabel_47;
 int giaveoto=30000,giavexemay=10000;
 Baigiuxe baigiuxe=this;
private JLabel lblNewLabel_63;
private JLabel lblNewLabel_64;
private JLabel lblNewLabel_65;
private JLabel lblNewLabel_66;
private JLabel lbmanv;
private JLabel lbtennv,lbnsnv;
private JLabel lbsdt;
private JLabel lbcccd;
ArrayList<Modeuser> arr=new ArrayList<Modeuser>();
ArrayList<Modedo> arr1=new ArrayList<Modedo>();
ArrayList<Modetk> arr2=new ArrayList<Modetk>();
String[] vitridx=new String[100];
private JPanel panel_1;
 JComboBox comboBox_2;
 int q=50,z=50;
 private JScrollPane scrollPane_7;

private JPanel panel_3;
private JRadioButton rdbtnNewRadioButton_2;
private JRadioButton rdbtnNewRadioButton_3;
private JRadioButton rdbtnNewRadioButton_4;
private JRadioButton rdbtnNewRadioButton_5;
private JRadioButton rdbtnNewRadioButton_6;
private JButton btnNewButton_5;
private ButtonGroup buttonGroup1;
private JPanel panel_2;
private JPanel paneltong;
private JPanel panelday;
private JPanel paneloto;
private JPanel panelxemay;
private JPanel paneltrong;
private JPanel mainPanel;
private ButtonGroup buttonGroup2;
private ButtonGroup buttonGroup3;
private JPanel panelxemayt;
private JPanel panelototrong;
private JPanel panelxemayday;
private JPanel panelotoday;
 JComboBox comboBox;
private JLabel lb1;
private JLabel lb2;
private String quyen1;
	byte[] anh1;
private JLabel lblNewLabel_22;
  JTable tabledoxe;
  private JLabel lblNewLabel_29;
  private JLabel lblNewLabel_30;
  private JLabel lblNewLabel_31;
  private JLabel lblNewLabel_32;
  private JLabel lblNewLabel_34;
  private JLabel lblNewLabel_67;
  private JLabel lblNewLabel_68;
  private JLabel lblNewLabel_69;
  private JLabel lblNewLabel_70;
  private JLabel lblNewLabel_71;
  private JLabel lblNewLabel_72;
  private JLabel lblNewLabel_73;
  private JLabel lblNewLabel_74;
  private JLabel lblNewLabel_75;
  private JLabel lblNewLabel_76;
  private JLabel lblNewLabel_77;
  private JLabel lblNewLabel_78;
  private JLabel lblNewLabel_79;
  private JLabel lblNewLabel_80;
  private JLabel lblNewLabel_81;
  private JLabel lblNewLabel_82;
  private JLabel lblNewLabel_83;
  private JLabel lblNewLabel_84;
private JLabel lblNewLabel_21;
int thangoto=0,thangxemay=0;
tongtien tien=new tongtien(this);
private JLabel lblNewLabel_26;
private JLabel lblNewLabel_27;
private JLabel lblNewLabel_28;
private JPanel panel_4;
private JLabel avartar;
private JLabel quyen;
private JLabel lblNewLabel_37;
private JLabel lblNewLabel_39;
private JButton btnNewButton_3;
private JButton btnNewButton_6;
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Baigiuxe frame = new Baigiuxe();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    private void updateDateTimeContinuously() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");
        Timer timer = new Timer(1000, e -> {
            String formattedDateTime = dateFormat.format(new Date());
lablegio.setText(formattedDateTime);
        });

        timer.start();
    }

    public void openMenu() {
        new Thread(new Runnable() {
        	
            @Override
            public void run() {
                for (int i = 0; i < width; i++) {
                    panelmenu.setSize(i, height);
                    try {
                        Thread.sleep(2);
                        rdbtnNewRadioButton_2.setEnabled(false);
                        rdbtnNewRadioButton_3.setEnabled(false);
                        rdbtnNewRadioButton_4.setEnabled(false);
                        rdbtnNewRadioButton_5.setEnabled(false);
                        rdbtnNewRadioButton_6.setEnabled(false);
                        btnNewButton_5.setEnabled(false);
                        textField_9.setVisible(false);
                        comboBox_2.setVisible(false);
                      
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    public void closeMenu() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = width; i >= 0; i--) {
                    panelmenu.setSize(i, height);
                    try {
                        Thread.sleep(2);
                        rdbtnNewRadioButton_2.setEnabled(true);
                        rdbtnNewRadioButton_3.setEnabled(true);
                        rdbtnNewRadioButton_4.setEnabled(true);
                        rdbtnNewRadioButton_5.setEnabled(true);
                        rdbtnNewRadioButton_6.setEnabled(true);
                        btnNewButton_5.setEnabled(true);
                        textField_9.setVisible(true);
                        comboBox_2.setVisible(true);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
   public void xeuser()
   {
	   int otouser = 0;
	    int xemayuser = 0;

	   for(int i=0;i<tableuser.getRowCount();i++)
	   {
		   Object data= tableuser.getValueAt(i, 3);
		   if(data.equals("Ô tô"))
		   {
			   otouser++;
		   }
		   else
		   {
			   xemayuser++;
		   }
	   }
	   labelxemayuser.setText(xemayuser+"");
	   labelotouser.setText(otouser+"");
   }
 public void loadtableuser()
 {
	 DefaultTableModel model = (DefaultTableModel) tableuser.getModel();
	 model.setRowCount(0);
	 for(Modeuser bokk:arr)
	 {
		 model.addRow(new Object[]{bokk.getHovaten1(), bokk.getBiensoxe(), bokk.getMave(), bokk.getLoaixe(), 
				 bokk.getThoigiandk(), bokk.getThoigianhh()});
	 }
 }
 public void loadtabledo()
 {
	 DefaultTableModel model = (DefaultTableModel) tabledoxe.getModel();
	 model.setRowCount(0);
	 for(Modedo bokk:arr1)
	 {
		 model.addRow(new Object[]{bokk.getMave(), bokk.getBiensoxe(), bokk.getLoaixe(), bokk.getTenxe(), 
				 bokk.getVitri(),  bokk.getLoaive(), bokk.getThoigianvaoben()});
	 }
 }
 public void loadtabletk()
 {
	 DefaultTableModel model = (DefaultTableModel) table_1.getModel();
	 model.setRowCount(0);
	 for(Modetk bokk:arr2)
	 {
		 model.addRow(new Object[]{bokk.getMave(), bokk.getBiensoxe(), bokk.getLoaixe(), bokk.getTenxe(), 
				 bokk.getVitri(),  bokk.getLoaive(), bokk.getThoigianvaoben(), bokk.getThoigianxuatben()});
	 }
 }
 public void Vitri()
 {
	
	 roomPanels = new ArrayList<>();
	 int x=tablevitri.getRowCount();
	 for(int i=0;i<x;i++)
	 {
		 Object data=tablevitri.getValueAt(i, 1);
		 Object data1=tablevitri.getValueAt(i, 0);
		 Object data2=tablevitri.getValueAt(i, 2);
		JPanel roomPanel = new JPanel();
		roomPanel.setLayout(new BorderLayout(0,0));
         JLabel lable=new JLabel(data1+"");
         roomPanel.add(lable,BorderLayout.CENTER);
         lable.setFont(new Font("Tahoma", Font.BOLD, 13));
         lable.setHorizontalAlignment(JLabel.CENTER);
         
         if(data2.equals(""))
         {
          lblNewLabel_22 = new JLabel("Đang trống");
         roomPanel.add(lblNewLabel_22, BorderLayout.NORTH);
         JLabel lblNewLabel_23 = new JLabel(data+"");
         roomPanel.add(lblNewLabel_23, BorderLayout.SOUTH);
         roomPanel.setBackground(new Color(128, 255, 255));
         }
         else
         {
        	  JLabel lblNewLabel_22 = new JLabel("Đã đậu");
              roomPanel.add(lblNewLabel_22, BorderLayout.NORTH);
             roomPanel.setBackground(Color.red);
             JLabel lblNewLabel_23 = new JLabel(data+":"+data2);
             roomPanel.add(lblNewLabel_23, BorderLayout.SOUTH);
         }
         
         roomPanels.add(roomPanel);
         mainPanel.add(roomPanel);
		 
	 }
	 }
public void vitriday()
{
	 roomPanels = new ArrayList<>();
	 int x=tablevitri.getRowCount();
	 for(int i=0;i<x;i++)
	 {
		 Object data=tablevitri.getValueAt(i, 1);
		 Object data1=tablevitri.getValueAt(i, 0);
		 Object data2=tablevitri.getValueAt(i, 2);
		 String a=data2+"";
		 if(a.length()>0)
		 {
		JPanel roomPanel = new JPanel();
		roomPanel.setLayout(new BorderLayout(0,0));
         JLabel lable=new JLabel(data1+"");
         roomPanel.add(lable,BorderLayout.CENTER);
         lable.setFont(new Font("Tahoma", Font.BOLD, 13));
         lable.setHorizontalAlignment(JLabel.CENTER);
        	  JLabel lblNewLabel_22 = new JLabel("Đã đậu");
              roomPanel.add(lblNewLabel_22, BorderLayout.NORTH);
             roomPanel.setBackground(Color.red);
             JLabel lblNewLabel_23 = new JLabel(data+":"+data2);
             roomPanel.add(lblNewLabel_23, BorderLayout.SOUTH);
                 roomPanels.add(roomPanel);
         panelday.add(roomPanel);
		 }
	 }
}
public void vitritrong()
{
	 roomPanels = new ArrayList<>();
	 int x=tablevitri.getRowCount();
	 for(int i=0;i<x;i++)
	 {
		 Object data=tablevitri.getValueAt(i, 1);
		 Object data1=tablevitri.getValueAt(i, 0);
		 Object data2=tablevitri.getValueAt(i, 2);
		 String a=data2+"";
		 if(a.length()>0)
		 {
			 
		 }
		 else {
		JPanel roomPanel = new JPanel();
		roomPanel.setLayout(new BorderLayout(0,0));
         JLabel lable=new JLabel(data1+"");
         roomPanel.add(lable,BorderLayout.CENTER);
         lable.setFont(new Font("Tahoma", Font.BOLD, 13));
         lable.setHorizontalAlignment(JLabel.CENTER);
         JLabel lblNewLabel_22 = new JLabel("Đang trống");
         roomPanel.add(lblNewLabel_22, BorderLayout.NORTH);
         JLabel lblNewLabel_23 = new JLabel(data+"");
         roomPanel.add(lblNewLabel_23, BorderLayout.SOUTH);
         roomPanel.setBackground(new Color(128, 255, 255));    
         roomPanels.add(roomPanel);
         paneltrong.add(roomPanel);
		 }
	 }
}
public void vitrioto()
{

	 roomPanels = new ArrayList<>();
	 int x=tablevitri.getRowCount();
	 for(int i=0;i<x;i++)
	 {
		 Object data=tablevitri.getValueAt(i, 1);
		 Object data1=tablevitri.getValueAt(i, 0);
		 Object data2=tablevitri.getValueAt(i, 2);
		 if(data.equals("Ô tô")) {
		JPanel roomPanel = new JPanel();
		roomPanel.setLayout(new BorderLayout(0,0));
        JLabel lable=new JLabel(data1+"");
        roomPanel.add(lable,BorderLayout.CENTER);
        lable.setFont(new Font("Tahoma", Font.BOLD, 13));
        lable.setHorizontalAlignment(JLabel.CENTER);
        
        if(data2.equals(""))
        {
        JLabel lblNewLabel_22 = new JLabel("Đang trống");
        roomPanel.add(lblNewLabel_22, BorderLayout.NORTH);
        JLabel lblNewLabel_23 = new JLabel(data+"");
        roomPanel.add(lblNewLabel_23, BorderLayout.SOUTH);
        roomPanel.setBackground(new Color(128, 255, 255));
        }
        else
        {
       	  JLabel lblNewLabel_22 = new JLabel("Đã đậu");
             roomPanel.add(lblNewLabel_22, BorderLayout.NORTH);
            roomPanel.setBackground(Color.red);
            JLabel lblNewLabel_23 = new JLabel(data+":"+data2);
            roomPanel.add(lblNewLabel_23, BorderLayout.SOUTH);
        }
        
        roomPanels.add(roomPanel);
        paneloto.add(roomPanel);
		 }
	 }
}
public void vitrixemay()
{

	 roomPanels = new ArrayList<>();
	 int x=tablevitri.getRowCount();
	 for(int i=0;i<x;i++)
	 {
		 Object data=tablevitri.getValueAt(i, 1);
		 Object data1=tablevitri.getValueAt(i, 0);
		 Object data2=tablevitri.getValueAt(i, 2);
		 if(data.equals("Xe máy")) {
		JPanel roomPanel = new JPanel();
		roomPanel.setLayout(new BorderLayout(0,0));
        JLabel lable=new JLabel(data1+"");
        roomPanel.add(lable,BorderLayout.CENTER);
        lable.setFont(new Font("Tahoma", Font.BOLD, 13));
        lable.setHorizontalAlignment(JLabel.CENTER);
        
        if(data2.equals(""))
        {
        JLabel lblNewLabel_22 = new JLabel("Đang trống");
        roomPanel.add(lblNewLabel_22, BorderLayout.NORTH);
        JLabel lblNewLabel_23 = new JLabel(data+"");
        roomPanel.add(lblNewLabel_23, BorderLayout.SOUTH);
        roomPanel.setBackground(new Color(128, 255, 255));
        }
        else
        {
       	  JLabel lblNewLabel_22 = new JLabel("Đã đậu");
             roomPanel.add(lblNewLabel_22, BorderLayout.NORTH);
            roomPanel.setBackground(Color.red);
            JLabel lblNewLabel_23 = new JLabel(data+":"+data2);
            roomPanel.add(lblNewLabel_23, BorderLayout.SOUTH);
        }
        
        roomPanels.add(roomPanel);
        panelxemay.add(roomPanel);
		 }
	 }
}
public void xemaytrong()
{
	 roomPanels = new ArrayList<>();
	 int x=tablevitri.getRowCount();
	 for(int i=0;i<x;i++)
	 {
		 Object data=tablevitri.getValueAt(i, 1);
		 Object data1=tablevitri.getValueAt(i, 0);
		 Object data2=tablevitri.getValueAt(i, 2);
		 if(data.equals("Xe máy")) {
	
        if(data2.equals(""))
        {
        	JPanel roomPanel = new JPanel();
    		roomPanel.setLayout(new BorderLayout(0,0));
            JLabel lable=new JLabel(data1+"");
            roomPanel.add(lable,BorderLayout.CENTER);
            lable.setFont(new Font("Tahoma", Font.BOLD, 13));
            lable.setHorizontalAlignment(JLabel.CENTER);
        JLabel lblNewLabel_22 = new JLabel("Đang trống");
        roomPanel.add(lblNewLabel_22, BorderLayout.NORTH);
        JLabel lblNewLabel_23 = new JLabel(data+"");
        roomPanel.add(lblNewLabel_23, BorderLayout.SOUTH);
        roomPanel.setBackground(new Color(128, 255, 255));
        roomPanels.add(roomPanel);
        panelxemayt.add(roomPanel);
        }
       
		 }
	 }
}
public void ototrong()
{
	 roomPanels = new ArrayList<>();
	 int x=tablevitri.getRowCount();
	 for(int i=0;i<x;i++)
	 {
		 Object data=tablevitri.getValueAt(i, 1);
		 Object data1=tablevitri.getValueAt(i, 0);
		 Object data2=tablevitri.getValueAt(i, 2);
		 if(data.equals("Ô tô")) {
	
        if(data2.equals(""))
        {
        	JPanel roomPanel = new JPanel();
    		roomPanel.setLayout(new BorderLayout(0,0));
            JLabel lable=new JLabel(data1+"");
            roomPanel.add(lable,BorderLayout.CENTER);
            lable.setFont(new Font("Tahoma", Font.BOLD, 13));
            lable.setHorizontalAlignment(JLabel.CENTER);
        JLabel lblNewLabel_22 = new JLabel("Đang trống");
        roomPanel.add(lblNewLabel_22, BorderLayout.NORTH);
        JLabel lblNewLabel_23 = new JLabel(data+"");
        roomPanel.add(lblNewLabel_23, BorderLayout.SOUTH);
        roomPanel.setBackground(new Color(128, 255, 255));
        roomPanels.add(roomPanel);
        panelototrong.add(roomPanel);
        }
       
		 }
	 }
}
public void otoday()
{
	 roomPanels = new ArrayList<>();
	 int x=tablevitri.getRowCount();
	 for(int i=0;i<x;i++)
	 {
		 Object data=tablevitri.getValueAt(i, 1);
		 Object data1=tablevitri.getValueAt(i, 0);
		 Object data2=tablevitri.getValueAt(i, 2);
		 if(data.equals("Ô tô")) {
	
        
        if(data2.equals(""))
        {
 
        }
        else
        {
        	JPanel roomPanel = new JPanel();
    		roomPanel.setLayout(new BorderLayout(0,0));
            JLabel lable=new JLabel(data1+"");
            roomPanel.add(lable,BorderLayout.CENTER);
            lable.setFont(new Font("Tahoma", Font.BOLD, 13));
            lable.setHorizontalAlignment(JLabel.CENTER);
       	  JLabel lblNewLabel_22 = new JLabel("Đã đậu");
             roomPanel.add(lblNewLabel_22, BorderLayout.NORTH);
            roomPanel.setBackground(Color.red);
            JLabel lblNewLabel_23 = new JLabel(data+":"+data2);
            roomPanel.add(lblNewLabel_23, BorderLayout.SOUTH);
            roomPanels.add(roomPanel);
            panelotoday.add(roomPanel);
        }
       
		 }
	 }
}
public void xemayday()
{
	 roomPanels = new ArrayList<>();
	 int x=tablevitri.getRowCount();
	 for(int i=0;i<x;i++)
	 {
		 Object data=tablevitri.getValueAt(i, 1);
		 Object data1=tablevitri.getValueAt(i, 0);
		 Object data2=tablevitri.getValueAt(i, 2);
		 if(data.equals("Xe máy")) {
	
        
        if(data2.equals(""))
        {
 
        }
        else
        {
        	JPanel roomPanel = new JPanel();
    		roomPanel.setLayout(new BorderLayout(0,0));
            JLabel lable=new JLabel(data1+"");
            roomPanel.add(lable,BorderLayout.CENTER);
            lable.setFont(new Font("Tahoma", Font.BOLD, 13));
            lable.setHorizontalAlignment(JLabel.CENTER);
       	  JLabel lblNewLabel_22 = new JLabel("Đã đậu");
             roomPanel.add(lblNewLabel_22, BorderLayout.NORTH);
            roomPanel.setBackground(Color.red);
            JLabel lblNewLabel_23 = new JLabel(data+":"+data2);
            roomPanel.add(lblNewLabel_23, BorderLayout.SOUTH);
            roomPanels.add(roomPanel);
           panelxemayday.add(roomPanel);
        }
       
		 }
	 }
}

public void thongke()
{
	int a1=0,a2=0;
	int a=0;
	int b=0,b1=0,b2=0;
	int c=0,c1=0,c2=0;
	int d=0,d1=0,d2=0;
	int e=0,e1=0,e2=0;
	for(int i=0;i<table_1.getRowCount();i++)
	{
		a++;
		Object data=table_1.getValueAt(i, 2);
		Object data1=table_1.getValueAt(i, 5);
		if(data.equals("Ô tô"))
		{
			a1++;
		}
		else
		{
			a2++;
		}
		if(data1.equals("Vé lượt"))
		{
			b++;
			if(data.equals("Ô tô"))
			{
				b1++;
				d1++;
				e1++;
			}
			else
			{
				b2++;
				d2++;
				e2++;
			}
		}
		else
		{
			c++;
			if(data.equals("Ô tô"))
			{
				c1++;
			}
			else
			{
				c2++;
			}
		}
	}
	e1=e1*giaveoto;
	e2=e2*giavexemay;
	e=e1+e2;
	d1=d1*giaveoto+thangoto;
	d2=d2*giavexemay+thangxemay;
	d=d1+d2;
	lblNewLabel_56.setText(a+"");
	lblNewLabel_57.setText(b+"");
	lblNewLabel_58.setText(c+"");
	lblNewLabel_21.setText(d+"VND");
	lblNewLabel_26.setText(e+"VND");
	int k=thangoto+thangxemay;
	lblNewLabel_27.setText(k+"VND");
	
	lblNewLabel_73.setText(a1+"");
	lblNewLabel_74.setText(b1+"");
	lblNewLabel_75.setText(c1+"");
	lblNewLabel_76.setText(d1+"VND");
	lblNewLabel_77.setText(e1+"VND");
	lblNewLabel_78.setText(thangoto+"VND");

	lblNewLabel_79.setText(a2+"");
	lblNewLabel_80.setText(b2+"");
	lblNewLabel_81.setText(c2+"");
	lblNewLabel_82.setText(d2+"VND");
	lblNewLabel_83.setText(e2+"VND");
	lblNewLabel_84.setText(thangxemay+"VND");
}
public void xuatfile() {
    try {
        XSSFWorkbook Work = new XSSFWorkbook();
        XSSFSheet sheet = Work.createSheet("Lịch sử");
        XSSFRow row = null;
        XSSFCell cell = null;
        row = sheet.createRow(0); 

        String[] headers = {"STT", "Mã vé", "Biển số xe", "Loại xe", "Tên xe", "Vị trí", "Chiếc vé", "Thời gian vào bến", "Thời gian xuất bến"};
        for (int i = 0; i < headers.length; i++) {
            cell = row.createCell(i, CellType.STRING);
            cell.setCellValue(headers[i]);
        }

        for (int i = 0; i < table_1.getRowCount(); i++) {
            row = sheet.createRow(i + 1);

            for (int j = 0; j < table_1.getColumnCount(); j++) {
                Object data = table_1.getValueAt(i, j);
                cell = row.createCell(0, CellType.STRING);
                cell.setCellValue((i+1)+"");
                cell = row.createCell(j+1, CellType.STRING);
                cell.setCellValue(data != null ? data.toString() : "");
            }
        }
        for (int i = 0; i < headers.length; i++) {
            sheet.autoSizeColumn(i);
        }
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
        File f = new File(timeStamp+"Thongke.xlsx");
        FileOutputStream fis = new FileOutputStream(f);
        Work.write(fis);
        fis.close();
        System.out.println("Xuất thành công");
    } catch (Exception e) {
      
    e.printStackTrace();
    }
}
public Baigiuxe(String quyen1,byte[] anh)
{
	this(); 
    this.quyen1=quyen1;
    this.anh1=anh1;
    conn=cn.getConnection();
    
    try {
        String sql="Select * from quyen where maquyen = ?";
        PreparedStatement pst=conn.prepareStatement(sql);
        pst.setString(1, quyen1);
        ResultSet rs=pst.executeQuery();
        if(rs.next()) {
           
            quyen.setText("Chức vụ: "+rs.getString("tenquyen"));
            
            ImageIcon imageIcon = new ImageIcon(anh);
			  Image scaledI = imageIcon.getImage().getScaledInstance(111, 79, Image.SCALE_SMOOTH);
			  avartar.setIcon(new ImageIcon(scaledI));
			  if(quyen1.equals("nv"))
			  {
				  btnNewButton_3.setEnabled(false);
				  btnNewButton_4.setEnabled(false);
				  textField_9.setEditable(false);
				  comboBox_2.setEditable(false);
				  btnNewButton_5.setEnabled(false);
				  btnNewButton_6.setEnabled(false);
			  }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}

    public Baigiuxe() {
    	setBackground(new Color(255, 255, 255));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 899, 539);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
this.setTitle("Ứng dụng quản lí bãi giữ xe");
        setContentPane(contentPane);
        contentPane.setLayout(null);

        panelmenu = new JPanel();
        panelmenu.setBounds(0, 0, 0, 500);
        contentPane.add(panelmenu);
        panelmenu.setBackground(Color.orange);
        panelmenu.setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("New label");
        lblNewLabel_1.setBounds(-10008, -10031, 1, 451);
        panelmenu.add(lblNewLabel_1);

        ImageIcon icon1=new ImageIcon("E:\\Close-icon.png");
        Image scaledIcon1 = icon1.getImage().getScaledInstance(19, 14, Image.SCALE_SMOOTH);
        
        JLabel lblNewLabel_2 = new JLabel("New label");
        lblNewLabel_2.setBounds(-10008, -10031, 1, 451);
        panelmenu.add(lblNewLabel_2);

         lbtrangchu = new JLabel("Khách hàng");
         ImageIcon iconkh = new ImageIcon("E:\\client.png");
         Image scaledIconkh = iconkh.getImage().getScaledInstance(50, 30, Image.SCALE_SMOOTH);
         lbtrangchu.setIcon(new ImageIcon(scaledIconkh));
         lbtrangchu.setFont(new Font("Tahoma", Font.BOLD, 11));
         lbtrangchu.setOpaque(true);
 		lbtrangchu.setBackground(Color.orange.yellow);
        lbtrangchu.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		panelkhachhang.setVisible(true);
        		paneldoxe.setVisible(false);
        		panelvitri.setVisible(false);
        		panelthongke.setVisible(false);
        		panelvexe.setVisible(false);
        		panelnv.setVisible(false);
        		panelmenu.setVisible(false);
        		panelmenu.setVisible(true);
        		lbtrangchu.setOpaque(true);
        		lbtrangchu.setBackground(Color.orange.yellow);
        		lbdoxe.setBackground(Color.orange);
        		lbthongke.setBackground(Color.orange);
        		lbvexe.setBackground(Color.orange);
        		lbvitri.setBackground(Color.orange);
        		lbnhanvien.setBackground(Color.orange);

        	}
        });
        lbtrangchu.setBounds(0, 110, 155, 40);
        panelmenu.add(lbtrangchu);

         lbnhanvien = new JLabel("Nhân viên");
         ImageIcon iconnv= new ImageIcon("E:\\nhanvien.png");
         Image scaledIconnv = iconnv.getImage().getScaledInstance(50, 30, Image.SCALE_SMOOTH);
         lbnhanvien.setIcon(new ImageIcon(scaledIconnv));
         lbnhanvien.setFont(new Font("Tahoma", Font.BOLD, 11));
        lbnhanvien.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		
        		panelkhachhang.setVisible(false);
        		paneldoxe.setVisible(false);
        		panelvitri.setVisible(false);
        		panelthongke.setVisible(false);
        		panelvexe.setVisible(false);
        		panelnv.setVisible(true);
        		panelmenu.setVisible(false);
        		panelmenu.setVisible(true);
        		lbnhanvien.setOpaque(true);
        		lbnhanvien.setBackground(Color.ORANGE.yellow); 
        		lbdoxe.setBackground(Color.orange);
        		lbthongke.setBackground(Color.orange);
        		lbvexe.setBackground(Color.orange);
        		lbtrangchu.setBackground(Color.orange);
        		lbvitri.setBackground(Color.orange);
        	}
        });
        lbnhanvien.setBounds(0, 170, 155, 40);
        panelmenu.add(lbnhanvien);

         lbvitri = new JLabel("Vị trí đỗ xe");
         ImageIcon iconvt= new ImageIcon("E:\\parked-car.png");
         Image scaledIconvt = iconvt.getImage().getScaledInstance(50, 40, Image.SCALE_SMOOTH);
         lbvitri .setIcon(new ImageIcon(scaledIconvt));
         lbvitri.setFont(new Font("Tahoma", Font.BOLD, 11));
        lbvitri.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		panelkhachhang.setVisible(false);
        		paneldoxe.setVisible(false);
        		panelvitri.setVisible(true);
        		panelthongke.setVisible(false);
        		panelvexe.setVisible(false);
        		panelnv.setVisible(false);
        		panelmenu.setVisible(false);
        		panelmenu.setVisible(true);
        		lbvitri.setOpaque(true);
        		lbvitri.setBackground(Color.orange.yellow);
        		lbdoxe.setBackground(Color.orange);
        		lbthongke.setBackground(Color.orange);
        		lbvexe.setBackground(Color.orange);
        		lbtrangchu.setBackground(Color.orange);
        		lbnhanvien.setBackground(Color.orange);
        		
        	}
        });
        lbvitri.setBounds(0, 230, 155, 40);
        panelmenu.add(lbvitri);

         lbdoxe = new JLabel("Đỗ xe");
         ImageIcon icondx= new ImageIcon("E:\\doxe.png");
         Image scaledIcondx = icondx.getImage().getScaledInstance(50, 40, Image.SCALE_SMOOTH);
         lbdoxe .setIcon(new ImageIcon(scaledIcondx));
         lbdoxe.setFont(new Font("Tahoma", Font.BOLD, 11));
        lbdoxe.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		panelkhachhang.setVisible(false);
        		paneldoxe.setVisible(true);
        		panelvitri.setVisible(false);
        		panelthongke.setVisible(false);
        		panelvexe.setVisible(false);
        		panelnv.setVisible(false);
        		panelmenu.setVisible(false);
        		panelmenu.setVisible(true);
        		lbdoxe.setOpaque(true);
        		lbdoxe.setBackground(Color.ORANGE.yellow);
        		lbnhanvien.setBackground(Color.orange);
        		lbthongke.setBackground(Color.orange);
        		lbvexe.setBackground(Color.orange);
        		lbtrangchu.setBackground(Color.orange);
        		lbvitri.setBackground(Color.orange);
        		
        	}
        });
        lbdoxe.setBounds(0, 290, 155, 40);
        panelmenu.add(lbdoxe);

         lbvexe = new JLabel("Vé xe");
         ImageIcon iconvx= new ImageIcon("E:\\vexe.png");
         Image scaledIconvx = iconvx.getImage().getScaledInstance(50, 40, Image.SCALE_SMOOTH);
         lbvexe .setIcon(new ImageIcon(scaledIconvx));
         lbvexe.setFont(new Font("Tahoma", Font.BOLD, 11));
        lbvexe.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		panelkhachhang.setVisible(false);
        		paneldoxe.setVisible(false);
        		panelvitri.setVisible(false);
        		panelthongke.setVisible(false);
        		panelvexe.setVisible(true);
        		panelnv.setVisible(false);
        		panelmenu.setVisible(false);
        		panelmenu.setVisible(true);
        		lbvexe.setOpaque(true);
        		lbvexe.setBackground(Color.ORANGE.yellow); 
        		lbdoxe.setBackground(Color.orange);
        		lbthongke.setBackground(Color.orange);
        		lbtrangchu.setBackground(Color.orange);
        		lbvitri.setBackground(Color.orange);
        		lbnhanvien.setBackground(Color.orange);
        	}
        });
        lbvexe.setBounds(0, 405, 155, 40);
        panelmenu.add(lbvexe);

        JLabel lblNewLabel_9 = new JLabel("Đăng xuất");
        lblNewLabel_9.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		setVisible(false);
        		new login().setVisible(true);
        	}
        });
        ImageIcon iconlo= new ImageIcon("E:\\logout.png");
        Image scaledIconlo = iconlo.getImage().getScaledInstance(50, 30, Image.SCALE_SMOOTH);
        lblNewLabel_9 .setIcon(new ImageIcon(scaledIconlo));
        lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_9.setBounds(0, 470, 160, 30);
        panelmenu.add(lblNewLabel_9);

         lbthongke = new JLabel("Thống kê");
         ImageIcon icontk= new ImageIcon("E:\\thongke1.png");
         Image scaledIcontk= icontk.getImage().getScaledInstance(50, 30, Image.SCALE_SMOOTH);
         lbthongke .setIcon(new ImageIcon(scaledIcontk));
         lbthongke.setFont(new Font("Tahoma", Font.BOLD, 11));
        lbthongke.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		panelkhachhang.setVisible(false);
        		paneldoxe.setVisible(false);
        		panelvitri.setVisible(false);
        		panelthongke.setVisible(true);
        		panelvexe.setVisible(false);
        		panelnv.setVisible(false);
        		panelmenu.setVisible(false);
        		panelmenu.setVisible(true);
        		lbthongke.setOpaque(true);
        		lbthongke.setBackground(Color.ORANGE.yellow); 
        		lbdoxe.setBackground(Color.orange);
        		lbvexe.setBackground(Color.orange);
        		lbtrangchu.setBackground(Color.orange);
        		lbvitri.setBackground(Color.orange);
        		lbnhanvien.setBackground(Color.orange);
        	}
        });
        lbthongke.setBounds(0, 350, 155, 40);
        panelmenu.add(lbthongke);
        
        panel_4 = new JPanel();
        panel_4.setBackground(new Color(255, 255, 255));
        panel_4.setBounds(0, 0, 153, 102);
        panelmenu.add(panel_4);
        panel_4.setLayout(null);
        
                JLabel labelclose = new JLabel("");
                labelclose.setBounds(136, 0, 19, 14);
                panel_4.add(labelclose);
                labelclose.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        closeMenu();
                    }
                });
                labelclose.setIcon(new ImageIcon(scaledIcon1));
                
                avartar = new JLabel("");
                avartar.setBackground(new Color(255, 255, 255));
                avartar.setBounds(22, 0, 111, 79);
                panel_4.add(avartar);
                
                quyen = new JLabel("");
                quyen.setBackground(new Color(255, 255, 255));
                quyen.setBounds(0, 88, 155, 14);
                panel_4.add(quyen);
        
        JLabel labelmenu = new JLabel();
        ImageIcon icon = new ImageIcon("E:\\menu1.png");
        Image scaledIcon = icon.getImage().getScaledInstance(45, 30, Image.SCALE_SMOOTH);
        labelmenu.setIcon(new ImageIcon(scaledIcon));
        labelmenu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                openMenu();
            }
        });
        labelmenu.setBounds(0, 0, 46, 35);
        contentPane.add(labelmenu);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 255, 255));
        panel.setBounds(0, 28, 883, 472);
        contentPane.add(panel);
        panel.setLayout(new CardLayout(0, 0));
        
        panelkhachhang = new JPanel();
        panelkhachhang.setBackground(new Color(255, 255, 255));
        panel.add(panelkhachhang, "name_623457728078400");
        panelkhachhang.setLayout(null);
        
        JLabel lblNewLabel_13 = new JLabel("QUẢN LÝ KHÁCH HÀNG ĐĂNG KÝ VÉ THÁNG");
        lblNewLabel_13.setForeground(new Color(255, 128, 0));
        lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_13.setBounds(273, 0, 335, 28);
        panelkhachhang.add(lblNewLabel_13);
        
        tableuser = new JTable();
        tableuser.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"Họ và tên", "Biển số xe", "Mã vé","Loại xe","Thời gian đăng ký", "Thời gian hết hạn"
        	}
        ));
        
        JScrollPane scrollPane_6 = new JScrollPane(tableuser);
        scrollPane_6.setBounds(0, 291, 883, 181);
        panelkhachhang.add(scrollPane_6);
        
        lblNewLabel_40 = new JLabel("Họ và tên");
        lblNewLabel_40.setForeground(new Color(255, 128, 0));
        lblNewLabel_40.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_40.setBounds(71, 42, 69, 14);
        panelkhachhang.add(lblNewLabel_40);
        
        Textfieldten = new JTextField();
        Textfieldten.addFocusListener(new FocusAdapter() {
        	@Override
        	public void focusLost(FocusEvent e) {
        		String text=Textfieldten.getText();
        		if(text.length()>0)
        		{
        			lblNewLabel_63.setText("");
        		}
        		else
        		{
        			lblNewLabel_63.setText("Không được để trống");
        		}
        	}
        });
        Textfieldten.setBounds(215, 39, 130, 20);
        panelkhachhang.add(Textfieldten);
        Textfieldten.setColumns(10);
       
        lblNewLabel_41 = new JLabel("Biển số xe");
        lblNewLabel_41.setForeground(new Color(255, 128, 0));
        lblNewLabel_41.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_41.setBounds(71, 80, 69, 14);
        panelkhachhang.add(lblNewLabel_41);
        
        Textfieldbsxuser = new JTextField();
        Textfieldbsxuser.addFocusListener(new FocusAdapter() {
        	@Override
        	public void focusLost(FocusEvent e) {
        		String text=Textfieldbsxuser.getText();
        		if(text.length()>0)
        		{
        			lblNewLabel_64.setText("");
        			for(int i=0;i<tableuser.getRowCount();i++)
        			{
        			Object data = tableuser.getValueAt(i, 1);
   				 if(text.equals(data))
   				 {
   					 lblNewLabel_64.setText("Xe này đã được đăng ký");
   				 }
        			}
        		}
        		else
        		{
        			lblNewLabel_64.setText("Không được để trống");
        		}
        	}
        });
        Textfieldbsxuser.setBounds(215, 78, 130, 20);
        panelkhachhang.add(Textfieldbsxuser);
        Textfieldbsxuser.setColumns(10);
        
        lblNewLabel_42 = new JLabel("Mã vé");
        lblNewLabel_42.setForeground(new Color(255, 128, 0));
        lblNewLabel_42.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_42.setBounds(71, 120, 46, 14);
        panelkhachhang.add(lblNewLabel_42);
        
        Textfieldmaveuser = new JTextField();
        Textfieldmaveuser.addFocusListener(new FocusAdapter() {
        
			@Override
        	public void focusLost(FocusEvent e) {
        		String text=Textfieldmaveuser.getText();
        		
        		if(text.length()>0)
        		{
        			lblNewLabel_65.setText("");
     
        		
        			for(int i=0;i<tableuser.getRowCount();i++)
        			{
        				Object data1= tableuser.getValueAt(i, 2);
       				if(data1.equals(text))
        				{
       					lblNewLabel_65.setText("Vé đã được đăng ký");
        				}
        			}
        			for(int i=0;i<tableve.getRowCount();i++)
        			{
        				Object data=tableve.getValueAt(i, 0);
        				if(text.equals(data))
        				{
        					lblNewLabel_65.setText("Mã vé này là vé thường");
        				}
        			}
        		}
        			
        		else
        		{
        			lblNewLabel_65.setText("Không được để trống");
        		}
        	}
        });
        Textfieldmaveuser.setBounds(215, 118, 130, 20);
        panelkhachhang.add(Textfieldmaveuser);
        Textfieldmaveuser.setColumns(10);
        lblNewLabel_43.setForeground(new Color(255, 128, 0));
        lblNewLabel_43.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNewLabel_43.setBounds(565, 39, 225, 20);
        panelkhachhang.add(lblNewLabel_43);
        
        lblNewLabel_44 = new JLabel("Xe máy");
        lblNewLabel_44.setForeground(new Color(255, 128, 0));
        lblNewLabel_44.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_44.setBounds(539, 80, 58, 14);
        panelkhachhang.add(lblNewLabel_44);
        
        lblNewLabel_45 = new JLabel("Ô tô");
        lblNewLabel_45.setForeground(new Color(255, 128, 0));
        lblNewLabel_45.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_45.setBounds(744, 80, 46, 14);
        panelkhachhang.add(lblNewLabel_45);
        
        labelxemayuser = new JLabel("");
        labelxemayuser.setFont(new Font("Tahoma", Font.BOLD, 15));
        labelxemayuser.setForeground(new Color(255, 128, 0));
        labelxemayuser.setBounds(576, 124, 46, 14);
        panelkhachhang.add(labelxemayuser);
        
        labelotouser = new JLabel("");
        labelotouser.setForeground(new Color(255, 128, 0));
        labelotouser.setFont(new Font("Tahoma", Font.BOLD, 15));
        labelotouser.setBounds(744, 124, 46, 14);
        panelkhachhang.add(labelotouser);
        
        labelxemay2 = new JLabel();
        labelxemay2.setBounds(590, 70, 49, 35);
        panelkhachhang.add(labelxemay2);
        
        labeloto2 = new JLabel("New label");
        labeloto2.setBounds(781, 71, 49, 35);
        panelkhachhang.add(labeloto2);
        
  
         panelnv = new JPanel();
        panelnv.setBackground(new Color(255, 255, 255));
        panel.add(panelnv, "name_623148469913100");
        panelnv.setLayout(null);
        
        JLabel lblNewLabel_10 = new JLabel("Mã nhân viên");
        lblNewLabel_10.setForeground(new Color(255, 128, 0));
        lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_10.setBounds(57, 33, 82, 14);
        panelnv.add(lblNewLabel_10);
        
        JLabel lblNewLabel_14 = new JLabel("QUẢN LÝ NHÂN VIÊN");
        lblNewLabel_14.setForeground(new Color(255, 128, 0));
        lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_14.setBounds(335, 0, 172, 20);
        panelnv.add(lblNewLabel_14);
        
        textmanv = new JTextField();
        textmanv.addFocusListener(new FocusAdapter() {
        	@Override
        	public void focusLost(FocusEvent e) {
        		String text=textmanv.getText();
        		if(text.length()>0)
        		{
        			lbmanv.setText("");
        			for(int i=0;i<tablenv.getRowCount();i++)
        			{
        				 Object data3 = tablenv.getValueAt(i, 0);
        				 if(text.equals(data3))
        				 {
        					 lbmanv.setText("Mã nhân viên này đã có");
        				 }
        			}
        		}
        		else
        		{
        			lbmanv.setText("Không được để trống");
        		}
        	}
        });
        textmanv.setBounds(176, 31, 116, 20);
        panelnv.add(textmanv);
        textmanv.setColumns(10);
        
        JLabel lblNewLabel_15 = new JLabel("Tên nhân viên");
        lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_15.setForeground(new Color(255, 128, 0));
        lblNewLabel_15.setBounds(57, 77, 92, 14);
        panelnv.add(lblNewLabel_15);
        
        texttennv = new JTextField();
        texttennv.addFocusListener(new FocusAdapter() {
        	@Override
        	public void focusLost(FocusEvent e) {
        		String text=texttennv.getText();
        		if(text.length()>0)
        		{
        			lbtennv.setText("");
        		}
        		else
        		{
        			lbtennv.setText("Không được để trống");
        		}
        	}
        });
        texttennv.setBounds(176, 75, 116, 20);
        panelnv.add(texttennv);
        texttennv.setColumns(10);
        
        JLabel lblNewLabel_16 = new JLabel("Ngày sinh");
        lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_16.setForeground(new Color(255, 128, 0));
        lblNewLabel_16.setBounds(57, 122, 82, 14);
        panelnv.add(lblNewLabel_16);
        
        textngaysinh = new JTextField();
        textngaysinh.addFocusListener(new FocusAdapter() {
        	@Override
        	public void focusLost(FocusEvent e) {
        		String text=textngaysinh.getText();
        		if(text.length()>0)
        		{
        			lbnsnv.setText("");
        		}
        		else
        		{
        			lbnsnv.setText("Không được để trống");
        		}
        	}
        });
        textngaysinh.setBounds(176, 120, 116, 20);
        panelnv.add(textngaysinh);
        textngaysinh.setColumns(10);
        
        JLabel lblNewLabel_17 = new JLabel("Giới tính");
        lblNewLabel_17.setForeground(new Color(255, 128, 0));
        lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_17.setBounds(57, 166, 62, 14);
        panelnv.add(lblNewLabel_17);
      
         rdbtnNewRadioButton = new JRadioButton("Nam");
        rdbtnNewRadioButton.setBounds(176, 163, 51, 23);
        panelnv.add(rdbtnNewRadioButton);
        
         rdbtnNewRadioButton_1 = new JRadioButton("Nữ");
        rdbtnNewRadioButton_1.setBounds(240, 163, 51, 23);
        panelnv.add(rdbtnNewRadioButton_1);
        
         buttonGroup = new ButtonGroup();
        buttonGroup.add(rdbtnNewRadioButton);
        buttonGroup.add(rdbtnNewRadioButton_1);
        
        JLabel lblNewLabel_18 = new JLabel("CCCD");
        lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_18.setForeground(new Color(255, 128, 0));
        lblNewLabel_18.setBounds(500, 33, 46, 14);
        panelnv.add(lblNewLabel_18);
        
        textcccd = new JTextField();
        textcccd.addFocusListener(new FocusAdapter() {
			@Override
        	public void focusLost(FocusEvent e) {
        		String text=textcccd.getText();
        		if(text.length()>0)
        		{
        			lbcccd.setText("");
        		}
        		else
        		{
        			lbcccd.setText("Không được để trống");
        		}
        	}
        });
        textcccd.setBounds(619, 31, 116, 20);
        panelnv.add(textcccd);
        textcccd.setColumns(10);
        
        JLabel lblNewLabel_19 = new JLabel("Số điện thoại");
        lblNewLabel_19.setForeground(new Color(255, 128, 0));
        lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_19.setBounds(500, 77, 82, 14);
        panelnv.add(lblNewLabel_19);
        
        textsdt = new JTextField();
        textsdt.addFocusListener(new FocusAdapter() {
        	@Override
        	public void focusLost(FocusEvent e) {
        		String text=textsdt.getText();
        		if(text.length()>0)
        		{
        			lbsdt.setText("");
        		}
        		else
        		{
        			lbsdt.setText("Không được để trống");
        		}
        	}
        });
        textsdt.setBounds(619, 75, 116, 20);
        panelnv.add(textsdt);
        textsdt.setColumns(10);
        
        tablenv = new JTable();
        tablenv.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"Mã nhân viên", "Tên nhân viên", "Ngày sinh", "Giới tính", "CCCD", "SĐT","Ảnh"
        	}
        ));
        tablenv.setBounds(0, 225, 885, 236);
        panelnv.add(tablenv);
        
        JScrollPane scrollPane_3 = new JScrollPane(tablenv);
        scrollPane_3.setBounds(0, 287, 885, 185);
        panelnv.add(scrollPane_3);
        
         btnNewButton_3 = new JButton("Thêm nhân viên");
        btnNewButton_3.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		if(lbmanv.getText().isEmpty()&&lbtennv.getText().isEmpty()&&lbcccd.getText().isEmpty()&&lbsdt.getText().isEmpty()&&
        				lbnsnv.getText().isEmpty())
        		{
sqlnvHandler.Insertnv();
login.Insertnv();
sqlnvHandler.showNhanVien();
        		}
        		else
        		{
        			JOptionPane.showMessageDialog(null, "Kiểm lại các thông tin vừa nhập đã đúng chưa");
        		}
        	}
        });
        btnNewButton_3.setBackground(new Color(255, 128, 0));
        btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
       
        btnNewButton_3.setBounds(428, 263, 133, 25);
        panelnv.add(btnNewButton_3);
        
        btnNewButton_4 = new JButton("Xóa nhân viên");
        btnNewButton_4.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		int removeIndex= tablenv.getSelectedRow();
        		if(removeIndex==-1)
        		{
        			 JOptionPane.showMessageDialog(null, "Xin vui lòng chọn nhân viên bạn muốn xóa");
        		}
        		else
        		{
        			login.xoanv();
        		sqlnvHandler.xoanv();
        		sqlnvHandler.showNhanVien();
        		}
        	}
        });
        btnNewButton_4.setBackground(new Color(255, 128, 0));
        btnNewButton_4.setForeground(new Color(0, 0, 0));
        btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 12));
       
        btnNewButton_4.setBounds(602, 263, 133, 25);
        panelnv.add(btnNewButton_4);
        
        JLabel lblNewLabel_61 = new JLabel("Ảnh đại diện");
        lblNewLabel_61.setForeground(new Color(255, 128, 0));
        lblNewLabel_61.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_61.setBounds(500, 122, 82, 14);
        panelnv.add(lblNewLabel_61);
        
         labelanh = new JLabel("");
        labelanh.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
        labelanh.setBackground(new Color(192, 192, 192));
        labelanh.setBounds(621, 123, 114, 91);
        panelnv.add(labelanh);
        
        JButton btnNewButton_11 = new JButton("Lấy ảnh");
        btnNewButton_11.addMouseListener(new MouseAdapter() {

			@Override
        	public void mouseClicked(MouseEvent e) {
        		JFileChooser jfilechooser=new JFileChooser();
        		jfilechooser.setDialogTitle("ADD IMAGE");
        		jfilechooser.setMultiSelectionEnabled(false);
        		jfilechooser.setFileFilter(new FileTypeFiler(".jpg","JGP"));
        		jfilechooser.setFileFilter(new FileTypeFiler(".jif","GIF"));
        		jfilechooser.setFileFilter(new FileTypeFiler(".png","PNG"));
        		int resul=jfilechooser.showOpenDialog(null);
        		if(resul==jfilechooser.APPROVE_OPTION)
        		{
        			File file=jfilechooser.getSelectedFile();
        			String imagePath=file.getAbsolutePath();
        			  ImageIcon icon1 = new ImageIcon(imagePath);
        			  Image scaledIcon1 = icon1.getImage().getScaledInstance(114, 91, Image.SCALE_SMOOTH);
        			  
        			labelanh.setIcon(new ImageIcon(scaledIcon1));
        			 anh=file.getAbsolutePath().replace("/", "//");
        			
        		}
        	}
        });
        btnNewButton_11.setBackground(new Color(255, 128, 0));
        btnNewButton_11.setBounds(500, 147, 89, 23);
        panelnv.add(btnNewButton_11);
        
         lbmanv = new JLabel("");
         lbmanv.setForeground(new Color(255, 0, 0));
        lbmanv.setBounds(176, 50, 133, 14);
        panelnv.add(lbmanv);
        
         lbtennv = new JLabel("");
         lbtennv.setForeground(new Color(255, 0, 0));
        lbtennv.setBounds(176, 95, 138, 14);
        panelnv.add(lbtennv);
        
         lbnsnv = new JLabel("");
         lbnsnv.setForeground(new Color(255, 0, 0));
        lbnsnv.setBounds(176, 141, 133, 14);
        panelnv.add(lbnsnv);
        
          lbcccd = new JLabel("");
         lbcccd.setForeground(new Color(255, 0, 0));
        lbcccd.setBounds(619, 50, 133, 14);
        panelnv.add(lbcccd);
        
         lbsdt = new JLabel("");
         lbsdt.setForeground(new Color(255, 0, 0));
        lbsdt.setBounds(619, 95, 133, 14);
        panelnv.add(lbsdt);
        
         panelvitri = new JPanel();
        panelvitri.setBackground(new Color(255, 255, 255));
        panel.add(panelvitri, "name_623191052326900");
        panelvitri.setLayout(null);
      
        lblNewLabel = new JLabel("QUẢN LÝ VỊ TRÍ ĐỖ XE");
        lblNewLabel.setForeground(new Color(255, 128, 0));
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel.setBounds(320, 0, 181, 35);
        panelvitri.add(lblNewLabel);
        
        String[] Box2= {"Ô tô","Xe máy"};
        paneltong=new JPanel();
        paneltong.setBackground(new Color(255, 255, 255));
        
       
        JScrollPane scrollPane_8 = new JScrollPane(paneltong);
        paneltong.setLayout(new CardLayout(0, 0));
       
        GridLayout gridlayout=new GridLayout(5,5);
        gridlayout.setHgap(10);
        gridlayout.setVgap(10);
        panelday = new JPanel(gridlayout);
        panelday.setBackground(new Color(255, 255, 255));
        paneltong.add(panelday, "name_269326048343300");
        
        paneloto = new JPanel(gridlayout);
        paneloto.setBackground(new Color(255, 255, 255));
        paneltong.add(paneloto, "name_269336099303200");
        
        panelxemay = new JPanel(gridlayout);
        panelxemay.setBackground(new Color(255, 255, 255));
        paneltong.add(panelxemay, "name_269474124427100");
        
        paneltrong = new JPanel(gridlayout);
        paneltrong.setBackground(new Color(255, 255, 255));
        paneltong.add(paneltrong, "name_269505017831899");
        
        mainPanel = new JPanel(gridlayout);
        mainPanel.setBackground(new Color(255, 255, 255));
        paneltong.add(mainPanel, "name_269891343679400");
        
        panelxemayt = new JPanel(gridlayout);
        panelxemayt.setBackground(new Color(255, 255, 255));
        paneltong.add(panelxemayt, "name_276138638602500");
        
        panelototrong = new JPanel(gridlayout);
        panelototrong.setBackground(new Color(255, 255, 255));
        paneltong.add(panelototrong, "name_312951851654300");
        
        panelxemayday = new JPanel(gridlayout);
        panelxemayday.setBackground(new Color(255, 255, 255));
        paneltong.add(panelxemayday, "name_313094567012300");
        
        panelotoday = new JPanel(gridlayout);
        panelotoday.setBackground(new Color(255, 255, 255));
        paneltong.add(panelotoday, "name_313098412527400");
       
        mainPanel.setVisible(true);
 		panelxemay.setVisible(false);
 		paneloto.setVisible(false);
 		paneltrong.setVisible(false);
 		panelday.setVisible(false);
        scrollPane_8.setBounds(146, 31, 737, 443);
        panelvitri.add(scrollPane_8);
        
        
        
        panel_3 = new JPanel();
        panel_3.setBackground(new Color(255, 255, 255));
        panel_3.setBounds(0, 0, 144, 472);
        panelvitri.add(panel_3);
        panel_3.setLayout(null);
        
         rdbtnNewRadioButton_2 = new JRadioButton("Tất cả vị trí");
         rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent e) {
         		rdbtnNewRadioButton_3.setSelected(false);
         		rdbtnNewRadioButton_4.setSelected(false);
         		rdbtnNewRadioButton_5.setSelected(false);
         		rdbtnNewRadioButton_6.setSelected(false);
         		mainPanel.setVisible(true);
         		panelxemay.setVisible(false);
         		paneloto.setVisible(false);
         		paneltrong.setVisible(false);
         		panelday.setVisible(false);
         	}
         });
        rdbtnNewRadioButton_2.setBackground(new Color(240, 240, 240));
        rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
        rdbtnNewRadioButton_2.setBounds(6, 27, 140, 30);
        panel_3.add(rdbtnNewRadioButton_2);
        
         rdbtnNewRadioButton_3 = new JRadioButton("Vị trí đõ xe ô tô");
         rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent e) {
         		if(rdbtnNewRadioButton_3.isSelected())
         		{
         		rdbtnNewRadioButton_2.setSelected(false);
         		rdbtnNewRadioButton_4.setSelected(false);
         		panelday.setVisible(false);
         		mainPanel.setVisible(false);
         			panelxemay.setVisible(false);
         			paneloto.setVisible(true);
         			paneltrong.setVisible(false);
         			if(rdbtnNewRadioButton_5.isSelected())
         			{
         				panelday.setVisible(false);
                 		mainPanel.setVisible(false);
                 			panelxemay.setVisible(false);
                 			paneloto.setVisible(false);
                 			paneltrong.setVisible(false);
                 			panelototrong.setVisible(true);
         			}
         			else if(rdbtnNewRadioButton_6.isSelected())
         			{
         				paneloto.setVisible(false);

         				panelday.setVisible(false);
                 		mainPanel.setVisible(false);
                 			panelxemay.setVisible(false);
                 			paneloto.setVisible(false);
                 			paneltrong.setVisible(false);
         				panelotoday.setVisible(true);
         				
         			}
         		}
         		else
         		{
         			if(rdbtnNewRadioButton_5.isSelected()) {
         			panelday.setVisible(false);
             		mainPanel.setVisible(false);
             			panelxemay.setVisible(false);
             			paneloto.setVisible(false);
             			paneltrong.setVisible(true);
             			panelxemayt.setVisible(false);
         			}
         			else if(rdbtnNewRadioButton_6.isSelected())
         			{
         				panelday.setVisible(true);
                 		mainPanel.setVisible(false);
                 			panelxemay.setVisible(false);
                 			paneloto.setVisible(false);
                 			paneltrong.setVisible(false);
                 			panelxemayt.setVisible(false);
         			}
         		}
         	}
         });
        
        rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
        rdbtnNewRadioButton_3.setBounds(6, 60, 140, 30);
        panel_3.add(rdbtnNewRadioButton_3);
        
         rdbtnNewRadioButton_4 = new JRadioButton("Vị trí đỗ xe máy");
         rdbtnNewRadioButton_4.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent e) {
         		if(rdbtnNewRadioButton_4.isSelected()) {
             		rdbtnNewRadioButton_3.setSelected(false);
             		rdbtnNewRadioButton_2.setSelected(false);
             		panelday.setVisible(false);
             		mainPanel.setVisible(false);
             			panelxemay.setVisible(true);
             			paneloto.setVisible(false);
             			paneltrong.setVisible(false);
             			if(rdbtnNewRadioButton_5.isSelected())
             			{
             				panelday.setVisible(false);
                     		mainPanel.setVisible(false);
                     			panelxemay.setVisible(false);
                     			paneloto.setVisible(false);
                     			paneltrong.setVisible(false);
                     			panelxemayt.setVisible(true);
             			}
             			else if(rdbtnNewRadioButton_6.isSelected())
             			{
             				paneloto.setVisible(false);
             				panelday.setVisible(false);
                     		mainPanel.setVisible(false);
                     			panelxemay.setVisible(false);
                     			paneloto.setVisible(false);
                     			paneltrong.setVisible(false);
             				panelxemayday.setVisible(true);
             			}
             	}
             		else {
             		if(rdbtnNewRadioButton_5.isSelected())
         			{
         				panelday.setVisible(false);
                 		mainPanel.setVisible(false);
                 			panelxemay.setVisible(false);
                 			paneloto.setVisible(false);
                 			paneltrong.setVisible(true);
                 			panelxemayt.setVisible(false);
         			}
             		else if(rdbtnNewRadioButton_6.isSelected())
             		{
             			panelxemayday.setVisible(false);
             			panelday.setVisible(true);
             		}
             	}
         	}
         });

        rdbtnNewRadioButton_4.setFont(new Font("Tahoma", Font.BOLD, 11));
        rdbtnNewRadioButton_4.setBounds(6, 93, 140, 30);
        panel_3.add(rdbtnNewRadioButton_4);
        
         rdbtnNewRadioButton_5 = new JRadioButton("Vị trí đang trống");
         rdbtnNewRadioButton_5.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent e) {
         		if(rdbtnNewRadioButton_5.isSelected()) {
             		rdbtnNewRadioButton_2.setSelected(false);
             		rdbtnNewRadioButton_6.setSelected(false);
             		paneltrong.setVisible(true);
             		panelototrong.setVisible(false);
             		panelxemayt.setVisible(false);
             		panelday.setVisible(false);
             		panelotoday.setVisible(false);
             		panelxemayday.setVisible(false);
             		mainPanel.setVisible(false);
             			panelxemay.setVisible(false);
             			paneloto.setVisible(false);
             			if(rdbtnNewRadioButton_4.isSelected())
             			{
             				panelday.setVisible(false);
                     		mainPanel.setVisible(false);
                     			panelxemay.setVisible(false);
                     			paneloto.setVisible(false);
                     			paneltrong.setVisible(false);
                     			panelxemayt.setVisible(true);
             			}
             			else if(rdbtnNewRadioButton_3.isSelected())
             			{
             				panelday.setVisible(false);
                     		mainPanel.setVisible(false);
                     			panelxemay.setVisible(false);
                     			paneloto.setVisible(false);
                     			paneltrong.setVisible(false);
                     			panelototrong.setVisible(true);
             			}
             		}
             		else
             		{
             		if(rdbtnNewRadioButton_4.isSelected())
         			{
         				panelday.setVisible(false);
                 		mainPanel.setVisible(false);
                 			panelxemay.setVisible(true);
                 			paneloto.setVisible(false);
                 			paneltrong.setVisible(false);
                 			panelxemayt.setVisible(false);
         			}
             		else if(rdbtnNewRadioButton_3.isSelected())
             		{
             			panelday.setVisible(false);
                 		mainPanel.setVisible(false);
                 			panelxemay.setVisible(false);
                 			paneloto.setVisible(true);
                 			paneltrong.setVisible(false);
                 			panelxemayt.setVisible(false);
             		}
             		}
         	}
         });

        rdbtnNewRadioButton_5.setFont(new Font("Tahoma", Font.BOLD, 11));
        rdbtnNewRadioButton_5.setForeground(new Color(0, 0, 0));
        rdbtnNewRadioButton_5.setBounds(6, 189, 140, 30);
        panel_3.add(rdbtnNewRadioButton_5);
        
         rdbtnNewRadioButton_6 = new JRadioButton("Vị trí đã có xe");
         rdbtnNewRadioButton_6.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent e) {
         		if(rdbtnNewRadioButton_6.isSelected()) {
         		rdbtnNewRadioButton_2.setSelected(false);
         		rdbtnNewRadioButton_5.setSelected(false);
         		panelday.setVisible(true);
mainPanel.setVisible(false);
	panelxemay.setVisible(false);
	paneloto.setVisible(false);
	paneltrong.setVisible(false);
	if(rdbtnNewRadioButton_3.isSelected())
	{
		panelotoday.setVisible(true);
		mainPanel.setVisible(false);
		panelxemay.setVisible(false);
		paneloto.setVisible(false);
		paneltrong.setVisible(false);
		panelday.setVisible(false);
	
	}else if(rdbtnNewRadioButton_4.isSelected()) {
		panelday.setVisible(false);
		panelxemayday.setVisible(true);
	}
         		}
         		else
         		{
         			if(rdbtnNewRadioButton_3.isSelected())
         			{
                       panelotoday.setVisible(false);
         				panelday.setVisible(false);
                 		mainPanel.setVisible(false);
                 			panelxemay.setVisible(false);
                 			paneloto.setVisible(true);
                 			paneltrong.setVisible(false);
                 			panelxemayt.setVisible(false);
         			}
         			else if(rdbtnNewRadioButton_4.isSelected())
         			{
         				panelxemayday.setVisible(false);
         				panelxemay.setVisible(true);
         			}
         		}
         	}
         });
        
        rdbtnNewRadioButton_6.setFont(new Font("Tahoma", Font.BOLD, 11));
        rdbtnNewRadioButton_6.setBounds(6, 222, 140, 30);
        panel_3.add(rdbtnNewRadioButton_6);
        
        buttonGroup1 = new ButtonGroup();
        lblNewLabel_24 = new JLabel("Mã vị trí");
        lblNewLabel_24.setBounds(6, 302, 63, 14);
        panel_3.add(lblNewLabel_24);
        lblNewLabel_24.setForeground(new Color(255, 128, 0));
        lblNewLabel_24.setFont(new Font("Tahoma", Font.BOLD, 12));
        
        textField_9 = new JTextField();
        textField_9.setBounds(66, 300, 80, 20);
        panel_3.add(textField_9);
        textField_9.setColumns(10);
        
        lblNewLabel_25 = new JLabel("Loại xe");
        lblNewLabel_25.setBounds(6, 349, 46, 14);
        panel_3.add(lblNewLabel_25);
        lblNewLabel_25.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_25.setForeground(new Color(255, 128, 0));
        comboBox_2 = new JComboBox(Box2);
        comboBox_2.setBounds(66, 347, 80, 20);
        panel_3.add(comboBox_2);
        
        btnNewButton_5 = new JButton("Thêm ");
        btnNewButton_5.setBounds(6, 417, 89, 23);
        panel_3.add(btnNewButton_5);
        
           btnNewButton_5.addMouseListener(new MouseAdapter() {
           	@Override
           	public void mouseClicked(MouseEvent e) {
           		vitri.insertvitri();
vitri.showVitri();
mainPanel.removeAll();
panelxemay.removeAll();
paneloto.removeAll();
paneltrong.removeAll();
panelxemayt.removeAll();
panelototrong.removeAll();
Vitri();
vitritrong();
vitrioto();
vitrixemay();
xemaytrong();
ototrong();
           	}
           });
           btnNewButton_5.setBackground(new Color(255, 128, 0));
           btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 12));
        
       
        ImageIcon icon3=new ImageIcon("E:\\\\iconxemay1.jpg");
        Image scaledIcon3 = icon3.getImage().getScaledInstance(49, 35, Image.SCALE_SMOOTH);
        ImageIcon icon4=new ImageIcon("E:\\\\\\\\iconoto.jpg");
        Image scaledIcon4 = icon4.getImage().getScaledInstance(49, 35, Image.SCALE_SMOOTH);
        
       
       
       
        
        
        
        
         paneldoxe = new JPanel();
        paneldoxe.setBackground(new Color(255, 255, 255));
        panel.add(paneldoxe, "name_623233149727300");
        paneldoxe.setLayout(null);
        
        
        tabledoxe = new JTable();
        tabledoxe.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        			  "Mã vé", "Biển số xe",  "Lo\u1EA1i xe", "T\u00EAn xe", "V\u1ECB tr\u00ED", "Lo\u1EA1i v\u00E9", "Th\u1EDDi gian v\u00E0o b\u1EBFn "
        	}
        ));
       
        JScrollPane Scro = new JScrollPane(tabledoxe);
        Scro.setBounds(0, 235, 885, 259);
        paneldoxe.add(Scro);
       
       
        
        JLabel lblNewLabel_3 = new JLabel("Biển số xe");
        lblNewLabel_3.setForeground(new Color(255, 128, 0));
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_3.setBounds(56, 37, 65, 14);
        paneldoxe.add(lblNewLabel_3);
        
        textbsx = new JTextField();
        textbsx.addFocusListener(new FocusAdapter() {
        	@Override
        	public void focusLost(FocusEvent e) {
        		String text=textbsx.getText();
        		if(text.length()>0)
        		{
        			lb1.setText("");
        			for(int i=0;i<tabledoxe.getRowCount();i++)
        			{
        				 Object data3 = tabledoxe.getValueAt(i, 1);
        				 if(text.equals(data3))
        				 {
        					 lb1.setText("Xe này đã có trong bãi");
        				 }
        			}
        		}
        		else
        		{
        			lb1.setText("Không được để trống");
        		}
        	}
        });
        textbsx.setBounds(171, 31, 116, 20);
        paneldoxe.add(textbsx);
        textbsx.setColumns(10);
        
        lblNewLabel_4 = new JLabel("Mã vé");
        lblNewLabel_4.setForeground(new Color(255, 128, 0));
        lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_4.setBounds(56, 75, 65, 14);
        paneldoxe.add(lblNewLabel_4);
        
        textmvdx = new JTextField();
        textmvdx.addFocusListener(new FocusAdapter() {
        	@Override
        	public void focusLost(FocusEvent e) {
String text=textmvdx.getText();
        		
        		if(text.length()>0)
        		{
        			lb2.setText("");
        			if(tableve.getRowCount()<=0&&tableuser.getRowCount()<=0) {
    					lb2.setText("Vé xe không tồn tại");
    				}
    				else {
    					boolean noMatch = true;
    					boolean noMatch1 = true;

    					for (int i = 0; i < tableve.getRowCount(); i++) {
    					    Object data3 = tableve.getValueAt(i, 0);
    					    
    					    if (text.equals(data3)) {
    					        noMatch = false;
    					        break;
    					    }
    					    
    					}
    					for (int i = 0; i < tableuser.getRowCount(); i++) {
    					    Object data3 = tableuser.getValueAt(i, 2);
    					    
    					    if (text.equals(data3)) {
    					        noMatch = false;
    					        break;
    					    }
    					    
    					}

    					if (noMatch&&noMatch1) {
    					    lb2.setText("Vé xe không tồn tại");
    					} else {
    					    lb2.setText("");
    					}

    				}
        			LocalDateTime now = LocalDateTime.now();
        	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        	        for (int i = 0; i < tableuser.getRowCount(); i++) {
        	            String expiryString = (String) tableuser.getValueAt(i, 5); 
        	            LocalDateTime expiryDate = LocalDateTime.parse(expiryString, formatter);

        	            if (expiryDate.isBefore(now)) {
        	                lb2.setText("Vé này đã hết hạn");
        	            }
        			
        		}
        		}	
        		else
        		{
        			lb2.setText("Không được để trống");
        		}
        		for(int i=0;i<tabledoxe.getRowCount();i++)
    			{
    				Object data1= tabledoxe.getValueAt(i, 0);
   				if(data1.equals(text))
    				{
   					lb2.setText("Vé đã được dùng");
    				}
    			}
        	}
        });
     
        textmvdx.setBounds(171, 69, 116, 20);
        paneldoxe.add(textmvdx);
        textmvdx.setColumns(10);
        
        lblNewLabel_5 = new JLabel("Loại xe");
        lblNewLabel_5.setForeground(new Color(255, 128, 0));
        lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_5.setBounds(56, 116, 46, 14);
        paneldoxe.add(lblNewLabel_5);
        String[] a= {"Ô tô","Xe máy"};
         comboBox = new JComboBox(a);
        comboBox.addFocusListener(new FocusAdapter() {
        	@Override
        	public void focusLost(FocusEvent e) {
        		String text=comboBox.getSelectedItem()+"";
        		if(text.equals("Ô tô"))
        {
        			 DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        	for(int i=0;i<tablevitri.getRowCount();i++)
        	{
        		Boolean a=true;
        		Object data3=tablevitri.getValueAt(i, 0);
        		Object data1=tablevitri.getValueAt(i, 1);
        		for(int j=0;j<tabledoxe.getRowCount();j++) {
        		Object data=tabledoxe.getValueAt(j, 4);
        		if(data.equals(data3)&&data1.equals("Ô tô"))
        				{
        			a=false;
        			break;
        		}
        		}
        		if(data1.equals("Ô tô")&&a)
            		model.addElement(data3 + "");
          	
        	}
        	comboBox_1.removeAllItems();
        	 comboBox_1.setModel(model);
        }
        		else
        		{	 DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            	for(int i=0;i<tablevitri.getRowCount();i++)
            	{
            		Boolean a=true;
            		Object data3=tablevitri.getValueAt(i, 0);
            		Object data1=tablevitri.getValueAt(i, 1);
            		for(int j=0;j<tabledoxe.getRowCount();j++) {
            		Object data=tabledoxe.getValueAt(j, 4);
            		if(data.equals(data3)&&data1.equals("Xe máy"))
            				{
            			a=false;
            			break;
            		}
            		}
            		if(data1.equals("Xe máy")&&a)
                		model.addElement(data3 + "");
              	
            	}
            	comboBox_1.removeAllItems();
            	 comboBox_1.setModel(model);
        		}
        	}
        });
        comboBox.setBounds(171, 110, 116, 20);
        paneldoxe.add(comboBox);
        comboBox.setBackground(Color.WHITE);
        
        JLabel lblNewLabel_6 = new JLabel("Tên xe");
        lblNewLabel_6.setForeground(new Color(255, 128, 0));
        lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_6.setBounds(509, 37, 46, 14);
        paneldoxe.add(lblNewLabel_6);
        
        textlx = new JTextField();
        textlx.setBounds(607, 35, 116, 20);
        paneldoxe.add(textlx);
        textlx.setColumns(10);
        
        JButton btnNewButton = new JButton("Vào Bãi");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
    if(lb1.getText().isEmpty()&&lb2.getText().isEmpty())
    {
    	if(tabledoxe.getRowCount()==tablevitri.getRowCount())
    	{
    		JOptionPane.showMessageDialog(null, "Xin lỗi đã hết chỗ đổ xe");
    	}
    	else
    	{
        		doxe.insetdoxe();
        		doxe.showdulieudoxe();
        		String text= comboBox_1.getSelectedItem()+"";
        		String text1=textmvdx.getText();
        		for(int i=0;i<tablevitri.getRowCount();i++)
        		{
        			Object data=tablevitri.getValueAt(i, 0);
        			if(text.equals(data))
        			{
        				vitri.xoavitri1(i);
        			}
        		}
        		for(int i=0;i<tableve.getRowCount();i++)
        		{
        			Object data=tableve.getValueAt(i, 0);
        			if(text1.equals(data))
        			{
        				ve.xoa1(i);
        			}
        		}
        		ve.themve1();
        		vitri.them1();
        		vitri.showVitri();
        		ve.showve();
        		mainPanel.removeAll();
        		panelxemay.removeAll();
        		paneloto.removeAll();
        		paneltrong.removeAll();
        		panelxemayt.removeAll();
        		panelototrong.removeAll();
        		panelotoday.removeAll();
        		panelxemayday.removeAll();
        		panelday.removeAll();
        		
        		 Vitri();
                 vitriday();
                 vitritrong();
                 vitrioto();
                 vitrixemay();
                 xemaytrong();
                 ototrong();
                 otoday();
                 xemayday();
                 textbsx.setText("");
                 textmvdx.setText("");
                textlx.setText("");
    }
    }
    else
    {
    	
			JOptionPane.showMessageDialog(null, "Kiểm lại các thông tin vừa nhập đã đúng chưa");
		
		
    }
        	}
        });
        btnNewButton.setBackground(new Color(255, 128, 0));
        btnNewButton.setForeground(new Color(0, 0, 0));
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton.setBounds(466, 201, 89, 25);
        btnNewButton.setBackground(new Color(255,128,0));
        paneldoxe.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Xuất Bãi");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		int removeIndex= tabledoxe.getSelectedRow();
        		if(removeIndex==-1)
        		{
        			
        		}
        		else
        		{
        			Object data=tabledoxe.getValueAt(removeIndex, 4);
        			Object data2=tabledoxe.getValueAt(removeIndex, 0);
        			for(int i=0;i<tablevitri.getRowCount();i++)
        			{
        				Object data1=tablevitri.getValueAt(i, 0);
        				if(data.equals(data1))
        				{
        					vitri.xoavitri1(i);
        				}
        			}
        			for(int i=0;i<tableve.getRowCount();i++)
        			{
        				Object data1=tableve.getValueAt(i, 0);
        				if(data2.equals(data1))
        				{
        					ve.xoa1(i);
        				}
        			}
        		}
        		Object data=tabledoxe.getValueAt(removeIndex, 4);
        		Object data1=tabledoxe.getValueAt(removeIndex, 2);
        		Object data2=tabledoxe.getValueAt(removeIndex, 0);
        		Object data3=tabledoxe.getValueAt(removeIndex, 1);
        		Object data4=tabledoxe.getValueAt(removeIndex, 3);
        		Object data5=tabledoxe.getValueAt(removeIndex, 5);
        		Object data6=tabledoxe.getValueAt(removeIndex, 6);
        		thongke.insetthongke(data2+"", data3+"", data1+"", data4+"", data+"", data5+"", data6+"");
        		thongke.showdulieu();
        		ve.themve2(data2+"");
        		doxe.xoadoxe();
        		doxe.showdulieudoxe();
        		vitri.them2(data+"", data1+"");
        		vitri.showVitri();
        		ve.showve();
        		mainPanel.removeAll();
        		panelxemay.removeAll();
        		paneloto.removeAll();
        		paneltrong.removeAll();
        		panelxemayt.removeAll();
        		panelototrong.removeAll();
        		panelotoday.removeAll();
        		panelxemayday.removeAll();
        		panelday.removeAll();
        		
        		 Vitri();
                 vitriday();
                 vitritrong();
                 vitrioto();
                 vitrixemay();
                 xemaytrong();
                 ototrong();
                 otoday();
                 xemayday();
                 thongke();
        	}
        });
        btnNewButton_1.setForeground(new Color(0, 0, 0));
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton_1.setBounds(629, 201, 89, 25);
        btnNewButton_1.setBackground(new Color(255,128,0));
        paneldoxe.add(btnNewButton_1);
        
        lblNewLabel_7 = new JLabel("Tìm kiếm theo vé xe");
        lblNewLabel_7.setForeground(new Color(255, 128, 0));
        lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_7.setBounds(24, 210, 128, 14);
        paneldoxe.add(lblNewLabel_7);
        
        textField_3 = new JTextField();
        textField_3.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyReleased(KeyEvent e) {
        		try {
            	    Connection connection = connect.getConnection();
            	    String sql = "SELECT * FROM tabledo WHERE Biensoxe LIKE N'%" + textField_3.getText() + "%' OR Mave LIKE N'%" + textField_3.getText() + 
            	    		"%' OR Loaixe LIKE N'%"+textField_3.getText()+"%' OR Loaive LIKE N'%"+textField_3.getText()+"%'";
            	    Statement st = connection.createStatement();
            	    ResultSet rs = st.executeQuery(sql);
            	    arr1.clear();
            	    
            	    while(rs.next()) {
            	        String mave = rs.getString("Mave");
            	        String bienso = rs.getString("Biensoxe");
            	        String loaixe = rs.getString("Loaixe");
            	        String tenxe = rs.getString("Tenxe");
            	        String vitri = rs.getString("Vitri");
            	        String Loaive = rs.getString("Loaive");
            	       String Thoigianvaoben=rs.getString("Thoigianvaoben");
            	        Modedo book = new Modedo(mave, bienso, loaixe, tenxe, vitri, Loaive, Thoigianvaoben);
            	        arr1.add(book);
            	    }
            	    connection.close();
            	    loadtabledo();
            	} catch (Exception e2) {
            	    
            	}

        	}
        });
        textField_3.setBounds(175, 204, 112, 20);
        paneldoxe.add(textField_3);
        textField_3.setColumns(10);
        
        lblNewLabel_8 = new JLabel("Vị trí");
        lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_8.setForeground(new Color(255, 128, 0));
        lblNewLabel_8.setBounds(509, 75, 46, 14);
        paneldoxe.add(lblNewLabel_8);
        
        comboBox_1 = new JComboBox();
        comboBox_1.setBounds(607, 73, 116, 20);
        paneldoxe.add(comboBox_1);
        
        lblNewLabel_20 = new JLabel("QUẢN LÝ BÃI ĐỖ XE");
        lblNewLabel_20.setForeground(new Color(255, 128, 0));
        lblNewLabel_20.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_20.setBounds(335, 0, 169, 32);
        paneldoxe.add(lblNewLabel_20);
        
         lb1 = new JLabel();
         lb1.setForeground(new Color(255, 0, 0));
        lb1.setBounds(171, 51, 149, 14);
        paneldoxe.add(lb1);
        
        lb2 = new JLabel("");
        lb2.setForeground(new Color(255, 0, 0));
        lb2.setBounds(171, 88, 135, 14);
        paneldoxe.add(lb2);
       
        
        
       
       
       
         panelvexe = new JPanel();
        panelvexe.setBackground(new Color(255, 255, 255));
        panel.add(panelvexe, "name_623271635803400");
        panelvexe.setLayout(null);
        
        JLabel lblNewLabel_11 = new JLabel("QUẢN LÝ VÉ XE");
        lblNewLabel_11.setForeground(new Color(255, 128, 0));
        lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_11.setBounds(350, 0, 129, 29);
        panelvexe.add(lblNewLabel_11);
        
        tableve = new JTable();
        tableve.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"Mã vé", "Biển số xe", "Loại xe"
        	}
        ));
        tableve.setBounds(0, 0, 1, 1);
        panelvexe.add(tableve);
        
        JScrollPane scrollPane_5 = new JScrollPane(tableve);
        scrollPane_5.setBounds(0, 236, 653, 236);
        panelvexe.add(scrollPane_5);
        
        lblNewLabel_33 = new JLabel("Mã vé xe");
        lblNewLabel_33.setForeground(new Color(255, 128, 0));
        lblNewLabel_33.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_33.setBounds(85, 39, 68, 14);
        panelvexe.add(lblNewLabel_33);
        
        textField_11 = new JTextField();
        textField_11.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		
        	}
        });
        textField_11.setBounds(163, 37, 116, 20);
        panelvexe.add(textField_11);
        textField_11.setColumns(10);
        
        JLabel lblNewLabel_35 = new JLabel("Tìm kiếm mã vé");
        lblNewLabel_35.setForeground(new Color(255, 128, 0));
        lblNewLabel_35.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_35.setBounds(37, 211, 116, 14);
        panelvexe.add(lblNewLabel_35);
        
        textField_12 = new JTextField();
        textField_12.setBounds(163, 205, 116, 20);
        panelvexe.add(textField_12);
        textField_12.setColumns(10);
        
        JButton btnNewButton_7 = new JButton("Thêm vé ");
        btnNewButton_7.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		ve.insertve();
        		ve.showve();
        		Vitri();
        		 tongve();
        	}
        });
       
        btnNewButton_7.setBackground(new Color(255, 128, 0));
        btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton_7.setBounds(364, 207, 89, 23);
        panelvexe.add(btnNewButton_7);
        
        JLabel lblNewLabel_36 = new JLabel("Tổng số vé:");
        lblNewLabel_36.setForeground(new Color(255, 128, 0));
        lblNewLabel_36.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_36.setBounds(486, 40, 81, 14);
        panelvexe.add(lblNewLabel_36);
        
         lblNewLabel_37 = new JLabel("New label");
        lblNewLabel_37.setForeground(new Color(255, 128, 0));
        lblNewLabel_37.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_37.setBounds(585, 39, 68, 14);
        panelvexe.add(lblNewLabel_37);
        
        JLabel lblNewLabel_38 = new JLabel("Số vé còn lại");
        lblNewLabel_38.setForeground(new Color(255, 128, 0));
        lblNewLabel_38.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_38.setBounds(486, 95, 81, 14);
        panelvexe.add(lblNewLabel_38);
        
         lblNewLabel_39 = new JLabel("New label");
        lblNewLabel_39.setForeground(new Color(255, 128, 0));
        lblNewLabel_39.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_39.setBounds(585, 96, 68, 14);
        panelvexe.add(lblNewLabel_39);
        
        btnNewButton_10 = new JButton("Xóa vé");
        btnNewButton_10.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		ve.xoave();
        		ve.showve();
        		 tongve();
        	}
        });
        btnNewButton_10.setBackground(new Color(255, 128, 0));
        btnNewButton_10.setForeground(new Color(0, 0, 0));
        btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton_10.setBounds(486, 207, 89, 23);
        panelvexe.add(btnNewButton_10);
        
        labelxemay2.setIcon(new ImageIcon(scaledIcon3));
        labeloto2.setIcon(new ImageIcon(scaledIcon4));
        
        lblNewLabel_48 = new JLabel("Tìm kiếm thông tin khánh hàng");
        lblNewLabel_48.setForeground(new Color(255, 128, 0));
        lblNewLabel_48.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_48.setBounds(10, 266, 204, 14);
        panelkhachhang.add(lblNewLabel_48);
        
        textField_16 = new JTextField();
        textField_16.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
            	try {
            	    Connection connection = connect.getConnection();
            	    String sql = "SELECT * FROM tableuser WHERE Hovaten LIKE N'%" + textField_16.getText() + "%' OR Mave LIKE N'%" + textField_16.getText() + 
            	    		"%' OR Biensoxe LIKE N'%"+textField_16.getText()+"%'";
            	    Statement st = connection.createStatement();
            	    ResultSet rs = st.executeQuery(sql);
            	    arr.clear();
            	    
            	    while(rs.next()) {
            	        String ten = rs.getString("Hovaten");
            	        String bienso = rs.getString("Biensoxe");
            	        String mave = rs.getString("Mave");
            	        String loaixe = rs.getString("Loaixe");
            	        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            	        Timestamp timestamp = rs.getTimestamp("Thoigiandangky");
            	        Timestamp timestamp1 = rs.getTimestamp("Thoigiahethang");
            	        String formattedDateTime = dateFormat.format(timestamp);
            	        String formattedDateTime1 = dateFormat.format(timestamp1);
            	        Modeuser book = new Modeuser(ten, bienso, mave, loaixe, formattedDateTime, formattedDateTime1);
            	        arr.add(book);
            	    }
            	    connection.close();
            	    loadtableuser();
            	} catch (Exception e2) {
            	    
            	}


            }
        });
        textField_16.setBounds(215, 264, 127, 20);
        panelkhachhang.add(textField_16);
        textField_16.setColumns(10);
        
        btnNewButton_8 = new JButton("Thêm ");
        btnNewButton_8.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		if(lblNewLabel_63.getText().isEmpty()&&lblNewLabel_64.getText().isEmpty()&&lblNewLabel_65.getText().isEmpty()&&lblNewLabel_66.getText().isEmpty())
        		{
        			Toancuc tc= new Toancuc();
            		tc.setHovaten(Textfieldten.getText());
            		tc.setBiensoxe(Textfieldbsxuser.getText());
            		tc.setMave(Textfieldmaveuser.getText());
            		tc.setLoaixe(comboBox_3.getSelectedItem()+"");
            		 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            		    String formattedDateTime = dateFormat.format(new Date());
            		    Timestamp timestamp = Timestamp.valueOf(formattedDateTime);
            		tc.setThoigiandk(formattedDateTime);
            		 int numberOfMonths = Integer.parseInt(textField_13.getText()); 
            	        Calendar calendar = Calendar.getInstance();
            	        calendar.setTime(timestamp);
            	        calendar.add(Calendar.MONTH, numberOfMonths);
            	        Timestamp expirationTimestamp = new Timestamp(calendar.getTimeInMillis());
         tc.setThoigianhethan(expirationTimestamp+"");
         if("Ô tô".equals(comboBox_3.getSelectedItem()))

    	    {
        	thangoto=0;
    	    	int b=giaveoto;
    	    	int a=numberOfMonths*30*b*8/10;
    	    	 tien.insert(a,comboBox_3.getSelectedItem()+"");
    	    	 tien.showVitri();
    	    	 tc.setTongtien(a);
    	    }
    	    else {
    	    	thangxemay=0;
    	    	int b=giavexemay;
    	    	int a=numberOfMonths*30*b*8/10;
    	    	 tien.insert(a, comboBox_3.getSelectedItem()+"");
    	    	 tien.showVitri();
    	    	 tc.setTongtien(a);
    	    }
         thongke();
         Hoadon hoadon = new Hoadon();
         hoadon.setVisible(true);
         hoadon.setLocationRelativeTo(null);
            	sqluser.insetuser();
            	sqluser.showduleuser();
            	xeuser();
                 Textfieldten.setText("");
                 Textfieldmaveuser.setText("");
                 Textfieldbsxuser.setText("");
                 textField_13.setText("");
        			
                 
        		}
        		else{
        			JOptionPane.showMessageDialog(null, "Kiểm lại các thông tin vừa nhập đã đúng chưa");
        		
        		}
        		}
        });
        btnNewButton_8.setBackground(new Color(255, 128, 0));
        btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton_8.setBounds(500, 262, 89, 23);
        panelkhachhang.add(btnNewButton_8);
        
        btnNewButton_9 = new JButton("Xóa");
        
        btnNewButton_9.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		int removeIndex= tableuser.getSelectedRow();
        		if(removeIndex==-1)
        		{
        			 JOptionPane.showMessageDialog(null, "Xin vui lòng chọn khách hàng mà bạn muốn xóa");
        		}
        		else
        		{
sqluser.xoauser();       		
sqluser.showduleuser();
        		}
        		xeuser();
        	}
        });
        btnNewButton_9.setBackground(new Color(255, 128, 0));
        btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton_9.setBounds(653, 262, 89, 23);
        panelkhachhang.add(btnNewButton_9);
        
        JLabel lblNewLabel_60 = new JLabel("Bao nhiêu tháng");
        lblNewLabel_60.setForeground(new Color(255, 128, 0));
        lblNewLabel_60.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_60.setBounds(71, 161, 134, 14);
        panelkhachhang.add(lblNewLabel_60);
        
        textField_13 = new JTextField();
        textField_13.addFocusListener(new FocusAdapter() {
        	@Override
        	public void focusLost(FocusEvent e) {
        		String Text=textField_13.getText();
        		if(Text.length()>0)
        		{
        			lblNewLabel_66.setText("");
        		}
        		else
        		{
        			lblNewLabel_66.setText("Không được để trống");
        		}
        	}
        });
        textField_13.setBounds(215, 159, 130, 20);
        panelkhachhang.add(textField_13);
        textField_13.setColumns(10);
        
        JLabel lblNewLabel_62 = new JLabel("Loại xe");
        lblNewLabel_62.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_62.setForeground(new Color(255, 128, 0));
        lblNewLabel_62.setBounds(71, 202, 69, 14);
        panelkhachhang.add(lblNewLabel_62);
        
        String[] b= {"Ô tô","Xe máy"};
         comboBox_3 = new JComboBox(b);
        comboBox_3.setBounds(215, 200, 130, 20);
        panelkhachhang.add(comboBox_3);
        
        lblNewLabel_46 = new JLabel("Xe");
        lblNewLabel_46.setForeground(new Color(255, 128, 0));
        lblNewLabel_46.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_46.setBounds(576, 162, 46, 14);
        panelkhachhang.add(lblNewLabel_46);
        
        lblNewLabel_47 = new JLabel("Xe");
        lblNewLabel_47.setForeground(new Color(255, 128, 0));
        lblNewLabel_47.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_47.setBounds(744, 162, 46, 14);
        panelkhachhang.add(lblNewLabel_47);
        
         lblNewLabel_63 = new JLabel("");
        lblNewLabel_63.setForeground(new Color(255, 0, 0));
        lblNewLabel_63.setBounds(215, 59, 159, 14);
        panelkhachhang.add(lblNewLabel_63);
        
        lblNewLabel_64 = new JLabel("");
        lblNewLabel_64.setForeground(new Color(255, 0, 0));
        lblNewLabel_64.setBounds(215, 97, 159, 14);
        panelkhachhang.add(lblNewLabel_64);
        
        lblNewLabel_65 = new JLabel("");
        lblNewLabel_65.setForeground(new Color(255, 0, 0));
        lblNewLabel_65.setBounds(215, 138, 159, 14);
        panelkhachhang.add(lblNewLabel_65);
        
        lblNewLabel_66 = new JLabel("");
        lblNewLabel_66.setForeground(new Color(255, 0, 0));
        lblNewLabel_66.setBounds(215, 178, 159, 14);
        panelkhachhang.add(lblNewLabel_66);
      
        
         panelthongke = new JPanel();
        panelthongke.setBackground(new Color(255, 255, 255));
        panel.add(panelthongke, "name_623296638713500");
        panelthongke.setLayout(null);
        
        
        table_1 = new JTable();
        table_1.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"M\u00E3 v\u00E9", "Bi\u1EC3n s\u1ED1 xe", "Lo\u1EA1i xe", "T\u00EAn xe", "V\u1ECB tr\u00ED", "Lo\u1EA1i v\u00E9", "Th\u1EDDi gian v\u00E0o b\u1EBFn", "Th\u1EDDi gian xu\u1EA5t b\u1EBFn"
        	}
        ));
        table_1.setBounds(0, 0, 1, 1);
        panelthongke.add(table_1);
//        table_1.getColumnModel().getColumn(0).setPreferredWidth(50); 
//        table_1.getColumnModel().getColumn(1).setPreferredWidth(50); 
//        table_1.getColumnModel().getColumn(2).setPreferredWidth(50); 
//        table_1.getColumnModel().getColumn(3).setPreferredWidth(50); 
        JScrollPane scrollPane_2 = new JScrollPane(table_1);
        scrollPane_2.setBounds(0, 265, 903, 214);
        panelthongke.add(scrollPane_2);
        
        lblNewLabel_49 = new JLabel("THỐNG KÊ");
        lblNewLabel_49.setForeground(new Color(255, 128, 0));
        lblNewLabel_49.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_49.setBounds(355, 0, 105, 26);
        panelthongke.add(lblNewLabel_49);
        
        lblNewLabel_50 = new JLabel("Tổng số lượt xe đã gởi");
        lblNewLabel_50.setForeground(new Color(255, 128, 0));
        lblNewLabel_50.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_50.setBounds(39, 32, 150, 14);
        panelthongke.add(lblNewLabel_50);
        
        lblNewLabel_51 = new JLabel("Số lượt xe gởi theo lượt");
        lblNewLabel_51.setForeground(new Color(255, 128, 0));
        lblNewLabel_51.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_51.setBounds(39, 69, 151, 14);
        panelthongke.add(lblNewLabel_51);
        
        lblNewLabel_52 = new JLabel("Số lượt xe gởi theo tháng");
        lblNewLabel_52.setForeground(new Color(255, 128, 0));
        lblNewLabel_52.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_52.setBounds(39, 104, 161, 14);
        panelthongke.add(lblNewLabel_52);
        
        lblNewLabel_53 = new JLabel("Số tiền đã thu");
        lblNewLabel_53.setForeground(new Color(255, 128, 0));
        lblNewLabel_53.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_53.setBounds(39, 142, 128, 14);
        panelthongke.add(lblNewLabel_53);
        
        lblNewLabel_54 = new JLabel("Số tiền đã thu từ vé lượt");
        lblNewLabel_54.setForeground(new Color(255, 128, 0));
        lblNewLabel_54.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_54.setBounds(39, 177, 161, 14);
        panelthongke.add(lblNewLabel_54);
        
        lblNewLabel_55 = new JLabel("Số tiền đã thu từ vé tháng");
        lblNewLabel_55.setForeground(new Color(255, 128, 0));
        lblNewLabel_55.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_55.setBounds(39, 209, 173, 14);
        panelthongke.add(lblNewLabel_55);
        
        lblNewLabel_56 = new JLabel("New label");
        lblNewLabel_56.setForeground(new Color(255, 128, 0));
        lblNewLabel_56.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_56.setBounds(232, 33, 80, 14);
        panelthongke.add(lblNewLabel_56);
        
        lblNewLabel_57 = new JLabel("New label");
        lblNewLabel_57.setForeground(new Color(255, 128, 0));
        lblNewLabel_57.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_57.setBounds(232, 70, 80, 14);
        panelthongke.add(lblNewLabel_57);
        
        lblNewLabel_58 = new JLabel("New label");
        lblNewLabel_58.setForeground(new Color(255, 128, 0));
        lblNewLabel_58.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_58.setBounds(232, 105, 80, 14);
        panelthongke.add(lblNewLabel_58);
        
        lblNewLabel_59 = new JLabel("Tìm kiếm xe");
        lblNewLabel_59.setForeground(new Color(255, 128, 0));
        lblNewLabel_59.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNewLabel_59.setBounds(59, 240, 87, 14);
        panelthongke.add(lblNewLabel_59);
        
        textField_17 = new JTextField();
        textField_17.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyReleased(KeyEvent e) {
        		try {
            	    Connection connection = connect.getConnection();
            	    String sql = "SELECT * FROM tablethongke WHERE Biensoxe LIKE N'%" + textField_17.getText() + "%' OR Mave LIKE N'%" + textField_17.getText() + 
            	    		"%' OR Loaixe LIKE N'%"+textField_17.getText()+"%' OR Loaive LIKE N'%"+textField_17.getText()+"%' OR Thoigianvaoben LIKE N'%"+textField_17.getText()
            	    		+"%' OR Thoigianxuatben LIKE N'%"+textField_17.getText()+"%'";
            	    Statement st = connection.createStatement();
            	    ResultSet rs = st.executeQuery(sql);
            	    arr2.clear();
            	    
            	    while(rs.next()) {
            	        String mave = rs.getString("Mave");
            	        String bienso = rs.getString("Biensoxe");
            	        String loaixe = rs.getString("Loaixe");
            	        String tenxe = rs.getString("Tenxe");
            	        String vitri = rs.getString("Vitri");
            	        String Loaive = rs.getString("Loaive");
            	       String Thoigianvaoben=rs.getString("Thoigianvaoben");
            	       String Thoigianxuatben=rs.getString("Thoigianxuatben");
            	        Modetk book = new Modetk(mave, bienso, loaixe, tenxe, vitri, Loaive, Thoigianvaoben,Thoigianxuatben);
            	        arr2.add(book);
            	    }
            	    connection.close();
            	    loadtabletk();
            	} catch (Exception e2) {
            	    
            	}
        	}
        });
        textField_17.setBounds(172, 234, 157, 20);
        panelthongke.add(textField_17);
        textField_17.setColumns(10);
      
        
        lablegio = new JLabel("");
        lablegio.setBounds(696, 11, 177, 17);
        contentPane.add(lablegio);
        
        JLabel lblNewLabel_12 = new JLabel("New label");
        lblNewLabel_12.setBounds(236, 39, 46, 14);
        contentPane.add(lblNewLabel_12);
        updateDateTimeContinuously();
    
 
             
             panel_1 = new JPanel();
             panel.add(panel_1, "name_96943428070200");
             panel_1.setLayout(null);
             tablevitri = new JTable();
             tablevitri.setModel(new DefaultTableModel(
             	new Object[][] {
             		{null, null, null},
             		{null, null, null},
             		{null, null, null},
             		{null, null, null},
             		{null, null, null},
             		{null, null, null},
             		{null, null, null},
             		{null, null, null},
             		{null, null, null},
             		{null, null, null},
             		{null, null, null},
             		{null, null, null},
             		{null, null, null},
             		{null, null, null},
             		{null, null, null},
             	},
             	new String[] {
             		"M\u00E3 v\u1ECB tr\u00ED","Loại xe", "Bi\u1EC3n s\u1ED1 xe"
             	}
             ));
             
             scrollPane_4 = new JScrollPane(tablevitri);
             scrollPane_4.setBounds(149, 47, 585, 267);
             panel_1.add(scrollPane_4);
             
             
            
                   btnNewButton_6 = new JButton("Đặt lại thống kê");
                  btnNewButton_6.setBackground(new Color(255, 128, 0));
                  btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 12));
                  btnNewButton_6.addActionListener(new ActionListener() {
                  	public void actionPerformed(ActionEvent e) {
                  		xuatfile();
                  		thongke.xoa();
                  		thongke.showdulieu();
                  		tien.deleteAllData();
                  		thangoto=0;
                  		thangxemay=0;
                  		thongke();
                
                  	}
                  });
                  btnNewButton_6.setBounds(607, 234, 150, 26);
                  panelthongke.add(btnNewButton_6);
                  
                   lblNewLabel_21 = new JLabel("New label");
                  lblNewLabel_21.setForeground(new Color(255, 128, 0));
                  lblNewLabel_21.setFont(new Font("Tahoma", Font.BOLD, 12));
                  lblNewLabel_21.setBounds(232, 143, 128, 14);
                  panelthongke.add(lblNewLabel_21);
                  
                   lblNewLabel_26 = new JLabel("New label");
                  lblNewLabel_26.setFont(new Font("Tahoma", Font.BOLD, 12));
                  lblNewLabel_26.setForeground(new Color(255, 128, 0));
                  lblNewLabel_26.setBounds(232, 178, 128, 14);
                  panelthongke.add(lblNewLabel_26);
                  
                   lblNewLabel_27 = new JLabel("New label");
                  lblNewLabel_27.setForeground(new Color(255, 128, 0));
                  lblNewLabel_27.setFont(new Font("Tahoma", Font.BOLD, 12));
                  lblNewLabel_27.setBounds(232, 210, 128, 14);
                  panelthongke.add(lblNewLabel_27);
                  
                   lblNewLabel_28 = new JLabel("Ô tô");
                  lblNewLabel_28.setFont(new Font("Tahoma", Font.BOLD, 12));
                  lblNewLabel_28.setForeground(new Color(255, 128, 0));
                  lblNewLabel_28.setBounds(391, 32, 46, 14);
                  panelthongke.add(lblNewLabel_28);
                  
                  lblNewLabel_29 = new JLabel("Ô tô");
                  lblNewLabel_29.setForeground(new Color(255, 128, 0));
                  lblNewLabel_29.setFont(new Font("Tahoma", Font.BOLD, 12));
                  lblNewLabel_29.setBounds(391, 69, 46, 14);
                  panelthongke.add(lblNewLabel_29);
                  
                  lblNewLabel_30 = new JLabel("Ô tô");
                  lblNewLabel_30.setForeground(new Color(255, 128, 0));
                  lblNewLabel_30.setFont(new Font("Tahoma", Font.BOLD, 12));
                  lblNewLabel_30.setBounds(391, 104, 46, 14);
                  panelthongke.add(lblNewLabel_30);
                  
                  lblNewLabel_31 = new JLabel("Ô tô");
                  lblNewLabel_31.setForeground(new Color(255, 128, 0));
                  lblNewLabel_31.setFont(new Font("Tahoma", Font.BOLD, 12));
                  lblNewLabel_31.setBounds(391, 142, 46, 14);
                  panelthongke.add(lblNewLabel_31);
                  
                  lblNewLabel_32 = new JLabel("Ô tô");
                  lblNewLabel_32.setForeground(new Color(255, 128, 0));
                  lblNewLabel_32.setFont(new Font("Tahoma", Font.BOLD, 12));
                  lblNewLabel_32.setBounds(391, 177, 46, 14);
                  panelthongke.add(lblNewLabel_32);
                  
                  lblNewLabel_34 = new JLabel("Ô tô");
                  lblNewLabel_34.setForeground(new Color(255, 128, 0));
                  lblNewLabel_34.setFont(new Font("Tahoma", Font.BOLD, 12));
                  lblNewLabel_34.setBounds(391, 209, 46, 14);
                  panelthongke.add(lblNewLabel_34);
                  
                  lblNewLabel_67 = new JLabel("Xe máy");
                  lblNewLabel_67.setForeground(new Color(255, 128, 0));
                  lblNewLabel_67.setFont(new Font("Tahoma", Font.BOLD, 12));
                  lblNewLabel_67.setBounds(575, 33, 46, 14);
                  panelthongke.add(lblNewLabel_67);
                  
                  lblNewLabel_68 = new JLabel("Xe máy");
                  lblNewLabel_68.setForeground(new Color(255, 128, 0));
                  lblNewLabel_68.setFont(new Font("Tahoma", Font.BOLD, 12));
                  lblNewLabel_68.setBounds(575, 70, 46, 14);
                  panelthongke.add(lblNewLabel_68);
                  
                  lblNewLabel_69 = new JLabel("Xe máy");
                  lblNewLabel_69.setForeground(new Color(255, 128, 0));
                  lblNewLabel_69.setFont(new Font("Tahoma", Font.BOLD, 12));
                  lblNewLabel_69.setBounds(575, 105, 46, 14);
                  panelthongke.add(lblNewLabel_69);
                  
                  lblNewLabel_70 = new JLabel("Xe máy");
                  lblNewLabel_70.setForeground(new Color(255, 128, 0));
                  lblNewLabel_70.setFont(new Font("Tahoma", Font.BOLD, 12));
                  lblNewLabel_70.setBounds(575, 143, 46, 14);
                  panelthongke.add(lblNewLabel_70);
                  
                  lblNewLabel_71 = new JLabel("Xe máy");
                  lblNewLabel_71.setForeground(new Color(255, 128, 0));
                  lblNewLabel_71.setFont(new Font("Tahoma", Font.BOLD, 12));
                  lblNewLabel_71.setBounds(575, 178, 46, 14);
                  panelthongke.add(lblNewLabel_71);
                  
                  lblNewLabel_72 = new JLabel("Xe máy");
                  lblNewLabel_72.setForeground(new Color(255, 128, 0));
                  lblNewLabel_72.setFont(new Font("Tahoma", Font.BOLD, 12));
                  lblNewLabel_72.setBounds(575, 210, 46, 14);
                  panelthongke.add(lblNewLabel_72);
                  
                  lblNewLabel_73 = new JLabel("New label");
                  lblNewLabel_73.setForeground(new Color(255, 128, 0));
                  lblNewLabel_73.setFont(new Font("Tahoma", Font.BOLD, 12));
                  lblNewLabel_73.setBounds(442, 33, 80, 14);
                  panelthongke.add(lblNewLabel_73);
                  
                  lblNewLabel_74 = new JLabel("New label");
                  lblNewLabel_74.setForeground(new Color(255, 128, 0));
                  lblNewLabel_74.setFont(new Font("Tahoma", Font.BOLD, 12));
                  lblNewLabel_74.setBounds(442, 70, 80, 14);
                  panelthongke.add(lblNewLabel_74);
                  
                  lblNewLabel_75 = new JLabel("New label");
                  lblNewLabel_75.setForeground(new Color(255, 128, 0));
                  lblNewLabel_75.setFont(new Font("Tahoma", Font.BOLD, 12));
                  lblNewLabel_75.setBounds(442, 105, 80, 14);
                  panelthongke.add(lblNewLabel_75);
                  
                  lblNewLabel_76 = new JLabel("New label");
                  lblNewLabel_76.setForeground(new Color(255, 128, 0));
                  lblNewLabel_76.setFont(new Font("Tahoma", Font.BOLD, 12));
                  lblNewLabel_76.setBounds(442, 143, 123, 14);
                  panelthongke.add(lblNewLabel_76);
                  
                  lblNewLabel_77 = new JLabel("New label");
                  lblNewLabel_77.setForeground(new Color(255, 128, 0));
                  lblNewLabel_77.setFont(new Font("Tahoma", Font.BOLD, 12));
                  lblNewLabel_77.setBounds(442, 178, 123, 14);
                  panelthongke.add(lblNewLabel_77);
                  
                  lblNewLabel_78 = new JLabel("New label");
                  lblNewLabel_78.setForeground(new Color(255, 128, 0));
                  lblNewLabel_78.setFont(new Font("Tahoma", Font.BOLD, 12));
                  lblNewLabel_78.setBounds(442, 210, 123, 14);
                  panelthongke.add(lblNewLabel_78);
                  
                  lblNewLabel_79 = new JLabel("New label");
                  lblNewLabel_79.setForeground(new Color(255, 128, 0));
                  lblNewLabel_79.setFont(new Font("Tahoma", Font.BOLD, 12));
                  lblNewLabel_79.setBounds(644, 33, 80, 14);
                  panelthongke.add(lblNewLabel_79);
                  
                  lblNewLabel_80 = new JLabel("New label");
                  lblNewLabel_80.setForeground(new Color(255, 128, 0));
                  lblNewLabel_80.setFont(new Font("Tahoma", Font.BOLD, 12));
                  lblNewLabel_80.setBounds(644, 70, 80, 14);
                  panelthongke.add(lblNewLabel_80);
                  
                  lblNewLabel_81 = new JLabel("New label");
                  lblNewLabel_81.setForeground(new Color(255, 128, 0));
                  lblNewLabel_81.setFont(new Font("Tahoma", Font.BOLD, 12));
                  lblNewLabel_81.setBounds(644, 105, 80, 14);
                  panelthongke.add(lblNewLabel_81);
                  
                  lblNewLabel_82 = new JLabel("New label");
                  lblNewLabel_82.setForeground(new Color(255, 128, 0));
                  lblNewLabel_82.setFont(new Font("Tahoma", Font.BOLD, 12));
                  lblNewLabel_82.setBounds(644, 143, 115, 14);
                  panelthongke.add(lblNewLabel_82);
                  
                  lblNewLabel_83 = new JLabel("New label");
                  lblNewLabel_83.setForeground(new Color(255, 128, 0));
                  lblNewLabel_83.setFont(new Font("Tahoma", Font.BOLD, 12));
                  lblNewLabel_83.setBounds(644, 178, 128, 14);
                  panelthongke.add(lblNewLabel_83);
                  
                  lblNewLabel_84 = new JLabel("New label");
                  lblNewLabel_84.setForeground(new Color(255, 128, 0));
                  lblNewLabel_84.setFont(new Font("Tahoma", Font.BOLD, 12));
                  lblNewLabel_84.setBounds(644, 210, 128, 14);
                  panelthongke.add(lblNewLabel_84);
                  
                  
                  
                  vitri.showVitri();
                  ve.showve();
                       sqlnvHandler.showNhanVien();
                       sqluser.showduleuser();
                       doxe.showdulieudoxe();
                       thongke.showdulieu();
                       xeuser();
                       tien.showVitri();
                       tableuser.setShowGrid(false);
                       tableve.setShowGrid(false);
                       tablenv.setShowGrid(false);
                       tabledoxe.setShowGrid(false);
                       table_1.setShowGrid(false);
                       
             UIManager.put("Table.alternateRowColor", new Color(240, 240, 240)); 
             UIManager.put("Table.background", Color.WHITE);
           Vitri();
           vitriday();
           vitritrong();
           vitrioto();
           vitrixemay();
           xemaytrong();
           ototrong();
           otoday();
           xemayday();
           thongke();
           tongve();
    }
    public void tongve()
    {
    	int a=0;
    int text=tableve.getRowCount();
    lblNewLabel_37.setText(text+"");
    for(int i=0;i<text;i++)
    {
    	Object data=tableve.getValueAt(i, 2);
    	if(data.equals(""))
    	{
    		a++;
    	}
    }
    lblNewLabel_39.setText(a+"");
    }
}
