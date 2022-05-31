package oop.compucter;

import java.util.Random;
import java.util.Scanner;

public class Comp {
    Random random = new Random();
    Scanner scan = new Scanner(System.in);
    String processor;
    int operativka;
    int HDD;
    int resourceFullCycleWork;
    int startStop;
    boolean deathComp;
    int fullCycle = 0;

    public Comp() {
    }

    public Comp(String processor, int operativka, int HDD, int resourceFullCycleWork, int startStop, boolean deathComp) {
        this.processor = processor;
        this.operativka = operativka;
        this.HDD = HDD;
        this.resourceFullCycleWork = resourceFullCycleWork;
        this.startStop = startStop;
        this.deathComp = deathComp;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getOperativka() {
        return operativka;
    }

    public void setOperativka(int operativka) {
        this.operativka = operativka;
    }

    public int getHDD() {
        return HDD;
    }

    public void setHDD(int HDD) {
        this.HDD = HDD;
    }

    public int getResourceFullCycleWork() {
        return resourceFullCycleWork;
    }

    public void setResourceFullCycleWork(int resourceFullCycleWork) {
        this.resourceFullCycleWork = resourceFullCycleWork;
    }

    public int getStartStop() {
        return startStop;
    }

    public void setStartStop(int startStop) {
        this.startStop = startStop;
    }

    public boolean isDeathComp() {
        return deathComp;
    }

    public void setDeathComp(boolean deathComp) {
        this.deathComp = deathComp;
    }

    public void info() {
        System.out.println("В компьютере установлен процессор = " + processor);
        System.out.println("Компьютер имееет " + HDD + " ГБ памяти");
        System.out.println("Ресурс компьютера составляет " + resourceFullCycleWork + " рабочих циклов");
        if (deathComp == false) {
            System.out.println("Состояние компьютера - нерабочий");
        } else {
            System.out.println("Состояние компютера - рабочий");
        }
    }
    public void setParametersComp (){
        System.out.println("Введите параметры компьютера");
        System.out.println("Processor?");
        setProcessor(scan.nextLine());
        System.out.println("How mach hard drivers disk?");
        setHDD(scan.nextInt());
        System.out.println("What res computer?");
        setResourceFullCycleWork(scan.nextInt());
        System.out.println("What condition? True or False");
        setDeathComp(scan.nextBoolean());

    }

    public void startComp() {
        System.out.println("Чтобы включить компьютер введите 0 или 1");
        int x = random.nextInt(1);
        int life = 0;
        startStop = scan.nextInt();
        if (startStop == x || deathComp != false) {
            System.out.println("Компьютер запускается...");
            System.out.println("Ваш компьютер запущен!");
        } else {
            deathComp = false;
            System.out.println("Ваш компьютер сгорел,амен...");
        }
    }

    public void offComp() {
        System.out.println("Чтобы выключить компьютер введите 0 или 1");
        int x = random.nextInt(1);
        int life = 0;
        startStop = scan.nextInt();
        if (startStop == x || deathComp != false) {
            fullCycle ++;
            System.out.println("Компьютер выключается...");
            System.out.println("Ваш компьютер выключен!");
        } else {
            deathComp = false;
            System.out.println("Ваш компьютер сгорел, амен...");
        }
    }
    public void newOnComp(){
       if (fullCycle< resourceFullCycleWork){
           while (fullCycle<resourceFullCycleWork){
               startComp();
               if (deathComp == true){
                   offComp();
               }
           }
       } else {
            System.out.println("Your computer is death :(");
        }
    }
}


