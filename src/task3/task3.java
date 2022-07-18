package task3;

import task2.task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static task2.task2.*;

public class task3 {
    public static void PrintTree (Integer N)

    {

        int i=0;
        int n = 2;
         while (i <= N  ) {


           Trees(i,true,false,N);
           i++;
    }

    }


    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));

          Integer N = tryPars(bufferedReader.readLine());
          while (N ==null || N <= 0 )
          {
              N= tryPars(bufferedReader.readLine());
          }

        PrintTree(N);
    }


}
