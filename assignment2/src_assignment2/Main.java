import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //part_1
        Shape s1= new Shape("shape1", "pink");
        System.out.println(s1.getName());
        s1.printShape();
        System.out.println();

        Shape s2= new Shape("shape2", "orange", 30, 20);
        System.out.println(s2.getName());
        System.out.println("s2 has area: "+ s2.getArea()+ " , perimeter: "+ s2.getPerimeter());
        s2.printShape();
        System.out.println();

        Rectangle r1= new Rectangle(2);
        System.out.println("rectangle1");
        System.out.println("area: "+ r1.getArea()+ " perimeter: "+ r1.getPerimeter());
        System.out.println();

        Rectangle r2= new Rectangle("rectangle2", "purple", 4,7);
        System.out.println(r2.getName());
        System.out.println("area: "+ r2.getArea()+ " perimeter: "+ r2.getPerimeter());
        r2.printShape();
        System.out.println();

        Square sq1= new Square(3);
        System.out.println("square1");
        System.out.println("area: "+ sq1.getArea()+ " perimeter: "+ sq1.getPerimeter());
        System.out.println();

        Square sq2= new Square("square2", "black", 7);
        System.out.println(sq2.getName());
        System.out.println("area: "+ sq2.getArea()+ " perimeter: "+ sq2.getPerimeter());
        sq2.printShape();
        System.out.println();

        //Q2
        Sum sum= new Sum();
        System.out.println(sum.add(2,3));
        System.out.println(sum.add(4,9,12));
        System.out.println(sum.add(4,5.0f ));
        System.out.println(sum.add(15.5f, 5));
        System.out.println(sum.add(1.0f, 6.4f ));

    }


    //part_2

    //Q1 T(m*n), S(m*n)__from soln
    public int[][] transpose(int[][] matrix) {
        int m= matrix.length, n= matrix[0].length;
        int[][] ans= new int[n][m];
        System.out.println(ans);
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                ans[i][j]= matrix[j][i];
            }
        }
        return ans;
    }

    //Q2
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int size= wordsDict.length;
        int idx1 = size, idx2 =  size;
        int ans= size;
        for (int i=0; i<size; i++){
            if (wordsDict[i].equals(word1) ){
                idx1= i;
                ans= Math.min(ans, Math.abs(idx1-idx2));
            }else if (wordsDict[i].equals(word2) ){
                idx2=i;
                ans=Math.min(ans, Math.abs(idx1-idx2));
            }
        }
        return ans;
    }

    //Q3
    public void moveZeroes(int[] nums) {
        int zero=0;
        for (int i=0; i<nums.length; i++){
            if(nums[i] !=0){
                int tmp= nums[i];
                nums[i]= nums[zero];
                nums[zero]= tmp;
                zero++;
            }
        }
    }

    //Q4
    public void rotate(int[][] matrix) {
        int m= matrix.length, n= matrix[0].length;
        for (int i=0; i<m; i++){
            for (int j=i; j<n; j++){
                int tmp= matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]= tmp;
            }
        }

        for (int i=0; i<m; i++){
            for (int j=0; j<(n/2); j++){
                int tmp= matrix[i][j];
                matrix[i][j]= matrix[i][ n-1-j];
                matrix[i][n-1-j]= tmp;
            }
        }
    }

    //Q5
    public List<Integer> spiralOrder(int[][] matrix) {
        int m= matrix.length, n= matrix[0].length;
        int up=0, down=m-1;
        int left=0, right=n-1;
        List<Integer> ans= new ArrayList<>();

        while (ans.size() < m*n){
            for (int i= left; i<right+1; i++){
                ans.add( matrix[up][i]);
            }
            for(int j=up+1; j<down+1; j++){
                ans.add(matrix[j][right]);
            }
            if (up != down){
                for (int i=right-1; i>left-1; i--){
                    ans.add(matrix[down][i]);
                }
            }
            if (left!=right){
                for (int j=down-1; j>up; j--){
                    ans.add(matrix[j][left]);
                }
            }
            left++;
            right--;
            up++;
            down--;
        }
        return ans;
    }


    //Q6
    public boolean isIsomorphic(String s, String t) {
        int[] m1= new int[256];
        int[] m2= new int[256];

        for (int i=0; i<s.length(); i++){
            if (m1[s.charAt(i)] != m2[t.charAt(i)]) return false;
            m1[s.charAt(i)]= i+1;
            m2[t.charAt(i)]= i+1;
        }
        return true;
    }

    //Q7
    public String addStrings(String num1, String num2) {
        int l1= num1.length()-1;
        int l2= num2.length()-1;
        int carry=0;
        char[] arr1= num1.toCharArray();
        char[] arr2= num2.toCharArray();
        StringBuilder sb= new StringBuilder();
        //System.out.println(arr1);
        // for (int i=0; i< l2+1; i++){
        //      System.out.println(arr2[i]);
        // }
        while (l1>=0 || l2>=0 || carry!=0){
            int n1= l1>=0 ? (arr1[ l1] - '0') : 0;
            int n2= l2>=0 ? (arr2[ l2] - '0') : 0;
            int sum= n1+n2+carry;
            sb.insert(0, sum%10);
            carry= sum/10;
            l1--;
            l2--;

        }

        return sb.toString();
    }
}
