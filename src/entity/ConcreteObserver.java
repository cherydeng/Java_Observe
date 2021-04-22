package entity;

import entity.lmp.Observer;


public class  ConcreteObserver implements Observer {
    private String name;
    private ConcreteSubject sub;
    private String subState;
    
    
    public String getName(){
    	return name;
    }
    public void SetName(String Name){
    	this.name = Name;
    }
    public String getSubState(){
    	return subState;
    }
    public void setSubState(String SubState){
    	this.subState = SubState;
    }
    
    public ConcreteSubject getSub(){
    	return sub;
    }
    public void setSub(ConcreteSubject Sub){
    	this.sub = Sub;
    }
    public ConcreteObserver(ConcreteSubject s1,String v_name,String SubState){
    	sub = s1;
        name = v_name;
        subState = SubState;
    }
    public void Update()
    {
        System.out.println("新消息来了");
        System.out.println("观察者"+getName());
        System.out.println(getSubState());

    }
	

}
