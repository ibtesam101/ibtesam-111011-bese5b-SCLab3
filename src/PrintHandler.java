import java.util.ArrayList;
import java.util.List;

public class PrintHandler {
	List<Restaurant> restaurantDays;
	List<tableRecordKeeper> recordList;
	
	public PrintHandler(){
		this.restaurantDays = new ArrayList<Restaurant>();
		this.recordList = new ArrayList<tableRecordKeeper>();
		
		for(int i=0; i<31; i++){
			restaurantDays.add(new Restaurant());
		}
	}
	
	public void populate(){
		for(int i=0; i<restaurantDays.size(); i++){
			restaurantDays.get(i).reserve(3, 12, "Person"+i);
			recordList.add(new tableRecordKeeper("Person"+i, 3, (float)12));
		}
	}
	
	public void printAll(){
		for(int i=0; i<recordList.size(); i++){
			recordList.get(i).printRecord();
		}
	}
	
	public static void main(String[] args){
		PrintHandler printHandler = new PrintHandler();
		
		printHandler.populate();
		
		printHandler.printAll();
	}
	
}
