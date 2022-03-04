package search;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author TaeWK
 */
public class SeqSearch {

    static int binarySearch(int[] arr,int n, int key) {
        int st = 0;
        int ed = arr.length - 1;
        int mid = ((int) (st + ed) / 2);

        for(int i = 0; ((int) i < arr.length / 2); i++){

            mid = ((int) (st + ed) / 2);

            if(key == arr[mid]){
                return mid;
            }else if(arr[mid] > key){
                st = 0;
                ed = mid-1;
            }else if(arr[mid] < key){
                st = mid+1;
                ed = arr.length-1;
            }
            System.out.println("start = "+ st);
            System.out.println("end = "+ ed);
            System.out.println("mid = " + mid);

        }
        return -1;
    }

    static int seqSearch(int[] a , int n, int key){
        for (int i = 0; i < a.length; i++)
            if(a[i] == key)
                return i;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 사이즈: ");
        int num = sc.nextInt();
        int[] x = new int[num];

        for(int i=0; i<num; i++){
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();

                if(i != 0 && x[i] < x[i-1]){
                    System.out.println(x[i-1]+"보다 작은 수는 넣을 수 없습니다.");
                    i--;
                    continue;
            }
        }

        System.out.print("검색 할 값: ");
        int key = sc.nextInt();

        //int idx = seqSearch(x,num,key);
        int idx = binarySearch(x,num,key);

        if(idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(key + "은 x[" + idx + "]에 있습니다.");
    }
}