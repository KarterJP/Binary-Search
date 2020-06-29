import java.io.*;
import java.util.*;

public class BinarySearch {

    static int binarySearch(int[] a, int x, int left, int right) {
        if (right < left) {
            return -1;
        }
        int mid = left + ((right - left) / 2);
        if (x == a[mid]) {
            return mid;
        }
        if (x < a[mid]) {
            return binarySearch(a, x, left, mid-1);
        } else {
            return binarySearch(a, x, mid+1, right);
        }
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
		
        int m = scanner.nextInt();
        int[] b = new int[m];
		
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            System.out.print(binarySearch(a, b[i], 0, n-1) + " ");
        }
    }
	
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
