import java.util.Arrays;

public class BubbleSort {         //冒泡排序法
    public static void main(String[] args) {
        int [] arr = new int[]{ 3, 9, -1, 10, -2 };
        BubbleSort(arr);
    }
    public static void  BubbleSort(int [] arr){
        int temp;
        boolean flag = false;
        for(int i =0;i< arr.length-1;i++){
            for(int x = 0;x< arr.length-1-i;x++){
                if(arr[x]>arr[x+1]){
                    temp = arr[x+1];
                    flag = true;
                    arr[x+1] = arr[x];
                    arr[x] = temp;
                }
            }
                System.out.println("No." + (i+1)+ " sort:");
                System.out.println(Arrays.toString(arr));
                if(!flag){
                    break;
                }
                else
                    flag = false;
        }
    }
}
//从数组 arr 第一个元素开始，与其后面一个元素比较大小
//如果 arr[i] > arr[i+1] ，则交换，将大的元素换到后面去