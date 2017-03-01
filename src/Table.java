import java.util.ArrayList;
import java.util.List;

public class Table {

	int numOfSeats;
	
	int bookStartTime;
	
	List<Float> timeSlots;
	
	public Table(int num){
		this.numOfSeats = num;
		this.timeSlots = new ArrayList<Float>();
		
		for(float i = 11; i<23; i++){
			timeSlots.add(i);
			timeSlots.add((float)(i+0.25));
			timeSlots.add((float)(i+0.5));
			timeSlots.add((float)(i+0.75));
		}
		
	}
	
	public void bookTable(int time){
		this.bookStartTime = time;
	}
	
	
	public static void main(String[] args){
		Table t1 = new Table(10);
		
		System.out.println(t1.timeSlots);
	}
	
}