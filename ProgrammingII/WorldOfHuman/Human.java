public class Human {
  private String name;
  private int age;
  private double money;
  private double energy;
  private String career;
  
  public Human( String name, int age, double money, double energy, String career){
    this.name = name;
    this.age = age;
    this.money = money;
    this.energy = energy;
    this.career = career;
  }
  public String getInfo(){
    StringBuilder info = new StringBuilder();
    info.append( "Name   : " + name + '\n');
    info.append( "Age    : " + age + '\n');
    info.append( "Money  : " + money + '\n');
    info.append( "Energy : " + energy + '\n');
    info.append( "Career : " + career);
    return info.toString();
  }
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  public double getMoney(){
    return money;
  }
  public double getEnergy(){
    return energy;
  }
  public String getCareer(){
    return career;
  }
  public void setAge(int age){
    this.age = age;
  }
  public void setMoney(double money){
    this.money = money;
  }
  public void setEnergy(double energy){
    this.energy = energy;
  }
  
}