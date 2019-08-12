import java.util.Arrays;
public class app2 {


// Question 1 method of adding

    public static void main(String[] args) {
        totalOdds();
        totalSum();
    }

    public static void totalSum() {


        int[] nums1 = {0, 1, 2, 3, 4, 5, 6, 7};
        int sum1 = 0;
//        total();

        for (int i = 0; i < nums1.length; i++) {

            sum1 += nums1[i];

            System.out.println(sum1);

        }

    }

    public static void totalOdds() {
        int[] nums2 = {0, 1, 2, 3, 4, 5, 6, 7};
        int sum2 = 0;
        for (int i = 0; i < nums2.length; i++) {

//            sum2 += nums2[i];

            System.out.println(sum2);

            sum2 = nums2[2] + nums2[4] + nums2[6] + nums2[7];
        }
        ;

    }
}


