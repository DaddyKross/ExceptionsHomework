class Answer {
    public static int convertAndSum(String[] strings) {
        int sum = 0;
        for (String s : strings) {
            try {
                int number = Integer.parseInt(s);
                sum += number;
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Ошибка преобразования строки в число: " + s);
            }
        }
        if (sum > 100) {
            throw new ArithmeticException("Превышен лимит суммы");
        }
        return sum;
    }
}

public class Printer {
    public static void main(String[] args) {
        try {
            String[] strings = {"10", "20", "70"};
            System.out.println(Answer.convertAndSum(strings));
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try {
            String[] invalidStrings = {"10", "20", "abc"};
            System.out.println(Answer.convertAndSum(invalidStrings));
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try {
            String[] overLimitStrings = {"50", "60"};
            System.out.println(Answer.convertAndSum(overLimitStrings));
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}