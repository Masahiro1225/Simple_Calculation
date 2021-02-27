public class Calc{
  public static void main(String[] args){
    System.out.println("How many times do you want to do?");
    int inputA = new java.util.Scanner(System.in).nextInt();
    for(int i = 0; i < inputA; i++){
      int randomA = new java.util.Random().nextInt(100);
      randomA++;
      int randomB = new java.util.Random().nextInt(100);
      randomB++;
      int answer = randomA * randomB;
      System.out.println(randomA + " * " + randomB + " = ");
      int input = new java.util.Scanner(System.in).nextInt();
      if(input == answer){
        System.out.println("correct.");
      } else {
        System.out.println("incorrect. answer is " + answer);
      }
    }
  }
}
