class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        char[] arr = s1.toCharArray();
        int low = 0;

        int high = arr.length-1;
        if( arr.length<0){
            return false;
        }

        while(low<high){
            if(arr[low]!=arr[high]){
                return false;
            }
            low++;
            high--;

        }

        
        return true;
    }
}
