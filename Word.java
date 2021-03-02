//(c) A+ Computer Science
//www.apluscompsci.com
//Name Wesley Truong

import static java.lang.System.*;

public class Word
{
  private static String vowels = "AEIOUaeiou";   
  
  //add an instance variable
  private String s;

  //create 2 constructors
  public Word()
  {
    s = "";
  }

  public Word(String str)
  {
    s = str;
  }

  //setter method
  public void setWord(String initword)
  {
    s = initword;
  }

  //getter method
  public String getWord()
  {
    return s;
  }

  //getNumVowels
  public int getNumVowels()
  {
    int counter = 0;
    for(int i = 0; i < s.length();i++)
    {
      for(int j = 0; j < vowels.length(); j++ )
      {
        if (s.charAt(i) == vowels.charAt(j))
        {
          counter++;
        }
      }
    }
    return counter;
  }
  //getLength
  public int getLength()
  {
    return s.length();
  }
  //create a toString method
  public String toString()
  {
    return s + " ";
  }
}