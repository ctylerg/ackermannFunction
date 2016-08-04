import java.util.Scanner;

public class Ackermann{
  public static void main(String[] args){
    int NUMBER = 2;
    int input;
    int m;
    int n;

    Scanner keyboard = new Scanner(System.in);
    //create new array
    int a[] = new int[NUMBER];
    //user enters numbers for array
    System.out.println("Please enter the numbers you want to check.");
    for(int i = 0; i < a.length; i++ ){
      input = keyboard.nextInt();
      if(input < 0){
        System.out.println("You have entered " + input + " which is an invalid number. Goodbye.");
        System.exit(0);
      } else {
      a[i] = input;
      }
    }
    m = a[0];
    n = a[1];

    //display the result
    System.out.println(ackermann(m, n));
  }
    public static int ackermann(int m, int n){

      if (m == 0){
        return n + 1;
      }else if(n == 0){
        return ackermann(m - 1, 1);
      }else{
        return ackermann(m - 1, ackermann(m , n - 1));
      }

    }
}
