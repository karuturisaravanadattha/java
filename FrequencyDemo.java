import java.util.Scanner;

class FrequencyDemo{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();

        char maxChar = s.charAt(0);
        int maxCount = 0;

        for (int i = 0; i < s.length(); i++) {
            int count = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxChar = s.charAt(i);
            }
        }

        System.out.println("Max repeated letter: " + maxChar);
        System.out.println("Repeated times: " + maxCount);
    }
}