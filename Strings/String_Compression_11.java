// public class String_Compresion_11 {
//     public static String compression(String str) {
//         String newStr = "";
//         for (int i = 0; i < str.length(); i++) {
//             Integer count = 1;
//             while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
//                 count++;
//                 i++;
//             }
//             newStr += str.charAt(i);
//             if (count > 1) {
//                 newStr += count.toString();
//             }
//         }
//         return newStr;
//     }
//     public static void main(String[] args) {
//         String str = "aaabbccdee";
//         System.out.println(compression(str));
//     }
// }



public class String_Compression_11 {
    public static String compression(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int count = 1;

            // count repeating characters
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            // add character
            sb.append(str.charAt(i));

            // add count if > 1
            if (count > 1) {
                sb.append(count);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbccdee";
        System.out.println(compression(str));
    }
}