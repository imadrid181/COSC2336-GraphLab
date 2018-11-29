import java.util.*;
public class GraphLab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many vertices do you want the graph to have ? ");
        int numberOfVertices = input.nextInt();

        System.out.println("How many edges do you want the graph to have ? ");
        int numberOfEdges = input.nextInt();

        System.out.println("Do you want the graph to be weighted (Y/N) ? ");
        Char weighted = input.nextChar();

        if(weighted == 'Y') {
            System.out.println("What do you want the min weight to be ? ");
            int minWeight = input.nextInt();

            System.out.println("What do you want the max weight to be ? ");
            int maxWeight = input.nextInt();
        }
        
        System.out.println("How do you want the graph to be represented (List/Matrix) ?");
        Sting rep = input.nextLine();

    }
}