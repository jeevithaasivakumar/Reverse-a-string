public class reverse {
    public static void main(String[] args) {
        String s = "selenium";
        int len = s.length(); // (8) method to count length of string
        String rev = ""; // to store reverse
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);   //muineles

        }
        System.out.println(rev);
    }
}
