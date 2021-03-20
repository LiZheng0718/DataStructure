import java.util.Arrays;

public class InsertSort {      //插入排序
    public static void main(String[] args) {
        int [] arr = new int[]{91, 35, 12, 76, 8};
        insertSort(arr);
    }
    public static void insertSort(int [] arr){
        for(int i =1;i< arr.length;i++){
            int insertVal = arr[i];
            int insertIndex = i-1;
            while((insertIndex>=0)&&insertVal<arr[insertIndex]){
                arr[insertIndex+1] = arr[insertIndex];
                insertIndex--;
            }
            arr[insertIndex+1] = insertVal;
            System.out.println("No."+i+".");
            System.out.println(Arrays.toString(arr));
        }
    }
}
