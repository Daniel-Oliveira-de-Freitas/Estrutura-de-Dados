package exercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		Queue<Integer> fila = new LinkedList<>();
        int n,m;
        int sairam,entraram,i;
        n= tec.nextInt();
        for(i =0;i<n;i++) {
            entraram = tec.nextInt();
            fila.add(entraram);
        }
        m= tec.nextInt();
        for(i=0;i<m;i++) {
            sairam = tec.nextInt();
            if(fila.contains(sairam)) {
                    fila.remove(sairam);
            }

        }
        System.out.println(fila.toString().replaceAll("[\\[\\],]",""));

    }

}

