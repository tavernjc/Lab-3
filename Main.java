import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String name;
    int num;
    System.out.println("Please Enter Name");
    name= s.nextLine();
    System.out.println("Let Blast Off, " + name +"!");
    System.out.println("Enter a number to count down or up from:");
    num = s.nextInt();

    if(num<0){
      for (num = num; num<1;num=num+1){
        System.out.println("Countdown: "+num);
      }
      System.out.println("BLAST OFF!");
    }


    if(num>1){
      for (num = num; num>-1;num=num-1){
        System.out.println("Countdown: "+num);
      }
      System.out.println("BLAST OFF!");
    }

  
  
  }
}