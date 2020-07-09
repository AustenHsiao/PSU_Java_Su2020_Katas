package edu.pdx.cs410J.ahsiao;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class KataTest
{

  @Test
  public void canInstantiateKataClass() {
    new Kata();
  }

  @Test
  public void TestOne() {
    assertThat(Kata.decToRoman(1), equalTo("I"));
  }

  @Test
  public void TestFour() {
    assertThat(Kata.decToRoman(4), equalTo("IV"));
  }

  @Test
  public void TestTen() {
    assertThat(Kata.decToRoman(10), equalTo("X"));
  }

  @Test
  public void TestFifty() {
    assertThat(Kata.decToRoman(50), equalTo("L"));
  }

  @Test
  public void TestHundred() {
    assertThat(Kata.decToRoman(100), equalTo("C"));
  }

  @Test
  public void TestFiveHundred() {
    assertThat(Kata.decToRoman(500), equalTo("D"));
  }

  @Test
  public void TestThousand() {
    assertThat(Kata.decToRoman(1000), equalTo("M"));
  }

  @Test
  public void TestThreeThousand() {
    assertThat(Kata.decToRoman(3000), equalTo("MMM"));
  }

  @Test
  public void TestThirtyEight() {
    assertThat(Kata.decToRoman(38), equalTo("XXXVIII"));
  }

  @Test
  public void TestFourtyNine() {
    assertThat(Kata.decToRoman(49), equalTo("XLIX"));
  }



}
