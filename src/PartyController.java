import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PartyController {

	private Event event;
	private PartyView view;
	private List<Event> events = new ArrayList<Event>();

	public PartyController(List<Event> events, PartyView theView) {

		this.events = events;
		this.view = theView;
		this.view.updateEventList(events);
		// Zugriff auf Export Button aus PartyView und Zuweisung eines
		// ActionListeners; Aufruf der Methode exportEvents auf Klick
		view.getExportEvents().addActionListener(e -> exportEvents("events.txt"));
		view.getRemoveEvent().addActionListener(e -> removeEvent());
		view.getEditEvent().addActionListener(e -> editEvent());
		view.getAddEvent().addActionListener(e -> addEvent());
		// this.theView.addAddEventListener(new AddListener());
		// this.theView.addAddRemoveListener(new RemoveListener());
		// this.theView.addAddEditListener(new EditListener());
		// this.theView.addExportListener(new ExportListener());

	}

	public void exportEvents(String fileName) {

		try {
			File listOfEvents = new File(fileName);
			PrintWriter exporter = new PrintWriter(new BufferedWriter(new FileWriter(listOfEvents)));

			for (Event event : events) {
				exporter.println(event.toString());
			}
			exporter.close();
		} catch (Exception e) {
			System.out.println("error fileName");
		}

	}

	public void removeEvent() {

		view.updateEventList(events);

	}

	public void addEvent() {
		// events.add(event);
		Scanner scanner = new Scanner(System.in);
		AddGUI addEvent = new AddGUI();
	}

	public void editEvent() {

	}
}
