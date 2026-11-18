class Solution {
    public int mostWordsFound(String[] sentences) {
        int MaxWords = 0;
        for (String Sentence : sentences) {
            int count = 0;
            String[] words = Sentence.split(" ");
            count = words.length;
            MaxWords = Math.max(count, MaxWords);
        }
        return MaxWords;
    }
}