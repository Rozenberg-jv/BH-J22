package by.belhard.j22.lessons.lesson05.stringExample;

public class StringsExample {

    public static void main(String[] args) {

        String s1 = "abc";
        System.out.println(s1.hashCode());
        s1 += "def";
        System.out.println(s1.hashCode());

        System.out.println(s1);
        //
        System.out.println();
        //StringBuffer
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(sb.hashCode());
        sb.append("def");
        System.out.println(sb.hashCode());
        System.out.println(sb.toString());

        //
        System.out.println();

        String a = "abc";
        String b = "abc";
        String c = new String("abc");
        System.out.println(a.equals(b));
        System.out.println(a == b);
        System.out.println();
        System.out.println(a.equals(c));
        System.out.println(a == c);
        c = c.intern();
        System.out.println(a == c);
    }
}
