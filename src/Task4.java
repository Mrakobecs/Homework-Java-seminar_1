public class Task4 {
    static class Answer {
        // Функция для нахождения максимума из двух чисел
        public int findMaxOfTwo(int a, int b) {

            return Math.max(a, b);

        }
        // Функция для нахождения максимума из трех чисел
        public int findMaxOfThree(int a, int b, int c) {

            return findMaxOfTwo(findMaxOfTwo(a, b), c);
        }
    }
    // Не удаляйте этот класс - он нужен для вывода результатов на
//    экран и проверки
    public static class Printer {
        public static void main(String[] args) {
            int a = 5, b = 10, c = 3;
            if (args.length == 3) {
                a = Integer.parseInt(args[0]);
                b = Integer.parseInt(args[1]);
                c = Integer.parseInt(args[2]);
            }
// Вывод результата на экран
            Answer ans = new Answer();
            int itresume_res = ans.findMaxOfThree(a, b, c);
            System.out.println(itresume_res);
        }
    }

}
