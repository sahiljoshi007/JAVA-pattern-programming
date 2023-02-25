public class ABCDEFG
{
    public static void main(String args[]){
        int n=7,m=13;

     for(int i=0; i<n; i++) {
        for (int j = 0; j < m; j++) {
         
            if (i+j==(m-1)/2||j-i==(m-1)/2||i==(n-1)/2&&j>=3&&j<=9)
            {
             System.out.print("*");
        
            } 
            else
            {
        
                System.out.print(" ");
            }
         }
// B
System.out.print("    ");
         for (int j = 0; j < n; j++) {
         
            if (i==0&&j<n-1||j==0||i==(n-1)/2&&j<n-1||j==n-1&&(i!=0&&i!=3&&i!=6)||i==n-1&&j<n-1)
            {
             System.out.print("*");
        
            } 
            else
            {
        
                System.out.print(" ");
            }
         }

        //  C
        System.out.print("    ");
         for (int j = 0; j < n; j++) {
         
            if (j==0||i==0||i==n-1)
            {
             System.out.print("*");
        
            } 
            else
            {
        
                System.out.print(" ");
            }
         }

        //  D
        System.out.print("    ");
         for (int j = 0; j < n; j++) {
         
            if (j==0||i==0&&j<n-1||i==n-1&&j<n-1||j==n-1&&(i!=0&&i!=n-1))
            {
             System.out.print("*");
        
            } 
            else
            {
        
                System.out.print(" ");
            }
         }

        //  E
        System.out.print("    ");
        for (int j = 0; j < n; j++) {
        
           if (j==0||i==0||i==(n-1)/2||i==n-1)
           {
            System.out.print("*");
       
           } 
           else
           {
       
               System.out.print(" ");
           }
        }

        // F
        System.out.print("    ");
        for (int j = 0; j < n; j++) {
        
           if (j==0||i==0||i==(n-1)/2)
           {
            System.out.print("*");
       
           } 
           else
           {
       
               System.out.print(" ");
           }
        }

        // G
        System.out.print("    ");
        for (int j = 0; j < n; j++) {
        
           if (j==0||j==n-1&&i<(n-1)/2||i==0||i==n-1||j==n-1&&i>(n-1)/2||i==4&&j>=(n-1)/2)
           {
            System.out.print("*");
       
           } 
           else
           {
       
               System.out.print(" ");
           }
        }
         System.out.println();
        }
    }
}
