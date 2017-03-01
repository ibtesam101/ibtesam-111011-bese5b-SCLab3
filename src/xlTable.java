
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

	public static void main(String[] args){
		xlTable t1 = new xlTable(10);
		
		System.out.println(t1.timeSlots);
		System.out.println(t1.bookxlTable(11, (float)12.5));
		System.out.println(t1.bookxlTable(10, (float)12.5));
		System.out.println(t1.bookxlTable(13, (float)15.5));
		System.out.println(t1.bookxlTable(15, (float)16.5));
		System.out.println(t1.bookxlTable((float)17.5, 20));
		System.out.println(t1.bookxlTable((float)18.5, 19));
		System.out.println(t1.bookxlTable(22, 24));
		System.out.println(t1.bookxlTable(14, 16));
		System.out.println(t1.bookxlTable(11, 13));
	}
}
