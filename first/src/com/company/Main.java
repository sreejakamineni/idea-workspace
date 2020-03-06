package com.company;

class Wordplay
{
    public boolean isVowel(char ch)
    {
        if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='o'||ch=='O'||ch=='I'||ch=='u'||ch=='U')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void replaceVowels(String phrase,char ch) {
        int i;

        for (i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == 'a' || phrase.charAt(i) == 'A' || phrase.charAt(i) == 'e' || phrase.charAt(i) == 'E' || phrase.charAt(i) == 'i' || phrase.charAt(i) == 'o' || phrase.charAt(i) == 'O' || phrase.charAt(i) == 'I' || phrase.charAt(i) == 'u' || phrase.charAt(i) == 'U') {
                phrase = phrase.replace(phrase.charAt(i), ch);
            }
        }
        System.out.println("new string :" + phrase);

    }
    public void emphasize(String phrase,char ch)
    {
        for(int i=0;i<phrase.length();i++) {
            if (phrase.charAt(i) == ch)
            {
                if (i % 2 == 0) {
                    phrase = phrase.replace(phrase.charAt(i), '+');
                }
                else {
                    phrase = phrase.replace(phrase.charAt(i), '*');
                }
        }
        }
        System.out.println("new string :"+phrase);
    }

    }


public class Main {

    public static void main(String[] args) {
	// write your code here
        Wordplay w = new Wordplay();
        System.out.println(w.isVowel('F'));
        w.replaceVowels("Hello World",'*');
        w.emphasize("mary bella",'a');
    }
}
