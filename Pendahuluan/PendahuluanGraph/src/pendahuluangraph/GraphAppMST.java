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
public class GraphAppMST {
    public static void main(String[] args) {
        Graph theGraph= new Graph();
        theGraph.addVertex('A'); //0
        theGraph.addVertex('B'); //1
        theGraph.addVertex('C'); //2
        theGraph.addVertex('D'); //3
        theGraph.addVertex('E'); //4
        
        theGraph.addEdge(0,1 );
        theGraph.addEdge(0,2 );
        theGraph.addEdge(0,3 );
        theGraph.addEdge(0,4 );
        theGraph.addEdge(1,2 );
        theGraph.addEdge(1,3 );
        theGraph.addEdge(1,4 );
        theGraph.addEdge(2,3 );
        theGraph.addEdge(1,4 );
        theGraph.addEdge(3,4 );
        
        theGraph.display();
        theGraph.mst();
    }
    
}
