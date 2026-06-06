import java.util.Scanner;
class Decodelabs_p2{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System. in);
       System.out.println("Enter marks for Subject1");
       int s1 = sc.nextInt();
       System.out.println("Enter marks for Subject2");
       int s2 = sc.nextInt();
       System.out.println("Enter marks for Subject3");
       int s3 = sc.nextInt();
       int total = s1+s2+s3;
       double average = total/3.0;
       System.out.println("Total marks:"+ total);
       System.out.println("Average percentage:"+ average);
       if (average >= 90){
        System.out.println("Grade: A+");
       }else if (average >= 80){
        System.out.println("Grade: A");
       }else if (average >= 70){
        System.out.println("Grade : B");
       }else if (average >= 60){
        System.out.println("Grade : c");
       }else{
        System.out.println("Grade : D");
       }
       sc.close();
    }
}