
public class FindMaxDemo {

    public static Comparable findMax(Comparable[] arr) {
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(arr[maxIndex]) > 0)
                maxIndex = i;
        }
        return arr[maxIndex];
    }

    public static void main(String[] args){
       String[] strings = {"i","love","you"};
       System.out.println(findMax(strings));
    }
}
