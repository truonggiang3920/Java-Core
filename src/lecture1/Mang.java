public class Mang {
    public static void main(String[] args) {
        String s = "Good morning Jack";
        char c = s.charAt(3);
        System.out.println(c);
        int index = s.indexOf("ng");
        System.out.println(index);
        int lastIndex = s.lastIndexOf("ck");
        System.out.println(lastIndex);
        String subString = s.substring(5,12);
        System.out.println(subString);
    }
}
