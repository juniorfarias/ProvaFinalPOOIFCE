package ProvaFinal;

import java.util.Comparator;

public class ComparatorId implements Comparator<Contato>{

	@Override
	public int compare(Contato obj1, Contato obj2) {
		// TODO Auto-generated method stub
		return obj1.getId() - obj2.getId();
	}

}
