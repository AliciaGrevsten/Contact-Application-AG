import java.io.*;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Person> people = createPeopleList();

    public static void main(String[] args) {
        System.out.print("Welcome to Alicia's Family Database! \n" +
                "Search for person: ");

        String input = readUserInput();
        ArrayList<Person> results = personSearch(input);

        System.out.println("\nLet's see what we can find...");

        if (results.size() == 0)
            System.out.println("\nThere's not a single person with that name or phone number... \n" +
                    "Try something else..");
        else {
            System.out.println("Results for '" + input + "': \n");
            for (Person p : results) {
                System.out.println("Name: " + p.getName() + "\nPhone number: " + p.getMobilenumber() +
                        "\nAddress: " + p.getAddress() + "\nWork number: " + p.getWorknumber() +
                        "\nBirthday: " + p.getBirthday());
                System.out.println();
            }
        }
    }

    public static ArrayList<Person> personSearch(String searchWord) {
        ArrayList<Person> results = new ArrayList<>();

        for (Person p : people) {
            if (p.getName().contains(searchWord) || p.getMobilenumber().contains(searchWord)) {
                results.add(p);
            }
        }

        return results;
    }

    public static String readUserInput() {
        try{
            String input;

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            input = bufferedReader.readLine();

            return input;
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public static ArrayList<Person> createPeopleList() {
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Hanna", "Thors road", "074736677", "0703443332", "2003-11-19"));
        people.add(new Person("Samuel", "Balders gate", "077511232", "", "1994-06-13"));
        people.add(new Person("Filip", "Grand Lake Road", "079332211", "0703443332", "2000-01-16"));
        people.add(new Person("Mikael", "Dads Street", "0707531333", "", "1965-06-17"));
        people.add(new Person("Inca", "Queen Road", "075222688", "", "1964-05-28"));
        people.add(new Person("Alicia", "Developer Street", "075215822", "0703456832", "1996-03-26"));
        people.add(new Person("Andreas", "Contractor Road", "073369985", "", "1997-01-19"));
        people.add(new Person("Felicia", "Soccer Road", "0745332233", "", "2003-05-10"));
        people.add(new Person("Melinda", "Flower Avenue", "074736642", "", "1995-09-20"));
        people.add(new Person("Emelie", "Farmers Road", "074736457", "0789952210", "1993-08-28"));

        return people;
    }
}
