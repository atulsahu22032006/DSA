class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        int[] result = new int[list.size()];
        int ind = 0;
        for (int i : list) {
            result[ind++] = i;
        }
        return result;
    }
}