import lejos.nxt.*;
public class LightSensorDrive{
  public static void main(String args[]){
    LightSensor luz = new LightSensor(SensorPort.S1);
    int b = 400;
    int x = 500;
    while(!Button.ESCAPE.isDown()){
      while(x < b){
        Motor.A.setSpeed(50);
        Motor.B.setSpeed(270);
        Motor.A.forward();
        Motor.B.forward();
        x = luz.getNormalizedLightValue();
        LCD.drawString(x+"CCC",0,0);
      }
      Motor.A.setSpeed(270);
      Motor.B.setSpeed(50);
      Motor.A.forward();
      Motor.B.forward();
      x = luz.getNormalizedLightValue();
      LCD.drawString(x+"CCC",0,0);
    }    
    Button.waitForAnyPress(); 
  }
}