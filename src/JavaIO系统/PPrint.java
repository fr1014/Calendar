package JavaIO系统;

import java.util.Arrays;
import java.util.Collection;

public class PPrint {
    public static String pFormat(Collection<?> c) {
        if (c.size() == 0) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (Object elem : c) {
            if (c.size() != 1)
                sb.append("\n ");
            sb.append(elem);
        }
        if (c.size() != 1)
            sb.append("\n");
        sb.append("]");
        return sb.toString();
    }

    public static void print(Collection<?> c){
        System.out.println(pFormat(c));
    }

    public static void pPrint(Object[] c){
        System.out.println(pFormat(Arrays.asList(c)));
    }
}
