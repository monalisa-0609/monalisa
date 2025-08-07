 public class MediaNotas; {
 public static void main(String[] args); {
 Scanner scanner = new Scanner(System.in); {
 double[] notas = new double[8]; {
 for (int i = 0; i < 8; i++); {
 System.out.print("Digite a nota " + (i + 1) + ": "); {
 for (int i = 0; i < 4; i++); {
 double mediaBimestre = (notas[i * 2] + notas[i * 2 + 1]) / 2.0; {
 System.out.printf("Média do %dº bimestre: %.2f%n", i + 1, mediaBimestre);  {
 double mediaSemestre1 = (notas[0] + notas[1] + notas[2] + notas[3]) / 4.0; {
 double mediaSemestre2 = (notas[4] + notas[5] + notas[6] + notas[7]) / 4.0; {
 System.out.printf("Média do 1º semestre: %.2f%n", mediaSemestre1); {
 System.out.printf("Média do 2º semestre: %.2f%n", mediaSemestre2); {
 double soma = 0; {
 for (double nota : notas); {
 double mediaGeral = soma / notas.length; {
 System.out.printf("Média geral: %.2f%n", mediaGeral); {