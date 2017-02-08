public static int max(int[] arr) {
    if (arr.length == 0) {
        throw new IllegalArgumentException(); // ignore this case
    } else {
        int ret = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (ret < arr[i]) {
                ret = arr[i];
            }
        }
        return ret;
    }
}


/*
Relevant inputs: Array
Operations to count: comparison between ret and arr[i] (ret<arr[i])
Mathematical formula



Best case=1 Array of one element
Worst case =n-1 you have to check every element
Average case= n-1 you have to check every element as long as list is longer than 1








 */
