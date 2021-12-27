package IOCaracter;

import java.io.*;
import java.util.Scanner;

// Abra o teclado para escrever 3 filmes que você recomendaria e armazene em "recomendacoes.txt"
public class Exercicio2 {

    public static void inOutDocumnet() throws IOException {

        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Digite 3 recomendações de filmes: ");
        pw.flush();

        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        File f = new File("recomendacoes.txt");

        BufferedWriter bw = new BufferedWriter(new FileWriter(f.getName()));

        do {
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = scan.nextLine();
        } while (!(line.equalsIgnoreCase("fim")));

        pw.printf("Arquivo \"%s\" foi criado com sucesso!", f.getName());

        pw.close();
        scan.close();
        bw.close();

    }

    public static void main(String[] args) throws IOException {
        inOutDocumnet();
    }

}
