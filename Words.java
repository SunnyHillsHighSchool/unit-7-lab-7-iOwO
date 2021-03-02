//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Words
{
	private ArrayList<Word> words;

	public Words(String[] wordList)
	{
    words = new ArrayList<Word>(wordList.length);
    for(int i = 0; i < wordList.length; i++)
    {
      Word word = new Word(wordList[i]);
      words.add(word);
    }
	}

	public int countWordsWithXChars(int size)
	{
		int count=0;
    for (int i = words.size()-1; i >= 0; i-- )
    {
      if (words.get(i).getLength() == size)
      {
        count++;
      }
    }
		return count;
	}
	
	//this method will remove all words with a specified size / length
	//this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size)
	{
    int total = 0;
    for (int i = words.size()-1; i >= 0; i-- )
    {
      if (words.get(i).getLength() == size)
      {
        total = total + words.get(i).getNumVowels();
        words.remove(i);
      }
    }
    return total;
	}

	public int countWordsWithXVowels(int numVowels)
	{
		int count=0;
    for (int i = words.size()-1; i >= 0; i-- )
    {
      if(words.get(i).getNumVowels() == numVowels)
      {
        count++;
      }
    }
		return count;
	}
	
	//add in a toString
  public String toString()
  {
    return words + " ";
  }
}