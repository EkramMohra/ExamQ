import java.util.Scanner;

public class Q1 {
    public static String changeId(int id) {
        int unityDigit = id % 10;
        int n = id / 10;
        int TenthDigit = n % 10;
        String strId = String.valueOf(id);
        String newId = "";
        for (int i = 0; i < strId.length(); i++) {
            if (i == strId.length() - TenthDigit) {
                newId += unityDigit;
            }
            newId += strId.charAt(i);
        }
        return newId;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name and id");
        String input = sc.nextLine();
        var arr = input.split(" ");
        String name = arr[0];
        int id = Integer.parseInt(arr[1]);
        String newId=changeId(id);
        System.out.println("Name "+name+" newId "+newId);
    }
}
