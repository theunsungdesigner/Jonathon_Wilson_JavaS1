public class U1M1L5katasJonathonWilson {

    public static int subtractInts(int a, int b) {
        int sum = a - b;
        return sum;
    }

    public static int subtractOrZero(int a, int b) {
        int value = b - a;
        if (value < 0) {
           return 0;
        } else {
            return value;
        }

    }



    public static void main(String[] args) {
        int sum = subtractInts(5, 3);
        System.out.println(sum);

        int value = subtractOrZero(5, 3);
        System.out.println(value);

    }
}

