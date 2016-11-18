package HasARel;

public class Car {
	Engine e = new Engine();
	Doors d= new Doors();
	Windows w= new Windows();
	Steering st= new Steering();
	public void MoveCarStraight(){
		st.keepStraight();
	}
	public void turnCarRight(){
		st.turnRight();
	}
	public void turnCarLeft(){
		st.turnLeft();
	}
	public void startCar(){
		e.startEngine();
	}
	public void stopCar(){
		e.stopEngine();
	}
	
	public void closeCarFrontDoors(){
		d.closeFrontDoor();
	}
	public void closeCarRearDoors(){
		d.closeReartDoor();
	}	
	public void openCarFrontDoors(){
		d.openFrontDoor();
	}
	public void openCarReARtDoors(){
		d.openRearDoor();;
	}
	public void closeCarFrontWindow(){
		w.closeFronWindow();
	}
	public void closeCarRearWinidow(){
		w.closeReartWinow();
	}
	public void openCarFrontWindow(){
		w.openFrontWindow();
	}
	public void openCarRearWindow(){
		w.openRearWindow();
	}

}
