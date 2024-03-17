// Omer Ahmer, ID 2014063

package module6;

public class OnlineCourse extends Course {
	private String meetingType;
	private int meetingDuration;
	private int maxStudents;
	
	public OnlineCourse(String courseName, String instructorName, String meetingType, int meetingDuration, int maxStudents) {
		super(courseName, instructorName);
		this.meetingDuration = meetingDuration;
		this.meetingType = meetingType;
		this.maxStudents = maxStudents;
	}
	
	public void setDuration(int duration) {
		this.meetingDuration = duration;
	}
	
	public int getDuration() {
		return meetingDuration;
	}
	
	public String getMeetingType() {
		return meetingType;
	}
	
	public int getMaxStudents() {
		return maxStudents;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println(meetingType + " course meets for " + meetingDuration + " minutes with a maximum of " + maxStudents + " students");
	}
	
}

