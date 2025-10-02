import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[8];

        // Receber as 8 notas do aluno
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a nota do " + (i + 1) + "º bimestre: ");
            notas[i] = scanner.nextDouble();
        }

        // Calcular médias bimestrais (já são as notas, então só exibiremos)
        double media1Bimestre = notas[0];
        double media2Bimestre = notas[1];
        double media3Bimestre = notas[2];
        double media4Bimestre = notas[3];
        double media5Bimestre = notas[4];
        double media6Bimestre = notas[5];
        double media7Bimestre = notas[6];
        double media8Bimestre = notas[7];

        // Calcular médias semestrais
        double media1Semestre = (media1Bimestre + media2Bimestre + media3Bimestre + media4Bimestre) / 4;
        double media2Semestre = (media5Bimestre + media6Bimestre + media7Bimestre + media8Bimestre) / 4;

        // Calcular média final
        double mediaFinal = (media1Semestre + media2Semestre) / 2;

        // Apresentar os resultados
        System.out.println("\nPráticas");
        System.out.println("1º Bimestre: " + media1Bimestre);
        System.out.println("2º Bimestre: " + media2Bimestre);
        System.out.println("3º Bimestre: " + media3Bimestre);
        System.out.println("4º Bimestre: " + media4Bimestre);
        System.out.println("1º Semestre: " + media1Semestre);
        System.out.println("----------------------");
        System.out.println("5º Bimestre: " + media5Bimestre);
        System.out.println("6º Bimestre: " + media6Bimestre);
        System.out.println("7º Bimestre: " + media7Bimestre);
        System.out.println("8º Bimestre: " + media8Bimestre);
        System.out.println("2º Semestre: " + media2Semestre);
        System.out.println("-----------------------");
        System.out.println("Média Final: " + mediaFinal);

        scanner.close();
    }
}
