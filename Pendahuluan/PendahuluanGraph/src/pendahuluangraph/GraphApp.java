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
public class GraphApp {
    public static void main(String[] args) {
        Graph theGraph = new Graph();
        theGraph.addVertex('A'); //0
        theGraph.addVertex('B'); //1
        theGraph.addVertex('C'); //2
        theGraph.addVertex('D'); //3
        theGraph.addVertex('E'); //4
        theGraph.addVertex('F'); //5
        theGraph.addVertex('G'); //6
        theGraph.addVertex('H'); //7
        theGraph.addVertex('I'); //8
        
        /*theGraph.addEdge(0, 1); //AB
        theGraph.addEdge(1, 2); //BC
        theGraph.addEdge(0, 3); //AD
        theGraph.addEdge(3, 4);*/ //DE
        //theGraph.addEdge(4, 5);
        
        theGraph.addEdge(0, 1);
        theGraph.addEdge(1, 5);
        theGraph.addEdge(5, 7);
        theGraph.addEdge(0, 2);
        theGraph.addEdge(0, 3);
        theGraph.addEdge(3, 6);
        theGraph.addEdge(6, 8);
        theGraph.addEdge(0, 4);
        
        theGraph.display();
        
        theGraph.dfs();
        theGraph.bfs();
        //theGraph.mst();
    }
}
