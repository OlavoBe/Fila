
public class Fila {

	private static Fila instanciaUnica;
	
	private Fila() {
		
	}
	
	public static Fila getInstancia() {
		if (instanciaUnica == null) {
			instanciaUnica = new Fila();
		}
		return instanciaUnica;
}
	public void imprimeDocumento() {
		
	}
	public void removeDocumento() {
		
	}
	public void removeTodosDocumentos() {
		
	}
}

