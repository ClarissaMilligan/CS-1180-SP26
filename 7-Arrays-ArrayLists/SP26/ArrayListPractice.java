import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice
{
    public static void main(String[] args)
    {
//        ArrayList<String> classList = new ArrayList<>();
//        classList.add("Clarissa");
//        classList.add("Kayleigh");
//        classList.add("Reese");
//        System.out.println(classList);
//
//        for (String name : classList)
//        {
//            System.out.println(name.toUpperCase());
//        }
//
//        if (classList.contains("Bob"))
//        {
//            System.out.println("Bob was found at index " + classList.indexOf("Bob"));
//        }
//        else
//        {
//            System.out.println("Bob was not found!");
//            classList.add(0, "Bob");
//        }
//
//        System.out.println(classList);
//
//        System.out.println(classList.get(3));

        ArrayList<String> groupNames = new ArrayList<>(Arrays.asList("Clarissa", "Kayleigh", "Reese", "Bibek"));
        groupNames.add("Bob");
        groupNames.add("Alice");
        groupNames.add("Amelia");
        System.out.println(groupNames);

        System.out.println(mostVowelName(groupNames));

    }

    public static String mostVowelName(ArrayList<String> names)
    {
        int maxNumVowels = 0;
        String maxVowelName = "";
        for (String name : names)
        {
            int vowelNum = countVowels(name);
            if (vowelNum > maxNumVowels)
            {
                maxVowelName = name;
                maxNumVowels = vowelNum;
            }
        }
        return maxVowelName;
    }

    public static String mostVowelNameBAD(ArrayList<String> names)
    {
        int maxNumVowels = 0;
        String maxVowelName = "";
        for (String name : names)
        {
            int vowelCount = 0;
            for (int i = 0; i < name.length(); i++)
            {
                char letter = name.charAt(i);
                if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ||
                        letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')
                {
                    vowelCount++;
                }
            }
            if (vowelCount > maxNumVowels)
            {
                maxVowelName = name;
                maxNumVowels = vowelCount;
            }
        }
        return maxVowelName;
    }

    public static int countVowels(String name)
    {
        int vowelCount = 0;
        for (int i = 0; i < name.length(); i++)
        {
            char letter = name.charAt(i);
            if (isVowel(letter))
            {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    public static boolean isVowel(char letter)
    {
//        String letterString = Character.toString(letter);

        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ||
                letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')
//        if (letterString.equalsIgnoreCase("a") || letterString.equalsIgnoreCase("e") ||
//                letterString.equalsIgnoreCase("i") || letterString.equalsIgnoreCase("o") ||
//                letterString.equalsIgnoreCase("u"))
        {
            return true;
        }
        return false;
    }
}
