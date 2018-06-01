import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Chris
 *
 */
public class Event {

	private String title;
	private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd 'at' HH:mm");
	private Date date;
	private String address;

	public Event() {
		this.title = "awesomeEvent2";
		this.date = new Date();
		this.address = "Kapellenstraße 8";
	}

	public Event(String title, String date, String address) {
		this.title = title;

		try {
			this.date = dateFormat.parse(date);
		} catch (ParseException pe) {
			System.out.println("Invalid date format");
		}

		this.address = address;
	}

	public String getTitle() {
		return title;
	}

	public String getStringDate() {
		return dateFormat.format(date);
	}

	public String getAddress() {
		return address;
	}

	public String toString() {
		return title + " | " + this.getStringDate() + " | " + address;
	}
}
