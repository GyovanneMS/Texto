import java.util.Scanner;

class Texto{
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);

        System.out.println("\n Olá gentil senhorio ou senhorita, qual és a ta idade");
        int idade = ler.nextInt();
        int an = 2022 - idade;
        System.out.println("\n...\nCalculando\n...\nEnviando dados\n...\nMostrando dados\n...\t Olá ser maravilhoso que nasceu em " + an);
    }
}