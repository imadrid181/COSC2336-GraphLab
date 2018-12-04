import java.util.*;
public class GraphLab {
    public static void main(String[] args) {
        /*
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many vertices do you want the graph to have ? ");
        int numberOfVertices = input.nextInt();

        System.out.println("How many edges do you want the graph to have ? ");
        int numberOfEdges = input.nextInt();

        System.out.println("Do you want the graph to be weighted (Y/N) ? ");
        input.nextLine();
        String weighted = input.nextLine();

        if(weighted.equals("Y")) {
            System.out.println("What do you want the min weight to be ? ");
            int minWeight = input.nextInt();

            System.out.println("What do you want the max weight to be ? ");
            int maxWeight = input.nextInt();
        }
        
        System.out.println("How do you want the graph to be represented (List/Matrix) ?");
        input.nextLine();
        String rep = input.nextLine();
        input.close();
        */
        
        AdjMatrix graph = new AdjMatrix(5, 5, false);
        graph.printArray();
    }
    
}