package aplicativo;

import entidades.Cliente;

public class Programa {

	public static void main(String[] args) {
		
		/*hash code
		System.out.println("Hash code");
		String a = "Rafael";
		String b = "Rafael";
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		System.out.println();
		System.out.println("Equals");
		a = "Maria";
		b = "Rafael";
		
		System.out.println(a.equals(b));
		*/
		
		Cliente c1 = new Cliente("Maria", "maria@mail");
		Cliente c2 = new Cliente("Maria", "maria@mail");
		
		String s1 = "Test";
		String s2 = "Test";

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);//vai comparar referência de memória
		System.out.println(s1 == s2);
	
		 
		
		

	}

}
