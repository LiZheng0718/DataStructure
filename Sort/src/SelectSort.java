import java.util.Arrays;

public class SelectSort {           //选择排序法
    public static void main(String[] args) {
        int [] arr = new int[]{91, 7, 12, 76, 8};
        SelectSort(arr);
    }
    public static void SelectSort(int [] arr){
        for(int i = 0;i< arr.length-1;i++){
            int min = arr[i];
            int index = i;
            for(int x=i;x< arr.length;x++){
                if(arr[x]<min) {
                    min = arr[x];
                    index = x;
                }
            }
            arr[index] = arr[i];
            arr[i] = min;
            System.out.println("No." + (i+1)+ " sort:");
            System.out.println(Arrays.toString(arr));
        }
    }
}


//第一次从 arr[0]~arr[n-1]中选取最小值，与 arr[0] 交换
//第二次从 arr[1]~arr[n-1]中选取最小值， 与 arr[1] 交换
//第三次从 arr[2]~arr[n-1]中选取最小值， 与 arr[2] 交换。。。。。