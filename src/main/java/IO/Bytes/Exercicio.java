package IO.Bytes;

import java.io.*;

// Faça uma cópia do arquivo "recomendacoes-copy.txt"
public class Exercicio {
    public static void copyFile() throws IOException {
        File f = new File("/home/caiobarbieri/IdeaProjects/Input&Output.java/recomendacoes-copy.txt");
        String fileName = f.getName();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileName));

        String fileNameCopy = fileName.substring(0, fileName.indexOf("-")).concat("-copy2.txt");
        File fCopy = new File(fileNameCopy);

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileNameCopy));

        int line = 0;
        while ((line = bis.read()) != -1) {
            bos.write((char) line);
            bos.flush();
        }

        bis.close();
        bos.close();

        PrintStream ps = new PrintStream(System.out);
        ps.printf("Arquivo %s copiado com sucesso e está no diretório '%s' com %d bytes",
                fCopy.getName(), fCopy.getAbsolutePath(), fCopy.length());
    }

    public static void main(String[] args) throws IOException {
        copyFile();
    }
}
