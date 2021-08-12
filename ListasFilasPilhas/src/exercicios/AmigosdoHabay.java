package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;



public class AmigosdoHabay {

	public static void main(String[] args) {
		int i = 0;
        String nome,tam = null,ganhador = null;
        String amigo = null;
        String nom[] = new String[1000];
        String voto[] = new String[1000];
        ArrayList<String> participantes = new ArrayList<>();
        ArrayList<String> votos = new ArrayList<>();
        Set<String> semRepeticao = new LinkedHashSet<String>();
        
        Scanner tec = new Scanner(System.in);
        while(true) {
            nome = tec.nextLine();
            String info[] = nome.split(" ");
            if(!nome.equals("FIM")) {
            nom[i] = info[0];
            voto[i]= info[1];        
            i++;
            }else {
                break;
            }
            
        }
        
        for(i=0;i<voto.length;i++) {
            if(voto[i]!= null) {
            if(voto[i].equals("NO")) {
                votos.add(nom[i]);
                voto[i] = null;
                nom[i]= null;
            }else {
                participantes.add(nom[i]);
            }
            }
            }
 
        for(int x=0;x<nom.length;x++) {
            if(nom[x]!=null) {
                tam = nom[x];           
                    break;
            }
        }

            for(i=1;i<nom.length;i++) {
                if(nom[i]!=null) {
                    amigo = nom[i];
                    if(tam != null && amigo != null) {
                    if(amigo.length()> tam.length()) {
                        ganhador = amigo;
                        break;
                    }else {
                        ganhador= tam;
                    }
                    }
                }
                
            }
            Collections.sort(participantes);
            Collections.sort(votos);
            for (String valor: participantes) {
            semRepeticao.add(valor);
        }
            String dados[] = semRepeticao.toString().replace("[", "").replace("]", "").replace(",", "").split(" ");
        for(i=0;i<dados.length;i++) {
              nom[i]= dados[i];
              System.out.println(nom[i]);
  
        }
           
            String dados2[] = votos.toString().replace("[", "").replace("]", "").replace(",", "").split(" ");
            for(i=0;i<dados2.length;i++) {
            voto[i]= dados2[i];
            System.out.println(voto[i]);
            
            }
             System.out.println("\nAmigo do Habay:\n"+ganhador);
    }
        
    
    
	}


