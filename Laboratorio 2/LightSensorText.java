import lejos.nxt.*;
public class LightSensorText{
  public static void main (String args[]){
    int cont = 0;
    int aux = 0;
    while(!Button.ESCAPE.isDown()){
      cont++;
      LightSensor luz = new LightSensor(SensorPort.S3);
      int a = luz.getNormalizedLightValue();
      aux = a+aux;
      System.out.println(a);
    }
    aux=aux/cont;
    LCD.clear(); 
    Button.waitForAnyPress();
    LCD.drawString("promedio "+aux,0,0);
    Button.waitForAnyPress(); 
  }   
}