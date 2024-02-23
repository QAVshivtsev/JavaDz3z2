public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double m = 98; // Значение вводится в киллограмах
        double h = 1.87; // Значение вводится в метрах
        double bmi = (int)Math.round(service.calculate(m, h)); // должно получиться 28
        System.out.println(bmi);

        System.out.println( ); //пустая строка, далее делаю проверочный тест
        System.out.println("Расчитываем для человека 1.7 метра и весом 94 киллограмма");
        System.out.println(Math.round(service.calculate(94, 1.7)));
    }
}
// Нагуглил Math.round(n) — возвращает целое число, ближайшее к аргументу n (округляет n)
// Решил использовать, чтобы не получать длинные числа
// 6 строчка без формулы бы выглядела
// double bmi = service.calculate(m, h); // должно получиться 28
// Использую везде double, из-за того что значения не целое и пользователь условно может ввести не целым числом
