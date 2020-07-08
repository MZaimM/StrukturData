/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendahuluangraph;

/**
 *
 * @author USER
 */
public class Graph {
    private final int MAX_VERTS = 20;
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;
    private Stack theStack;
    private Queue theQue;
    
    public Graph(){
        theQue = new Queue(MAX_VERTS);
        theStack= new Stack(MAX_VERTS);
        vertexList= new Vertex[MAX_VERTS];
        adjMat= new int[MAX_VERTS][MAX_VERTS];
        nVerts=0;
        for (int i = 0; i < MAX_VERTS; i++) {
            for (int j = 0; j < MAX_VERTS; j++) {
                adjMat[i][j]=0;
            }
        }
    }
    public void addVertex(char label){
        vertexList[nVerts++]=new Vertex(label);
    }
    public void addEdge(int start, int end){
        adjMat[start][end]=1;
        adjMat[end][start]=1;
    }
    public void display(){
        System.out.println("Adjecency: ");
        for (int row = 0; row < nVerts; row++) {
            for (int col = 0; col < row; col++) {
                if (adjMat[row][col] == 1) {
                    System.out.println(vertexList[row].label + "--"+vertexList[col].label);
                }
            }
        }
        System.out.println("");
    }
    public void dfs(){
        System.out.println("Visit by using"+" DFS algorithm:");
        vertexList[0].wasVisited=true;
        displayVertex(0);
        theStack.push(0);
        while(!theStack.isEmpty()){
            int v=getAdjUnvisitedVertex(theStack.peek());
            if (v == -1) {
                theStack.pop();
            }
            else{
                vertexList[v].wasVisited = true;
                displayVertex(v);
                theStack.push(v);
            }
        }
        System.out.println("");
        resetFlags();
        
    }
    public void displayVertex(int v){
        System.out.print(vertexList[v].label+" ");
    }
    public int getAdjUnvisitedVertex(int v){
        for (int i = 0; i < nVerts; i++) {
            if (adjMat[v][i] == 1 && vertexList[i].wasVisited == false) {
                return i;
            }
        }
        return -1;
    }
    public void resetFlags(){
        for (int i = 0; i < nVerts; i++) {
            vertexList[i].wasVisited = false;
        }
    }
    public void bfs(){
        System.out.println("Visit by using"+" BFS algorithm: ");
        vertexList[0].wasVisited=true;
        displayVertex(0);
        theQue.insert(0);
        int v2;
        while(!theQue.isEmpty()){
            int v1=theQue.remove();
            while((v2 = getAdjUnvisitedVertex(v1)) != -1){
                vertexList[v2].wasVisited = true;
                displayVertex(v2);
                theQue.insert(v2);
            }
        }
        System.out.println("");
        resetFlags();
    }
    public void mst(){
        System.out.println("Minimum spanning"+" tree: ");
        vertexList[0].wasVisited = true;
        theStack.push(0);
        while(!theStack.isEmpty()){
            int currentVertex = theStack.peek();
            int v = getAdjUnvisitedVertex(currentVertex);
            if (v == -1) {
                theStack.pop();
            }
            else{
                vertexList[v].wasVisited = true;
                theStack.push(v);
                
                displayVertex(currentVertex);
                System.out.print(" -- ");
                displayVertex(v);
                System.out.println("");
            }
        }
        resetFlags();
    }

    
    
}
