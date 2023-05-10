import java.util.Scanner;
public class ProvaIsabella{
    public static void main(String[] args) {

    Scanner scanner = new Scanner (System.in);

    System.out.println("\nInforme a placa do veiculo:");
    String placaDoVeiculo = scanner.nextLine();
    System.out.println("\nInforme o valor do litro do combustivel:");
    double combustivel = scanner.nextDouble();
    System.out.println("\nInforme a quantidade de quilômetros rodados a 60KM/H:");
    double quilometro60 = scanner.nextDouble();
    System.out.println("\nInforme a quantidade de quilômetros rodados a 80KM/H:");
    double quilometro80 = scanner.nextDouble();
    System.out.println("\nInforme a quantidade de quilômetros rodados a 100KM/H:");
    double quilometro100 = scanner.nextDouble();
    System.out.println("\nInforme a quantidade de quilômetros rodados a 120KM/H:");
    double quilometro120 = scanner.nextDouble();
    System.out.println("\nInforme a quantidade de quilômetros rodados a 140KM/H:");
    double quilometro140 = scanner.nextDouble();

    double quantidade60 = (quilometro60 / 30.7);
    double quantidade80 = (quilometro80 / 26.8);
    double quantidade100 = (quilometro100 / 22.4);
    double quantidade120 = (quilometro120 / 18.1);
    double quantidade140 = (quilometro140 / 14.5);

    double totalCombustivel = (quantidade60 + quantidade80 + quantidade100 + quantidade120 + quantidade140);

    double distanciaTotal = (quilometro60 + quilometro80 + quilometro100 + quilometro120 + quilometro140);

    double mediaPonderada = ((quilometro60 * 60) + (quilometro80 * 80) + (quilometro100 * 100) + (quilometro120 * 120) + (quilometro140 * 140)) / distanciaTotal;

    double custoTotal = totalCombustivel * combustivel;

    System.out.println("\nA placa do veiculo:" + placaDoVeiculo);
    System.out.printf("\nO custo total da viagem é: %.2f\n", custoTotal);
    System.out.printf("\nA velocidade media ponderada é: %.4f\n", mediaPonderada);
    System.out.printf("\nA quantatidade total de combustivel é: %.4f\n", totalCombustivel);

    scanner.close();
    }
}