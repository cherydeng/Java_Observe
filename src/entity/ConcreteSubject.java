package entity;
import entity.lmp.Observer;
import entity.lmp.Subject;

import java.util.ArrayList;
import java.util.*;
public class ConcreteSubject  implements Subject {
	private List<entity.lmp.Observer> obsers;
	private String subState;



	ConcreteSubject(){
		obsers = new ArrayList<entity.lmp.Observer>();
	}
	public String getSubState()
	{
		return subState;
	}
	public void setSubState(String SubState){
		this.subState = SubState;
	}
	
	public void Attach(entity.lmp.Observer o1){
		obsers.add(o1);
	}
	@Override
	public void Detach(entity.lmp.Observer o2) {
		// TODO Auto-generated method stub
		obsers.remove(o2);
	}
	@Override
	public void Notify() {
		for(Observer o : obsers){
			o.Update();
		} 
	}



}
