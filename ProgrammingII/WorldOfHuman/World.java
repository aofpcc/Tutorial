public class World {
  public static void main(String[] args){
    Student one = new Student( "Newie", 18, 100, 100 );
    Teacher two = new Teacher( "Nut", 25, 300, 80 );
    
    System.out.println( one.getName() + " : " + one.getCareer() + " : " + one.getKnowledge() );
    System.out.println( one.getName() + " : " + one.getCareer() + " : " + one.getEnergy() );
    System.out.println( two.getName() + " : " + two.getCareer() + " : " + two.getEnergy() );
    
    two.teach( one );
    
    System.out.println( one.getName() + " : " + one.getCareer() + " : " + one.getKnowledge() );
    System.out.println( one.getName() + " : " + one.getCareer() + " : " + one.getEnergy() );
    System.out.println( two.getName() + " : " + two.getCareer() + " : " + two.getEnergy() );
    
  }
}