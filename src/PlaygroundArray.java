import java.util.Scanner;

public class PlaygroundArray {
    public static void main(String[] args) {

    int[] newArray =  {102040, 201030, 301020, 40302010, 50401020};
    boolean foundNumber = false;

    Scanner scanner = new Scanner(System.in);
    System.out.println("insira senha passe");
    int dataUser = scanner.nextInt();

    for (int i = 0; i < newArray.length; i++) {
        if (dataUser == newArray[i]) foundNumber = true;
        break;
    }

    for (int j : newArray) {
        if (dataUser == j) foundNumber = true;
    }

    if (foundNumber) {
        System.out.println("senha correta");
    } else {
        System.out.println("tente novamente");
    }

    }
}
