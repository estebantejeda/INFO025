import lejos.nxt.*;
public class SensorsTest {
	public static void main (String[] args) {
		while (!Button.ESCAPE.isDown()){
	     		LightSensor lght = new LightSensor(SensorPort.S3);
			SoundSensor sound = new SoundSensor(SensorPort.S2);
			UltrasonicSensor dst = new UltrasonicSensor(SensorPort.S4);
	     		int x = lght.getLightValue();
			int y = sound.readValue();
			int z = dst.getDistance();
             		System.out.println("Luminosidad: "+x);
			System.out.println("Sonido: "+y);
			System.out.println("Distancia: "+z);
		}
	}
}