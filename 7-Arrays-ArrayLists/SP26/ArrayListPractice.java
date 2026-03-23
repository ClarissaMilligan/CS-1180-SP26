import java.util.ArrayList;

public class ArrayListPractice
{
    public static void main(String[] args)
    {
        ArrayList<String> classList = new ArrayList<>();
        classList.add("Clarissa");
        classList.add("Kayleigh");
        classList.add("Reese");
        System.out.println(classList);

        for (String name : classList)
        {
            System.out.println(name.toUpperCase());
        }

        if (classList.contains("Bob"))
        {
            System.out.println("Bob was found at index " + classList.indexOf("Bob"));
        }
        else
        {
            System.out.println("Bob was not found!");
            classList.add(0, "Bob");
        }

        System.out.println(classList);

        System.out.println(classList.get(3));

    }
}
