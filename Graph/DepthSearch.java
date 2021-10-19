package Graph;
import java.util.Stack;
import java.util.Queue;
import java.util.ArrayList;
import java.util.List;

public class DepthSearch {
  int size;
  AdjList[] array;
  ArrayList < Integer > order = new ArrayList < Integer > ();

  public DepthSearch(int size) {
    this.size = size;
    array = new AdjList[this.size];
    for (int i = 0; i < size; i++) {
      array[i] = new AdjList();
      array[i].head = null;
    }

  }

  public void add(int src, int dest) {
    Node n = new Node(dest, null);
    n.next = array[src].head;
    array[src].head = n;
  }

  public List DFS(int start) {
    boolean[] visited = new boolean[size];
    for (int i = 0; i < size; i++) {
      visited[i] = false;
      Stack < Integer > st = new Stack < Integer > ();
      st.push(start);
      while (!st.isEmpty()) {
        int n = st.pop();
        st.push(n);
        visited[n] = true;
        Node head = array[n].head;
        boolean done = true;
        while (head != null) {
          if (visited[head.value] == false) {
            st.push(head.value);
            visited[head.value] = true;
            done = false;
            break;
          } else {
            head = head.next;
          }

        }

        if (done == true) {
          int out = st.pop();
          order.add(out);

        }

      }
    }
    List < Integer > result = new ArrayList < Integer > (order);
    return result;

  }
}