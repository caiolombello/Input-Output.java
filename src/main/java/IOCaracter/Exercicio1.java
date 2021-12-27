package IOCaracter;

import java.io.*;

// Abra o teclado para escrever 3 filmes que você recomendaria e exiba esses filmes no console
public class Exercicio1 {
    public static void InOutConsole() throws IOException {

        System.out.println("Recomende 3 filmes: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (!(line.isEmpty()));
        bw.flush();

        br.close();
        bw.close();

    }

    public static void main(String[] args) throws IOException {
        InOutConsole();
    }
}
