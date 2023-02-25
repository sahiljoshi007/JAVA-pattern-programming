public class sahiljoshi {
    public static void main(String args[]){
        int n=7,m=13;
        // S
         for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
         
            if (i==0|| j==0&&i<=(n-1)/2 || i==(n-1)/2||
            j==n-1&&i>=(n-1)/2|| i==n-1)
            {
             System.out.print("*");
        
            } 
            else
            {
        
                System.out.print(" ");
            }
         }
//  A
System.out.print(" ");
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

//  H
System.out.print(" ");
        for (int j = 0; j < n; j++) {
         
            if (j==0||j==n-1||i==(n-1)/2)
            {
             System.out.print("*");
        
            } 
            else
            {
        
                System.out.print(" ");
            }
         }
// I
System.out.print(" ");
for (int j = 0; j < n; j++) {
         
    if (j==(n-1)/2||i==n-1||i==0)
    {
     System.out.print("*");

    } 
    else
    {

        System.out.print(" ");
    }
 }

//  L
System.out.print("  ");
for (int j = 0; j < n; j++) {
         
    if (j==0||i==n-1&&j<=(n-1)/2)
    {
     System.out.print("*");

    } 
    else
    {

        System.out.print(" ");
    }
 }

//  J
System.out.print("         ");
for (int j = 0; j < n; j++) {
         
    if (i==0||j==(n-1)/2||i==n-1&&j<(n-1)/2||j==0&&i>(n-1)/2)
    {
     System.out.print("*");

    } 
    else
    {

        System.out.print(" ");
    }
 }

//  O
System.out.print(" ");
for (int j = 0; j < n; j++) {
         
    if (i==0||i==n-1||j==0||j==n-1)
    {
     System.out.print("*");

    } 
    else
    {

        System.out.print(" ");
    }
 }

//  S
System.out.print(" ");
for (int j = 0; j < n; j++) {
         
    if (i==0|| j==0&&i<=(n-1)/2 || i==(n-1)/2||
    j==n-1&&i>=(n-1)/2|| i==n-1)
    {
     System.out.print("*");

    } 
    else
    {

        System.out.print(" ");
    }
 }

 //  H
 System.out.print(" ");
 for (int j = 0; j < n; j++) {
         
    if (j==0||j==n-1||i==(n-1)/2)
    {
     System.out.print("*");

    } 
    else
    {

        System.out.print(" ");
    }
 }
// I
System.out.print(" ");
for (int j = 0; j < n; j++) {
 
if (j==(n-1)/2||i==n-1||i==0)
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
