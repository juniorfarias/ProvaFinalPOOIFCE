package ProvaFinal;

import java.util.Comparator;

public class ComparatorNome implements Comparator<Contato>{

	@Override
	public int compare(Contato obj1, Contato obj2) {
		// TODO Auto-generated method stub
		return obj1.getNome().compareTo(obj2.getNome());
	}
	
}
