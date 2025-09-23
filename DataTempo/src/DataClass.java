import java.time.LocalDate;

public class DataClass {
	// sabados e domingos ✔
	// dias uteis // descontando feriados
	// pagamento 
	// que dia da semana ✔
	// todos os dias de um mes ✔

	
	public static LocalDate[] sab_dom(LocalDate first,LocalDate last) {
		LocalDate[] sabs_and_doms = new LocalDate[0];
		
		while (last.compareTo(first) >= 0) {
			if (first.getDayOfWeek().getValue() == 7 || first.getDayOfWeek().getValue() == 6) {
				sabs_and_doms = append(sabs_and_doms,first);
			}
			first = first.plusDays(1);
		}
		
		return sabs_and_doms;
	}
	
	public static LocalDate[] dias_uteis() {
		LocalDate[] result = new LocalDate[0];
		//{"01/01","03/03", "04/03", "18/04", "21/04", "01/05", "19/06", "07/09", "12/10", "02/11", "15/11", "25/12"};
		
		
		return result;
	}
	
	
	public static int dia_semana(LocalDate data) {
		return data.getDayOfWeek().getValue();
	}
	
	public static LocalDate[] dias_do_mes(LocalDate mesAno) {
		LocalDate[] result = new LocalDate[0];
		int ano_inicio = mesAno.getYear();
		mesAno = LocalDate.of(mesAno.getYear(),mesAno.getMonth(),1);
		
		while (mesAno.getYear() == ano_inicio) {
			result = append(result,mesAno);
			
			mesAno = mesAno.plusDays(1);
		}
		
		return result;
	}
	
	private static LocalDate[] append(LocalDate[] arr, LocalDate item) {
		LocalDate[] arr_plus = new LocalDate[arr.length + 1];
		for (int i = 0; i < arr_plus.length; i++) {
			if (i == arr_plus.length - 1) {
				arr_plus[i] = item;
			} else {
				arr_plus[i] = arr[i];
			}
		}
		
		return arr_plus;
	}
}
