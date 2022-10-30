package Inherit_Contruct_Repls;

public class Method {
         static int calSum (int[][] a){
             int sum =0;
            for(int i=0;i<a.length;i++){
                for(int j=0; j<a[i].length;j++){
                    sum+=a[i][j];
                }
            }
            return sum;
        }
    }

    class Main1 extends Method {
        public static void main(String[] args){
            int[][] a = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9},
            };

            System.out.println(Main1.calSum(a));

        }
    }

    class Test1{

    }
