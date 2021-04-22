package entity.lmp;

import entity.lmp.Observer;

public interface Subject {
	void Attach(Observer obs);

	void Detach(Observer obs);

	void Notify();

}
