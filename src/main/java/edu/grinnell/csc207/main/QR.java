package edu.grinnell.csc207.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import edu.grinnell.csc207.util.IOUtils;
import edu.grinnell.csc207.util.Quadratic;
/**
 * Interactively compute quadratic roots.
 *
 * @author Samuel A. Rebelsky
 * @author Harrison Zhu
 * @author ben Sheeley
 */
public class QR {
  /**
   * Do all the work.
   *
   * @param args
   *   Command-line arguments (ignored).
   *
   * @throws Exception
   *   If something goes wrong with the I/O or elsewhere.
   */
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);
    BufferedReader eyes = new BufferedReader(new InputStreamReader(System.in));

    pen.println("Hi! I'm here to help you understand quadratic functions.");
    int a = IOUtils.readInt(pen, eyes, "Please enter a (the coefficient of the squared term): ");
    int b = IOUtils.readInt(pen, eyes, "Please enter b (the coefficient of the linear term) : ");
    int c = IOUtils.readInt(pen, eyes, "Please enter c (the constant)                       : ");

    Quadratic quad = new Quadratic(a, b, c);
    Double result = quad.smallerRoot();
    pen.println("The smaller root of " + quad + " = " + result);
    pen.printf("Experimentally, %d*%d^2 + %d*%d + %d = %d\n", a, result.intValue(), b, result.intValue(), c, quad.evaluate(result.intValue()));

    eyes.close();
    pen.close();
  } // main(String[])

} // QR
