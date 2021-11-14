import java.util.Scanner;

class StringSeInterger {

    static int stringToInt(String inputStr)
    {
        if (inputStr.length() == 1) {
            return (inputStr.charAt(0) - '0');
        }
        double g = stringToInt(inputStr.substring(1));
        double h = inputStr.charAt(0) - '0';
        h = h * Math.pow(10, inputStr.length() - 1) + g;

        return (int)(h);
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String inputStr = input.nextLine();
        System.out.println(stringToInt(inputStr));
    }
}
