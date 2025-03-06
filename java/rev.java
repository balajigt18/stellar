import java.util.Scanner;
public class rev {
    public static void main(String[] args) {
        String s="Balaji";
        String reversed="";
        for(int i=s.length()-1;i>=0;i--){
            reversed += s.charAt(i);
        }
        System.out.println("reversed string:"+reversed);
    }
    
}
