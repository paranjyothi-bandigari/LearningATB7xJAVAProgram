package ex_27072024;

public class Lab136 {
    public static void main(String[] args) {

        int[][] array_2d = {      //3 row 2 column
                {34, 1},
                {34, 2},
                {34, 3}
        };
        System.out.println(array_2d.length);
        for (int i=0;i<array_2d.length;i++)
        {
           for(int j=0;j<array_2d[i].length;j++)
           {
               System.out.print(array_2d[i][j]);
               System.out.print("\t");
           }
            System.out.println();

        }
}
}
