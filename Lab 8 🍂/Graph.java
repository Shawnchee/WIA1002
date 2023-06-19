import java.util.ArrayList;

public class Graph <T extends Comparable<T>, N extends Comparable<N>>{
    private Vertex <T,N> head ;
    private int size;

    public Graph(){
        head = null;
        size = 0;
    }

    public class Vertex<T extends Comparable<T>, N extends Comparable<N>>{
        T vertexInfo ;
        int indeg ;
        int outdeg;
        Vertex<T,N> nextVertex ;
        Edge<T,N> firstEdge;

    

    public Vertex(){
        vertexInfo = null;
        indeg = 0 ;
        outdeg = 0;
        nextVertex = null;
        firstEdge = null;

    }

    public Vertex(T vertexInfo , Vertex<T,N> nextVertex){
        this.vertexInfo = vertexInfo;
        indeg = 0;
        outdeg = 0;
        this.nextVertex = nextVertex;
        firstEdge = null;
    }
    }

    public class Edge<T extends Comparable<T>, N extends Comparable<N>>{
        Vertex <T,N> toVertex;
        Edge<T,N> nextEdge;

        public Edge(){
            toVertex = null;
            nextEdge = null;
        
        }
        public Edge (Vertex<T,N> destination, Edge<T,N> nextEdge){
            toVertex = destination;
            this.nextEdge = nextEdge;
        }
    }

    public int getSize(){
        return this.size ;
    }

    public boolean hasVertex(T v){
        if (head == null){
            return false ;
        }
        Vertex<T,N> temp = head; 
        while (temp != null){
            if (temp.vertexInfo.compareTo(v)== 0){
                return true;
            }
            temp = temp.nextVertex;
        }
        return false; 
    }

    public int getIndeg(T v){
        if (hasVertex(v)){
            Vertex<T,N> temp = head ;
            while (temp !=null){
                if (temp.vertexInfo.compareTo(v)==0) return temp.indeg;
                temp = temp.nextVertex;
            }
        }
        return -1;
    }

    public int getOutdeg (T v){
        if (hasVertex(v)){
            Vertex<T,N> temp = head;
            while (temp!= null){
                if (temp.vertexInfo.compareTo(v)==0) return temp.outdeg;
                temp = temp.nextVertex;
            }

        }
        return -1;
    }

    public boolean addVertex(T v){
        if (!hasVertex(v)){
            Vertex<T,N> newVertex = new Vertex<>(v,null);
            if (head == null){
                head = newVertex;
            }
            else {
                Vertex<T,N> current = head ;
                while (current.nextVertex!= null){
                    current = current.nextVertex;
                }
                current.nextVertex = newVertex;
            }
            size ++ ;
            return true;
            }
            return false;
        }

        public int getIndex (T v){
            Vertex <T,N> temp = head;
            int position = 0 ;
            while (temp!=null){
                if (temp.vertexInfo.compareTo(v) == 0) 
                return position;
                temp = temp.nextVertex;
                position++;
            }
            return -1;
        }

        public ArrayList<T> getAllVertexObjects(){
            ArrayList<T> list = new ArrayList<>();
            Vertex <T,N> current = head;
            while (current!=null){
                list.add(current.vertexInfo);
                current = current.nextVertex;
            }
            return list;
        }

        public T getVertex(int position){
            if (position >= size || position< 0){
                return null;
            }
            Vertex<T,N> current = head;
            for (int i = 0 ; i <position ; i++){
                current = current.nextVertex;
            }
            return current.vertexInfo;
        }

        public boolean hasEdge (T source, T destination){
            if (head==null) return false;

            if (!hasVertex(source) || !hasVertex(destination)){
                return false;
            }
            Vertex<T,N> sourceVertex = head ;
            while (sourceVertex!= null){
                if (sourceVertex.vertexInfo.compareTo(source)==0){      // Source vertex found
                    Edge<T,N> currentEdge = sourceVertex.firstEdge;
                    while (currentEdge!=null){
                        if (currentEdge.toVertex.vertexInfo.compareTo(destination)==0){
                            return true;
                        }
                        currentEdge = currentEdge.nextEdge;
                    }
                }
                sourceVertex = sourceVertex.nextVertex;
            }
            return false;
        }

        public boolean addEdge (T source, T destination){
            if (head == null) return false;
            if (!hasVertex(source) || !hasVertex(destination)) return false;

            Vertex <T,N> sourceVertex = head ;
            while (sourceVertex!= null){
                if (sourceVertex.vertexInfo.compareTo(source) == 0 ) {
                    // reached source vertex and found it!
            Vertex <T,N> destinationVertex = head ;
            while (destinationVertex != null){
                if (destinationVertex.vertexInfo.compareTo(destination) == 0 ){
                    // found destination vertex!
                Edge <T,N> currentEdge = sourceVertex.firstEdge;
                Edge <T,N> newEdge = new Edge<>(destinationVertex, currentEdge);
                sourceVertex.firstEdge = newEdge;
                sourceVertex.outdeg++;
                destinationVertex.indeg++;
                return true;
                }
                destinationVertex = destinationVertex.nextVertex;
            }
            }
            sourceVertex = sourceVertex.nextVertex;
        }
        return false;
    }

    public boolean addUndirectedEdge (T source, T destination){
        return addEdge(source, destination) && addEdge(destination, source);
    }

    public Edge<T,N> removeEdge(T source, T destination){
        if (head == null ) return null;
        if (!hasVertex(destination) || !hasVertex(source)) return null;
        Edge<T,N> removedEdge = null;

        Vertex <T,N> sourceVertex = head;
        while (sourceVertex!=null){
            if (sourceVertex.firstEdge.toVertex.vertexInfo.compareTo(destination)==0){
                removedEdge = sourceVertex.firstEdge;
                sourceVertex.firstEdge = sourceVertex.firstEdge.nextEdge;
            }
            else {
            Edge<T,N> currentEdge = sourceVertex.firstEdge;
            while (currentEdge!=null){
                if (currentEdge.nextEdge.toVertex.vertexInfo.compareTo(destination)==0){
                removedEdge = currentEdge.nextEdge;
                currentEdge.nextEdge = currentEdge.nextEdge.nextEdge;
                 }
              }
            }
            sourceVertex = sourceVertex.nextVertex;
            sourceVertex.outdeg--;
            removedEdge.toVertex.indeg--;
             size--;
              break;
        }
       return removedEdge;
    }



    public ArrayList <T> getNeighbours (T v){
        if (!hasVertex(v)) return null;
        ArrayList<T> ls = new ArrayList<>();
        Vertex <T,N> temp = head ;
        while (temp!=null){
            if (temp.vertexInfo.compareTo(v) == 0 ){
                Edge <T,N> currentEdge = temp.firstEdge;
                while (currentEdge!= null){
                    ls.add(currentEdge.toVertex.vertexInfo);
                    currentEdge = currentEdge.nextEdge;
                }
            }
            temp = temp.nextVertex;
        }
        return ls;
    }

    public void printEdges(){
        Vertex<T,N> current = head ;
        while (current!=null){
            System.out.println("# " +  current.vertexInfo + " : ");
            Edge<T,N> currentEdge = current.firstEdge;
            while (currentEdge != null){
                System.out.print("[ " + current.vertexInfo + "," + currentEdge.toVertex.vertexInfo + "] ");
            currentEdge = currentEdge.nextEdge;
            }
            System.out.println();
            current = current.nextVertex;
        }
    }


}


