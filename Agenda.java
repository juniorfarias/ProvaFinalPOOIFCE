package ProvaFinal;

import java.util.*;

public class Agenda {
	Set<Contato> contatos = new HashSet<>();
	
	public void atualizarContatoPorNome(int id, String nomeAtualizado) {
		Contato c = pesquisaPorId(id);
		c.setNome(nomeAtualizado);
		System.out.println("O nome " + nomeAtualizado + "foi atualizado!!! \n");
	}
	
	public void atualizarContatoPorEmail(int id, String emailAtualizado) {
		Contato c = pesquisaPorId(id);
		c.setEmail(emailAtualizado);
		System.out.println("O email " + emailAtualizado + "do " + c.getNome() + "foi atualizado!!! \n");
	}
	
	public void atualizarContatoPorTelefone(int id, String telefoneAtualizado) {
		Contato c = pesquisaPorId(id);
		c.setTelefone(telefoneAtualizado);
		System.out.println("O telefone " + telefoneAtualizado + "do " + c.getNome() + "foi atualizado!!! \n");
	}
	
	public void insereContato(int id, String nome, String telefone, String email) {
		Contato c = new Contato(id, nome, telefone, email);
		contatos.add(c);
	}
	
	public ArrayList<Contato> hashToArraylist(Set<Contato> agenda) {
		ArrayList<Contato> contatos = new ArrayList<Contato>();
		for (Contato contato : agenda) {
			contatos.add(contato);
		}
		return contatos;
	}
	
	public Contato pesquisaPorId(int id) {
		for (Contato contato : contatos) {
			if(contato.getId()==id) {
				return contato;
			}
		}
		return null;
	}
	
	public void remove(int id) throws ContatoNotFoundException{
		boolean remove = false;
		Contato c = pesquisaPorId(id);
		
		remove = contatos.remove(c);
		if (remove) {
			System.out.println("Contato de id " + id + " removido!!!\n");
		} else {
			throw new ContatoNotFoundException("Contato não encontrado!!!!!\n");
		}
	}
	
	public void listaPorId() {
		ComparatorId comparator = new ComparatorId();
		ArrayList<Contato> arrayListAgenda = hashToArraylist(contatos);
		Collections.sort(arrayListAgenda, comparator);
		System.out.println("-----------------------------------------");
		System.out.println("CONTATOS: \n");
		for (Contato c : arrayListAgenda) {
			System.out.println(c);
		}
		System.out.println("-----------------------------------------");
	}
	
	public void listaPorNome() {
		ComparatorNome comparator = new ComparatorNome();
		ArrayList<Contato> arrayListAgenda = hashToArraylist(contatos);
		Collections.sort(arrayListAgenda, comparator);
		System.out.println("-----------------------------------------");
		System.out.println("CONTATOS: \n");
		for (Contato c : arrayListAgenda) {
			System.out.println(c);
		}
		System.out.println("------------------------------------------");
	}
	
}
