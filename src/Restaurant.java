import java.util.List;
import java.util.ArrayList;

public class Restaurant {
	xlTable xltable;
	List<Table> ltable;
	List<Table> mtable;
	List<Table> stable;
	
	public Restaurant(){
		xltable = new xlTable(12);
		ltable = new ArrayList<Table>();
		mtable = new ArrayList<Table>();
		stable = new ArrayList<Table>();
		
		for(int i = 0; i < 3; i++){
			ltable.add(new Table(6));
		}
		
		for(int i = 0; i < 8; i++){
			mtable.add(new Table(4));
		}
		
		for(int i = 0; i < 4; i++){
			stable.add(new Table(2));
		}
	}
	
	public boolean reserve(int seats, float time){
		boolean reserved = false;
		
		return reserved;
	}
	
}
