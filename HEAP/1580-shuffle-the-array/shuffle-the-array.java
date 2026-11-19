
class Solution {
    public int[] shuffle(int[] nums, int n) {

        int[] ans = new int[nums.length];

        int index = 0;
        int i = 0;
        int j = n;

        while (index < nums.length) {
            ans[index] = nums[i];
            i++;
            index++;

            ans[index] = nums[j];
            j++;
            index++;
        }

        return ans;
    }
}
