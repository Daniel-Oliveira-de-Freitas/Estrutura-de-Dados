package exercicios;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class JogandoCartasFora {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter p = new PrintWriter(System.out);
	public static void main(String[] args) throws IOException{
		String l, r;
		int n, b, num;
		while(!(l = br.readLine()).equals("0")){
			n = Integer.parseInt(l);
			if(n==1){
				p.println("Discarded cards:");
				p.println("Remaining card: 1");
			}else{
				List<Integer> cartas = new ArrayList<>();
				for(int i = 1; i <= n; i++)
					cartas.add(i);
				b = 2;
				r = "";
				while(cartas.size() > 1){
					for(Iterator<Integer> iterator = cartas.iterator(); iterator.hasNext();){
						num = iterator.next();
						if(b == 2){
							b = 0;
							r += num + ", ";
							iterator.remove();
						}
						b++;
					}
				}
				p.println("Discarded cards: " + r.substring(0, r.length() - 2));
				p.println("Remaining card: " + cartas.get(0));
			}
		}
		p.close();
	}
}


