import java.util.Scanner;

public class App3 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um numero inteiro maior do que 9");
        String n = sc.nextLine();
        String[] nSplit = n.split("");

        int[] nSplitInt = new int[nSplit.length];

        for (int i = 0; i < nSplit.length; i++) {
            nSplitInt[i] = Integer.parseInt(nSplit[i]);
            System.out.println(nSplitInt[i]);
        }

        int soma = 0;
        for (int i = 0; i < nSplitInt.length; i++) {
            soma += nSplitInt[i];
        }
        System.out.println("Seu resultado das somas dos digitos é: ");
        System.out.println(soma);

        sc.close();

    }
}
