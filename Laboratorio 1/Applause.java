import lejos.nxt.*;
public class Applause {
	public static void main (String[] args) {
		SoundSensor sound = new SoundSensor(SensorPort.S2);
		int x = 0;
		boolean forward = true;
		boolean backward = false;
		while (!Button.ESCAPE.isDown()) {
			while (forward && !Button.ESCAPE.isDown() ) {
				x = sound.readValue();
				Motor.A.forward();
				Motor.B.forward();
				System.out.println("FORWARD");
				if (x > 60) {
					forward = false;
					backward = true;
				}
			}
			while (backward && !Button.ESCAPE.isDown()) {
				x = sound.readValue();
				Motor.A.backward();
				Motor.B.backward();
				System.out.println("BACKWARD");
				if (x > 60) {
					backward = false;
					forward = true;
				}
			}
		}
		Motor.B.stop();
	}
}