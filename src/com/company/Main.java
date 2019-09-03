package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello world");
        System.out.println(stringReverse("ahmed"));
        numberOfCharacter("palindrome");
        System.out.println(isAnagram("atm", "mat"));
    }

    public static String stringReverse(String string){
        String rev = "";
        for (int i = string.length() - 1; i >= 0; --i){
            rev += string.charAt(i);
        }
        return rev;
    }

    static void numberOfCharacter(String string){
        string = string.replace(" ", "");
        int counter = 0;
        char[] ch = string.toCharArray();
        for (int i = 0; i < ch.length; ++i){
            for (int j = 0; j < ch.length; ++j){
                if (ch[i] == ch[j]){ counter++; }
                if (j < i && ch[i] == ch[j]){break;}
                if (j == ch.length - 1){
                    System.out.println(String.format("%c : %d", ch[i], counter));
                }
            }counter = 0;
        }
    }

    static boolean isAnagram(String a, String b){
        boolean ret = false;
        StringBuilder b_ = new StringBuilder(b);
        if (a.length() != b.length()){return ret;}
        for (int i = 0; i < a.length(); ++i){
            for (int j = 0; j < b_.length(); ++j){
                if (a.charAt(i) == b_.charAt(j)){
                    b_.deleteCharAt(j);
                    if (i == a.length() - 1 && b_.length() == 0){break;}
                }
            }ret = true;
        }

        return ret;
    }
}
