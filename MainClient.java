import java.io.*;
import java.util.*;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;

public class MainClient {
    public static void main(String[] args) {

        try {
            File myObj = new File("C:\\Users\\Vatsal\\Visual Studios Projects\\URL.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    String myString = "This text will be copied into clipboard";
    StringSelection stringSelection = new StringSelection(myString);
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    clipboard.setContents(stringSelection, null);

    

}
