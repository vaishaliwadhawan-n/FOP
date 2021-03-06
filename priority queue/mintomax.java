<<<<<<< HEAD
  import java.util.*;
class mintomax
{ 
    // To heapify a subtree with root at given index 
    static void MaxHeapify(int arr[], int i, int n) 
    { 
        int l = 2*i + 1; 
        int r = 2*i + 2; 
        int largest = i; 
        if (l < n && arr[l] > arr[i]) 
            largest = l; 
        if (r < n && arr[r] > arr[largest]) 
            largest = r; 
        if (largest != i) 
        { 
            // swap arr[i] and arr[largest] 
            int temp = arr[i]; 
            arr[i] = arr[largest]; 
            arr[largest] = temp; 
            MaxHeapify(arr, largest, n); 
        } 
    } 
   
    //  builds max heap 
    static void convertMaxHeap(int arr[], int n) 
    { 
        // Start from bottommost and rightmost 
        // internal mode and heapify all internal 
        // modes in bottom up way 
        for (int i = (n-2)/2; i >= 0; --i) 
            MaxHeapify(arr, i, n); 
    } 
   
    static void printArray(int arr[], int size) 
    { 
        for (int i = 0; i < size; ++i) 
            System.out.print(arr[i]+" "); 
    } 
      
    public static void main (String[] args)  
    { 
        // array representing Min Heap 
        int arr[] = {3, 5, 9, 6, 8, 20, 10, 12, 18, 9}; 
        int n = arr.length; 
   
        System.out.print("Min Heap array : "); 
        printArray(arr, n); 
   
        convertMaxHeap(arr, n); 
   
        System.out.print("\nMax Heap array : "); 
        printArray(arr, n); 
    } 
=======
  import java.util.*;
class mintomax
{ 
    // To heapify a subtree with root at given index 
    static void MaxHeapify(int arr[], int i, int n) 
    { 
        int l = 2*i + 1; 
        int r = 2*i + 2; 
        int largest = i; 
        if (l < n && arr[l] > arr[i]) 
            largest = l; 
        if (r < n && arr[r] > arr[largest]) 
            largest = r; 
        if (largest != i) 
        { 
            // swap arr[i] and arr[largest] 
            int temp = arr[i]; 
            arr[i] = arr[largest]; 
            arr[largest] = temp; 
            MaxHeapify(arr, largest, n); 
        } 
    } 
   
    //  builds max heap 
    static void convertMaxHeap(int arr[], int n) 
    { 
        // Start from bottommost and rightmost 
        // internal mode and heapify all internal 
        // modes in bottom up way 
        for (int i = (n-2)/2; i >= 0; --i) 
            MaxHeapify(arr, i, n); 
    } 
   
    static void printArray(int arr[], int size) 
    { 
        for (int i = 0; i < size; ++i) 
            System.out.print(arr[i]+" "); 
    } 
      
    public static void main (String[] args)  
    { 
        // array representing Min Heap 
        int arr[] = {3, 5, 9, 6, 8, 20, 10, 12, 18, 9}; 
        int n = arr.length; 
   
        System.out.print("Min Heap array : "); 
        printArray(arr, n); 
   
        convertMaxHeap(arr, n); 
   
        System.out.print("\nMax Heap array : "); 
        printArray(arr, n); 
    } 
>>>>>>> 952faf54c1aecb69383e21fcc73ad86b755fd28a
}