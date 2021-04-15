package letcode.array;



import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName: RepeatArray
 * @Description:
 * @Author: wlj
 * @Date: 2021/4/8 14:00
 */
public class RepeatArray {

        public static  int removeDuplicates(int[] nums) {
            Set<Integer> set = new HashSet<>();
            int size = nums.length;
            for (int i = 0; i < size - 1; i++) {
                if (set.contains(nums[i])) {
                    int tmp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = tmp;
                }
                set.add(nums[i]);
            }
            for (int i = 0; i < set.size(); i++) {
                System.out.println(nums[i]);
            }
            return set.size();
        }

    public static int remove(int[] nums) {
        if (nums != null && nums.length == 0) {
            return 0;
        }
        int left = 0;
        //如果左指针和右指针指向的值一样，说明有重复的，
        //这个时候，左指针不动，右指针继续往右移。如果他俩
        //指向的值不一样就把右指针指向的值往前挪
        for (int right = 1; right < nums.length; right++) {
            if (nums[left] != nums[right]) {
                nums[++left] = nums[right];
            }
        }
        return ++left;
    }

    public int removeDuplicates2(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }



    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        System.out.println(remove(nums));
    }
}
