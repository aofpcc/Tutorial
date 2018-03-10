public class SolarSystemTest{
  public static void main(String[] args){
    SolarSystem solarSystem = new SolarSystem();
    solarSystem.add( new Planet("E", 400) );
    solarSystem.add( new Planet("C", 300) );
    solarSystem.add( new Planet("B", 200) );
    solarSystem.add( new Planet("A", 100) );
    solarSystem.add( new Planet("F", 500) );
    
    solarSystem.showAll();
  }
}