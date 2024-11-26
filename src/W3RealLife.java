public class W3RealLife {
    public static void main(String[] args) {
        int ages[] = {20, 22, 24, 19, 18, 56, 32, 67, 83, 21};

        float avg, sum = 0; // inicialização das variáveis

        int length = ages.length;

        for (int j : ages) {
            sum += j;
        }

        avg = sum / length;

        System.out.println(avg);

        //

        int[] listAges = {75, 20, 30, 22, 20, 48, 29, 90, 36, 71, 35, 19, 19};

        int listLength = listAges.length;

        int lowestAge = listAges[0];
        int biggestAge = listAges[0];

        for (int age : listAges) {
            if (lowestAge > age) lowestAge = age;
            if (biggestAge < age) biggestAge = age;
        }
    }
}
