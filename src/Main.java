public class Main {
    static int banyakRusak=0;
    public static void main(String[] args) {
        //No. 1
        rusak(1000);
        System.out.printf("String Hello Dicetak Sebanyak = %d \n", banyakRusak);

        //No. 2
        System.out.printf("Return Value roger(8,8) = %d \n", roger(8,8));

        //No.3
        sumCharType("pemrogramanDasarJava1");
    }

    public static void rusak(int n) {
        if (n == 0) {
            return;
        }
        for (int i = 0 ; i < n ; i++) {
            System.out.println("Hello");
            banyakRusak++;
        }
        rusak((int)n/2);
    }

    public static int roger(int k, int b) {
        if (b == 1) return 1;
        else if (k % b == 0) return 1 + roger(k, --b);
        else return 0 + roger(k, --b);
    }

    public static void sumCharType(String input){
        int totalUpperCase = 0;
        int totalLowerCase = 0;
        int totalNumber = 0;
        int totalSymbol = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))){
                totalUpperCase++;
            } else if(Character.isLowerCase(input.charAt(i))){
                totalLowerCase++;
            } else if (Character.isDigit(input.charAt(i))){
                totalNumber++;
            } else{
                totalSymbol++;
            }
        }
        System.out.printf("uppercase : %d\n", totalUpperCase);
        System.out.printf("lowercase : %d\n", totalLowerCase);
        System.out.printf("angka     : %d\n", totalNumber);
        System.out.printf("symbol    : %d\n", totalSymbol);
    }
}