public class q09Arrays {

public static void main(String[] args) {

//single-dimensional array
int a[]= {11,22,33,44,55};
for(int i=0;i<5;i++) {
System.out.println("Elements of array a: "+a[i]);
}


//multidimensional array
int[][] b = {
            {1, 3, 5, 7, 9}, 
            {2, 4, 8} };
      
      System.out.println("\nLength of row 1: " + b[0].length);
      }
}
