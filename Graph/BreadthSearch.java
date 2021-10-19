package Graph;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
import java.util.List;

public class BreadthSearch {
  int size;
  AdjList[] array;
  ArrayList < Integer > order = new ArrayList < Integer > ();

  public BreadthSearch(int size) {
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

  public List BFS(int start) {
    boolean[] visited = new boolean[size];
    for (int i = 0; i < size; i++) {
      visited[i] = false;
      Queue < Integer > q = new LinkedList < Integer > ();
      q.add(start);
      while (!q.isEmpty()) {
        int n = q.poll();
        order.add(n);
        visited[n] = true;
        Node head = array[n].head;
        while (head != null) {
          if (visited[head.value] == false) {
            q.add(head.value);
            visited[head.value] = true;
          } else {
            head = head.next;
          }
        }
      }
    }
    List < Integer > result = new ArrayList < Integer > (order);
    return result;
  }
}