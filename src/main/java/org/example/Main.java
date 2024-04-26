package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Jail jail = new Jail();

        while (true) {
            System.out.print("\nВыберите функции, которые хотите использовать:\n1.Выбрать обед\n2.Узнать название тюрьмы\n3.Сменить камеру\n4.Выйти из тюрьмы\n5.Выбрать количество людей в вашей камере\n6.Узнать информацию о себе\n7.Заварить чай\n8.Прилечь поспать\n ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    jail.ChoiseBreakFast();
                    break;
                case 2:
                    jail.NameJail();
                    break;
                case 3:
                    jail.SmenaCameri();
                    break;
                case 4:
                    jail.ExitJailBreak();
                    break;
                case 5:
                    jail.AmountInCamera();
                    break;
                case 6:
                    jail.Info();
                    break;
                case 7:
                    jail.DrinkTea();
                    break;
                case 8:
                    jail.sleep();
                    break;
                default:
                    System.out.println("Вы выбрали несуществующую функцию!");
            }
        }
    }
}

class Prisoner {
    private String name;
    private String country;
    private int age;
    private String crime;

    public Prisoner(String name, String country, int age, String crime) {
        this.name = name;
        this.country = country;
        this.age = age;
        this.crime = crime;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getAge() {
        return age;
    }

    public String getCrime() {
        return crime;
    }
}

class Jail {
    private Prisoner prisoner;

    public Jail() {
        this.prisoner = new Prisoner("Чарльз Бронсон", "Великобритания", 27, "ограбление почтового отделения");
    }

    public void ChoiseBreakFast() {
        String Obeda;
        System.out.print("Выберите обед:\n1.Гречка с соисками\n2.Макароны по флотски\n3.Куринный супчик\n");
        Scanner vibor = new Scanner(System.in);
        int viborka = vibor.nextInt();
        switch (viborka) {
            case 1:
                Obeda = "Гречку с сосисками";
                System.out.printf("Вы выбрали %s", Obeda);

                break;
            case 2:
                Obeda = "Макароны по флотски";
                System.out.printf("Вы выбрали %s", Obeda);
                break;
            case 3:
                Obeda = "Куринный супчик";
                System.out.printf("Вы выбрали %s", Obeda);
                break;
            default:
                System.out.print("Такого выбора нет!");
        }
    }

    public void NameJail() {
        System.out.print("Вы находитесь в тюрьме удовольствия --- Prison of pleasure\n ");
    }

    public void SmenaCameri() {
        System.out.print("Выберите камеру в которую хотите переместиться (от 1 до 100 )\n");
        Scanner camera = new Scanner(System.in);
        int ViborCameri = camera.nextInt();
        if(ViborCameri >0 && ViborCameri<=100)
            System.out.print("Вы переместились в камеру под номером: " + ViborCameri);
        else{
            System.out.print("Ты дурачок камеры есть с 1 по 100");
        }
    }

    public void ExitJailBreak() {
        System.out.print("Куда вы планируете выйти:\n1.На улицу \n2.В туалет\n3.Работать\n");
        Scanner ExitJail = new Scanner(System.in);
        int Exit = ExitJail.nextInt();
        switch (Exit) {
            case 1:
                System.out.print("Вы вышли на улицу\nВы видите баскетбольную площадку\nВаши действия:\n1.Пойти туда\n2.Дышать свежим воздухом\n");
                Scanner vibor = new Scanner(System.in);
                int bascet = vibor.nextInt();
                if (bascet == 1) {
                    new Play().Bascetball();
                } else {
                    new FreshAir().Vozdux();
                }
                break;
            case 2:
                System.out.print("Вы вышли в туалет");
                break;
            case 3:
                System.out.print("Вы пошли работать");
                break;
            default:
                System.out.print("Такого выбора нет!");
        }
    }

    public void AmountInCamera() {
        System.out.print("Выбрите количество людей сколько будет в вашей камере\n");
        Scanner AmountPeople = new Scanner(System.in);
        int AmountPeopleCamera = AmountPeople.nextInt();
        System.out.print("В вашей камере будут жить: " + AmountPeopleCamera + " человек");
    }

    public void Info() {
        System.out.print("Вас зовут: " + prisoner.getName() + "\nВы из: " + prisoner.getCountry() + "\nВам " + prisoner.getAge() + " лет\nВас посадили за: " + prisoner.getCrime());
    }

    public void DrinkTea() {
        System.out.print("У вас есть на выбор чай, который вы хотите заварить:\n1.GreenFeald\n2.Пуэр\n3.Зеленый чай Матча\n4.Молочный улун\n5.Цейлонский чай\n6.Earl Grey\n");
        Scanner TeaVibor = new Scanner(System.in);
        int Tea = TeaVibor.nextInt();
        switch (Tea) {
            case 1:
                System.out.print("Вы заварили GreenFeald");
                break;
            case 2:
                System.out.print("Вы заварили Пуэр");
                break;
            case 3:
                System.out.print("Вы заварили Зеленый чай Матча");
                break;
            case 4:
                System.out.print("Вы заварили Молочный улун");
                break;
            case 5:
                System.out.print("Вы заварили Цейлонский чай");
                break;
            case 6:
                System.out.print("Вы заварили Earl Grey");
                break;
            default:
                System.out.print("Такого чая нету.");
        }
    }

    public void sleep() {
        System.out.print("У вас есть на выбор две койки: верхняя и нижняя\nВаши действия\n1.Лечь сверху\n2.Лечь снизу\n");
        Scanner viborkoika = new Scanner(System.in);
        int koika = viborkoika.nextInt();
        if (koika == 1)
            System.out.print("Вы легли спать на верхнюю койку");
        else System.out.print("Вы легли спать на нижнюю койку");
    }
}

abstract class Activity {
    abstract void perform();
}

class Play extends Activity {
    @Override
    void perform() {
        Bascetball();
    }

    protected void Bascetball() {
        System.out.println("Вы видите там 3 человек и предлагаете сыграть в стрит (Баскетбол на одно кольцо) \n Вдруг сокамерник говорит: Что на просто-так скучно играть и предлагает сыграть на пачку сигарет\nВы соглашаетесь\nИдет игра и вы с легкостью побеждаете, забрав награду.");
    }
}



class FreshAir extends Activity {
    @Override
    void perform() {
        Vozdux();
    }

    protected void Vozdux() {
        System.out.println("Вы идете мимо баскетбольной площадки, наслаждаясь прекрасным, свежим воздухом");
    }
}