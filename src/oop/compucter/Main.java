package oop.compucter;

public class Main {
    public static void main(String[] args) {
        Comp comp = new Comp();
        comp.setParametersComp();
        comp.info();
        comp.startComp();
        if (comp.deathComp == true){
            comp.offComp();
        }
        comp.newOnComp();

    }
}
