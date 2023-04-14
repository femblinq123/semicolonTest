public class Number3 {
    public static void main(String[] args) {
        String str = "Mississippi";
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 's') {
                count1++;
            }
            if (str.charAt(i) == 'i') {
                count2++;
            }
        }
        System.out.println("Number of occurrences of 's': " + count1);
        System.out.println("Number of occurrences of 'i': " + count2);
    }
}
