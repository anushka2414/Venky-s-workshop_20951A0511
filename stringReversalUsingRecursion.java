import java.util.Scanner;

public class stringReversalUsingRecursion {

    public static String revString(String para) {
        if (para.length() == 0) {
            return "";
        }
        return revString(para.substring(1))+ para.charAt(0);
    }

    public static void main(String args[]){
            Scanner in = new Scanner(System.in);
            String[] str = in.nextLine().split(" ");

            for(int i=0; i<str.length;i++){
                str[i] = revString(str[i]);
            }

            System.out.println(String.join(" ", str));

            in.close();
    }
}
