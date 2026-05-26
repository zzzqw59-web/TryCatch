package test;

public class StringComparisionMain {
    static void main(String[] args) {
        String str1 = "Hello, Java!";
        String str2 = "hello, java!";
        String str3 = "Hello, World!";

        System.out.println("str equals str2: " + str1.equals(str2));
        System.out.println("str equals str2: " + str1.equalsIgnoreCase(str2));

        System.out.println("'b' compareTo 'a': " + "c".compareTo("a"));
        System.out.println("'b' compareTo 'a': " + "c".compareTo("b"));
        System.out.println("'b' compareTo 'a': " + "a".compareTo("b"));

        System.out.println("str1 strats with 'hello'" + str1.startsWith("Hello"));
    }
}
