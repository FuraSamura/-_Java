import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            int a, b;
            int R = 0;
            System.out.println(" ");
            System.out.print("Напишите пример: ");
            try {
                Scanner x = new Scanner(System.in);
                String xx = x.nextLine();
                String[] parts = xx.split(" ");
                String[] RomamN = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX"};

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
                    } catch (Exception ex) {

                    }
                }
                if (!xx.contains(" ")) {
                    System.out.println("Вы ввели данные некорректно!");
                    break;
                } else if (Integer.parseInt(parts[0]) > 10 || Integer.parseInt(parts[0]) < 1 || Integer.parseInt(parts[2]) > 10 || Integer.parseInt(parts[2]) < 1) {
                    System.out.println("Калькулятор принимает на вход числа от 1 до 10");
                } else {
                    int j = Calculator.calculate(Integer.parseInt(parts[0]), Integer.parseInt(parts[2]), parts[1]);

                    try {
                        if (R < 1) {
                            if (j != -1) {
                                System.out.print(j);
                            }
                        } else if (R > 1) {
                            switch (j) {
                                case (1):
                                    System.out.println("I");
                                    break;
                                case (2):
                                    System.out.println("II");
                                    break;
                                case (3):
                                    System.out.println("III");
                                    break;
                                case (4):
                                    System.out.println("IV");
                                    break;
                                case (5):
                                    System.out.println("V");
                                    break;
                                case (6):
                                    System.out.println("VI");
                                    break;
                                case (7):
                                    System.out.println("VII");
                                    break;
                                case (8):
                                    System.out.println("VIII");
                                    break;
                                case (9):
                                    System.out.println("IX");
                                    break;
                                case (10):
                                    System.out.println("X");
                                    break;
                                case (11):
                                    System.out.println("XI");
                                    break;
                                case (12):
                                    System.out.println("XII");
                                    break;
                                case (13):
                                    System.out.println("XIII");
                                    break;
                                case (14):
                                    System.out.println("XIV");
                                    break;
                                case (15):
                                    System.out.println("XV");
                                    break;
                                case (16):
                                    System.out.println("XVI");
                                    break;
                                case (17):
                                    System.out.println("XVII");
                                    break;
                                case (18):
                                    System.out.println("XVIII");
                                    break;
                                case (19):
                                    System.out.println("XIX");
                                    break;
                                case (20):
                                    System.out.println("XX");
                                    break;
                                default:
                                    System.out.println("Калькулятор считает римские цифры от I до XX. Также не может быть минуса");
                            }
                        } else {
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

class Calculator {
     public static int calculate(int a,int b, String sign){
         int c = 0;
         try
         {
             switch (sign) {
                 case ("+"):
                     c = a + b;
                     break;
                 case ("-"):
                     c = a - b;
                     break;
                 case ("*"):
                     c = a * b;
                     break;
                 case ("/"):
                     c = a / b;
                     break;
                 }
                 return c;
         }
         catch (ArithmeticException ex)
         {
             System.out.println("Невозможно поделить на 0");
         }
         catch (Exception ex)
         {
             System.out.println("Неизвестная ошибка");
         }
         return -1;
     }
}

