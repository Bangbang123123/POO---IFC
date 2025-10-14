package Theater;

public class HomeTheaterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EquipamentoEletronico ee = new EquipamentoEletronico();
		ee.setConsumo(300);
		ee.setTensao(220);
		SistemaDeSom ss = new SistemaDeSom("Sony","SY-395",300,ee.getTensao(),ee.getConsumo());
		SistemaDeVideo sv = new SistemaDeVideo("Sony","SY-394","TV","1080p",ee.getTensao(),ee.getConsumo());
		HomeTheater ht = new HomeTheater(ss,sv);
		
		StringBuilder builder = new StringBuilder();
		builder.append(ee.toString());
		builder.append("\n\n");
		builder.append(ss.toString());
		builder.append("\n\n");
		builder.append(sv.toString());
		builder.append("\n\n");
		builder.append(ht.toString());
		
		ht.som.setConsumo(23);
		
		System.out.print(builder.toString());
		
		
	}

}
