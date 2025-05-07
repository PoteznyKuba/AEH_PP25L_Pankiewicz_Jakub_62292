package pl.pp;


public class person {

    public String forename;
    public String surname;
    public int age;
    public String address;
    public int birthYear;

    // Konstruktor domyślny, który tworzy obiekt bez nadawania mu konkretnych danych
    public person() {}

    // Konstruktor, który pozwala stworzyć osobę i od razu ustawić imię, nazwisko i wiek
    public person(String initForename, String initSurname, int initAge) {
        forename = initForename;
        surname = initSurname;
        age = initAge;
    }

    // Metoda wyświetlająca wszystkie dostępne informacje o osobie
    public void hiToAll() {
        System.out.println("Nazywam się " + forename + " " + surname +
                ". Mam " + age + " lat." +
                (address != null ? " Mój adres to: " + address + "." : "") +         // sprawdza czy adres został ustawiony
                (birthYear > 0 ? " Urodziłem się w " + birthYear + "." : ""));      // sprawdza czy rok urodzenia został ustawiony
    }

    // Metoda zwiększająca wiek osoby o określoną liczbę lat (przekazaną jako argument)
    public int growOld(int years) {
        age += years;
        return age;
    }

    // Metoda zmniejszająca wiek osoby o 1, o ile wiek jest większy niż 0
    public int beYounger() {
        if (age > 0) {
            age--;
        }
        return age;
    }

    // Metoda zwracająca imię osoby (getter)
    public String getName() {
        return forename;
    }

    // Metoda ustawiająca imię osoby (setter)
    public void setName(String nameToSet) {
        forename = nameToSet;
    }
}