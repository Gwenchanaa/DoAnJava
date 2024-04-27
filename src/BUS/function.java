package BUS;
import java.util.regex.Pattern;

public class function {

    public static boolean checkPhone(String a) {
        Pattern p = Pattern.compile("^[0]\\d{9}$");
        if (p.matcher(a).find())
            return true;
        else
            return false;
    }

}
