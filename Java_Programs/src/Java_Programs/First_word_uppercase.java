package Java_Programs;

public class First_word_uppercase {
    public static void main(String[] args) {
        String str = "hi how are you";
        char[] ch = str.toCharArray();

        // Ensure the first character is uppercase
        if (ch[0] >= 'a' && ch[0] <= 'z') {
            ch[0] = (char) (ch[0] - 32);
        }

        // Traverse the array to capitalize the first character after each space
        for (int i = 1; i < ch.length; i++) {
            if (ch[i - 1] == ' ' && ch[i] >= 'a' && ch[i] <= 'z') {
                ch[i] = (char) (ch[i] - 32);
            }
        }

        // Convert the character array back to a string and print it
        System.out.println(new String(ch));
    }
}
