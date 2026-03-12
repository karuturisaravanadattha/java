class MostFreqAlphabet {
    public static void main(String[] args) {

        String str = "JAVAProgrammingLANGUAGE";

        // 0–25: A–Z, 26–51: a–z
        int[] freq = new int[52];

        // Count frequency
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                freq[ch - 'A']++;
            } else if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a' + 26]++;
            }
        }

        // Find maximum frequency
        int max = 0;
        for (int i = 0; i < 52; i++) {
            if (freq[i] > max) {
                max = freq[i];
            }
        }

        // Print most frequent character(s)
        System.out.println("Most frequent character(s):");

        for (int i = 0; i < 52; i++) {
            if (freq[i] == max && max > 0) {
                if (i < 26) {
                    System.out.println((char) (i + 'A') + " -> " + freq[i]);
                } else {
                    System.out.println((char) (i - 26 + 'a') + " -> " + freq[i]);
                }
            }
        }
    }
}

