import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        // exercícios de fixação
        // 1

        int[] numerosInteiros = {1, 2, 3, 4, 5};

        for (int i = 0; i < numerosInteiros.length; i++) {
            System.out.println(numerosInteiros[i]);
        }

        int[] numeros = {10, 20, 30, 40, 50};
        for (int numero : numeros) {
            System.out.println(numero);
        }


        // 2

        int[] integers = {47, 28, 35, 99};
        int soma = 0;

        for (int i = 0; i < integers.length; i++) {
            soma += integers[i];
        }
        for (int integer : integers) {
            soma += integer;
        }
        System.out.println(soma/2);


        // 3

        int[] numbers = {1001, 1938, 1047, 1288, 1488, 1844,};

        int bigger = numbers[0];
        int smaller = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > bigger) bigger = numbers[i];
            if (numbers[i] < smaller) smaller = numbers[i];
        }


        // 4

        int[] biggestArray = {10, 20, 13, 15, 90, 99, 18, 81, 71, 92};

        for (int j : biggestArray) {
            if (j % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }

        int count = 0;
        for (int evenNumber : biggestArray) {
            if (evenNumber % 2 == 0) count++;
        }
        System.out.println(count);


        // 5 - multiplying elements

        int[] integerArray = {1, 2, 3, 4, 5};

        for (int i = 0; i < integerArray.length; i++) {
            System.out.println(integerArray[i] * 2);
        }
        for (int integerNumber : integerArray) {
            System.out.println(integerNumber * 2);
        }


        // 6 - printing backwards

        int[] directArray = {1, 2, 3, 4, 5, 6};

        for (int i = directArray.length - 1; i >=0; i--) {
            System.out.println(directArray[i]);
        }


        // 7

        double[] gradesSemester = {7, 6, 8, 9};
        double gradesSum = 0;

        for (double grade : gradesSemester) {
            gradesSum += grade;
        }
        double gradesAverage = gradesSum/gradesSemester.length;


        // desafios
        // 8

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um número no console");
        int userNumber = scanner.nextInt();

        int countNumber = 0;
        int[] countArray = {1, 1, 2, 3, 2, 3, 1, 3, 4, 1, 2, 3};

        for (int i = 0; i < countArray.length; i++) {
            if (userNumber == countArray[i]) countNumber++;
        }

        for (int j : countArray) {
            if (userNumber == j) countNumber++;
        }

        //9 - elementos unicos

        int[] singleArray = {1, 1, 2, 3, 2, 3, 1, 3, 4, 1, 2, 3} ;

        for (int i = 0; i < singleArray.length; i++) {
            boolean uniqueValue = true;
            for (int j = 0; j < singleArray.length; j++) {
                if (i != j && singleArray[i] == singleArray[j]) {
                    uniqueValue = false;
                    break;
                }
            }
            if (uniqueValue) {
                System.out.println(singleArray[i]);
            }
        }


        // 10 - substituindo valores negativos

        int[] zArray = {-3, -2, -1, 0, 1, 2, 3};

        for (int i = 0; i < zArray.length; i++) {
            if (zArray[i] < 0) zArray[i] = 0;
        }


        // 11 - soma de pares e impares

        int[] paricityArray = {10, 11, 12, 13, 14, 20, 21, 23, 24};

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < paricityArray.length; i++) {
            if (paricityArray[i] % 2 == 0) {
                evenSum += paricityArray[i];
            } else {
                oddSum += paricityArray[i];
            }
        }

        // 12 - rotação


    }
}
