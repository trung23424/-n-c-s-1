package GUI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

import javax.swing.table.TableCellEditor;
public class myTable extends JTable {
	public myTable() {
		 setShowHorizontalLines(true);//true hiển thị đường kẻ ngang giữa các dòng.
	     setShowVerticalLines(false);//false không hiển thị đường kẻ dọc giữa các cột.
	     setGridColor(new Color(235,235,235));// set màu đường viền cho bảng
	     setRowHeight(38);//Đặt chiều cao mỗi dòng là 38 pixel. Giúp hiển thị nội dung thoáng hơn.
	     getTableHeader().setReorderingAllowed(false);//false = Không cho người dùng kéo cột để thay đổi thứ tự.
	     getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
	    	 @Override
	            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
	                tableheader header = new tableheader(o + "");
	                return header;
	            }
	        }); 
	     setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
	        	
	            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean selected, boolean bln1, int i, int i1) {
	                	Component com = super.getTableCellRendererComponent(jtable, o, selected, bln1, i, i1);
	                    setBorder(noFocusBorder);
	                    if (selected) {
	                    	com.setBackground(new Color(235,235,235));
	                    	com.setFont(new Font("Arial",Font.PLAIN,13));
	                        com.setForeground(new Color(15, 89, 140));
	                        
	                    } else {
	                    	com.setBackground(Color.WHITE);
	                    	
	                    	com.setFont(new Font("Arial",Font.PLAIN,13));
	                        com.setForeground(new Color(102, 102, 102));
	                    }
	                   return com;
	                }
	            
	        });
	    }

		
	}
