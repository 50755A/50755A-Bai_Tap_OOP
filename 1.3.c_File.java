import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws FileNotFoundException {

    File inFile = new File("D:\\Downloads\\input.txt");
    File outFile = new File("D:\\Downloads\\output.txt");

    Scanner scanner = new Scanner(inFile);
    PrintWriter writer = new PrintWriter(outFile);

    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      line = line.replace("{file}", "tập tin");
      writer.println(line);
    }

    System.out.println(writer);

    scanner.close();
    writer.close();
  }
}