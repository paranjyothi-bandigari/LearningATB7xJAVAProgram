package ex_27072024;

public class Lab135
{
    public static void main(String[] args)
    {
        int[][] age={{1,2,3},{4,5,6},{7,8,9}};

        for (int i=0;i< age.length;i++)
        {
            for(int j=0;j<age[i].length;j++)
            {
                System.out.print(age[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }

    }
}
