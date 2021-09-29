import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr1 = {2,3,4,2,2,3,5,7};
        //System.out.println(noRepeatingArr(arr1));
        String s= "1A3d4s5t";
        String s2= "A2bb2d4";
        System.out.println( letterDigit(s2));
    }
    //Q1 T(n), S(n)
    public int sumOfUnique(int[] nums) {
        HashMap <Integer, Integer> m= new HashMap <Integer, Integer>();
        int sum=0;
        for (int num :nums){
            if (m.containsKey(num)) {
                int update= m.get(num);
                update++;
                m.replace(num, update);
            }else{
                m.put(num, m.getOrDefault(num, 0)+1);
            }
        }
        for (int num: m.keySet()){
            if (m.get(num)==1){
                sum+= num;
            }
        }
        return sum;
    }
    //Q2 T(n), S(n)
    public int[] sortedSquares(int[] nums) {
        int[] ans= new int[nums.length];
        int l=0;
        int r= nums.length-1;
        for (int i=nums.length-1 ; i>=0; i--){
            if (nums[l]*nums[l] >= nums[r]*nums[r]){
                ans[i]=nums[l]*nums[l];
                l++;
            }else{
                ans[i]= nums[r]*nums[r];
                r--;
            }
        }
        //System.out.println(ans);
        return ans;
    }


    //Q3 T(n), S(n)
    public static int noRepeatingArr(int[] arr){
        HashMap <Integer, Integer> m= new HashMap<>();
        //int[] arr1 = {2,3,4,2,2,3,5,7};
        for (int i=0; i<arr.length; i++){
            m.put(arr[i], m.getOrDefault(arr[i], 0)+1);
        }
        System.out.println(m.keySet());
        System.out.println(m.values());
        int ans=0;
        for (int i=0; i<arr.length;i++){
            if (m.get(arr[i])==1 ){
                return ans=arr[i];
            }
        }
        return ans;
    }


    //Q4 T(n), S(1)__26 characters
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] m= new int[26];
        System.out.println(m);
        for (char cha: magazine.toCharArray()){
            m[cha-'a']++;
        }
        for (char cha:ransomNote.toCharArray()){
            m[cha-'a']--;
            if (m[cha-'a'] <0 ){
                return false;
            }
        }
        //for (int num:m){System.out.println(num);}
        return true;
    }
    //Q5 T(n), S(1)
    public static boolean letterDigit(String s){
        //For example: 1A3d4s5t, Result : True
        int i=0;
        int j=1;
        boolean prev= false;
        boolean cur = false;
        boolean ans=true;
        while (j<s.length()){
            prev= Character.isDigit(s.charAt(i));
            cur= Character.isDigit(s.charAt(j));
            if (prev==cur){
                ans=false;
                break;
            }
            i++;
            j++;
        }
        return ans;
    }


}
