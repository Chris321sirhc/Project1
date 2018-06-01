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
	private JList<Event> eventList;

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
		DefaultListModel<Event> listModel = new DefaultListModel<Event>();
		listModel.addElement(new Event());

		// create the list
		eventList = new JList<Event>(listModel);
		JScrollPane listScrollPane = new JScrollPane(eventList);
		listScrollPane.setPreferredSize(new Dimension(300, 300));
		panel.add(listScrollPane);

	}

	void addButtonListener(ActionListener listenerForButton) {
		addEvent.addActionListener(listenerForButton);
	}

	void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}

}