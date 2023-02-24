package ArrayEx;

public class DateOfBirth {
	int date;
	int month;
	int year;

	public DateOfBirth(int date, int month, int year) {
		super();
		this.date = date;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		return "DateOfBirth [date=" + date + ", month=" + month + ", year=" + year + "]";
	}

	
}
