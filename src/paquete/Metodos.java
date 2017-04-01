package paquete;

public class Metodos {

	public static void main(String[] args) {
		//Metodo length, asigna el numero de caracteres
		String cad = "1234567890";
		int i = cad.length();

		//Concatenar con +
		String c;
		c = 34 + " Cartagena"; //genera 34 Cartagena
		
		//Metodo concat(), concatena dos cadenas
		String dst = "Desconocido";
		String org = " Rutina";
		System.out.println("Concatena = " +dst.concat(org));
		
		//Metodo chartAt()
		String v = new String("Nuestro honor");
		System.out.println(v.charAt(0)+v.charAt(2)+v.charAt(4)); //Imprime NET
		
		/*
		 * Metodo getChars()
		 * void getChars(int p, int n, char[]c, int k)
		 * 
		 */
		
		final int M = 10;
		String bs = "Hoy puede ser un buen dia";
		char ds[] = new char[M];
		bs.getChars(0, 2, ds, 0); //ds contiene los caracteres "Ho" en la posicion 0 y 1
		bs.getChars(4, 5, ds, 0); //ds contiene los caracteres "puede" en la posicion 0 .. 4
		bs.getChars(10, 3, ds, 5); //los caracteres "ser" se copian en las posiciones 5 .. 7 de ds
		bs.getChars(0, bs.length()/2, ds, 0); //la mitad de los caracteres de la cadena se copian en ds a partir de la posicion 0
		
		/*
		 * Metodo substring()
		 * String substring(int inicial, int final)
		 * (final-inicial)
		 */
		
		String dc = "Terminal inteligente";
		System.out.println(dc.substring(3, 8)); //"minal", caracteres 3..7
		System.out.println(dc.substring(9, dc.length())); //"inteligente"
		dc.substring(3); //"minal inteligente"
	}
	
	//Metodo chartAt() con for
	int numVocales(String cadena){
		int k =0;
		for(int i=0; i<cadena.length(); i++){
			switch(cadena.charAt(i)){
			case 'a': case 'e': case 'i': case 'o': case 'u':
			case 'A': case 'E': case 'I': case 'O': case 'U': k++;
			}
		}
		return k;
	}

}
