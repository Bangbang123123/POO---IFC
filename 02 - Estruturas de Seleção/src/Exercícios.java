import java.util.Scanner;

public class Exercícios {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o número do exercício: ");
		int select = input.nextInt();
		
		
		switch(select) {
			default:
				System.out.print("Número inválido");
				break;
			case 1:
				System.out.println("Digite dois números: ");
				float num1 = input.nextFloat();
				float num2 = input.nextFloat();
				if (num1 > num2) {
					System.out.print("Maior número: "+ num1);
				}else {
					System.out.print("Maior número: "+ num2);
				}
				break;
			case 2:
				System.out.print("Digite um número: ");
				float n= input.nextFloat();
				if (n > 0) {
					System.out.print("É positivo");
				}else if (n < 0){
					System.out.print("É negativo");
				}else {
					System.out.print("É zero");
				}
				break;
			case 3:
				System.out.print("Informe o sexo (M/F): ");
				// clear enter input
				input.nextLine();
				char sexo = input.nextLine().charAt(0);
				if (sexo == 'M') {
					System.out.print("Masculino");
				}else if (sexo == 'F') {
					System.out.print("Feminino");
				}else {
					System.out.print("Inválido");
				}
				break;
			case 4:
				System.out.print("Informe um ano de 4 dígitos: ");
				int ano = input.nextInt();
				if (ano >= 10000) {
					System.out.print("Precisa ser de 4 dígitos");
				}else {
					if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)) {
						System.out.print("É um ano bissexto");
					}else {
						System.out.print("Não é um ano bissexto");
					}
				}
				
				break;
			case 5:
				System.out.print("Informe uma letra: ");
				// clear enter input
				input.nextLine();
				char letra = input.nextLine().charAt(0);
				if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
					letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
					System.out.print("É vogal");
				}else {
					System.out.print("É consoante");
				}
				
				break;
			
			case 6:
				System.out.print("Informe um número: ");
				int num = input.nextInt();
				if (num % 2 == 0) {
					System.out.print("Esse número é par // "+ (num+1) +" é ímpar");
				}else {
					System.out.print("Esse número é ímpar // "+ (num+1) +" é par");
				}
				break;
			case 7:
				System.out.println("Informe 3 números: ");
				int[] list = {0,0,0};
				for(int i = 0; i < 3 ; i++) {
					list[i] = input.nextInt();
				}
				// bubble sorting
				boolean is_sorted = false;
				while(!is_sorted) {
					is_sorted = true;
					for (int i = 0; i<2 ; i++) {
						if (list[i] < list[i+1]) {
							int buffer = list[i+1];
							list[i+1] = list[i];
							list[i] = buffer;
							is_sorted = false;
						}
					}
				}
				System.out.print("A lista em ordem decrescente é: [ ");
				for(int i = 0;i<3;i++) {
					System.out.print(list[i]+" ");
				}
				System.out.print("]");
				break;
			case 8:
				System.out.print("Informe 2 notas: ");
				float media = (input.nextFloat() + input.nextFloat())/2;
				if (media >= 7) {
					System.out.print("Aprovado com a média: "+ media);
				}else {
					System.out.print("Reprovado com a média: "+ media);
				}
				break;
			case 9:
				System.out.println("Informe sexo [M/F], altura e peso: ");
				double alt = input.nextDouble();
				double peso = input.nextDouble();
				input.nextLine();
				char sex = input.nextLine().charAt(0);
				
				double peso_ideal;
				if (sex == 'M'){
					peso_ideal = (72.7*alt) - 58;
				}else if (sex == 'F'){
					peso_ideal = (62.1*alt) - 44.7;
				}else {
					System.out.print("Sexo inválido");
					break;
				}
				
				if (peso_ideal > peso) {
					System.out.print("Está abaixo do peso ideal");
				}else if (peso_ideal < peso) {
					System.out.print("Está acima do peso ideal");
				}else {
					System.out.print("Está no peso ideal");
				}
				
				break;
			case 10:
				System.out.print("Informe 3 números: ");
				int[] list2 = {0,0,0};
				int maior = 0,menor = 0;
				for(int i = 0;i<3;i++) {
					list2[i] = input.nextInt();
					if (i == 0) {
						maior = list2[i];
						menor = list2[i];
					}else {
						if (maior < list2[i]) {
							maior = list2[i];
						}else if (menor > list2[i]) {
							menor = list2[i];
						}
					}
				}
				System.out.print("Maior: "+ maior +" // Menor: "+ menor);
				break;
			case 11:
				System.out.print("Informe um turno, Matutino[M], Vespertino[V] ou Noturno[N]: ");
				input.nextLine();
				switch(input.nextLine().charAt(0)) {
					case 'M','m':
						System.out.print("Bom dia!");
						break;
					case 'V','v':
						System.out.print("Boa tarde!");
						break;
					case 'N','n':
						System.out.print("Boa noite!");
						break;
					default:
						System.out.print("Inválido");
				}
				break;
			case 12:
				System.out.print("Informe o salário: ");
				double salario = input.nextDouble();
				double aumento;
				if (salario <= 280) {
					aumento = 0.2;
				}else if (salario <= 700) {
					aumento = 0.15;
				}else if (salario <= 1500) {
					aumento = 0.1;
				}else{
					aumento = 0.05;
				}
				System.out.print("Salário antes: R$"+ salario
						+"\nAumento: "+ (aumento*100)
						+"%\nValor adicionado: "+ (aumento*salario)
						+"\nSalário final: R$ "+ ((aumento+1)*salario));
				break;
			case 13:
				System.out.print("Ganho por hora: ");
				float salario_bruto = input.nextFloat();
				System.out.print("Horas trabalhadas nesse mês: ");
				salario_bruto *= input.nextFloat();
				
				float imposto;
				if (salario_bruto <= 900) {
					imposto = 0;
				}else if (salario_bruto <= 1500) {
					imposto = 0.05f;
				}else if (salario_bruto <= 2500) {
					imposto = 0.1f;
				}else{
					imposto = 0.2f;
				}
				
				System.out.print("Salário Bruto: R$ "+ salario_bruto
						+"\nIR ["+ (imposto*100) +"%]: R$ "+ (salario_bruto * imposto)
						+"\nINSS [10%]: R$ "+ (salario_bruto * 0.1)
						+"\nSindicato [3%]: R$ "+ (salario_bruto * 0.03)
						+"\nFGTS [11%]: R$ "+ (salario_bruto * 0.11)
						+"\nTotal de descontos ["+ (0.13 + imposto) +"%]: R$ "+ (salario_bruto * (0.13 + imposto))
						+"\nSalário Líquido: R$ "+ (salario_bruto * (0.87 - imposto))
						);
				break;
			case 14:
				System.out.print("Digite um número de 1 a 7: ");
				switch(input.nextInt()) {
					default:
						System.out.print("Número Inválido");
						break;
					case 1:
						System.out.print("É domingo");
						break;
					case 2:
						System.out.print("É segunda");				
						break;
					case 3:
						System.out.print("É terça");
						break;
					case 4:
						System.out.print("É quarta");
						break;
					case 5:
						System.out.print("É quinta");
						break;
					case 6:
						System.out.print("É sexta");
						break;
					case 7:
						System.out.print("É sábado");
						break;
				}
				break;
			case 15:
				System.out.println("Digite o código e o preço: ");
				switch(input.nextInt()) {
					default:
						System.out.print("Importado // R$ "+ input.nextFloat());
						break;
					case 1:
						System.out.print("Sul // R$ "+ input.nextFloat());
						break;
					case 2:
						System.out.print("Norte // R$ "+ input.nextFloat());				
						break;
					case 3:
						System.out.print("Leste // R$ "+ input.nextFloat());
						break;
					case 4:
						System.out.print("Oeste // R$ "+ input.nextFloat());
						break;
					case 5,6:
						System.out.print("Nordeste // R$ "+ input.nextFloat());
						break;
					case 7,8:
						System.out.print("Centro-Oeste // R$ "+ input.nextFloat());
						break;
				}
				break;
			case 16:
				System.out.print("Informe 2 notas: ");
				float media_ = (input.nextFloat() + input.nextFloat())/2;
				if (media_ <= 3) {
					System.out.print("Reprovado");
				}else if (media_ < 7) {
					System.out.print("Em exame");
				}else {
					System.out.print("Aprovado");
				}
				break;
			case 17:
				System.out.print("Informe 2 notas: ");
				float _media = (input.nextFloat() + input.nextFloat())/2;
				if (_media < 4) {
					System.out.print("Nível de conceito: E // Reprovado");
				}else if (_media < 6) {
					System.out.print("Nível de conceito: D // Reprovado");
				}else if (_media < 7.5) {
					System.out.print("Nível de conceito: C // Aprovado");
				}else if (_media < 9) {
					System.out.print("Nível de conceito: B // Aprovado");
				}else{
					System.out.print("Nível de conceito: A // Aprovado");
				}
				break;
			case 18:
				System.out.println("Informe os lados do triângulo: ");
				float[] lados = {0,0,0};
				for(int i = 0;i<3;i++) {
					lados[i] = input.nextFloat();
				}
				if ((lados[0] == lados[1] && lados[1] == lados[2])) {
					System.out.print("É um triângulo equilátero");
				}else if (lados[0] == lados[1] || lados[0] == lados[2] || lados[1] == lados[2]) {
					System.out.print("É um triângulo isósceles");
				}else {
					System.out.print("É um triângulo escaleno");
				}
				break;
			case 19:
				System.out.println("Informe os coeficientes da equação [ax²+bx+c = 0]: ");
				float a = input.nextFloat();
				
				if (a == 0) {
					System.out.print("Coeficiente inválido");
					break;
				}else {
					float b = input.nextFloat();
					float c = input.nextFloat();
					float delta = b*b - 4*a*c;
					if (delta < 0) {
						System.out.print("Não possui raíz real");
					}else if (delta == 0) {
						System.out.print("Única raíz: "+ (-b + Math.pow(delta, 0.5))/(2*a));
					}else {
						System.out.print("1° raíz: "+ (-b + Math.pow(delta, 0.5))/(2*a)+
										"\n2° raíz: "+ (-b - Math.pow(delta, 0.5))/(2*a)
						);
					}
				}
				break;
			case 20:
				System.out.print("Informe um ano: ");
				int ano_ = input.nextInt();
				if ((ano_ % 4 == 0) && (ano_ % 100 != 0) || (ano_ % 400 == 0)) {
					System.out.print("É um ano bissexto");
				}else {
					System.out.print("Não é um ano bissexto");
				}
				break;
			case 21:
				System.out.print("Insira uma data, informando respectivamente dia, mês e ano: ");
				int dia = input.nextInt();
				int mes = input.nextInt();
				int _ano = input.nextInt();
				int dia_limit = 0;
				if (dia < 0 || mes < 0 || _ano < 0 || _ano >= 10000) {
					System.out.print("Data inválida");
					break;
				}else {
					switch(mes) {
						default:
							System.out.print("Data inválida");
							break;
						case 1,3,5,7,8,10,12:
							dia_limit = 31;
							break;
						case 4,6,9,11:
							dia_limit = 30;
							break;
						case 2:
							if ((_ano % 4 == 0) && (_ano % 100 != 0) || (_ano % 400 == 0)) {
								dia_limit = 29;
							}else {
								dia_limit = 28;
							}
							break;
					}
					if (dia <= dia_limit) {
						System.out.print("Data válida: ["+ dia +"/"+ mes +"/"+ _ano +"]");
					}else {
						System.out.print("Data inválida");
					}
				}
				break;
			case 22:
				System.out.print("Informe um número menor que 1000: ");
				int cdu = input.nextInt();
				if (cdu < 1000) {
					System.out.print("Centenas: "+ (cdu / 100));
					cdu = cdu % 100;
					System.out.print("\nDezenas: "+ (cdu / 10));
					cdu = cdu % 10;
					System.out.print("\nUnidades: "+ cdu);
				}else {
					System.out.print("Número inválido");
				}
				break;
			case 23:
				System.out.println("Informe 3 idades de alunos: ");
				float med_idade = (input.nextFloat() + input.nextFloat() + input.nextFloat())/3;
				if (med_idade < 25) {
					System.out.print("Turma Jovem");
				}else if (med_idade < 40) {
					System.out.print("Turma Adulta");
				}else{
					System.out.print("Turma Idosa");
				}
				break;
			case 24:
				System.out.println("Informe 3 notas: ");
				float _media_ = (input.nextFloat() + input.nextFloat() + input.nextFloat())/3;
				if (_media_ < 7) {
					System.out.print("Média: "+ _media_ +" // Reprovado");
				}else if (_media_ < 10) {
					System.out.print("Média: "+ _media_ +" // Aprovado");
				}else{
					System.out.print("Média: "+ _media_ +" // Aprovado com Distinção");
				}
				break;
			case 25:
				System.out.print("Informe uma quantia menor que 600: ");
				int valor = input.nextInt();
				if (valor >= 10 && valor <= 600) {
					if (valor/100 != 0) {
						System.out.println("Notas de 100: "+ (valor / 100));
						valor = valor % 100;
					}
					if (valor/50 != 0) {
						System.out.println("Notas de 50: "+ (valor / 50));
						valor = valor % 50;
					}
					if (valor/10 != 0) {
						System.out.println("Notas de 10: "+ (valor / 10));
						valor = valor % 10;
					}
					if (valor/5 != 0) {
						System.out.println("Notas de 5: "+ (valor / 5));
						valor = valor % 5;
					}
					if (valor != 0) {
						System.out.println("Notas de 1: "+ valor);
					}
				}else {
					System.out.print("Número inválido");
				}
				break;
			case 26:
				System.out.print("Informe um número inteiro: ");
				if (input.nextInt() % 2 == 0) {
					System.out.print("É par");
				}else {
					System.out.print("É ímpar");
				}
				break;
			case 27:
				System.out.print("Informe um número: ");
				float n1 = input.nextFloat();
				if (n1 == Math.floor(n1)) {
					System.out.print("É inteiro");
				}else {
					System.out.print("É decimal");
				}
				break;
			case 28:
				// The operations I choose were (+ - * /)
				System.out.println("Informe 2 números e a operação [(+)(-)(*)(/)]:");
				float n_1 = input.nextFloat(); float n_2 = input.nextFloat();
				input.nextLine();
				char choose = input.nextLine().charAt(0);
				float result = 0;
				switch(choose) {
				default:
					System.out.print("Escolha inválida");
					System.exit(0);
				case '+':
					result = n_1 + n_2;
					break;
				case '-':
					result = n_1 - n_2;
					break;				
				case '*':
					result = n_1 * n_2;
					break;
				case '/':
					if (n_2 != 0) {
						result = n_1 / n_2;
					}else {
						System.out.print("Divisão por 0");
						System.exit(0);
					}
					break;
				}
				
				System.out.println("O resultado da operação ("+ choose +") é: "+ result);
				if (result % 2 == 0) {
					System.out.println("O número é par");
				}else {
					System.out.println("O número é ímpar");
				}
				if (result >= 0) {
					System.out.println("O número é positivo");
				}else {
					System.out.println("O número é negativo");
				}
				if (result == Math.floor(result)) {
					System.out.print("O número é inteiro");
				}else {
					System.out.print("O número é decimal");
				}
				break;
			case 29:
				System.out.println("Responda as seguintes perguntas com [s/n]: ");
				String[] perguntas = {"Telefonou para a vítima?","Esteve no local do crime?","Mora perto da vítima?","Devia para a vítima?","Já trabalhou com a vítima?"};
				int counter = 0;
				int i = 0;
				input.nextLine();
				while (i < perguntas.length) {
					System.out.print(perguntas[i] +": ");
					char response = input.nextLine().charAt(0);
					if (response == 's') {
						counter++;
						i++;
					}else if (response == 'n') {
						i++;
					}else {
						System.out.println("Resposta inválida\n");
					}
				}
				switch(counter) {
					default:
						System.out.print("\nInocente");
						break;
					case 2:
						System.out.print("\nSuspeita");
						break;
					case 3,4:
						System.out.print("\nCúmplice");
						break;
					case 5:
						System.out.print("\nAssassino");
						break;
				}
				break;
			case 30:
				System.out.print("Informe os litros e o tipo [A-Álcool // G-Gasolina]: ");
				float litros = input.nextFloat();
				input.nextLine();
				switch(input.nextLine().charAt(0)) {
					default:
						System.out.print("Tipo inválido");
						break;
					case 'A':
						if (litros <= 20) {
							System.out.print("O preço é: R$ "+ (litros*1.9*0.97));
						}else {
							System.out.print("O preço é: R$ "+ (litros*1.9*0.95));
						}
						break;
					case 'G':
						if (litros <= 20) {
							System.out.print("O preço é: R$ "+ (litros*2.5*0.96));
						}else {
							System.out.print("O preço é: R$ "+ (litros*2.5*0.94));
						}
						break;
				}
				break;
			case 31:
				System.out.print("Informe os Kg de morango e maçã: ");
				float kg_total = 0;
				float rs_total = 0;
				
				// Morango
				float kg = input.nextFloat();
				if (kg <= 5) {
					rs_total += kg * 2.5;
				}else {
					rs_total += kg * 2.2;
				}
				kg_total += kg;
				
				// Maçã
				kg = input.nextFloat();
				if (kg <= 5) {
					rs_total += kg * 1.8;
				}else {
					rs_total += kg * 1.5;
				}
				kg_total += kg;
				
				if (kg_total >= 8 || rs_total >= 25) {
					rs_total *= 0.9;
				}
				System.out.print("Preço final: R$ "+ rs_total);	
				break;
			case 32:
				System.out.println("Informe o tipo (Filé Duplo, Alcatra ou Picanha [F/A/P]), os quilos, e se tem cartão [s/n]:");
				float preco = 0;
				String saida = "";
				input.nextLine();
				// Tipo da carne
				switch(input.nextLine().charAt(0)) {
					default:
						System.out.print("Tipo inválido");
						System.exit(0);
					case 'F':
						preco = 4.9f;
						saida += "Filé Duplo // ";
					case 'A':
						preco = 5.9f;
						saida += "Alcatra // ";
					case 'P':
						preco = 6.9f;
						saida += "Picanha // ";
				}
				
				// Quilos de carne
				float quilos = input.nextFloat();
				if (quilos >= 5) {
					preco += 0.9f;
				}
				
				preco *= quilos;
				saida += quilos + " Kg\nPreço total: "+ preco +"\nUsando cartão?: ";
				
				// Cartão
				input.nextLine();
				if (input.nextLine().charAt(0) == 's') {
					saida += "Sim\nDesconto 5%\nValor do Desconto: R$ "+ (preco * 0.05);
					preco *= 0.95;
					saida += "\nValor a pagar: R$" + preco;
				}else {
					saida += "Não\nDesconto: 0%\nValor do Desconto: R$ 0\nValor a pagar: R$ "+ preco;
				}
				System.out.print(saida);
				break;
			case 33:
				System.out.println("Informe o gabarito:");
				String gabarito = "aabbccddee";
				int resultado = 0;
				String resultado_text = "";
				input.nextLine();
				for (int j = 0;j < gabarito.length();j++) {
					char resposta = input.nextLine().charAt(0);
					resultado_text += "\nQ"+ (j+1) +": ["+ resposta +"] -- ["+ gabarito.charAt(j) +"] // ";
					if (resposta == gabarito.charAt(j)) {
						resultado++;
						resultado_text += "Correto";
					}else {
						resultado_text += "Incorreto";
					}
				}
				resultado_text += "\n\nPontuação final: "+ resultado;
				System.out.print(resultado_text);
				break;
		}
		
		input.close();
	}
}
