public class Assign3_Q1
{
    void sort01(int arr[], int size)
    {
        int left = 0;
        int right = size - 1;

        while (left < right)
        {
            while (arr[left] == 0 && left < right)
                left++;

            while (arr[right] == 1 && left < right)
                right--;

            if (left < right)
            {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args)
    {
        Assign3_Q1 s = new Assign3_Q1();
        int arr[] = {0, 1, 0, 1, 1, 1};
        int i, arr_size = arr.length;

        s.sort01(arr, arr_size);

        System.out.print("Array sorting 0&1: ");
        for (i = 0; i < 6; i++)
            System.out.print(arr[i] + " ");
    }
}
