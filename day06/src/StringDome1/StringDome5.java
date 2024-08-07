package StringDome1;

public class StringDome5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String str = getTheString(arr);
        System.out.println(str);
    }

    public static String getTheString(int[] arr) {
        if(arr==null){
            return "";
        }
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1)
                str = str + arr[i] + ",";
            else
                str = str + (char) (arr[i] + 48);
        }
        str = str + "]";
        return str;
    }
}
