import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;
import java.io.File;


/**
 * @author Chris controller class
 */
public class PartyController {

	private Event event;
	private PartyView view;
	private List<Event> events = new ArrayList<Event>();
	private EventDataGUI viewEvent;
	private JFileChooser fileChooser;

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

		// sorts events by date
		this.events.sort(new DateComparator());

		// assigns list of events to the View class to be displayed in JList GUI
		this.view.updateEventList(events);

		// access buttons of View interface PartyView and assigns them
		// ActionListeners that trigger methods
		view.getExportEvents().addActionListener(e -> exportEvents());
		view.getRemoveEvent().addActionListener(e -> removeEvent());
		view.getEditEvent().addActionListener(e -> editEvent());
		view.getAddEvent().addActionListener(e -> addEvent());

		viewEvent = new EventDataGUI();
		viewEvent.setVisible(false);
		viewEvent.okay.addActionListener(e -> createEvent());

	}

	/**
	 *            exports all existing Events in events-List<Event> to
	 *            "events.txt" in the workspace directory
	 */
	
	public void exportEvents() {

			fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
			int returnValue = fileChooser.showSaveDialog(null);
			if(returnValue == JFileChooser.APPROVE_OPTION) {
				File selectedFile = fileChooser.getSelectedFile();
				try {
					PrintWriter exporter = new PrintWriter(new BufferedWriter(new FileWriter(selectedFile)));

					for (Event event : events) {
						exporter.println(event.toString());
					}
					exporter.close();
				} catch (Exception e) {
					System.out.println("error fileName"); 
				}
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
	 * method opens new GUI AddGUI
	 */
	public void addEvent() {

		viewEvent.setVisible(true);
				
	}

	/**
	 * method creates an event
	 */
	public void createEvent() {

		Event event = new Event(viewEvent.inputTitle.getText(), viewEvent.inputDate.getText(),
				viewEvent.inputAddress.getText());
		events.add(event);
		this.events.sort(new DateComparator());
		view.updateEventList(events);
		viewEvent.setVisible(false);
		
	}

	/**
	 * method edits an existing event
	 */
	public void editEvent() {
		viewEvent.setVisible(true);
		event = events.get(view.getEventList().getSelectedIndex());

		viewEvent.inputTitle.setText(event.getTitle());
		viewEvent.inputDate.setText(event.getStringDate());
		viewEvent.inputAddress.setText(event.getAddress());
		removeEvent();
	}
}
