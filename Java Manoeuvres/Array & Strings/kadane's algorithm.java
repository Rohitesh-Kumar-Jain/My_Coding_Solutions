public int kandaneModified(int[] arr) {
  int maxEndHere = arr[0];
  int maxSoFar = arr[0];
  for(int i=1;i<arr.length;i++){
   maxEndHere = Math.max(arr[i], maxEndHere+arr[i]);
   maxSoFar = Math.max(maxSoFar,maxEndHere);
  }
  return maxSoFar;
 }



// modified kadane's algo for finding minimum subarray sum.
int  meh = nums[0];
int minsf = nums[0];
for(int i=1;i<nums.length;i++){
    meh = Math.min(nums[i],meh + nums[i]);
    minsf = Math.min(minsf,meh);
}


 // below is the actual kadane's algorithm that works for only positive numberes:
 public int kandaneForMaxSubArray(int[] arr) {
 int maxEndHere = 0;
 int maxSoFar = 0;
 for (int i = 0; i < arr.length; i++) {
 maxEndHere += arr[i];
 if (maxEndHere < 0) {
 maxEndHere = 0;
 }
 if (maxSoFar < maxEndHere) {
 maxSoFar = maxEndHere;
 }
 }
 return maxSoFar;
 }
