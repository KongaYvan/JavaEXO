import java.util.Scanner;
public class Exo17{
    public static void main(String[] args){
        System.out.println("Entrer un nombre positif : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a >= 0){
            for (int i=0;i<a+1;i++){
                System.out.println();
                for(int j=i;j<a+1;j++){
                    System.out.print(" ");
                }
                for(int j=0;j<i;j++){
                if(i==1){
                    System.out.print("*");
                }else{
                    System.out.print("**");
                }
                    
                }

                System.out.println();
            }
        }else{
            System.out.println("Desole c'est impossible avec ce numero.");
        }

    }
}