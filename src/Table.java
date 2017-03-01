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
	
	public boolean bookTable(float time){
		boolean book = false;
		for(int i=0; i<timeSlots.size(); i++){
			if(time == timeSlots.get(i)){
				book = bookable(i, i+8, time, time+2);
				break;
			}
		}
		return book;
	}
	
	public boolean bookable(int startIndex, int endIndex, float stTime, float endTime){
		boolean bookable = false;
		float t = stTime;
		
		for(int i = startIndex; i < timeSlots.size(); i++){
			if(!(t==timeSlots.get(i))){
				bookable = false;
				break;
			}
			
			else{
				if(t==endTime){
					bookable = true;
					break;
				}
			}
			t+=0.25;
		}
		
		if(bookable){
			for(int i=startIndex; i<endIndex; i++)
				timeSlots.remove(startIndex);
		}
		
		return bookable;
	}
	
	public static void main(String[] args){
		Table t1 = new Table(10);
		
		System.out.println(t1.timeSlots);
		System.out.println(t1.bookTable(11));
		System.out.println(t1.bookTable(10));
		System.out.println(t1.bookTable(13));
		System.out.println(t1.bookTable(15));
		System.out.println(t1.bookTable((float)17.5));
		System.out.println(t1.bookTable((float)18.5));
		System.out.println(t1.bookTable(22));
		System.out.println(t1.bookTable(14));
		System.out.println(t1.bookTable(11));
	}
	
}