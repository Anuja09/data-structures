Graph Theory

1. vertex - v
2. edge  - e - line between two vertices
3. represenation -> e1 = {v1, v2}, where e1 is thr edge between two vertices v1 and v2.
4. |V| - order of graph, |E| - size of the graph
5. self loop - edge starting on a vertex and ending on the same vertex
6. multi-edges - more than one paralles edges between two vertices
7. pseudo graph - graph containing self loop and multiedges
8. multi graph -  graph containing multiedges and no self loop
9. simple graph - graph containing no self loop and no multiedges
10. adjacent vertices - neighbours - vertices are said to be adjacent when they have common edge between.
11. adjacent edges - edge connecting two vertices
12. directed graph - graph containing directed edges
13. degree of vertex - no of outgoing edges adjacent vertices

Applications: 
1. Locations - e.g. Google Maps, Uber, Ola etc
2. Computations - e.g. facebook, youtube, google search engine, clustor computaions (hadoop, spark)
3. Bio -molecular srtucture etc

Types of Graph:
1. Regular graph - A simple graph where every vertex have same degree. Formula to calculate no of edges -> (n*d)/2
2. Complete graph - A simple graph where every vertes is adjacent to every other vertex.
   Formula to calculate no of edges -> nC2 = (n*(n-1))/2, where n is no of vertex and n-1 is degree of a vertex  
3. Eulerian Graph - A graph in which both eulerian path and eularian cycle is present.
   1. Eulerian path - starting from a vertex and cover all edges and ends in other vertex.
   2. Eulerian cycle - starting from a vertex and cover all edges and ends in the same vertex.

Q. How many simple graph are possible to draw if no of vertex is n.
Ans: Formula = 2^E, where E = no of edges = nC2


Representation of graph in programming:
1. Adjacency List - e.g. {v1=[v2, v3, v4], v2=[v1, v4}], v3=[v1], v4=[v1, v3]}
2. Adjacency Matrix - n* n matrix, consists of 1 and 0. where n is no of vertices
   e.g. [n][n] where for the adjacent vertices, put 1 otherwise 0.
3. Class representing graph -
   class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
  }

