package Java_Programs;

import java.util.Arrays;

public class Sum_of_Integers_String {
    public static void main(String[] args) {
        String str = "pro12gr34amm21in10g";
        str = str.replaceAll("[^0-9]", " ");
        String[] s1 = str.trim().split("\\s+");
        System.out.println(Arrays.toString(s1));
        
        int sum = 0;
        for (String num : s1) {
            if (!num.isEmpty()) { 
                sum += Integer.parseInt(num);
            }
        }
        
        System.out.println("The sum is " + sum);
    }
}
