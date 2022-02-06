# Array Initialization
```java
int MyArray1[]; // Declares an array
int[] MyArray2; // Also declares an array
int MyArray2[] = new int[10]; // Initializes MyArray2 and allocates space for 10 ints. No values are assigned to the array
```

Note: the length of an array cannot be changed without assigning a new array to the array variable. The length of an array in memory is immutable
# Array Literal
```java
int arr[] = {1,2,3,4,5};
```
# Accessing and Assigning Array values
```java 
int arr[] = {1,2,3,4,5};
arr[0] = 4;
int b = arr[0];
```

## Foreach loops
```java
int[] intList = new int[10];
for ( int item : intList ) {   // INCORRECT! DOES NOT MODIFY THE ARRAY!
   item = 17;
}
```
# Variable Arity Methods (Varargs)
```java
add(1,2);
add(2,3,1);
public int add(int... nums) {
    // Treat a variable arity property as an array
    int sum = 0;
    for (int n : nums) {
        sum += n;
    }
    return sum;
}
```
# Sorting
## Bubble Sort
Terrible do not use unless you want to reduce code efficiency. Iterates through all adjacent pairs and swaps them if they are out of order.
```java
int[] array;

int swaps = -1;
while (swaps != 0) {
    for (int i = 0; i < array.length-1;i++) {
        swaps = 0;
        if (array[i] > array[i+1]) {
            int temp = array[i];
            array[i] = array[i+1];
            array[i+1] = temp;

            swaps++;
        }
    }
}
```

## Insertion Sort
**Insertion Sort of an array, arr, of N elements into ascending order:**
1. For k in range [1,N)
   1.1 Remove element arr[k] and store in x
   1.2 For i starting at k-1 and for all preceding elements greater than x
      1.2.1 Move arr[i] one position to the right in the array
   1.3 Insert x at its correct location

Good Example: https://youtu.be/OGzPmgsI-pQ

## Selection Sort
**Selection Sort of an array, arr, of N elements into ascending order:**
1. For i in range [0,N)
   1.1. Let smallestIndex = i
   1.2. For j in range (i,N)
      1.2.1. If arr[j] < arr[smallestIndex]
         1.2.1.1. smallestIndex = j
   1.3. If i != smallestIndex
      1.3.1. Swap arr[i] and arr[smallestIndex]


# Searching
## Sequential Search
```java
int getIndexOfElementWithValue(int[] array, int val) {
    for (int i = 0; i < array.length; i++) {
        if (array[i] == val) {
            return i;
        }
    }
    return -1; // Used to indicate faliure
}
```
## Binary Search
Can only be used on sorted arrays


# Multidimensional Arrays
```
int arr[][] = new int[5][10];
arr[0][9] = 4;
int b = arr[0][9];
```
