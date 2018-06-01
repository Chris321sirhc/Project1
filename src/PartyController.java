import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class PartyController {

	private Event event;
	private PartyView theView;
	private List<Event> events = new ArrayList<Event>();

	public PartyController(List<Event> events, PartyView theView) {

		this.theView = theView;
		this.events = events;

		this.theView.addAddEventListener(new AddListener());
		this.theView.addAddRemoveListener(new RemoveListener());
		this.theView.addAddEditListener(new EditListener());

	}

	class AddListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {

			try {

			} catch (Exception e) {
				theView.displayErrorMessage("Bitte alle Felder ausfüllen");
			}
		}
	}

	class RemoveListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {

			try {

			} catch (Exception e) {
				theView.displayErrorMessage("Bitte alle Felder ausfüllen");
			}
		}
	}

	class EditListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {

			try {

			} catch (Exception e) {
				theView.displayErrorMessage("Bitte alle Felder ausfüllen");
			}
		}
	}
}
