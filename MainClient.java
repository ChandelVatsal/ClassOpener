import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class MainClient {
    public static void main(String[] args) throws IOException, URISyntaxException {

        File text = new File("Links.txt");

        Scanner scnr = new Scanner(text);

        int lineNumber = 1;
        while (scnr.hasNextLine()) {
            String line = scnr.nextLine();
            System.out.println("line " + lineNumber + " :" + line);
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI(line);
            desktop.browse(oURL);
            lineNumber++;
        }
        scnr.close();

    }
}