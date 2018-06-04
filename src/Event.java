import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Chris Model Object Event hast title, date, address
 * 
 */
public class Event {

	private String title;
	private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd 'at' HH:mm");
	private Date date;
	private String address;

	/**
	 * creates standard event
	 */
	public Event() {
		this.title = "Awesome Event";
		this.date = new Date();
		this.address = "Awesome Street 8";
	}

	/**
	 * creates Event with Strings title, date, address from user input
	 * 
	 * @param title
	 * @param date
	 * @param address
	 */
	public Event(String title, String date, String address) {
		this.title = title;

		try {
			this.date = dateFormat.parse(date);
		} catch (ParseException pe) {
			System.out.println("Invalid date format");
		}

		this.address = address;
	}

	/**
	 * @return title of Event
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return date of Event
	 */
	public String getStringDate() {
		return dateFormat.format(date);
	}

	/**
	 * @return address of Event
	 */
	public String getAddress() {
		return address;
	}

	public String toString() {
		return title + " | " + this.getStringDate() + " | " + address;
	}
}
