package google_charts;
import java.util.Scanner;
import java.util.Random;
import java.io.IOException;
import java.io.FileWriter;

public class create_chart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe a quantidade de pontos: ");
        int qn = input.nextInt();
        System.out.println("num 1: " + qn);

        System.out.print("Informe o máximo: ");
        int max = input.nextInt();
        System.out.println("num 1: " + max);

        System.out.print("Informe o mínimo: ");
        int min = input.nextInt();
        System.out.println("num 1: " + min);
        Random rand = new Random();
        
        if (min > max) {
			System.out.println("Valores de início e fim invertidos");
			int buffer = max;
			max = min;
			min = buffer;
		}
        
        String content = "<!DOCTYPE html>\r\n"
        		+ "<html lang=\"en\">\r\n"
        		+ "<head>\r\n"
        		+ "    <title>Google Charts</title>\r\n"
        		+ "    <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\r\n"
        		+ "    <script type=\"text/javascript\">\r\n"
        		+ "        google.charts.load('current', {'packages': ['corechart']});\r\n"
        		+ "        google.charts.setOnLoadCallback(desenhar);\r\n"
        		+ "        function desenhar(){\r\n"
        		+ "            var data = google.visualization.arrayToDataTable([\n"
        		+ "                 ['x','y']";
        
        for (int i = 0; i < qn; i++) {
        	int pog = (rand.nextInt(max-min) + min);
        	content += ",["+ i +","+ pog + "]";
        	System.out.println(pog);
        }
        
        content += "            ]);\n"
        		+ "\n"
        		+ "            var options= {\r\n"
        		+ "                title: 'teste',\r\n"
        		+ "                curveType: 'function',\r\n"
        		+ "                legend: {position: 'bottom'}\r\n"
        		+ "            };\r\n"
        		+ "\n"
        		+ "            var chart = new google.visualization.LineChart(document.getElementById('curve_chart'));\r\n"
        		+ "\n"
        		+ "            chart.draw(data, options);\r\n"
        		+ "        }\r\n"
        		+ "\r\n"
        		+ "    </script>\r\n"
        		+ "</head>\r\n"
        		+ "<body>\r\n"
        		+ "    <div id=\"curve_chart\" style=\"width: 900px; height: 500px\"></div>\r\n"
        		+ "</body>\r\n"
        		+ "</html> ";
        
        // file
        String file_name = "chart.html";
        
        
        try {
        	FileWriter writer = new FileWriter(file_name);
        	
        	writer.write(content);
        	writer.close();
        	
        	System.out.print("Arquivo criado!");
        }catch(IOException e) {
        	System.out.println("Erro na criação de arquivo: "+ e.getMessage());
        }
        
        
	}

}
