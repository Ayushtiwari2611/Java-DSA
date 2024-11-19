import java.util.Arrays;
import java.util.Scanner;

public class Strings {

    public static void printChars(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static boolean isStrPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static float shortestPathInDirections(String str) {
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);
            if (dir == 'S') {
                y--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'E') {
                x++;
            } else {
                x--;
            }
        }
        int X = x * x, Y = y * y;
        return (float) Math.sqrt(X + Y);
    }

    public static String substring(String str, int si, int ei){
        String substr = "";
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }

    public static String changeToUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String stringCompress(String str){
        String newstr = "";
        for(int i=0; i<str.length(); i++){
            Integer count =1;
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newstr += str.charAt(i);
            if(count >1){
                newstr += count.toString();
            }
        }
        return newstr;
    }

    public static StringBuilder compress(String str){
        StringBuilder newstr = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newstr.append(str.charAt(i));
            if(count>1){
                newstr.append(count.toString());
            }
        }
        return newstr;
    }

    // Question-1 : Count how many times lowercase vowels occured in a String entered by the user
    public static int countVowels(String str){
        int count=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }

    // Question-4 : Anagrams of a string
    public static boolean anagrams(String str1, String str2){
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1, s2);
    }



    public static void main(String[] args) {
        char arr[] = { 'a', 'b', 'c', 'd' };
        String str = "abcde";
        // Strings are immutable - means no change in the existing string, everytime a
        // new string formed for any change

        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        String name = sc.nextLine();
        // System.out.println("name is " + name);
        System.out.println("name is " + name);

        // length function
        System.out.println("length of name is " + name.length());

        // concatenation
        String fname = "Ayush", lname = "Tiwari";
        String fullname = fname + " " + lname;
        System.out.println(fullname);

        // .charAt function
        System.out.println(fullname.charAt(7));

        // call printchars function
        printChars(fullname);

        // call function isStrPalindrome
        System.out.println(isStrPalindrome("neon"));

        // call function shortest path
        System.out.println(shortestPathInDirections("NNSEEWEEENSNWEE"));

        // .eqauls function
        String s1 = "ayush";
        String s2 = "ayush";
        String s3 = new String("ayush");

        if (s1 == s2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if (s1 == s3) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if (s1.equals(s3)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.println(substring("Helloworld", 3, 8));
        // Inbuilt substring
        System.out.println("ayushtiwari".substring(3,9));

        // CompareTo inbuilt function: compare 2 strings lexographically
        // it gives -ve, 0 & +ve as result, that means str1 is lesser than, equal to & greater than respectively to str2
        // it takes capital letters & small letters as different
        System.out.println("Ayush".compareTo("ayush"));

        // comparetoIgnoreCase, it takes the capital & small letters as equal 
        System.out.println("Ayush".compareToIgnoreCase("ayush"));


        String fruits[] = {"apple", "papaya", "mango", "banana"};
        String largestfruit = fruits[0];
        for(int i=0; i<fruits.length; i++){
            if(largestfruit.compareTo(fruits[i]) < 0){
                largestfruit = fruits[i];
            }
        }
        System.out.println(largestfruit);

        // Interning - agar pehle se aapke liye koi value define hai to koi dusra variable bhi same value ko hi point karega heap memory ke andar
        // If we make the a variable with using "new" keyword, then it will make an another value, and the variable point on this new value.

        // StringBuilder - we use this over String because, string are immutable and always make a copy of new value in the memory, also takes more time for caopying these values
        // To avoid these problems, we use String Builder
        // String Builders are mutable 

        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());

        // call changetouppercase function
        String sentence = "hello, my name is ayush tiwari";
        System.out.println(changeToUpperCase(sentence));

        // call compress function
        String newsstr = "aaabbcccdd";
        System.out.println(stringCompress(newsstr));

        // call compress function
        System.out.println(compress(newsstr));

        // qusetion-1
        System.out.println(countVowels("Hello, my name is Ayush Tiwari"));

        // Question-2 : compare the Strings and give result
        String a = "ShradhaDidi", b= "ApnaCollege", c="ShradhaDidi";
        System.out.println(a.equals(b)+ " "+ a.equals(c));

        // Question-3 : output of the code
        String replaced= "ApnaCollege".replace("l", "");
        System.out.println(replaced);

        // find anagrams of string
        System.out.println(anagrams("race", "care"));

        // intern method in string
        String var1 = new String("ayush");
        String var2 = var1.intern();

        System.out.println("1: "+(var1==var2));
        System.out.println("2: "+ var1.equals(var2)); 

        String var3 = "ayush";
        System.out.println("3: "+s2.equals(s3));

        // StringBuffer - Mutable
        // methods : append(), delete(), reverse(), insert(), ensureCapacity()

        StringBuffer sbuff = new StringBuffer();
        sbuff.append("ayush");
        sbuff.append(" ");
        sbuff.append("tiwari");
        String result = sbuff.toString();
        System.out.println(result);
    }
}
