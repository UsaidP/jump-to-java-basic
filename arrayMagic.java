public class arrayMagic {
    public static void main(String arga[]) {
        int nums[] = { 1, 25, 3, 15, 4 };

        for (int i = 0; i < nums.length; i++) {
            // System.out.println(nums[i]);
        }

        // * Enhance For loop */
        for (int num : nums) { // value comes one by one and assign to num;
            // System.out.println(num);
            System.out.println(num * 5);
        }
    }

}
