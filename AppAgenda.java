package ProvaFinal;

public class AppAgenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agenda agenda = new Agenda();
		
		agenda.insereContato(1, "Junior", "33439978", "junior@gmail.com");
		agenda.insereContato(2, "Pedro", "33439916", "pedro@gmail.com");
		agenda.insereContato(3, "Cecilia", "33439914", "cecilia@gmail.com");
		agenda.insereContato(4, "Elisangela", "33439912", "elisangela@gmail.com");
		agenda.insereContato(5, "Ueliton", "33439990", "ueliton@gmail.com");
		agenda.insereContato(6, "Patricia", "33430009", "patricia@gmail.com");
		agenda.insereContato(7, "Charlote", "4543678398", "charlote@gmail.com");
		agenda.insereContato(8, "Duke", "0978778887", "charlote@gmail.com");
		
		agenda.listaPorNome();
		agenda.atualizarContatoPorEmail(3, "ce@hotmail.com");
		agenda.atualizarContatoPorNome(4, "Elisângela");
		agenda.atualizarContatoPorTelefone(1, "999938109");
		try {
			agenda.remove(0);
			
		}catch(ContatoNotFoundException e) {
			System.out.println(e.getMessage());
		}
		agenda.listaPorId();
		
		try {
			agenda.remove(8);
			
		}catch(ContatoNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
