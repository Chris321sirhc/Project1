import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class EventDataGUI extends JFrame {
	// JPanel inputPanel;
	JButton okay;
	JTextField inputTitle = new JTextField(20);
	JTextField inputDate = new JTextField(14);
	JTextField inputAddress = new JTextField(14);
	JLabel title, date, address;
	// JFrame frame = new JFrame("Event hinzuf�gen");
	Font font = new Font("Comic Sans", Font.PLAIN, 20);

	public EventDataGUI() {
		Container c = this.getContentPane();
		SpringLayout layout = new SpringLayout();
		c.setLayout(layout);

		okay = new JButton("Speichern");
		okay.setFont(font);
		c.add(okay);

		title = new JLabel("Name der Veranstaltung");
		date = new JLabel("Datum");
		address = new JLabel("Adresse");
		// ? title.setSize(500, 100);
		// ? date.setSize(new Dimension(50, 10));
		inputTitle.setText("Event1");
		inputDate.setText("14.03.2019 12:00");
		inputAddress.setText("Venue1");
		title.setFont(font);
		date.setFont(font);
		address.setFont(font);
		inputTitle.setFont(font);
		inputDate.setFont(font);
		inputAddress.setFont(font);

		c.add(inputTitle);
		c.add(title);
		c.add(inputDate);
		c.add(date);
		c.add(inputAddress);
		c.add(address);

		// Titel
		// Adjust constraints for the title so it's at (5,5).
		layout.putConstraint(SpringLayout.WEST, title, 5, SpringLayout.WEST, c);
		layout.putConstraint(SpringLayout.NORTH, title, 5, SpringLayout.NORTH, c);
		// Adjust constraints for the text field so it's at
		// (<label's right edge> + 5, 5).
		layout.putConstraint(SpringLayout.WEST, inputTitle, 5, SpringLayout.EAST, title);
		layout.putConstraint(SpringLayout.NORTH, inputTitle, 5, SpringLayout.NORTH, c);

		// Datum
		// Adjust constraints for the date so it's at (5,5).
		layout.putConstraint(SpringLayout.WEST, date, 5, SpringLayout.WEST, c);
		layout.putConstraint(SpringLayout.NORTH, date, 50, SpringLayout.NORTH, c);
		// Adjust constraints for the text field so it's at
		// (<label's right edge> + 5, 5).
		layout.putConstraint(SpringLayout.WEST, inputDate, 5, SpringLayout.EAST, date);
		layout.putConstraint(SpringLayout.NORTH, inputDate, 50, SpringLayout.NORTH, c);

		// Adresse
		// Adjust constraints for the title so it's at (5,5).
		layout.putConstraint(SpringLayout.WEST, address, 5, SpringLayout.WEST, c);
		layout.putConstraint(SpringLayout.NORTH, address, 100, SpringLayout.NORTH, c);
		// Adjust constraints for the text field so it's at
		// (<label's right edge> + 5, 5).
		layout.putConstraint(SpringLayout.WEST, inputAddress, 5, SpringLayout.EAST, address);
		layout.putConstraint(SpringLayout.NORTH, inputAddress, 100, SpringLayout.NORTH, c);

		// Okay Button
		layout.putConstraint(SpringLayout.EAST, okay, -5, SpringLayout.EAST, c);
		layout.putConstraint(SpringLayout.SOUTH, okay, -5, SpringLayout.SOUTH, c);


		this.setVisible(false);
		this.pack();
		this.setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setMinimumSize(new Dimension(600, 200));
		this.setLocationRelativeTo(null);

	}
	
	public JTextField getInputTitle() {
		return inputTitle;
	}

	public JTextField getInputDate() {
		return inputDate;
	}

	public JTextField getInputAddress() {
		return inputAddress;
	}

	public JButton getOkay() {
		return okay;
	}

}
