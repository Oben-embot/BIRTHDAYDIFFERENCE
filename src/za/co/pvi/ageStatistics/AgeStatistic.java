package za.co.pvi.ageStatistics;

public class AgeStatistic {

	public AgeStatistic() {
	}

	private long day;
	private long month;
	private long year;
	private long week;

	public long getDay() {
		return day;
	}

	public void setDay(long day) {
		this.day = day;
	}

	public long getMonth() {
		return month;
	}

	public void setMonth(long month) {
		this.month = month;
	}

	public long getYear() {
		return year;
	}

	public void setYear(long year) {
		this.year = year;
	}

	public long getWeek() {
		return week;
	}

	public void setWeek(long week) {
		this.week = week;
	}

	@Override
	public String toString() {
		return "AgeStatistic [day: " + day + ", month: " + month + ", year: " + year + ", week: " + week + "]";
	}

}
