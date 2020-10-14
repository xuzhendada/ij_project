public class tst {
    public static void main(String[] args) {
        System.out.println(getMin(1));
    }

    public static int getMin(int second) {
        if (second > 0 && second < 60) {
            return 1;
        } else {
            int minute = second / 60;
            if (second % 60 >= 30) minute += 1;
            return minute;
        }
    }
}
