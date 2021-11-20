package Main;

public class QuickSort extends Student{
    public QuickSort(int idNum, int GPA) {
        super(idNum, GPA);
    }
    public void Sort (int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i + 1; j <9; j++)
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
                if (i != min_i) {
                    int tmp = arr[i];
                    arr[i] = arr[min_i];
                    arr[min_i] = tmp;
                }
        }
    }
}
