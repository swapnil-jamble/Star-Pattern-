package MyJavaPackage;

public class Star7 {
    public static void main(String[] args) {
        int space=4;
        for(int i=1; i<=4; i++)
        {
            for(int k=1; k<=space; k++)
            {
                System.out.print(" ");
            }
            space--;
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

/*

    *
   * *
  * * *
 * * * *

 */