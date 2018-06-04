import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Chris controller class
 */
public class PartyController {

	private Event event;
	private PartyView view;
	private List<Event> events = new ArrayList<Event>();

	/**
	 * receives event list and view from main and updates the GUI to match the
	 * events adds 4 ButtonListeners and links them to the respective methods
	 * 
	 * @param events
	 * @param theView
	 */
	public PartyController(List<Event> events, PartyView theView) {

		this.events = events;
		this.view = theView;

		// assigns list of events to the View class to be displayed in JList GUI
		this.view.updateEventList(events);

		// access buttons of View interface PartyView and assigns them
		// ActionListeners that trigger methods
		view.getExportEvents().addActionListener(e -> exportEvents("events.txt"));
		view.getRemoveEvent().addActionListener(e -> removeEvent());
		view.getEditEvent().addActionListener(e -> editEvent());
		view.getAddEvent().addActionListener(e -> addEvent());

	}

	/**
	 * @param fileName
	 *            exports all existing Events in events-List<Event> to
	 *            "events.txt" in the workspace directory
	 */
	public void exportEvents(String fileName) {

		try {
			File listOfEvents = new File(fileName);
			PrintWriter exporter = new PrintWriter(new BufferedWriter(new FileWriter(listOfEvents)));

			for (Event event : events) {
				exporter.println(event.toString());
			}
			exporter.close();
		} catch (Exception e) {
			System.out.println("error fileName"); // ?
		}

	}

	/**
	 * removes the selected list entry from the list and then updates the list
	 */
	public void removeEvent() {
		events.remove(view.getEventList().getSelectedIndex());
		view.updateEventList(events);

	}

	/**
	 * method opens new GUI AddGUI and uses input to create a new event of the
	 * class Event updates events afterwards
	 */
	public void addEvent() {
		EventDataGUI addEvent = new EventDataGUI();

		// if (addEvent.getOkay().isEnabled() == true) {
		// Event event = new
		// Event(addEvent.getInputTitle().getText().toString(),
		// addEvent.getInputDate().getText().toString(),
		// addEvent.getInputAddress().getText().toString());
		Event event1 = new Event(addEvent.inputTitle.getText(), addEvent.inputDate.getText(),
				addEvent.inputAddress.getText());
		events.add(event);
		// }
		// if (!addEvent.getOkay().isEnabled() == true) {
		// }
		view.updateEventList(events);
	}

	/**
	 * edits an existing event
	 */
	public void editEvent() {

	}
}
