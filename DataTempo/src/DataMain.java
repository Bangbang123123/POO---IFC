import java.time.LocalDate;

public class DataMain {

	public static void main(String[] args) {
		LocalDate[] sd = DataClass.sab_dom(LocalDate.now(), LocalDate.now().plusDays(14));
		
		System.out.print("Sábados e domingos entre ["+ LocalDate.now() +" // "+ LocalDate.now().plusDays(14) +"]:\n");
		for (int i = 0; i < sd.length; i++) {
			System.out.print(sd[i] + "\n");
		}
		System.out.print("Dias do mês [12]:\n");
		sd = DataClass.dias_do_mes(LocalDate.of(1980,12,24));
		for (int i = 0; i < sd.length; i++) {
			System.out.print(sd[i] + "\n");
		}
		System.out.print("Dia da semana hoje:\n"+ DataClass.dia_semana(LocalDate.now()));
	}

}
