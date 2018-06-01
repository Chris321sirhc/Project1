import java.util.ArrayList;
import java.util.List;

public class MVCParty {

	// List<PartyModel>

	public static void main(String[] args) {
		// List of Events
		List<Event> events = new ArrayList<Event>();

		events.add(new Event());
		events.add(new Event());
		events.add(new Event());

		PartyView view = new PartyView();

		PartyController controller = new PartyController(events, view);

		view.setVisible(true);
	}

}
