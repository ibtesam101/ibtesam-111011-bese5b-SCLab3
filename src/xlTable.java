
public class xlTable extends Table{

	int bookEndTime;
	
	public xlTable(int num) {
		super(num);
	}
	
	public boolean bookxlTable(float timeStart, float timeEnd){
		boolean book = false;
		for(int i=0; i<timeSlots.size(); i++){
			if(timeStart == timeSlots.get(i)){
				book = bookable(i, getEndIndex(timeEnd), timeStart, timeEnd);
				break;
			}
		}
		return book;
	}

	private int getEndIndex(float timeEnd) {
		int index = 0;
		for(int i=0; i<timeSlots.size(); i++){
			if(timeEnd == timeSlots.get(i)){
				index = i;
				break;
			}
		}
		
		return index;
	}

}
