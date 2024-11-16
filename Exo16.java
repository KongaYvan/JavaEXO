import java.util.Scanner;

public class Exo16{
  public static void main(String[] args) throws Exception {
    int a;
    do {
        System.out.println("Entrer un nombre positif : ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        if(a<0){
          System.out.println("svp positif");
        }
        else if (a==0) {
          System.out.println("merci aurevoir!");
        } else{
          System.out.println("sa racine carree est"+ Math.sqrt(a));
        }
        
    } while (a!=0);

  }
}