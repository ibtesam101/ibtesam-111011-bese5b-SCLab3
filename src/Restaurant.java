import java.util.List;
import java.util.ArrayList;

public class Restaurant {
	xlTable xltable;
	List<Table> ltableList;
	List<Table> mtableList;
	List<Table> stableList;
	
	public Restaurant(){
		xltable = new xlTable(12);
		ltableList = new ArrayList<Table>();
		mtableList = new ArrayList<Table>();
		stableList = new ArrayList<Table>();
		
		for(int i = 0; i < 3; i++){
			ltableList.add(new Table(6));
		}
		
		for(int i = 0; i < 8; i++){
			mtableList.add(new Table(4));
		}
		
		for(int i = 0; i < 4; i++){
			stableList.add(new Table(2));
		}
	}
	
	public boolean reserve(int seats, float time){
		boolean reserved = false;
		
		if(seats <= 2){
			for(int i=0; i < stableList.size(); i++){
				if(stableList.get(i).bookTable(time)){
					reserved = true;
					break;
				}
			}
		}
		
		if(seats <= 4 && !reserved){
			for(int i=0; i < mtableList.size(); i++){
				if(mtableList.get(i).bookTable(time)){
					reserved = true;
					break;
				}
			}
		}
		
		if(seats <= 6 && !reserved){
			for(int i=0; i < ltableList.size(); i++){
				if(ltableList.get(i).bookTable(time)){
					reserved = true;
					break;
				}
			}
		}
		
		return reserved;
	}
	
	public boolean reserveXL(float startTime, float endTime){
		boolean reserved = false;
		
		if(xltable.bookxlTable(startTime, endTime)){
			reserved = true;
		}
		
		return reserved;
	}
	
}
