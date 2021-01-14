import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class KataEncrypt {

    public static String encrypt(final String text, int n) {


        if (n <= 0 || text == null || text.isEmpty()) {
            return text;
        }


        List<Character> args1 = new ArrayList<>();
        List<Character> args2 = new ArrayList<>();

        for (int i = 1; i < text.length(); i += 2) {
            args1.add(text.charAt(i));

        }

        for (int j = 0; j < text.length(); j += 2) {
            args2.add(text.charAt(j));
        }


        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        // Appends characters one by one
        for (Character ch : args1) {
            sb1.append(ch);
        }
        for (Character ch : args2) {
            sb2.append(ch);
        }

        String str3 = sb1.toString() + sb2.toString();


        return encrypt(str3, --n);
    }


    public static String decrypt(final String encryptedText, int n) {

        if (n <= 0 || encryptedText == null || encryptedText.isEmpty()) {
            return encryptedText;
        }


        List<Character> args1 = new ArrayList<>();

        for (int i = 0; i < encryptedText.length(); i++) {
            args1.add(encryptedText.charAt(i));
        }

        String result;
        StringBuilder sb3 = new StringBuilder();


        for (int i = args1.size() / 2, j = 0; i <= args1.size() - 1 || j <= args1.size() / 2 - 1; i++, j++) {

            sb3.append(args1.get(i));
            sb3.append(args1.get(j));
        }

        if (args1.size() % 2 == 1) {

            result = sb3.toString().substring(0, sb3.length() - 1);
        } else {
            result = sb3.toString();
        }

        return decrypt(result, --n);


    }


}







