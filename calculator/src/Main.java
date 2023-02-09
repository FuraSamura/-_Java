import java.util.Scanner;

public class Main {
    public static int R = 0;
    public static String calc(String input) {
        int c = 0;
        String[] parts = input.split(" ");
        String[] RomamN = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX"};
        if (parts.length < 4) {
            for (int i = 0; parts.length > i; i++) {
                try {
                    for (int j = 0; RomamN.length > j; j++) {

                        if (parts[i].equals(RomamN[j])) {
                            switch (parts[i]) {
                                case ("I"):
                                    R++;
                                    parts[i] = "1";
                                    break;
                                case ("II"):
                                    R++;
                                    parts[i] = "2";
                                    break;
                                case ("III"):
                                    R++;
                                    parts[i] = "3";
                                    break;
                                case ("IV"):
                                    R++;
                                    parts[i] = "4";
                                    break;
                                case ("V"):
                                    R++;
                                    parts[i] = "5";
                                    break;
                                case ("VI"):
                                    R++;
                                    parts[i] = "6";
                                    break;
                                case ("VII"):
                                    R++;
                                    parts[i] = "7";
                                    break;
                                case ("VIII"):
                                    R++;
                                    parts[i] = "8";
                                    break;
                                case ("IX"):
                                    R++;
                                    parts[i] = "9";
                                    break;
                                case ("X"):
                                    R++;
                                    parts[i] = "10";
                                    break;
                                default:
                                    System.out.println("Калькулятор принимает на вход числа от I до X");
                            }
                        }
                    }
                }
                catch (Exception ex) {
                    return "-1";
                }
            }
            if (Integer.parseInt(parts[0]) > 10 || Integer.parseInt(parts[0]) < 1 || Integer.parseInt(parts[2]) > 10 || Integer.parseInt(parts[2]) < 1) {
                System.out.println("Калькулятор принимает на вход числа от 1 до 10");
            }
            try {
                switch (parts[1]) {
                    case ("+"):
                        c = Integer.parseInt(parts[0]) + Integer.parseInt(parts[2]);
                        break;
                    case ("-"):
                        c = Integer.parseInt(parts[0]) - Integer.parseInt(parts[2]);
                        break;
                    case ("*"):
                        c = Integer.parseInt(parts[0]) * Integer.parseInt(parts[2]);
                        break;
                    case ("/"):
                        c = Integer.parseInt(parts[0]) / Integer.parseInt(parts[2]);
                        break;
                }
                return Integer.toString(c);
            }
            catch (ArithmeticException ex) {
                System.out.println("Невозможно поделить на 0");
                return "-1";
            }
            catch (Exception ex) {
                System.out.println("Неизвестная ошибка");
                return "-1";
            }
        }
        else {
            System.out.println("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        return "-1";
    }


    public static void main(String[] args) {
        while (true) {
            R = 0;
            System.out.println(" ");
            System.out.print("Напишите пример: ");
            try {
                Scanner x = new Scanner(System.in);
                String xx = x.nextLine();
                if (!xx.contains(" ")) {
                    System.out.println("Вы ввели данные некорректно!");
                    break;
                }
                else {

                    int j = Integer.parseInt(calc(xx));
                    try {
                        if (R < 1) {
                            if (j != -1) {
                                System.out.print(j);
                            }
                        }
                        else if (R > 1)
                        {
                            int p = 0;
                            String itog = "";
                            if(j > 10 && j < 100)
                            {
                                if(j >= 40 && j < 50)
                                {
                                    p = j % 10;
                                    itog = "XL";
                                }
                                if(j > 10 && j < 20)
                                {
                                    p = j % 10;
                                    itog = "X";
                                }
                                if(j >= 20 && j < 30)
                                {
                                    p = j % 10;
                                    itog = "XX";
                                }
                                if(j >= 30 && j < 40)
                                {
                                    p = j % 10;
                                    itog = "XXX";
                                }
                                if(j >= 50 && j < 60)
                                {
                                    p = j % 10;
                                    itog = "L";
                                }
                                if(j >= 60 && j < 70)
                                {
                                    p = j % 10;
                                    itog = "LX";
                                }
                                if(j >= 70 && j < 80)
                                {
                                    p = j % 10;
                                    itog = "LXX";
                                }
                                if(j >= 80 && j < 90)
                                {
                                    p = j % 10;
                                    itog = "LXXX";
                                }
                                if(j >= 90 && j <= 99)
                                {
                                    p = j % 10;
                                    itog = "XC";
                                }
                            }
                            else if(j == 10)
                            {
                                itog += "X";
                            }
                            else if(j == 100)
                            {
                                itog += "C";
                            }
                            else if(j < 0 || j > 100) {
                                System.out.println("Калькулятор считает римские цифры от I до C. Также не может быть минуса");
                            }

                            if(p != 0) {
                                switch (p) {
                                    case 1:
                                        itog += "I";
                                        break;
                                    case 2:
                                        itog += "II";
                                        break;
                                    case 3:
                                        itog += "III";
                                        break;
                                    case 4:
                                        itog += "IV";
                                        break;
                                    case 5:
                                        itog += "V";
                                        break;
                                    case 6:
                                        itog += "VI";
                                        break;
                                    case 7:
                                        itog += "VII";
                                        break;
                                    case 8:
                                        itog += "VIII";
                                        break;
                                    case 9:
                                        itog += "IX";
                                        break;
                                }
                            }
                            else {
                                switch (j) {
                                    case 1:
                                        itog += "I";
                                        break;
                                    case 2:
                                        itog += "II";
                                        break;
                                    case 3:
                                        itog += "III";
                                        break;
                                    case 4:
                                        itog += "IV";
                                        break;
                                    case 5:
                                        itog += "V";
                                        break;
                                    case 6:
                                        itog += "VI";
                                        break;
                                    case 7:
                                        itog += "VII";
                                        break;
                                    case 8:
                                        itog += "VIII";
                                        break;
                                    case 9:
                                        itog += "IX";
                                        break;
                                }
                            }
                            System.out.println(itog);
                        }
                        else
                        {
                            System.out.println("Калькулятор умеет работать только с арабскими или римскими цифрами одновременно");
                            break;
                        }
                    } catch (Exception ex) {

                    }
                }
            }
            catch (Exception ex) {
                if(R < 1) {
                    System.out.println("Невозможно ввести буквы!");
                }
                break;
            }
        }
    }
}

