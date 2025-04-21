package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JScrollBar;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class MyDesignScrollBar extends BasicScrollBarUI {
	private static final int SCROLL_BAR_ALPHA_ROLLOVER = 100; // Mức trong suốt khi rê chuột vào (100 = đậm hơn)
	private static final int SCROLL_BAR_ALPHA = 50; // Mức trong suốt bình thường (50 = hơi trong)
	private static final int THUMB_SIZE = 8; // Độ dày thanh trượt (cục đen kéo lên xuống)
	private static final Color THUMB_COLOR = Color.BLACK; // Màu của thanh trượt

	public MyDesignScrollBar() {

	}

	@Override
	protected JButton createDecreaseButton(int orientation) {
		return new InvisibleScrollBarButton(); //Ghi đè 2 nút cuộn (lên và xuống) thành nút "vô hình" 
	}

	@Override
	protected JButton createIncreaseButton(int orientation) {
		return new InvisibleScrollBarButton(); //Ghi đè 2 nút cuộn (lên và xuống) thành nút "vô hình" 
	}

	@Override
	protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {
	}
	
	 @Override
	protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
		 int alpha = isThumbRollover() ? SCROLL_BAR_ALPHA_ROLLOVER : SCROLL_BAR_ALPHA;
		 //isThumbRollover() kiểm tra xem chuột có đang di chuyển qua thumb không.
		 //SCROLL_BAR_ALPHA: mức trong suốt bình thường
		 //SCROLL_BAR_ALPHA_ROLLOVER: đậm hơn khi hover
	        int orientation = scrollbar.getOrientation();
	        int x = thumbBounds.x;
	        int y = thumbBounds.y;
	        int width = orientation == JScrollBar.VERTICAL ? THUMB_SIZE : thumbBounds.width; width = Math.max(width, THUMB_SIZE);
	        int height = orientation == JScrollBar.VERTICAL ? thumbBounds.height : THUMB_SIZE; height = Math.max(height, THUMB_SIZE);
	        Graphics2D g2 = (Graphics2D) g.create();
	        g2.setColor(new Color(0,0,0,70));//là màu đen có độ trong suốt alpha = 70 (rất nhẹ)
	        g2.fillRect(x, y, width, height);//vẽ một hình chữ nhật làm "cục trượt"
	        g2.dispose();//để dọn dẹp đối tượng Graphics2D sau khi vẽ
	}

	private static class InvisibleScrollBarButton extends JButton {
	        private InvisibleScrollBarButton() {
	            setOpaque(false);// Làm cho nền của button không tô màu (trong suốt).
	            setFocusable(false); // Không cho button này được focus bằng bàn phím hay tab.
	            setFocusPainted(false);// tắt hiệu ứng vẽ viền xanh khi được focus.
	            setBorderPainted(false);//Tắt việc vẽ viền cho nút.
	            setBorder(BorderFactory.createEmptyBorder());//Gán viền rỗng cho button — tức là không có padding hay khung nào bao quanh.
	        }
	    }

}
