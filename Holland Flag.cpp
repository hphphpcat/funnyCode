// split array to less then pivot equal to pivot greater than pivot
int split(int arr[], int len, int pivot)
{
    int i = 0;
    int j = 0;
    int k = len - 1;
    while (j <= k)
    {
        if (arr[j] < pivot)
            swap(arr[i++], arr[j++]);
        else if (arr[j] > pivot)
            swap(arr[k--], arr[j]);
        else
            j++;
    }
}