public class Teacher extends Human implements Teachable, Learnable{
  private double income;
  private double knowledge;
  
  public Teacher( String name, int age, double money, double energy){
    super(name, age, money, energy, "Teacher");
  }
  
  public double getKnowledge(){
    return knowledge;
  }
  
  public void teach( Student student ){
    student.learn();
    setEnergy( getEnergy() - 10 );
  }
  
  public void learn(){
    knowledge += ADD_KNOWLEDGE;
  }
    
}