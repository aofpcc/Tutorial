import java.util.*;
public class BubbleSort {
  public static void main(String[] args){
    Random rand = new Random();
    int size = rand.nextInt( 5 ) + 8;
    int[] num = new int[ size ];
    for(int i = 0; i < size; ++i){
      num[i] = rand.nextInt( 100 );
      System.out.print( num[i] + " " );
    }
    System.out.println();
    
    System.out.println("---------------------");
    
    num = bubbleSort( num ); 
    
    for(int i = 0; i < size; ++i){
      System.out.print( num[i] + " " );
    }
    
    System.out.println();
    System.out.println("---------------------");
  }
  public static int[] bubbleSort(int[] num){
    for(int i = 0; i < num.length; ++i){
      for(int j = i+1; j < num.length; ++j){
        if( num[i] > num[j] ){
          int temp = num[j];
          num[j] = num[i];
          num[i] = temp;
        }
      }
    }
    return num;
  }
}