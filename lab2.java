import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lab2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = in.nextLine();
        str.toLowerCase();
        Pattern p = Pattern.compile("(?i)([a-f\\d]{8}-([a-f\\d]{4}-){3}[a-f\\d]{12})");
        Matcher m = p.matcher(str);
        if (m.find())
            System.out.print("данная строка GUID со скобками");
        else
            System.out.print("данная строка GUID без скобкок");
    }
}
