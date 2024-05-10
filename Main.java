import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome :");
        String nome = sc.nextLine();
        System.out.println("Informe a sua idade :");
        int idade = sc.nextInt();

        System.out.println("Nome: " + nome + "\n idade: " + idade);

        if (idade<16){
            System.out.println("Você ainda não pode Votar");
        } else if (idade>=16&&idade<18) {
            System.out.println("Você pode votar se quiser e tiver o título de eleitor");
        }else if (idade>=18 && idade<=70){
            System.out.println("Voto é Obrigatório até 70 anos");
        }else {
            System.out.println("Acima dos 70 voto não é obrigado mas pode votar se quiser");
        }
    }
}