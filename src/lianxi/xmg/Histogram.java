package lianxi.xmg;

public class Histogram {
    private static final String[] words = {"I", "recommend", "polygene", "lubricants"};

    public static void main(String[] args) {
        int[] histogram = new int[5];
        for (String word1 : words) {
            for (String word2 : words) {
                String pair = word1 + word2;
                int bucket = Math.abs(pair.hashCode()) % histogram.length;
                histogram[bucket]++;
            }
        }
        int pairCount = 0;
        for (int freq : histogram)
            pairCount += freq;
        System.out.println('C' + pairCount);
    }
}