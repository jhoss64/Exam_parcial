package pregunta4_codeClean;

public class ReturnEarly_dirty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dato = 7;
		String tipo = validar_dato(dato);
		System.out.println("El dato "+ dato+" es de tipo "+tipo);
	}

	private static String validar_dato(double dato) {
		// TODO Auto-generated method stub
		String tipo = "desconocido";
		if(dato>=0) {
			if(dato<=1000) {
				if(dato%2==0) {
					tipo = "natural par antes de mil";
				}
			}
		}
		return tipo;
	}

}
