package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1253 {
    static int n,cnt;
    static int [] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        cnt = 0;
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        for(int i=0; i<n; i++){
            twoPoint(i);
        }
        System.out.println(cnt);
    }

    static void twoPoint(int fixIndex){
        int start= 0;
        int end = n-1;
        int target = arr[fixIndex];

        while (start<end){
            if(start == fixIndex){
                start++;
            }else if (end == fixIndex){
                end--;
            }
            else{
                if(target > arr[start]+arr[end]){
                    start++;
                } else if (target == arr[start]+arr[end]) {
                    cnt++;
                    return;
                }else{
                    end--;
                }
            }
        }
    }
}
