package party;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class PartyController {

	private Event event;
	private PartyView view;
	private List<Event> events = new ArrayList<Event>();

	public PartyController(List<Event> events, PartyView view) {
		this.view = view;
		this.events = events;
		this.view.loadEvents(events);
		this.view.addAddEventListener(new AddListener());
		this.view.addAddRemoveListener(new RemoveListener());
		this.view.addAddEditListener(new EditListener());
	}

	class AddListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {

			try {

			} catch (Exception e) {
				view.displayErrorMessage("Bitte alle Felder ausf�llen");
			}
		}
	}

	class RemoveListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {

			try {

			} catch (Exception e) {
				view.displayErrorMessage("Bitte alle Felder ausf�llen");
			}
		}
	}

	class EditListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {

			try {

			} catch (Exception e) {
				view.displayErrorMessage("Bitte alle Felder ausf�llen");
			}
		}
	}
}
