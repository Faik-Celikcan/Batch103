package day28abstraction;

public class Civic implements Engine, Ac , Hood{
    @Override
    public void eco() {
        System.out.println("Uses Eco Engine");
    }

    @Override
    public void gas() {

        System.out.println("Uses gas");
    }

    @Override
    public void tsi() {

        System.out.println("Uses Tsi Technology");
    } // Bir Class'i bir interface'in child'i yapmak icin "implements" kullaniriz


    @Override
    public void digital() {

        System.out.println("Uses Digital AC");
    }

    @Override
    public void climate() {

        System.out.println("Uses Climate Technology");
    }

    @Override
    public void steel() {
        System.out.println("Hood Is Made By Steal");
    }


}
