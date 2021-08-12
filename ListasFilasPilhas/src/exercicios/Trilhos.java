package exercicios;

import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.util.Stack;

public class Trilhos {

	public static void main(String[] args) throws Exception, Exception {
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in), 1 << 16);
        while (true)
        {
            int n = Integer.parseInt(leitor.readLine());
            if(n == 0) { 
                
                break;
                
            }
            while (true)
            {
                String linha = leitor.readLine();
                if(linha.equals("0")) {
                    break;
                }
                String[] s = linha.split("\\s+");
                Stack<Integer> pilha = new Stack<>();
                int[] ponteiro = new int[n];
                
                for(int i = 0; i < n; i++)
                {
                    ponteiro[i] = Integer.parseInt(s[i]);
                }
              
                int proximo = 1, vagao = 0;
                boolean livre = true;
                while (vagao < n)
                {
                  
                    if(ponteiro[vagao] == proximo)
                    {
                        proximo++;
                        vagao++;
                   
                    }
                    else if(!pilha.isEmpty() && ponteiro[vagao] == pilha.peek())
                    {
                        pilha.pop();
                        vagao++;
                      
                    }
                    else
                    {
                        
                        if(proximo > n)
                        {
                            livre = false;
                            break;
                        }
                        pilha.add(proximo++);
                    }
                }
                
                if(livre == true) {
                    
                    System.out.println("Yes");
                }else {
                    System.out.println("No");
                }
            }
            System.out.print('\n');
        }
    }
}