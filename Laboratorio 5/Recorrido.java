import lejos.nxt.*;
import lejos.robotics.navigation.DifferentialPilot;
public class Recorrido{
	public static void main (String args[]){
		DifferentialPilot pilot = new DifferentialPilot(2.1f,4.4f,Motor.A,Motor.B,true);
		boolean x = true;
		pilot.setTravelSpeed(7);
		while (!Button.ESCAPE.isDown() && x){
			pilot.steer(50, 180);
			pilot.travel(0.5);
			pilot.steer(-50, -133);
			pilot.steer(-50, -65);
			x = false;
		}
	}
}