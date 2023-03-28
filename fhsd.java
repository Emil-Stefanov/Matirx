import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int matrix[][] = new int[m][n];
        
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                matrix[i][j] = scan.nextInt();
            }
        }
        // otpecahtva sumira glaven diagonal
        int sum1=0;
        // variant 1
        for(int i=0; i<m; i++) {
           for(int j=0; j<n; j++) {
                if(i==j) {
                    System.out.print(matrix[i][j] + " ");
                    sum1+=matrix[i][j];
                }
            }
        }
        //variant 2
        //for(int i=0; i<m; i++) sum1+=matrix[i][i];
        System.out.print(sum1);
        
        System.out.println();
        
        // otpechatva i sumira vtorichen diagonal
        int sum2=0;
        for(int i=0; i<m; i++) {
           for(int j=0; j<n; j++) {
               if(i+j == n-1) {
                    System.out.print(matrix[i][j] + " ");
                    sum2+=matrix[i][j];
               }
            }
        }
        System.out.print(sum2);
        System.out.println();
        
        // nad glaven diagonal 
        int sum3=0;
        for(int i=0; i<m; i++) {
           for(int j=0; j<n; j++) {
               if(i<j) {
                    System.out.print(matrix[i][j] + " ");
                    sum3+=matrix[i][j];
               }
            }
        }
        System.out.print(sum3);
        System.out.println();
        
        // pod glaven diagonal 
        int sum4=0;
        for(int i=0; i<m; i++) {
           for(int j=0; j<n; j++) {
               if(i>j) {
                    System.out.print(matrix[i][j] + " ");
                    sum4+=matrix[i][j];
               }
            }
        }
        System.out.print(sum4);
        System.out.println();
        
        // nad vtorichen diagonal 
        int sum5=0;
        for(int i=0; i<m-1; i++) {
           for(int j=0; j<n-i-1; j++) {
    
                    System.out.print(matrix[i][j] + " ");
                    sum5+=matrix[i][j];
             
            }
        }
        System.out.print(sum5);
        System.out.println();
        
        //pod vtorichen diagonal 
        int sum6=0;
        for(int i=0; i<m; i++) {
           for(int j=0; j<n; j++) {
               if(i>j) {
                    System.out.print(matrix[i][j] + " ");
                    sum4+=matrix[i][j];
               }
            }
        }
        System.out.print(sum6);
        System.out.println();
    }
}
