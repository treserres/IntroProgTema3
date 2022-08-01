import java.util.Scanner;

class Suma3
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);        

        System.out.println("Vamos a sumar tres números, por favor ingresa el primero: ");
        int numero1= s.nextInt();

        System.out.println("Ingresa el segundo número: ");
        int numero2= s.nextInt();

        System.out.println("Y el tercero: ");
        int numero3= s.nextInt();

        s.close();

       

        int suma3= numero1+numero2+numero3;
        System.out.println("El resultado es: "+ suma3);

    }
}
