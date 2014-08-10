package sis.studentinfo;

public class Student {
	private String name;
	private int credits;
	static final int CREDITS_REQUIRED_FOR_FULL_TIME = 12;
	static final String IN_STATE = "CO";
	private String state = "";

	public Student(final String name) {
		this.name = name;
		credits = 0;
	}

	public String getName() {
		return this.name;
	}

	int getCredits() {
		return credits;
	}

	void addCredits(int credits) {
		this.credits += credits;
	}

	boolean isFullTime() {
		return credits >= CREDITS_REQUIRED_FOR_FULL_TIME;
	}

	void setState(String state) {
		this.state = state.toUpperCase();
	}

	boolean isInState() {
		return state.equals(Student.IN_STATE);
	}
}
