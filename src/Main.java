import java.util.Arrays;
public class Main {
    int[] arr = generateRandomArray();
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    //String a = Arrays.toString(arr);
    //System.out.println(a);
    //System.out.println(Arrays.toString(arrSort));


    public static void main(String[] args) {
        //HW 1 Exercise 1
        System.out.println("HW 1 Exercise 1");
        int[] myArray = generateRandomArray();
        int sum = 0;
        for(int i = 0; i < myArray.length; i++){
                sum = sum + myArray[i];
                //System.out.println(myArray[i]);
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //HW 1 Exercise 2
        System.out.println();
        System.out.println("HW 1 Exercise 2");
        int min = myArray[0];
        int max = myArray[0];
        for(int i = 0; i < myArray.length; i++ ){
            System.out.println(myArray[i]);
            if(myArray[i] < min){
                min = myArray[i];
            }
            if(myArray[i] > max){
                max = myArray[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min +  " рублей. ");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей.");

        //HW 1 Exercise 3
        System.out.println();
        System.out.println("HW 1 Exercise 3");
        double average;
        int numDays = myArray.length;
        for(int i = 0; i < myArray.length; i++){
            sum = sum + myArray[i];
        }
        average = sum/numDays;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        //HW 1 Exercise 4
        System.out.println();
        System.out.println("HW 1 Exercise 4");
        char[] reverseFullName = {'n','a','v','I','.','v','o','n','a','v','I'};
        //char[] FullName = new char[reverseFullName.length];
        for(int i = reverseFullName.length - 1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }

       }


}