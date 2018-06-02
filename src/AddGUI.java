import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class AddGUI extends JFrame {
	// JPanel inputPanel;
	JTextField inputTitle = new JTextField(14);
	JTextField inputDate = new JTextField(14);
	JTextField inputAddress = new JTextField(14);
	JLabel title, date, address;
	JFrame frame = new JFrame("Event hinzufügen");

	public AddGUI() {
		Container c = frame.getContentPane();
		SpringLayout layout = new SpringLayout();
		c.setLayout(layout);
		c.add(inputTitle);
		c.add(inputDate);

		title = new JLabel("Name der Veranstaltung");
		date = new JLabel("Datum");
		address = new JLabel("Adresse");

		layout.putConstraint(SpringLayout.WEST, inputTitle, 5, SpringLayout.WEST, c);

		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		frame.setSize(600, 200);
		frame.setLocationRelativeTo(null);

		// inputPanel = new JPanel();
		//
		//
		// inputPanel.add(title);
		// inputPanel.add(date);
		// inputPanel.add(address);
		// inputPanel.add(inputTitle);
		// inputPanel.add(inputDate);
		// inputPanel.add(inputAddress);
		//
		// inputTitle.setLocation(20, 80);

		// this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		// this.setVisible(true);
		// this.setSize(600, 200);
		// this.setLocationRelativeTo(null);
		// this.setTitle("Event hinzufügen");
		//
		// this.add();
	}
}
