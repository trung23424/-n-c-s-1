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
	
}
	public static void main(String[] args) {
		new AccountForm();
	}
}
