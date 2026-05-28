public class Sorted_and_Rotated_Array_03 {
    public static int search(int[] arr, int tar, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;

        //case FOUND
        if (arr[mid] == tar) {
            return mid;
        }

        // mid on L1
        if (arr[si] <= arr[mid]) {
            if (tar >= arr[si] && tar <= arr[mid]) {
                return search(arr, tar, si, mid - 1);
            } else {
                //case b: right
                return search(arr, tar, mid + 1, ei);
            }
        }
        // mid on L2
        else {
            // case c: right
            if (tar >= arr[mid] && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            } else {
                // case d: left
                return search(arr, tar, si, mid - 1);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int tar = 6;
        int ans = search(arr, tar, 0, arr.length - 1);
        System.out.println(ans);
    }
}
