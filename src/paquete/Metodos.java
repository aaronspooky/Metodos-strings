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
