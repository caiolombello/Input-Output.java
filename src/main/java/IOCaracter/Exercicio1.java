package IOCaracter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Exercicio1 {
    public static void InOutConsole() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

    }

    public static void main(String[] args) throws IOException {
        InOutConsole();
    }
}
