
public class PessoaMain {

	public static void main(String[] args) {
		ListaPessoas list = new ListaPessoas();
		
		list.addPessoa(new Pessoa("Uuwuu","example@gmail.com","01/12/2003"));
		list.addPessoa(new Pessoa("Yooo","example@yahoo.com","23/04/2940"));
		list.addPessoa(new Pessoa("Pogg","example@ifc.edu.br","15/06/1924"));
		list.addPessoa(new Pessoa("Yumm","example@gmail.com","17/12/2032"));
		
		System.out.print(list.mesmoMes("12") +"\n\n"+ list.mesmoDominio("gmail.com"));
	}

}
