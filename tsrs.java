import java.util.Scanner;
public class tsrs {

    public static int display(int a){
        return ++a;
    }
    public static void main(String[] args) {
        int z;
        z = display(100);
        System.out.println(z);
    }
}