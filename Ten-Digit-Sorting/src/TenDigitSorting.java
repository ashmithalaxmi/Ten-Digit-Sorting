import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class TenDigitSorting {
    static int tenDigitSorting(int n){
        return (n/10)%10;
    }
    static Integer[] sort(Integer[] arr){
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer n1, Integer n2) {
                int digit1= tenDigitSorting(n1);
                int digit2= tenDigitSorting(n2);
                if(digit1 == digit2){
                    return n2-n1;
                } else{
                    return digit1-digit2;
                }
            }

        });
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        arr = sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
