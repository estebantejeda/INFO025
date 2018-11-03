import lejos.nxt.*;
import lejos.robotics.navigation.DifferentialPilot;
public class Espiral{
	public static void main (String args[]){
		DifferentialPilot pilot = new DifferentialPilot(2.1f,4.4f,Motor.A,Motor.B,true);
		UltrasonicSensor ultra = new UltrasonicSensor(SensorPort.S4);
		int x = 0;
		int y = 100;
		int z = 5;
		boolean a = true;
		while (!Button.ESCAPE.isDown() && a){
			x = ultra.getDistance();
			if(x>=40){
				pilot.setTravelSpeed(z);
				pilot.steer(y,-180);
				pilot.steer(y-5,-180);
				y-=10;
				z+=1;
			}
			else{
				a = false;
			}
		}
	}
}