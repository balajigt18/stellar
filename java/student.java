import java.util.Scanner;
public class student {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tamil,english,math,science,social;
        int a;
        int avg;
        System.out.println("Enter The Mark Of tamil:");
        tamil = sc.nextInt();
        System.out.println("Enter The Mark Of english:" );
        english = sc.nextInt();
        System.out.println("Enter The Mark Of math:");
        math = sc.nextInt();
        System.out.println("Enter The Mark Of science:");
        science = sc.nextInt();
        System.out.println("Enter The Mark Of social:");
        social = sc.nextInt();

        a = tamil+english+math+science+social;
        System.out.println("Total Mark="+a);
        avg=a/5;
        System.out.println("Average Mark="+avg);

    }
}