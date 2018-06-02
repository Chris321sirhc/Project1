package party;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;

public class MVCParty {

	public static void main(String[] args) {
		// create the party model (events)
		List<Event> events = new ArrayList<Event>();
		// load the events from a csv
		events = loadEvents("events.csv");
		// create the party view (gui)
		PartyView view = new PartyView();
		// create the party controller
		PartyController controller = new PartyController(events, view);
		// ? not sure why this needs to be set
		view.setVisible(true);
	}

	private static List<Event> loadEvents(String fileName) {
		// create a list of events
		List<Event> events = new ArrayList<Event>();
		// create a scanner object to read a csv line by line
		try (Scanner reader = new Scanner(new File(fileName))) {
			// set the delimiter to be used for the scanner
			reader.useDelimiter(";");
			while(reader.hasNextLine()){
				// read each delimited term
				String title = reader.next();
				String address = reader.next();
				String date = reader.next();
				// create and add a new event to the event list
				events.add(new Event(title, address, date));
			}
			// close the reader once it is done with the file
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return events;
	}
}

