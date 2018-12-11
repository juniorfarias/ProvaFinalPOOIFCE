package ProvaFinal;

public class ContatoNotFoundException extends NullPointerException {
	private static final long serialVersionUID = 1L;

	ContatoNotFoundException() {
		super();
	}
	ContatoNotFoundException(String msg) {
		super(msg);
	}
}
