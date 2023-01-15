import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the subject marks");
        Scanner sc=new Scanner(System.in);
        float English =sc.nextFloat();
        float Maths =sc.nextFloat();
        float Physics =sc.nextFloat();
        float Chemistry =sc.nextFloat();
        float Computer =sc.nextFloat();
        float total= English+Maths+Physics+Chemistry+Computer;
        float percent= (total/500)*100;
        System.out.print("You'r total percentage is ");
        System.out.print(percent);
    }
}
