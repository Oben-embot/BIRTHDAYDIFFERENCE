package za.co.pvi.people;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import za.co.pvi.ageStatistics.AgeStatistic;

public class Student extends Person {

	private AgeStatistic ageStatistic = new AgeStatistic();

	public AgeStatistic getAgeStatistic() {
		return ageStatistic;
	}

	public void setAgeStatistic(AgeStatistic ageStatistic) {
		this.ageStatistic = ageStatistic;
	}

	public Student() {

	}

	public void register(String surname, String firstName, String dateOfBirth, String idNumber, String gender) {

		this.setSurname(surname);
		this.setFirstName(firstName);
		this.setDateOfBirth(dateOfBirth);
		this.setIdNumber(idNumber);
		this.setGender(gender);

		long year = this.calculateYear(dateOfBirth);
		this.ageStatistic.setYear(year);

		long weeks = this.calculateWeeks(dateOfBirth);
		this.ageStatistic.setWeek(weeks);

		long days = this.calculateDays(dateOfBirth);
		this.ageStatistic.setDay(days);

		long months = this.calculateMonths(dateOfBirth);
		this.ageStatistic.setMonth(months);

		this.ageStatistic = ageStatistic;
	}

	private long calculateYear(String dateOfBirth) {

		LocalDate dob = LocalDate.parse(dateOfBirth);

		LocalDate todayDay = LocalDate.now();

		long years = todayDay.getYear() - dob.getYear();

		return years;
	}

	private long calculateWeeks(String dateOfBirth) {
		long year = calculateYear(dateOfBirth);
		long weeks = year * 53;
		return weeks;
	}

	private long calculateDays(String dateOfBirth) {
		long year = calculateYear(dateOfBirth);
		long days = year * 365;
		return days;

	}

	private long calculateMonths(String dateOfBirth) {
		long year = calculateYear(dateOfBirth);
		long months = year * 12;
		return months;
	}

	public void retrieve(long day, long month, long year, long week) {
		ageStatistic.setDay(day);
		ageStatistic.setMonth(month);
		ageStatistic.setYear(year);
		ageStatistic.setWeek(week);
	}

	Student highestYear;

	public void getHighestYear(List<Student> students) {
		long hY = 0;

		for (int i = 0; i < students.size(); i++) {
			if (hY < students.get(i).ageStatistic.getYear()) {
				highestYear = students.get(i);
				hY = highestYear.getAgeStatistic().getYear();
			}
		}
		System.out.println(highestYear);

	}

	@Override
	public String toString() {
		return "Student [\nageStatistic: " + ageStatistic + "]";
		//return "Student [\nageStatistic: " + ageStatistic + super.toString() + "]";

	}

}
