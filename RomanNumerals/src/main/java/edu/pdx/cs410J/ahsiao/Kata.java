package edu.pdx.cs410J.ahsiao;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {
                                                                                    

  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
    System.exit(1);
  }
  public static String decToRoman(int decimal) {
    String numeral = "";
    if (decimal > 1000) {
      for (int i = 0; i < (int)(decimal / 1000); i++) {
        numeral += "M";
      }
    }
    decimal -= (int)(decimal / 1000) * 1000;
    if (decimal > 500) {
      for (int i = 0; i < (int)(decimal / 500); i++) {
        numeral += "D";
      }
    }
    decimal -= (int)(decimal / 500) * 500;
    if (decimal > 100) {
      for (int i = 0; i < (int)(decimal / 100); i++) {
        numeral += "C";
      }
    }
    decimal -= (int)(decimal / 100) * 100;
    if (decimal > 50) {
      for (int i = 0; i < (int)(decimal / 50); i++) {
        numeral += "L";
      }
    }
    decimal -= (int)(decimal / 50) * 50;
    return numeral;
  }
}