package string.problems;
import java.util.Arrays;
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        // Words to match
        String a = "CAT";
        String b = "ACT";
        String i = "ARMY";
        String j = "MARY";
        System.out.println(anagramMethod(a,b));
        System.out.println(anagramMethod(i,j));
        System.out.println(anagramMethod(a,i));
    }
    public static boolean anagramMethod(String x, String y){

        char[] ArrayOfCharFromStringX = x.toCharArray();
        char[] ArrayOfCharFromStringY = y.toCharArray();
        Arrays.sort(ArrayOfCharFromStringX);
        Arrays.sort(ArrayOfCharFromStringY);
        return Arrays.equals( ArrayOfCharFromStringX,ArrayOfCharFromStringY);
    }
}
