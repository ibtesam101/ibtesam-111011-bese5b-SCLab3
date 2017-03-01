
public class xlTable extends Table{

	int bookEndTime;
	
	public xlTable(int num) {
		super(num);
	}
	
	public void bookxlTable(int timeStart, int timeEnd){
		this.bookStartTime = timeStart;
		this.bookEndTime = timeEnd;
	}

}
