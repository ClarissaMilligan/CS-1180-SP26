import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        double[] gpas = {3.9, 4.0, 2.7, 3.3};

        System.out.println(Arrays.toString(gpas));

        // shallow copy!! just copies the memory address
        // both reference the same array so if one is modified, both are modified
        //double[] moreGPAs = gpas;

        // deep copies!! actually copy the contents of the array into a NEW array
        //double[] moreGPAs = Arrays.copyOf(gpas, 4);
        double[] moreGPAs = gpas.clone();

        System.out.println(Arrays.toString(moreGPAs));

        moreGPAs[0] = 0.0;
        System.out.println("more gpas: " + Arrays.toString(moreGPAs));

        gpas[3] = 2.2;
        System.out.println("gpas: " + Arrays.toString(gpas));
        System.out.println("more gpas: " + Arrays.toString(moreGPAs));

    }
}
