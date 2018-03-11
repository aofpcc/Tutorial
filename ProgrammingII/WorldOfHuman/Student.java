public class Student extends Human implements Learnable {
  private double income;
  private double knowledge;
  
  public Student(String name, int age, double money, double energy){
    super( name, age, money, energy, "Student" );
  }
  
  public double getKnowledge(){
    return knowledge;
  }
  
  public void learn(){
    knowledge += ADD_KNOWLEDGE;
    setEnergy( getEnergy() - 10 );
  }
  
} 