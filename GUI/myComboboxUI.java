package GUI;

import javax.swing.JComboBox;
import javax.swing.plaf.ComboBoxUI;

public class myComboboxUI extends ComboBoxUI {

	@Override
	public void setPopupVisible(JComboBox<?> c, boolean v) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isPopupVisible(JComboBox<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFocusTraversable(JComboBox<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

}
