import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalendarDate {

    public static void printCalendar(Calendar calendar, int day) {
        StringBuffer sb = new StringBuffer();
        sb.append("日\t一\t二\t三\t四\t五\t六\t").append("\n");
        for (int i = 1; i < calendar.get(Calendar.DAY_OF_WEEK); i++) {
            sb.append("\t");
        }
        int max = calendar.getActualMaximum(Calendar.DATE);
        int k = calendar.get(Calendar.DAY_OF_WEEK);
        for (int i = 1; i <= max; i++) {
            sb.append(i).append("\t");
            if ((i + k) % 7 == 1) {
                sb.append("\n");
            }
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入日期(格式类似：2018-1-9):");
        String dd = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = sdf.parse(dd);
            Calendar calendar = Calendar.getInstance();
            //将得到的date设置成日历的时间
            calendar.setTime(date);
            //得到输入日期在一年中的第几天
//            int year = calendar.get(Calendar.DAY_OF_YEAR);
//            System.out.println(year);20
            //得到输入日期在某个月的第几天
            int day = calendar.get(Calendar.DATE);
            calendar.set(Calendar.DATE, 1);
            printCalendar(calendar, day);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
