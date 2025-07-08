class Solution {
    public static int pivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int binarysearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        int pivotIndex = pivot(nums);
        if (pivotIndex == -1) {
            return binarysearch(nums, target, 0, nums.length - 1);
        }
        if (nums[pivotIndex] == target) {
            return pivotIndex;
        }
        if (target >= nums[0]) {
            return binarysearch(nums, target, 0, pivotIndex - 1);
        }
        return binarysearch(nums, target, pivotIndex + 1, nums.length - 1);
    }
}
