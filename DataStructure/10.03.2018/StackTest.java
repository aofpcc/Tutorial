public class StackTest{
  public static void main(String[] args){
    Stack<Integer> st = new Stack<Integer>();
    st.push( 6 );
    st.push( 1 );
    st.push( 5 );
    st.push( 2 );
    st.push( 3 );
    while( !st.isEmpty() ){
      System.out.println( st.pop() );
    }
  }
}