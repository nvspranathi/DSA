
public class RemoveDuplicates{
    int removeDuplicates(int[] nums){
        int i=0,j=1;
        int n = nums.length;
        while(j<n){
            if(nums[j]!=nums[j-1]){
                nums[++i] = nums[j];
            }
            j++;
        }
        return i+1;
    }
    public static void main(String[] args){
        RemoveDuplicates rd = new RemoveDuplicates();
        int[] nums = {1,1,2,2,3,4,5,5,6,7,8,8,9};
        int n = rd.removeDuplicates(nums);
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}