import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class HelloDate {

    /**
     *
     * @param args 用来存储命令行参数
     */
    public static void main(String[] args){
        Date date = new Date();
        System.out.println(date);
        Scanner scanner = new Scanner(System.in);
        String date_sc = scanner.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        try {
            Date d = dateFormat.parse(date_sc);
            System.out.println(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
