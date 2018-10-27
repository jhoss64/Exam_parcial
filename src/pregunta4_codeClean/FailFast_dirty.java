package pregunta4_codeClean;

public class FailFast_dirty {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
         int numero1 = 6;
         int numero2 = 10;
         if(numero1<0) {
        	 if(numero2<0) {
        		 int suma = numero1+numero2;
        		 System.out.println(suma);
        	 }else {
        		 throw new Exception("Segundo numero tiene que ser mayor a 0"); 
        	 }
        	 throw new Exception("Primer numero tiene que ser mayor a 0");
         }
	}

}
