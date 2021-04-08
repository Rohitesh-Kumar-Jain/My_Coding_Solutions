Here's the rock's solution:

https://leetcode.com/problems/minimum-absolute-sum-difference/discuss/1141362/JavaPython-3-Sort-and-binary-search-time-O(nlogn).


public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int[] sorted1 = nums1.clone(); 
        Arrays.sort(sorted1);
        int mx = Integer.MIN_VALUE;
        long sumDiff = 0;
        for (int i = 0; i < nums2.length; ++i) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            sumDiff += diff;
            // Eihter sorted1[idx] or sorted1[idx - 1] has the minimum difference from nums2[i]. 
            int idx = Arrays.binarySearch(sorted1, nums2[i]); 
            if (idx < 0) {
                idx = ~idx; // ~idx = -idx - 1, locate the insertion point.
            }
            if (idx < sorted1.length) {
                mx = Math.max(mx, diff - Math.abs(sorted1[idx] - nums2[i]));
            }
            if (idx > 0) {
                mx = Math.max(mx, diff - Math.abs(sorted1[idx - 1] - nums2[i]));
            }
        }
        return (int)((sumDiff - mx) % 1_000_000_007);
    }




// Here's my accepted greedy solution (This is failing some custom test cases, not the correct approach).

 class Solution {
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int d = 1_000_000_007;
        int initialSd = 0;
        int maxSd = 0;
        int n = nums1.length;
        List<Integer> possibleIndexes = new ArrayList<>();
        for (int i=0; i < n; i++) {
            int abs = Math.abs(nums1[i] - nums2[i]);
            initialSd += abs;
            initialSd = initialSd % d;
            if (maxSd < abs) {
                maxSd = abs;
                possibleIndexes = new ArrayList<>();
                possibleIndexes.add(i);
            }
            else if (maxSd == abs) {
                possibleIndexes.add(i);
            }
        }
        
        Set<Integer> uniquePossible = new HashSet<>();
        List<Integer> shortList = new ArrayList<>();
        
        for(int i : possibleIndexes) {
            if (!uniquePossible.contains(nums2[i])) {
                uniquePossible.add(nums2[i]);
                shortList.add(i);
            }
        }
                
        int bestRepDiff = Integer.MAX_VALUE;
        int bestRep;
        int bestRepIndex = 0;
        for (int i : shortList) {
            for (int j=0; j < n; j++) {
                if (bestRepDiff > Math.abs(nums2[i] - nums1[j])) {
                    bestRepDiff =  Math.abs(nums2[i] - nums1[j]);
                    bestRep = nums1[j];
                    bestRepIndex = i;
                }
                if (bestRepDiff == 0) break;
            }
        }
        return Math.min(initialSd -  Math.abs(nums1[bestRepIndex] - nums2[bestRepIndex]) + bestRepDiff, initialSd);
    }
}