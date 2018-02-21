/**
 *   Converts from Fahrenheit for Celsius
 */

public class F2C{
  public static void main(String[] args){
    double f = 100;
    // C = (F - 32) * 5.0 / 9.0
    double c;
    c = (f - 32)  * 5.0 / 9.0;
    System.out.println(c);
  }
}
