public class Main {
    public static void main(String[] args) {
//        Задание 1 (часть решения для задания 3)
        int[] arr1 = generateRandomArray();
        int totalSalary = 0;
        int counter = 0;
        for (int i = 0; i < arr1.length; i++) {
            counter = i + 1;
            totalSalary += arr1[i];
        }
        System.out.println("Сумма трат за месяц составила " + totalSalary + " рублей");
//        Arrays.sort(arr1);  ## Вариант для сортировки от меньшего к большему
//        и найти мин и макс индексом для избежания большого кода ##
//        Задание 2
        for (int i = 0; i < arr1.length; i++) {
        }
        int s = arr1[0];
        int l = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > l) l = arr1[i];
            else if (arr1[i] < s) s = arr1[i];
        }
        System.out.println("Минимальная сумма трат за день составила " + s + " рублей. " + "Максимальная сумма трат за день составила " + l + " рублей");
//        Задание 3
        System.out.println("Средняя сумма трат за месяц составила " + (float) totalSalary / counter + " рублей");
//        Задание 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
//        System.out.println();
//        System.out.println(Arrays.toString(arr1));
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}