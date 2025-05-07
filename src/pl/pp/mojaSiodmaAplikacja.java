package pl.pp;

public class mojaSiodmaAplikacja {
    public static void main(String[] args) {

        person person1 = new person();
        person1.hiToAll();


        person1.forename = "Mateusz";
        person1.surname = "Karmazyn";
        person1.age = 24;
        person1.address = "ul. Długa 5, Kraków";
        person1.birthYear = 2001;
        person1.hiToAll();


        person person2 = new person("Dariusz", "Walendziak", 42);
        person2.address = "ul. Krótka 12, Warszawa";
        person2.birthYear = 1983;
        person2.hiToAll();


        person1.growOld(2);
        person2.growOld(5);


        person1.beYounger();
        person2.beYounger();
        person2.beYounger();


        person1.hiToAll();
        person2.hiToAll();


        System.out.println(person1.getName());
        person1.setName("Lolo");
        System.out.println(person1.getName());
        person1.hiToAll();
    }
}