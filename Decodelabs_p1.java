import java.util.Random;
import java.util.Scanner;
class Decodelabs_p1{
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int num = random.nextInt(100)+1;
        int guess = 0;
        System.out.println("Guess a number between 1 to 100");
        while(guess != num){
        System.out.println("Enter your guess:");
        guess = sc.nextInt();
        if (guess>num){
            System.out.println("Too high");
        }else if(guess<num){
            System.out.println("Too low");
        }else{
            System.out.println("Correct! You won!");
        }
    }
        sc.close();
    }
}