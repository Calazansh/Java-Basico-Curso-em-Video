import java.util.Scanner;

public class programaIdade {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int nasc = t.nextInt();
        int i = 2022 - nasc;
        if (i >= 18 ){
            System.out.println("Maior de idade ");
        }
        else {
            System.out.println("Menor de idade ");
        }


    }
}
