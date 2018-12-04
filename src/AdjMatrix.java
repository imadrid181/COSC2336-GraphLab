import java.util.concurrent.ThreadLocalRandom;
public class AdjMatrix {
    public int numberOfVertices;
    public int numberOfEdges;
    public int[][] adj;

    public AdjMatrix(int v) {
        this.numberOfVertices = v;
        this.numberOfEdges = 0;
        this.adj = new int[v][v];
    }

    //Constructor if UnWeighted
    public AdjMatrix(int v, int e, boolean dir) {
        this.numberOfVertices = v;
        this.numberOfEdges = 0;
        this.adj = new int[v][v];
        while(this.numberOfEdges != e) {
            int firstVertex = ThreadLocalRandom.current().nextInt(0, v);
            int secondVertex = ThreadLocalRandom.current().nextInt(0, v);
            
            if(addEdgeUnWeighted(firstVertex, secondVertex, dir) == true)
                this.numberOfEdges++;
        }

    }

    //Constructor if weighted
    public AdjMatrix(int v, int e, Boolean dir, int min, int max) {
        this.numberOfVertices = v;
        this.numberOfEdges = 0;
        this.adj = new int[v][v];
        while(this.numberOfEdges != e) {
            int firstVertex = ThreadLocalRandom.current().nextInt(0, v);
            int secondVertex = ThreadLocalRandom.current().nextInt(0, v);
            
            if(addEdgeWeighted(firstVertex, secondVertex, dir, min, max) == true)
                this.numberOfEdges++;
        }

    }

    public boolean addEdgeUnWeighted(int s, int e, Boolean dir) {
        if(s == e)
            return false;
        if(dir == true) {
            if(adj[s][e] == 0) {
                adj[s][e] = 1;
                return true;
            }
            else
                return false;
        }
        else {
            if(adj[s][e] == 0) {
                adj[s][e] = 1;
                adj[e][s] = 1;
                return true;
            }
            else
                return false;
        }
    }

    public boolean addEdgeWeighted(int s, int e, Boolean dir, int min, int max) {
        if(s == e)
            return false;
        if(dir == true) {
            if(adj[s][e] == 0) {
                adj[s][e] = ThreadLocalRandom.current().nextInt(min, max + 1);
                return true;
            }
            else
                return false;
        }
        else {
            if(adj[s][e] == 0) {
                int w = ThreadLocalRandom.current().nextInt(min, max + 1);
                adj[s][e] = w;
                adj[e][s] = w;
                return true;
            }
            else
                return false;
        }
    }

    public void printArray() {
        for(int i = 0; i < this.numberOfVertices; i++) {
            for(int j = 0; j < this.numberOfVertices; j++)
                System.out.print(adj[i][j] + " ");
            System.out.println();
        }

    }

}