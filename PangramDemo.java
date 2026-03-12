class PangramDemo {
    final static int MAX_SIZE = 26;

    static boolean checkPangram(String str) {
        boolean[] isAlpPresent = new boolean[MAX_SIZE];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z')
                isAlpPresent[c - 'A'] = true;
            else if (c >= 'a' && c <= 'z')
                isAlpPresent[c - 'a'] = true;
        }

        for (int i = 0; i < MAX_SIZE; i++) {
            if (!isAlpPresent[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "Hello Java";
        if (checkPangram(str))
            System.out.println("Pangram");
        else
            System.out.println("Not Pangram");
    }
}