

public class Remove_Duplicates_02 {
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            //duplicate
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            //not duplicate
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        }
    }
        public static void main(String[] args) {
            String str = "appnnacollege";
            boolean map[] = new boolean[26];
            removeDuplicates(str, 0, new StringBuilder(""), map);
        }
}
