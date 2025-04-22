package GUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class AccountForm extends JFrame{
	private DefaultTableModel modelAccount;
	private Object[][] dataAccount;
	private myCombobox<String> cbbPhongBan;
	private static String [] columnName = {"STT", "Nhân viên", "Quyền"};
	public AccountForm () {
		modelAccount = new DefaultTableModel(dataAccount, columnName) {
		public boolean isCellEditable (int row, int comlumn) {
			return false;
		}
	};
	init();
}
public void init () {
	this.setLayout(null);
	JPanel panelFeature = new JPanel();
	panelFeature.setBounds(10, 10, 1000, 46);
	panelFeature.setBackground(Color.white);
	this.add(panelFeature);
	panelFeature.setLayout(null);
	
	JLabel titlelabel = new JLabel("TÀI KHOẢN VÀ PHÂN QUYỀN");
	titlelabel.setForeground(new Color(0, 0, 0, 140));
	titlelabel.setFont(new Font("arial", 0, 14));
	titlelabel.setBounds(10,10,250,25);
	panelFeature.add(titlelabel);
	
	JPanel panelTaiKhoan = new JPanel();
	panelTaiKhoan.setLayout(null);
	panelTaiKhoan.setBackground(Color.white);
	panelTaiKhoan.setBounds(10, 66, 430, 634);
	this.add(panelTaiKhoan);
	
	JLabel titleLabelTaiKhoan = new JLabel("Tài khoản người dùng");
	titleLabelTaiKhoan.setForeground(new Color (0,0,0,140));
	titleLabelTaiKhoan.setFont(new Font("arial", 0, 15));
	titleLabelTaiKhoan.setForeground(new Color(0,0,0,200));
	titleLabelTaiKhoan.setBounds(190,20,220,26);
	panelTaiKhoan.add(titleLabelTaiKhoan);
	
	cbbPhongBan = new myCombobox<String>();
	cbbPhongBan.setModel(new DefaultComboBoxModel<>(cbbPhongString));
	cbbPhongBan.setForeground(new Color (0,0,0,140));
	cbbPhongBan.setForeground(new Color(0,0,0,200));
	cbbPhongBan.setBounds(190,10,220,26);
	panelTaiKhoan.add(cbbPhongBan);
	((myCombobox<String>)cbbPhongBan).showArrow();
	
	scrollPane = new JScrollPane();
	scrollPane.setBackground(Color.white);
	scrollPane.setVerticalScrollBar(new myScrollBar());
	scrollPane.setBorder(new EmptyBorder(0,0,0,0));
	scrollPane.setBounds(10, 50, 400, 420);
	panelTaiKhoan.add(scrollPane);
	
	tableAccount = new myTable();
	tableAccount.setRowHeight(40);
	tableAccount.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() { // Dùng setDefaultRenderer(Object.class, ...) để áp dụng renderer này cho mọi ô (cell) có kiểu object trong bảng
		public Component getTableCellRendererComponent(JTable jtable, Object o, boolean selected, boolean bln1, int i, int i1) { // Dùng setDefaultRenderer(Object.class, ...)
			 Color selectedColor = Color.decode("#2980b9"); // màu chữ khi chọn
			 Color backgroundSelected = new Color(245,245,245); // màu nền khi chọn

			 String str = (String)o;
     		 str = "  "+str; // thêm khoảng trắng đầu dòng để căn lề trái đẹp hơn
     		 o = (Object)str;
     		 
     		Component com = super.getTableCellRendererComponent(jtable, o, selected, bln1, i, i1); //Dùng super.getTableCellRendererComponent() để giữ các hành vi mặc định (kiểu font, căn giữa,...), rồi chỉnh lại theo ý mình.
            setBorder(noFocusBorder);
            if (selected) {
            	com.setBackground(backgroundSelected);
            	com.setFont(new Font("Arial",Font.PLAIN,13));
                com.setForeground(selectedColor);
            } else {
            	com.setBackground(Color.WHITE);
            	com.setFont(new Font("Arial",Font.PLAIN,13));
                com.setForeground(new Color(102, 102, 102));
            }
            return com; // Trả về component đã chỉnh sửa để nó được hiển thị trên giao diện.
		 }
	});
	
	scrollPane.setViewportView(tableAccount); // Gán tableAccount vào bên trong scrollPanel
	tableAccount.setModel(modelAccount); // Gán dữ liệu (Model) cho bảng tableAccount
	
	JPanel panelChiTietTaiKhoan = new JPanel();
	panelChiTietTaiKhoan.setBounds(10, 480, 400, 145);
	panelChiTietTaiKhoan.setBorder(new LineBorder(new Color(0,0,0,40), 2));
	panelChiTietTaiKhoan.setLayout(null);
	panelChiTietTaiKhoan.setBackground(Color.white);
	panelTaiKhoan.add(panelChiTietTaiKhoan);
	JLabel titelLabelTaikhoan2 = new JLabel("Chi tiết tài khoản");
	titelLabelTaikhoan2.setForeground(new Color(0,0,0,140)); // chữ màu xám mờ
	titelLabelTaikhoan2.setFont(new Font("arial", 0, 15));
	titelLabelTaikhoan2.setBounds(10, 10, 166, 25);
	panelChiTietTaiKhoan.add(titelLabelTaikhoan2);
	
	chiTietTaiKhoan = new JLabel("001 - Nguyễn Văn A");
	chiTietTaiKhoan.setForeground(new Color(0,0,0,140));
	chiTietTaiKhoan.setFont(new Font("arial", 0, 14));
	chiTietTaiKhoan.setBounds(10,50,240,25);
	panelChiTietTaiKhoan.add(chiTietTaiKhoan);
	
	JLabel titelLabelTaikhoan4 = new JLabel("Quyền tài khoản");
	titelLabelTaikhoan4.setForeground(new Color(0,0,0,140));
	titelLabelTaikhoan4.setFont(new Font("arial", 0, 14));
	titelLabelTaikhoan4.setBounds(10,90,166,25);
	panelChiTietTaiKhoan.add(titelLabelTaikhoan4);
	
	cbbQuyen = new myCombobox<String>();
	cbbQuyen.setForeground(new Color(0,0,0,140));
	cbbQuyen.setFont(new Font("arial", 1, 13));
	cbbQuyen.setBounds(150,90,140,25);
	cbbQuyen.setFocusable(false);
	cbbQuyen.setMaximumRowCount(2);
	panelChiTietTaiKhoan.add(cbbQuyen);
	
	btnLuuQuyen = new Button();
	btnLuuQuyen.setIcon(new ImageIcon(getClass().getResource("/assets/img/department_img/department_add_save.png")));
	btnLuuQuyen.setText("Lưu");
	btnLuuQuyen.setFont(new Font("Arial",1,12));
	btnLuuQuyen.setForeground(Color.white);
	btnLuuQuyen.setBackground(Color.decode("#44bd32"));
	btnLuuQuyen.setBounds(295,88,90,35);
	panelChiTietTaiKhoan.add(btnLuuQuyen);
	btnLuuQuyen.setFocusable(false);
	
}
	public static void main(String[] args) {
		new AccountForm();
	}
}
