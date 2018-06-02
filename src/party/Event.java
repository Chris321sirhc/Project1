package party;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Chris
 *
 */
public class Event {

	private String title;
	private String address;
	private Date date;
	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yy HH:mm");

	/**
	 * Class constructor
	 * @param title the title of the event
	 * @param address the address of the event
	 * @param date the date as a String dd.MM.yy 'at' HH:mm
	 */
	public Event(String title, String address, String date) {
		this.title = title;
		this.address = address;
		try {
			this.date = dateFormat.parse(date);
		} catch (ParseException pe) {
			System.out.println("Invalid date format");
		}
	}
	
	/**
	 * Default Class Constructor
	 */
	public Event() {
		this.title = "Karrierecafé mit Bosch - Ein Karriere Event exklusiv von Frauen für Frauen";
		this.address = "KIT-Campus Süd, Geb. 50.41 (AVG), Raum 145/146";
		this.date = new Date();
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the date as a String
	 */
	public String getStringDate() {
		return dateFormat.format(date);
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @return the event object as a String
	 */
	public String toString() {
		return title + " | " + this.getStringDate() + " | " + address;
	}
}
