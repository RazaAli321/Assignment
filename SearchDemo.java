public class SearchDemo {
    static int binarySearch(int[] a, int k) {
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] == k) return m;
            if (k < a[m]) r = m - 1;
            else l = m + 1;
        }
        return -1;
    }

    static int linearRec(int[] a, int i, int k) {
        if (i == a.length) return -1;
        if (a[i] == k) return i;
        return linearRec(a, i + 1, k);
    }

    public static void main(String[] args) {
        int[] a = {3,8,12,20,25,30};
        System.out.println(binarySearch(a, 20));
        System.out.println(linearRec(a, 0, 12));
    }
}