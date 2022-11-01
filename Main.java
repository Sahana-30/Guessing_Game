import java.util.Scanner; 
import java.util.Random; 

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    int tries =0;
     int won =0;
     boolean playAgain =true;  
  
  while (playAgain == true){
    //Entering the valid input
    Random random = new Random();
    int x = random.nextInt(100)+1;

    while (won ==0){ 
    System.out.println("Guess a number between 1-100(inclusive)"); 
      int y = input.nextInt();
      tries++;
      while (y<1 || y>100){
        System.out.println("Sorry, please type a valid input:");
        y = input.nextInt();
      }
      while (won ==0){ 
       if (x == y){
              won++;
              System.out.println("Congratulations you won! Your numbers of tries was: " + tries + " and the number was: " + x);

              System.out.println("Do you want to play again?If yes, type 1,and if no, type 0."); 
              int replay = input.nextInt();
              if (replay ==0){
                 System.out.println("Thank you for playing."); 
                replay=1; 
                won++; 
              }
              else{
                x=random.nextInt(100)+1;
                System.out.println(x); 
                 
              }
           }

           else if (y < x){
              System.out.println("Your guess is too low!");
              System.out.println("Do you want to continue playing?If yes, type 1,and if no, type 0.");
              int replay = input.nextInt();
              if (replay ==1){
                 
              }
              else{
                System.out.println("Thank you for playing."); 
               break; 
              }
           }
           else if (y > x){
              System.out.println("Your guess is too high!");

              System.out.println("Do you want to continue playing?If yes, type 1,and if no, type 0."); 
              int replay = input.nextInt();
              if (replay !=1){
                 System.out.println("Thank you for playing."); 
                break; 

              }


    }
    }
    System.out.println("Do you want to play again? Yes =1, No=0 ");
    
    }
}
  }
}
  
     