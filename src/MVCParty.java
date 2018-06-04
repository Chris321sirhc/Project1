import java.util.ArrayList;
import java.util.List;

/**
 * @author Chris
 * 
 */
public class MVCParty {

	// List<PartyModel>

	/**
	 * @param args
	 *            main method ArrayList with type Event is created and objects
	 *            of View and Controller instantiated
	 */
	public static void main(String[] args) {
		// list of events
		List<Event> events = new ArrayList<Event>();

		// dummy events
		events.add(new Event("Kaffetrinken", "20.04.2019 16:20", "Café Gute Laune"));
		events.add(new Event("Bierchen zischen", "15.03.2019 14:00", "AKK"));
		events.add(new Event("Shopping Tour", "21.06.2018 11:30", "Ettlinger Tor Center"));

		// creates Instance of view, displays GUI
		PartyView view = new PartyView();

		// creates new instance of Controller with arguments (List<Event>,
		// PartyView)
		PartyController controller = new PartyController(events, view);

	}

}
