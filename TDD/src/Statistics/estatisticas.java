package Statistics;

import java.util.HashMap;
import java.util.Map;

public class estatisticas {
	public double media(double[] dados) {
		if (dados.length != 0 && dados != null) {
			double sum = 0;
			for (double dado : dados) {
				sum += dado;
			}
			return sum/dados.length;
		}
		return 0;
	}
	
	public double mediana(double[] dados) {
		if (dados.length != 0 && dados != null) {
			if (dados.length % 2 == 0) {
				return (dados[dados.length/2 - 1] + dados[dados.length/2])/2;
			}
			
			return dados[dados.length/2];
		}
		
		return 0;
	}
	
	public double moda(double[] dados) {
		if (dados.length != 0 && dados != null) {
	
	        Map<Double, Double> frequencia = new HashMap<>();
	        double mode = dados[0];
	        double maxCount = 0;
	
	        for (double dado : dados) {
	            double count = frequencia.getOrDefault(dado, 0.0) + 1.0;
	            frequencia.put(dado, count);
	            
	            if (count > maxCount) {
	                maxCount = count;
	                mode = dado;
	            }
	        }
	        return mode;
		}
		return 0;
	}
	
	public double variancia(double[] dados) {
		if (dados.length != 0 && dados != null) {
			double variancia = 0;
			double media = media(dados);
			
			for (double dado : dados) {
				variancia += (dado - media) * (dado - media);
			}
			
	        return variancia / dados.length;
		}
		return 0;
	}
	
	public double desvio_padrao(double[] dados) {
		return Math.sqrt(variancia(dados));
	}
}
