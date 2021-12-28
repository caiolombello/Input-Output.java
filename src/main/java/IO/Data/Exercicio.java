package IO.Data;

import java.io.*;
import java.util.Scanner;

/*
Crie um arquivo "peca-de-roupa.bin" e armazene:
1. Nome do produto, tamanho (P/M/G/U), quantidade e preço
2. Leia este arquivo e imprima no console.
*/
public class Exercicio {
    public static void addProduct() throws IOException {

        File f = new File("/home/caiobarbieri/Documents/ClothingPiece.bin");

        PrintStream ps = new PrintStream(System.out, true);

        DataOutputStream dos = new DataOutputStream(new FileOutputStream(f.getPath()));

        Scanner scan = new Scanner(System.in);

        ps.println("Nome da peça: ");
        String clothingPieceName = scan.nextLine();
        dos.writeUTF(clothingPieceName);

        ps.println("Tamanho da peça (P/M/G/U): ");
        char clothingPieceSize = (char) System.in.read();
        dos.writeChar(clothingPieceSize);

        ps.println("Quantidade de peças: ");
        int clothingPieceQuantity = scan.nextInt();
        dos.writeInt(clothingPieceQuantity);

        ps.println("Preço da peça: ");
        double clothingPiecePrice = scan.nextDouble();
        dos.writeDouble(clothingPiecePrice);

        ps.printf("\nO arquivo %s foi criado com %d bytes no diretório '%s'.",
                f.getName(), f.length(), f.getAbsolutePath());

        readProduct(f.getPath());

        dos.close();
        scan.close();
        ps.close();
        
    }

    public static void readProduct(String filePath) throws IOException {
        File f = new File(filePath);

        DataInputStream dis = new DataInputStream(new FileInputStream(f.getPath()));

        String name = dis.readUTF();
        char size = dis.readChar();
        int quantity = dis.readInt();
        double price = dis.readDouble();

        System.out.printf("\nNome:\t\t\t\t\t%s\n", name);
        System.out.printf("Tamanho:\t\t\t\t\t%c\n", size);
        System.out.printf("Quantidade:\t\t\t\t\t%d\n", quantity);
        System.out.printf("Preço:\t\t\t\t\t%.2f\n", price);
        System.out.print("Total valor das peças:\t" + (quantity * price));

        dis.close();

    }

    public static void main(String[] args) throws IOException {
        addProduct();
    }
}
