package entity;

public class main2{

	public static void main(String[] args) {
		// TODO Auto-generated method stu
			
			ConcreteSubject s11 = new ConcreteSubject();
			ConcreteObserver o1 = new ConcreteObserver(s11, "小红","关于五一放假的消息");
			ConcreteObserver o2 = new ConcreteObserver(s11, "小张","关于五一放假的消息");
			ConcreteObserver o3 = new ConcreteObserver(s11, "小王","关于五一放假的消息");
			s11.Attach(o1);
			s11.Attach(o2);
			s11.Attach(o3);
			s11.Notify();
//			o1.Update();

			s11.setSubState("关于期末考试的消息");

			s11.Detach(o1);

//			s11.Notify();

			System.out.print(s11.getSubState());
			}
			

	}

