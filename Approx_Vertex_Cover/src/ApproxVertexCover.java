import java.util.*;

class Edge {
    int u, v;

    public Edge(int u, int v) {
        this.u = u;
        this.v = v;
    }
}

class Graph {
    private List<Integer> vertices;
    private List<Edge> edges;

    public Graph() {
        vertices = new ArrayList<>();
        edges = new ArrayList<>();
    }

    public void addVertex(int vertex) {
        vertices.add(vertex);
    }

    public void addEdge(int u, int v) {
        Edge edge = new Edge(u, v);
        edges.add(edge);
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public Edge getRandomEdge() {
        if (!edges.isEmpty()) {
            Random random = new Random();
            return edges.get(random.nextInt(edges.size()));
        }
        return null;
    }

    public void removeEdgesIncidentTo(int vertex) {
        edges.removeIf(edge -> edge.u == vertex || edge.v == vertex);
    }

    public void printGraph() {
        System.out.println("Vertices: " + vertices);
        System.out.println("Edges: " + edges);
    }
}

public class ApproxVertexCover {

    public static Set<Integer> approxVertexCover(Graph G) {
        Set<Integer> C = new HashSet<>(); // Vertex cover set

        while (!G.getEdges().isEmpty()) {
            // Randomly select an edge (u, v)
            Edge selectedEdge = G.getRandomEdge();

            int u = selectedEdge.u;
            int v = selectedEdge.v;

            // Update vertex cover
            C.add(u);
            C.add(v);

            // Remove adjacent edges
            G.removeEdgesIncidentTo(u);
            G.removeEdgesIncidentTo(v);
        }

        return C;
    }

    public static void main(String[] args) {
        // Example usage
        Graph graph = new Graph();
        for (int i = 1; i <= 5; i++) {
            graph.addVertex(i);
        }

        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);

        graph.printGraph();

        Set<Integer> vertexCover = approxVertexCover(graph);
        System.out.println("Approximate Vertex Cover: " + vertexCover);
    }
}
