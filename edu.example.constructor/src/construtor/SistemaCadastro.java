package construtor;

public class SistemaCadastro {
	public static void main(String[] args) {
		Pessoa marcos = new Pessoa("Marcos", "123456", "RUA DAS MARIAS");
		
		System.out.println(marcos.getNome() + "-" + marcos.getCpf());
	}
}
