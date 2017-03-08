
public class tableRecordKeeper {
	String guestName;
	int Seats;
	float time;
	
	public tableRecordKeeper(String n, int s, float t){
		this.guestName = n;
		this.Seats = s;
		this.time = t;
	}
	
	public void printRecord(){
		System.out.println("Record Information");
		System.out.println("Guest Name : " + this.guestName);
		System.out.println("Seats booked : " + this.Seats);
		System.out.println("Time of booking : " + this.time);
	}
}
