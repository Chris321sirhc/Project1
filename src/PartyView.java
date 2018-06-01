import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class PartyView extends JFrame {

	private JButton addEvent;
	private JList<String> countryList;

	PartyView() {
		this.addEvent = new JButton("Event hinzufügen");

		// define the panel layout
		JPanel panel = new JPanel();
		panel.add(addEvent);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(800, 400);
		this.add(panel);
		this.setTitle("Party Kalender KIT");
		this.setLocationRelativeTo(null); // ?
		this.setVisible(true);

		// create the model and add elements
		DefaultListModel<String> listModel = new DefaultListModel<>();
		listModel.addElement("USA");
		listModel.addElement("India");
		listModel.addElement("Vietnam");
		listModel.addElement("Canada");
		listModel.addElement("Denmark");
		listModel.addElement("France");
		listModel.addElement("Great Britain");
		listModel.addElement("Japan");

		// create the list
		countryList = new JList<>(listModel);
		JScrollPane listScrollPane = new JScrollPane(countryList);
		listScrollPane.setPreferredSize(new Dimension(300, 300));
		panel.add(listScrollPane);
		// this.add(countryList);

	}

	void addButtonListener(ActionListener listenerForButton) {
		addEvent.addActionListener(listenerForButton);
	}

	void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}

}