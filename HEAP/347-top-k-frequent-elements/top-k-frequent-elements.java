class Pair implements Comparable<Pair> {
    int ele;
    int freq;

    Pair(int ele, int freq) {
        this.ele = ele;
        this.freq = freq;
    }

    public int compareTo(Pair p) {
        if (this.freq == p.freq)
            return this.ele - p.ele;

        return this.freq - p.freq;
    }
}

class Solution {
    public int[] topKFrequent(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int ele : arr) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        // Min Heap
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for (int ele : map.keySet()) {

            int freq = map.get(ele);

            pq.add(new Pair(ele, freq));

            if (pq.size() > k)
                pq.remove();
        }

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            Pair top = pq.remove();
            ans[i] = top.ele;
        }

        return ans;
    }
}