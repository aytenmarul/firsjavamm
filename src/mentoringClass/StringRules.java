package mentoringClass;

public class StringRules {
    public static void main(String[] args) {
        String str = "Books";
        //
        int charCount = str.length();
        int indexof = charCount - 1;

        System.out.println(charCount);
        System.out.println(indexof);//4
        System.out.println(str.toLowerCase());//books
        System.out.println(str.toUpperCase());//BOOKS

        System.out.println(str.startsWith("B"));
        System.out.println(str.startsWith("F"));
        System.out.println(str.endsWith("s"));
        System.out.println(str.endsWith("S"));
        System.out.println("================");
        String word = "Apple";
        System.out.println(word.substring(1, 4));
        // System.out.println(word.substring());
        System.out.println(word.charAt(0) + " " + word.charAt(1) + "" + word.charAt(2) + "" + word.charAt(3) + "" + word.charAt(4));

        System.out.println(word.concat(" sweet"));// Apple sweet

        String s1 = "      Books       is   interseting";
        String trimmed = s1.trim();
        System.out.println(trimmed);//Books is interseting
        //System.out.println("========");
        String b1 = "";
        System.out.println(b1.isEmpty());
        String b2 = "I love travel";
        System.out.println(b2.isEmpty());
        System.out.println("=====");
      //  System.out.println(b1.isBlank());

        System.out.println(b2.replace("love", "hate"));
        String sentence = "  I cooked chicken in the kitchen   ";

        System.out.println(sentence.trim());

    }
}
