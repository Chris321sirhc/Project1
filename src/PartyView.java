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
	private JButton removeEvent;
	private JButton editEvent;
	private JList<Event> eventList;
	
	PartyView() {
		this.addEvent = new JButton("Event hinzuf�gen");
		this.removeEvent = new JButton("Event entfernen");
		this.editEvent = new JButton("Event bearbeiten");
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

	void addAddEventListener(ActionListener listenerForAdd) {
		addEvent.addActionListener(listenerForAdd);
	}

	void addAddRemoveListener(ActionListener listenerForRemove) {
		removeEvent.addActionListener(listenerForRemove);
	}

	void addAddEditListener(ActionListener listenerForEdit) {
		editEvent.addActionListener(listenerForEdit);
	}

	void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}

}