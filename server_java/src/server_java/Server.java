package server_java;
import java.net.InetAddress;
import java.util.Scanner;

import java.time.LocalDateTime;
import java.time.Duration;

public class Server {
	public static void main(String[] args) throws InterruptedException {
		// Get time interval for checks (seconds)
		Scanner input = new Scanner(System.in);
		System.out.print("Informe o intervalo dos testes em segundos: ");
		long time = input.nextLong() * 1000;
		input.close();
		
		// I don't know how to use JSON, so this part is hard coded
		String[] name_list = {"Willian","Rafael","Rômulo"};
		String[] ip_list = {"26.247.75.31","192.168.120.99","26.181.104.16"};
		String[] email_list = {"willian@gmail.com","rafael@gmail.com","romulo@gmail.com"};
		LocalDateTime[] last_check_list = {LocalDateTime.now(),LocalDateTime.now(),LocalDateTime.now()};
		LocalDateTime[] last_activity = {LocalDateTime.now(),LocalDateTime.now(),LocalDateTime.now()};
		LocalDateTime[] last_inactivity = {LocalDateTime.now(),LocalDateTime.now(),LocalDateTime.now()};
		Duration[] inactivity_time = {Duration.ZERO,Duration.ZERO,Duration.ZERO};
		Duration[] activity_time = {Duration.ZERO,Duration.ZERO,Duration.ZERO};
		
		// Repeat indefinitely
		while(true) {
			// Loop for all IPs in ip_list
			System.out.println("\n\n\n----------------------------\n\n\n");
			for (int i = 0; i < ip_list.length; i++) {
				try {
					// Get interval of (in)activity
					Duration interval = Duration.between(last_check_list[i],LocalDateTime.now());
					last_check_list[i] = LocalDateTime.now();
					
					// Test if IP is functioning
					if (InetAddress.getByName(ip_list[i]).isReachable(1000)) {
						// Add interval to activity time
						activity_time[i] = activity_time[i].plus(interval);
						last_activity[i] = last_check_list[i];
						System.out.println(i + " - OK\n");
					} else {
						inactivity_time[i] = inactivity_time[i].plus(interval);
						last_inactivity[i] = last_check_list[i];
						System.out.println(
								"--- Ocorrência ---\n"+
								i + " - [" + LocalDateTime.now() + "]\n" +
								"["+ name_list[i] +" / "+ email_list[i] +" / "+ ip_list[i] +"]\n"+
								"Primeira Verificação de Inatividade ["+ last_inactivity[i] +"]\n"+
								"Última verificação de Atividade ["+ last_activity[i] +"]\n"+
								"Tempo Em Atividade ["+ activity_time[i].getSeconds() +"s]\n"+
								"Tempo Em Inatividade ["+ inactivity_time[i].getSeconds() +"s]\n"+
								"------------------\n");
					}
					
				} catch (Exception e) {
					
					e.printStackTrace();

					System.out.println("Erro no Try");
					
				}
			}
			Thread.sleep(time);
		}
	}
}