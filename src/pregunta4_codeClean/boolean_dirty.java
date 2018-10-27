package pregunta4_codeClean;

public class boolean_dirty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean esAprobado;
		double nota = 10.8;
		if(nota>14) {
			esAprobado = true;
		} else {
			esAprobado = false;
		}
		if(esAprobado== true) {
			System.out.print("Esta aprobado");
		}
	}	
}
