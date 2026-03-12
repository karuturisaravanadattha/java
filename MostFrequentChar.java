class MostFrequentChar {
    public static void main(String[] args) {
        String str = "success";
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        char maxChar = str.charAt(0);
        int max = freq[maxChar];

        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] > max) {
                max = freq[str.charAt(i)];
                maxChar = str.charAt(i);
            }
        }

        System.out.println("Most frequent character: " + maxChar);
    }
}

			