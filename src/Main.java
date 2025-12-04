import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Cuantos popochos tienes en casa:");
        for(int i = 0;i<1;i++) {
            int popocho = scan.nextInt();
            if (popocho == 1) {
                System.out.println("Ese popocho esta muy mimado");
                System.out.println("Zzz");
            } else if (popocho == 2){
                System.out.println("La familia de popochos esta equilibrada");
                System.out.println("Zzz,Zzz");
            }else if(popocho == 3){
                System.out.println("La familia de popochos esta equilibrada");
                System.out.println("Zzz,Zzz,Zzz");
            }else if (popocho > 3) {
                System.out.println("Hay demasiados popochos no queda espacio en la cama");
                System.out.println("Zzz,Zzz,Zzz,...");
            } else {
                System.out.println("Recomendado conseguir uno");
            }
            System.out.println("Todos los popochitos estan durmiendo");
            System.out.println("Cambios echos por otro programador");
        }
    }
}
