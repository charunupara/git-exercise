package hello;

import java.io.PrintWriter;

public class HelloWorld {
  public static void main(String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);
    pen.println("Hello, GitHub!");
    pen.println("Adding things on GitHub.");
    pen.println("Another line");
    pen.flush();
  }
}
