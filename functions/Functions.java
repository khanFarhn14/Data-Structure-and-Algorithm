package DSA.functions;

public class Functions {
    void printArray(int[] nums){
        int n = nums.length;
        for(int i = 0; i < n; i++){
            System.out.println(nums[i]);
        }
    }

    void insertElement(int[] nums, int index, int value){
        --index;
        int n = nums.length;
        for(int i = (n-1); i > index; i--){
            nums[i] = nums[i-1];
        }
        nums[index] = value;
    }
}
