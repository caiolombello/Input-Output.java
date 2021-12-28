package Object;

import java.io.*;
import java.util.Scanner;

/*
Crie a classe Gato com os atributos nome, idade e cor:
Intancie um objeto e serialize
Desserialize este objeto e mostre no console
 */
public class Exercicio {
    public static void serialization() throws IOException {
        Gato gato = new Gato("Simba", 6, "Alaranjado");

        File f = new File("gato");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f.getName()));
        oos.writeObject(gato);

        PrintStream ps = new PrintStream(System.out);
        ps.printf("Arquivo \"%s\" criado com sucesso!\nDiretório: %s\nTamanho: %d bytes.",
                f.getName(), f.getAbsolutePath(), f.length());

        oos.close();
        ps.close();
    }

    public static void deserialization(String file) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Gato gatoObject = (Gato) ois.readObject();

        System.out.printf("\nNome:\t%s\n", gatoObject.getName());
        System.out.printf("Idade:\t%d\n", gatoObject.getAge());
        System.out.printf("Cor:\t%s\n", gatoObject.getColor());
        System.out.println(gatoObject);

        ois.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Deseja serializar ou desserializar?");
        String option = scan.nextLine();
        scan.close();

        if (option.equalsIgnoreCase("serializar")) serialization();
        else if (option.equalsIgnoreCase("desserializar")) deserialization("/home/caiobarbieri/IdeaProjects/Input&Output.java/gato");

    }
}
