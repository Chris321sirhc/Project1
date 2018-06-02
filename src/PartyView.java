import java.awt.Dimension;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class PartyView extends JFrame {

	private JButton addEvent;
	private JButton removeEvent;
	private JButton editEvent;
	private JButton exportEvents;
	private JFileChooser fileChooser;
	private JList<Event> eventList;
	private DefaultListModel<Event> listModel;

	PartyView() {
		this.addEvent = new JButton("Event hinzuf�gen");
		this.removeEvent = new JButton("Event entfernen");
		this.editEvent = new JButton("Event bearbeiten");
		this.exportEvents = new JButton("Events als .txt exportieren");

		// define the panel layout
		JPanel panel = new JPanel();
		panel.add(addEvent);
		panel.add(removeEvent);
		panel.add(editEvent);
		panel.add(exportEvents);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(800, 400);
		this.add(panel);
		this.setTitle("Party Kalender KIT");
		this.setLocationRelativeTo(null); // ?
		this.setVisible(true);

		// create the model and add elements
		listModel = new DefaultListModel<Event>();

		// create the list
		eventList = new JList<Event>(listModel);
		JScrollPane listScrollPane = new JScrollPane(eventList);
		listScrollPane.setPreferredSize(new Dimension(500, 300));
		panel.add(listScrollPane);

	}

	public void updateEventList(List<Event> events) {
		listModel.clear();
		for (Event event : events) {
			listModel.addElement(event);
		}
		// JOptionPane.showMessageDialog(this, "Updated Events");
	}

	public JButton getAddEvent() {
		return addEvent;
	}

	public JButton getRemoveEvent() {
		return removeEvent;
	}

	public JButton getEditEvent() {
		return editEvent;
	}

	public JButton getExportEvents() {
		return exportEvents;
	}

	public void setAddEvent(JButton addEvent) {
		this.addEvent = addEvent;
	}

	public void setRemoveEvent(JButton removeEvent) {
		this.removeEvent = removeEvent;
	}

	public void setEditEvent(JButton editEvent) {
		this.editEvent = editEvent;
	}

	public void setExportEvents(JButton exportEvents) {
		this.exportEvents = exportEvents;
	}

	//
	// void addAddEventListener(ActionListener listenerForAdd) {
	// addEvent.addActionListener(listenerForAdd);
	// }
	//
	// void addAddRemoveListener(ActionListener listenerForRemove) {
	// removeEvent.addActionListener(listenerForRemove);
	// }
	//
	// void addAddEditListener(ActionListener listenerForEdit) {
	// editEvent.addActionListener(listenerForEdit);
	// }
	//
	// void addExportListener(ActionListener listenerForExport) {
	// exportEvents.addActionListener(listenerForExport);
	// }
	//
	// void displayErrorMessage(String errorMessage) {
	// JOptionPane.showMessageDialog(this, errorMessage);
	// }

}