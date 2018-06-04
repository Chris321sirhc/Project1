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
		events.add(new Event());
		events.add(new Event());
		events.add(new Event());

		// creates Instance of view, displays GUI
		PartyView view = new PartyView();

		// creates new instance of Controller with arguments (List<Event>,
		// PartyView)
		PartyController controller = new PartyController(events, view);

	}

}
