package _04_hospital;

public class Patient {

	boolean carefor = false;
	
	public boolean feelsCaredFor() {
		return carefor;
	}
	
	public void checkPulse() {
		carefor = true;
	}
	
	
}
