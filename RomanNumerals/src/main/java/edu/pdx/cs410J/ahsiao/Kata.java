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
    if(decimal > 3000){
      return "Too large";
    }

    String numeral = "";
    if (decimal >= 1000) {
      for (int i = 0; i < (int)(decimal / 1000); i++) {
        numeral += "M";
      }
      decimal -= (int)(decimal / 1000) * 1000;
    }

    if(decimal >= 900){
      numeral += "CM";
      decimal -= 900;
    }else if(decimal >= 500) {
      for (int i = 0; i < (int)(decimal / 500); i++) {
        numeral += "D";
      }
      decimal -= (int)(decimal / 500) * 500;
    }

    if(decimal >= 400){
      numeral += "CD";
      decimal -= 400;
    } else if(decimal >= 100) {
      for (int i = 0; i < (int)(decimal / 100); i++) {
        numeral += "C";
      }
      decimal -= (int)(decimal / 100) * 100;
    }

    if(decimal >= 90){
      numeral += "XC";
      decimal -= 90;
    }else if(decimal >= 50) {
      for (int i = 0; i < (int)(decimal / 50); i++) {
        numeral += "L";
      }
      decimal -= (int)(decimal / 50) * 50;
    }

    if(decimal >= 40){
      numeral += "XL";
      decimal -= 40;
    }else if(decimal >= 10) {
      for (int i = 0; i < (int)(decimal / 10); i++) {
        numeral += "X";
      }
      decimal -= (int)(decimal / 10) * 10;
    }

    if(decimal >= 9){
      numeral += "IX";
      decimal -= 9;
    } else if(decimal >= 5) {
      for (int i = 0; i < (int)(decimal / 5); i++) {
        numeral += "V";
      }
      decimal -= (decimal / 5) * 5;
    }

    if(decimal >= 4){
      numeral += "IV";
    }else if (decimal >= 1) {
      for (int i = 0; i < decimal; i++) {
        numeral += "I";
      }
    }
    return numeral;
  }
}