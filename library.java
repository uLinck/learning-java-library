import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pessoa {
    public Scanner scan = new Scanner(System.in);
    public int conhecimentoBruxos = 0;
    public int conhecimentoPessoal = 0;
    public int conhecimentoClean = 0;
    public int conhecimentoJava = 0;
    public int conhecimentoBanana = 0;

    public boolean again = true;
    
    public Pessoa(String a, int b, double c){
        
    }

    public void lerLivros(String livro) {
        
        switch(livro) {
            case "1":
                System.out.println("Livro selecionado: Java Como Programar");
                conhecimentoJava += 10;
                System.out.println("Conhecimento adquirido: Programação em java +10");
                break;
            case "2":
                System.out.println("Livro selecionado: Harry Potter e o Prisioneiro de Azkaban");
                conhecimentoBruxos += 10;
                System.out.println("Conhecimento adquirido: Universo de Harry Potter +10");
                break;
            case "3":
                System.out.println("Livro selecionado: Clean Code");
                conhecimentoClean += 10;
                System.out.println("Conhecimento adquirido: Aperfeiçoamento de codificação +10");
                break;
            case "4":
                System.out.println("Livro selecionado: Atomic Habits");
                conhecimentoPessoal += 10;
                System.out.println("Conhecimento adquirido: Desenvolvimento de Hábitos pessoais +10");
                break;
            case "5":
                System.out.println("Livro selecionado: Diário de um banana");
                conhecimentoBanana += 10;
                System.out.println("Conhecimento adquirido: Parabéns, agora você tem +10 " +
                        "de conhecimento da vida de um banana!");
                break;
            default:
                System.out.println("Numero inválido");

        }
    if (livro.equalsIgnoreCase("fechar")) {

        again = false;

    }
    }



    public static void main(String[] args) {

        Pessoa estudante = new Pessoa("nome", 1, 1.2);


        System.out.println("Bem vindo à biblioteca\n");

        System.out.println("Livros disponíveis:\n"
                + "1. Java Como Programar.\n"
                + "2. Harry Potter e o Prisioneiro de Azkaban.\n"
                + "3. Clean Code.\n"
                + "4. Atomic Habits.\n"
                + "5. Diário de um banana."
                + "\nCaso queira parar de ler livros, digite: \"fechar\"\n");


        while(estudante.again) {

            System.out.print("\nDigite o número do livro de seu interesse: ");
            estudante.lerLivros(estudante.scan.nextLine());

        }

        System.out.println("\nConhecimentos adquiridos:\n " +
                "Programação em Java: " + estudante.conhecimentoJava
                + "\n Conhecimento sobre o universo de Harry Potter: " + estudante.conhecimentoBruxos
                + "\n Conhecimento sobre aperfeiçoamento de codificação: " + estudante.conhecimentoClean
                + "\n Conhecimento sobre desevolvimento pessoal: " + estudante.conhecimentoPessoal
                + "\n Conhecimento sobre a vida de um banana: " + estudante.conhecimentoBanana);

    }

}
