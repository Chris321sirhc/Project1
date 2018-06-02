package party;

import java.awt.Dimension;
import java.awt.event.ActionListener;

import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class PartyView extends JFrame {

	// declare and create all ui elements
	private JPanel panel = new JPanel();
	private JButton addEvent = new JButton("Event hinzufügen");
	private JButton removeEvent = new JButton("Event entfernen");
	private JButton editEvent = new JButton("Event bearbeiten");
	private JList<Event> eventList;
	private DefaultListModel<Event> eventListModel = new DefaultListModel<Event>();

	PartyView() {
		// initialize the JFrame
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Party Kalender KIT");
		this.setSize(1200, 250);
		this.add(panel);
		this.setVisible(true);

		// add all ui elements to the panel
		panel.add(addEvent);
		panel.add(removeEvent);
		panel.add(editEvent);
	}

	/**
	 * @param events the events used to fill the JList with
	 */
	public void loadEvents(List<Event> events) {
		for (Event event : events) {
			eventListModel.addElement(event);
		}
		// create the ui list
		eventList = new JList<Event>(eventListModel);
		JScrollPane listScrollPane = new JScrollPane(eventList);
		listScrollPane.setPreferredSize(new Dimension(1100, 200));
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