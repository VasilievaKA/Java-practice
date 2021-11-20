package Main;

public class Main {

    public static void main(String[] args) {
        Student[] stud = new Student[]{
                new Student(12, 4),
                new Student(1, 3),
                new Student(23, 5),
                new Student(14, 4)
        };

        System.out.println("сортировка вставками\n");
        //сортировка вставками
        for (int i = 1; i < stud.length; i++) {
            Student current = stud[i];
            int j = i - 1;
            for (; j >= 0 && current.compareTo(stud[j]) < 0; j--) {
                stud[j + 1] = stud[j];
            }
            stud[j + 1] = current;
        }
        for (Student s : stud) {
            System.out.println(s);
        }
        System.out.println("\nбыстрая сортировка\n");

        QuickSort(stud, stud.length);
        for (Student s : stud) {
            System.out.println(s);
        }
        System.out.println("\nсортировка со слиянием\n");
        Student[] stud2 = new Student[]{
                new Student(35, 412),
                new Student(16, 105),
                new Student(18, 128),
                new Student(222, 201)
        };
        Student[] allStudents = new Student[stud.length + stud2.length];
        System.arraycopy(stud, 0, allStudents,0,stud.length);
        System.arraycopy(stud2, 0, allStudents,stud.length, stud2.length);
        mergeSort(allStudents, allStudents.length);
        for (Student s : allStudents) {
            System.out.println(s);
        }
    }

    //быстрая сортировка
    public static void QuickSort(Student[] stud, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Student[] left = new Student[mid];
        Student[] right = new Student[n - mid];

        System.arraycopy(stud, 0, left, 0, mid);
        System.arraycopy(stud, mid, right, 0, n - mid);
        QuickSort(left, mid);
        QuickSort(right, n - mid);
        Sort(stud, right, left, mid, n - mid);
    }

    public static void Sort(Student[] stud, Student[] left, Student[] right, int l, int r) {
        int i = 0, j = 0, k = 0;
        while (i < l && j < r) {
            if (left[i].compareTo(right[j]) <= 0) {
                stud[k++] = left[i++];
            } else {
                stud[k++] = right[j++];
            }
        }
        while (i < l) {
            stud[k++] = left[i++];
        }
        while (j < r) {
            stud[k++] = right[j++];
        }
    }

        //сортировка со слиянием
    public static void mergeSort(Student[] a, int n)
    {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Student[] left = new Student[mid];
        Student[] right = new Student[n - mid];

        System.arraycopy(a, 0, left, 0, mid);
        System.arraycopy(a, mid, right, 0, n - mid);
        mergeSort(left, mid);
        mergeSort(right, n - mid);
        merge(a, left, right, mid, n - mid);
    }
    public static void merge(Student[] a, Student[] left, Student[] right, int l, int r)
    {
        int i = 0, j = 0, k = 0;
        while (i < l && j < r) {
            if (left[i].compareTo(right[j]) <= 0) {
                a[k++] = left[i++];
            }
            else {
                a[k++] = right[j++];
            }
        }
        while (i < l) {
            a[k++] = left[i++];
        }
        while (j < r) {
            a[k++] = right[j++];
        }
    }
}

