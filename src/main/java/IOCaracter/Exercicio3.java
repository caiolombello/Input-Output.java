package IOCaracter;

import java.io.*;

// Faça uma cópia do arquivo "recomendações.txt" e agora adicione 3 recomendações de livros.
public class Exercicio3 {

    public static void copyFile() throws IOException {
        File f = new File("/home/caiobarbieri/IdeaProjects/Input&Output.java/recomendacoes.txt");
        String fileName = f.getName();

        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line = br.readLine();

        String fileNameCopy = fileName.substring(0, fileName.indexOf(".")).concat("-copy.txt");

        BufferedWriter bw = new BufferedWriter(new FileWriter(fileNameCopy));

        do {
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = br.readLine();
        } while(line != null);

        System.out.printf("Arquivo \"%s\" copiado com sucesso! Com o tamanho de %d bytes.\n", f.getName(), f.length());
        System.out.printf("Arquivo \"%s\" criado com sucesso! Com o tamanho de %d bytes.", fileNameCopy, fileNameCopy.length());

        PrintWriter pw = new PrintWriter(System.out);
        pw.println("\nRecomende 3 livros: ");
        pw.flush();

        addInfoFile(fileNameCopy);

        pw.printf("\nOk! Tudo certo. Tamanho do arquivo %d bytes.", fileNameCopy.length());

        br.close();
        bw.close();
        pw.close();
    }
    
    public static void addInfoFile(String fileNameCopy) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter(fileNameCopy, true));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (!(line.equalsIgnoreCase("fim")));

        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        copyFile();
    }

}
