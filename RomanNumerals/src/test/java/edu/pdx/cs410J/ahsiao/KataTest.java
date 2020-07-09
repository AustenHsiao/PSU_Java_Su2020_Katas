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

}
