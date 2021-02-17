/*
It's not directly possible to reverse sort an array of primitives (i.e., int[] arr = {1, 2, 3};)
using Arrays.sort() and Collections.reverseOrder() because those methods require reference types 
(Integer) instead of primitive types (int).

However, we can use Java 8 Stream to first box the array to sort in reverse order:
*/
int[] arr = {1, 2, 3, 4, 5, 6};

// an array of reverse sorted ints
int[] arrDesc = Arrays.stream(arr).boxed()
    .sorted(Collections.reverseOrder())
    .mapToInt(Integer::intValue)
    .toArray();

System.out.println(Arrays.toString(arrDesc)); // outputs [6, 5, 4, 3, 2, 1]
