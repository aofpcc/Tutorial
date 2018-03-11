public class World {
  public static void main(String[] args){
    Student one = new Student( "Newie", 18, 100, 100 );
    Teacher two = new Teacher( "Nut", 25, 300, 80 );
    
    System.out.println( "-------\tBefore\t-------" );
    printK( one );
    printK( two );
    
    two.teach( one );
    
    System.out.println( "-------\tAfter\t-------" );
    printK( one );
    printK( two );
    
  }
  public static void printK( Object obj){
    System.out.println( ((Human)obj).getInfo() );
    if( obj instanceof Learnable){
      System.out.println( "Knowlege : " + ((Learnable)obj).getKnowledge() );
    }
    System.out.println("_______");
  }
}