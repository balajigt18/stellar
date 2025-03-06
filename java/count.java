import java.util.Scanner;
public class count {
    public static void main(String[] args) {
        int count = 0,num=50000;
        while (num!=0){
        num /= 10;
        ++count;
        }
        System.out.println("Number of Digits:"+count);
    }

    
}
