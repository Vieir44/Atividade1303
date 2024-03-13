package atividade1303;

public class Atv4 {

	public static void main(String[] args) {
		String espaço = "Ispaço";
		String corrigir = espaço.replace("I", "E");
		
		String todosEspaço = "e s p a ç o";
		String tiraEspaço = todosEspaço.replace(" ", "");
		
		System.out.println("Antes: " + espaço + " depois: " + corrigir);
		System.out.println("Antes: " + todosEspaço + " depois: " + tiraEspaço);

	}

}
