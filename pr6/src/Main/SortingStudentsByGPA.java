package Main;

public class SortingStudentsByGPA extends Student {

    public SortingStudentsByGPA(int idNum, int GPA) {
        super(idNum, GPA);
    }

    public void quickSort(int arr[], int first, int last)
{
    if(first<last){
    int devideIndex = partition(arr, first, last);
    quickSort(arr, first, devideIndex-1);
    quickSort(arr, devideIndex, last);
    }

}
public int partition(int arr[],int first, int last){
    int rightIndex = last;
    int leftIndex = first;
    int privot = arr[first];
    while (leftIndex<=rightIndex){
        while (arr[leftIndex]<privot)
        {
            leftIndex++;
        }
        while (arr[rightIndex]>privot)
        {
            rightIndex--;
        }
        if (leftIndex <= rightIndex)
        {
            swap(arr, leftIndex, rightIndex);
            leftIndex++;
            --rightIndex;
        }
    }

    return leftIndex;
}
public void swap(int arr[], int ind1, int ind2)
{
    int val = arr[ind1];
    arr[ind1]=arr[ind2];
    arr[ind2]=val;
}
}
