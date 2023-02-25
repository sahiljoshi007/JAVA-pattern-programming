public class pwskills {
    public static void main(String args[]) 
    {
 int n=7,m=13;
// P
 for (int i = 0; i < n; i++) {
 for (int j = 0; j < n; j++) {
 
    if (i==0 && j<=(n-1)/2|| j==0 ||i==(n-1)/2&&j<=(n-1)/2 || j==(n-1)/2&&i<=(n-1)/2)
    {
     System.out.print("*");

    } 
    else
    {

        System.out.print(" ");
    }
 }

//  W
 for (int j = 0; j < m; j++) {
 
    if (i-j==(n-1)/2||i+j==9&&j<=(m-1)/2||j-i==(n-1)/2&&j>(m-1)/2||i+j==15)
    {
     System.out.print("*");

    } 
    else
    {

        System.out.print(" ");
    }
 }
System.out.print("      ");

// S
 for (int j = 0; j < n; j++) {
 
    if (i==0 && j<=(n-1)/2|| j==0&&i<=(n-1)/2 || i==(n-1)/2&&j<=(n-1)/2||
    j==(n-1)/2&&i>=(n-1)/2|| i==n-1&&j<=(n-1)/2)
    {
     System.out.print("*");

    } 
    else
    {

        System.out.print(" ");
    }
 }

//  K
 for (int j = 0; j < n; j++) {
 
    if (j==0||i+j==(n-1)/2||i-j==(n-1)/2)
    {
     System.out.print("*");

    } 
    else
    {

        System.out.print(" ");
    }
 }

//  I
 for (int j = 0; j < n; j++) {
 
    if (j==(n-1)/2||i==0||i==n-1)
    {
     System.out.print("*");

    } 
    else
    {

        System.out.print(" ");
    }
 }
//   L
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

//  L
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

//  S
for (int j = 0; j < n; j++) {
 
    if (i==0 && j<=(n-1)/2|| j==0&&i<=(n-1)/2 || i==(n-1)/2&&j<=(n-1)/2||
    j==(n-1)/2&&i>=(n-1)/2|| i==n-1&&j<=(n-1)/2)
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
