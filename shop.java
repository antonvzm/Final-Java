import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class shop {
    public static void main(String[] args) {
        Laptop lp1 = new Laptop("Lenovo", "Pink", 15.6, "Win 11", 256, 8);
        Laptop lp2 = new Laptop("Acer", "Black", 17.0, "Win 10", 512, 16);
        Laptop lp3 = new Laptop("Apple", "Grey", 14.0, "Mac OS", 128, 8);
        Laptop lp4 = new Laptop("Asus", "Green", 15.6, "DOS", 256, 8);
        Laptop lp5 = new Laptop("Techno", "Blue", 14.0, "Win 11", 512, 4);
        Laptop lp6 = new Laptop("Xiaomi", "Pink", 17.0, "Win 10", 256, 8);
        Laptop lp7 = new Laptop("HP", "Pink", 15.6, "Win 11", 256, 8);
        Laptop lp8 = new Laptop("Lenovo", "Black", 14.0, "DOS", 256, 8);
        Laptop lp9 = new Laptop("Xiaomi", "Black", 15.6, "Win 10", 512, 16);
        Laptop lp10 = new Laptop("HP", "Grey", 17.0, "Win 11", 256, 16);
        Laptop lp11 = new Laptop("Lenovo", "Pink", 15.6, "DOS", 128, 8);
        Laptop lp12 = new Laptop("Techno", "Black", 17.0, "Win 11", 256, 4);
        Laptop lp13 = new Laptop("Asus", "Green", 15.6, "Win 11", 256, 8);
        Laptop lp14 = new Laptop("Apple", "Pink", 14.0, "Mac OS", 256, 16);
        Laptop lp15 = new Laptop("Lenovo", "Grey", 15.6, "DOS", 128, 4);
        ArrayList<Laptop> lpShop = new ArrayList<>(
                Arrays.asList(lp1, lp2, lp3, lp4, lp5, lp6, lp7, lp8, lp9, lp10, lp11, lp12, lp13, lp14, lp15));
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("--------------------------------------------" +
                    "\nМеню\n 1: Печать каталога\n 2: Поиск по каталогу\n 3: Остановка программы"
                    + "\n--------------------------------------------");
            String str = in.nextLine();
            switch (str) {
                case "1":
                    for (Laptop lp : lpShop) {
                        System.out.println(lp);
                    }
                    break;
                case "2":
                    System.out.println("--------------------------------------------" +
                            "\nВыберете критерий для поиска\n 1: Фирма\n 2: Цвет\n 3: Экран\n 4: Операционная система\n 5: Память\n 6: RAM"
                            + "\n--------------------------------------------");
                    String catalog = in.nextLine();
                    switch (catalog) {
                        case "1":
                            System.out.println("--------------------------------------------" +
                                    "\nВведите фирму из списка\nLenovo\nAcer\nApple\nAsus\nTechno\nXiaomi\nHP"
                                    + "\n--------------------------------------------");
                            String firm = in.nextLine();
                            for (Laptop lp : lpShop) {
                                if (firm.equals(lp.getFirm())) {
                                    System.out.println(lp);
                                }
                            }
                            break;
                        case "2":
                            System.out.println("--------------------------------------------" +
                                    "\nВведите цвет\nPink\nBlack\nGrey\nGreen\nBlue"
                                    + "\n--------------------------------------------");
                            String color = in.nextLine();
                            for (Laptop lp : lpShop) {
                                if (color.equals(lp.getColor())) {
                                    System.out.println(lp);
                                }
                            }
                            break;
                        case "3":
                            System.out.println("--------------------------------------------" +
                                    "\nВведите диагональ из списка\n 15.6\n17.0\n14.0"
                                    + "\n--------------------------------------------");
                            String screen = in.nextLine();
                            for (Laptop lp : lpShop) {
                                String scr = Double.toString(lp.getScreen());
                                if (screen.equals(scr)) {
                                    System.out.println(lp);
                                }
                            }
                            break;
                        case "4":
                            System.out.println("--------------------------------------------" +
                                    "\nВведите OS из списка\nWin 11\nWin 10\nMac OS\nDOS"
                                    + "\n--------------------------------------------");
                            String os = in.nextLine();
                            for (Laptop lp : lpShop) {
                                if (os.equals(lp.getOs())) {
                                    System.out.println(lp);
                                }
                            }
                            break;
                        case "5":
                            System.out.println("--------------------------------------------" +
                                    "\nВведите объем памяти\n128\n256\n512"
                                    + "\n--------------------------------------------");
                            String memory = in.nextLine();
                            for (Laptop lp : lpShop) {
                                String mem = Integer.toString(lp.getInternalMemory());
                                if (memory.equals(mem)) {
                                    System.out.println(lp);
                                }
                            }
                            break;
                        case "6":
                            System.out.println("--------------------------------------------" +
                                    "\nВведите RAM из списка\n 4\n8\n16"
                                    + "\n--------------------------------------------");
                            String ram = in.nextLine();
                            for (Laptop lp : lpShop) {
                                String rm = Integer.toString(lp.getRam());
                                if (ram.equals(rm)) {
                                    System.out.println(lp);
                                }
                            }
                            break;
                        default:
                            System.out.println("Ошибка ввода");
                            break;
                    }
                case "3":
                flag = false;
                in.close();
                default:
                    System.out.println("Ошибка ввода");
                    break;
            }
        }
    }
}
