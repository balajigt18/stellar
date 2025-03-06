import java.util.Scanner;
public class nested {
    public static void main(String[] args) {
        int mark=37;
        if(mark>=35){
            System.out.println("pass");
            if(mark>=85){
                System.out.println("above 85");
                if(mark==100){
                    System.out.println("centum");
                }
            }
        }
        else{
            System.out.println("fail");
        }
    }
    
}
