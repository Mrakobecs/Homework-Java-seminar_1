//Напишите метод printEvenNums, который выведет на экран все четные числа
//в промежутке от 1 до 100, каждое на новой строке.


public class Task2 {
    static class Answer {
        public static void printEvenNums() {
// Напишите свое решение ниже

            for (int i = 0; i < 101; i++) {
                if (i % 2 == 0){
                    System.out.println(i);
                }

            }
        }
    }
    // Не удаляйте этот класс - он нужен для вывода результатов на
//    экран и проверки

    public static class Printer {
        public static void main(String[] args) {
            Answer ans = new Answer();
            ans.printEvenNums();
        }
    }

}
