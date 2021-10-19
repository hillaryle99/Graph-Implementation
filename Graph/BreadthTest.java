package Graph;
import java.util.List;
import java.util.ArrayList;
public class BreadthTest
{
  public static boolean Compare(List a, List b) {
    return a.equals(b);
  }

  public static boolean BreadthTest0() {
    boolean test2 = true;
    BreadthSearch g = new BreadthSearch(4);
    g.add(0, 1);
    g.add(0, 2);
    g.add(1, 2);
    g.add(2, 0);
    g.add(2, 3);
    g.add(3, 3);

    // Test Case 0: 
    List < Integer > list2 = new ArrayList < Integer > () {
      {
        add(0);
        add(2);
        add(1);
        add(3);
        add(0);
        add(1);
        add(0);
        add(2);
        add(0);
      }
    };
    test2 = Compare(g.BFS(0), list2);
    if (test2) {
      return true;
    } else {
      return false;
    }
  }
  public static boolean BreadthTest1() {
    boolean test2 = true;
    BreadthSearch g = new BreadthSearch(4);
    g.add(0, 1);
    g.add(0, 2);
    g.add(1, 2);
    g.add(2, 0);
    g.add(2, 3);
    g.add(3, 3);

    // Test Case 1: 
    List < Integer > list1 = new ArrayList < Integer > () {
      {
        add(1);
        add(2);
        add(3);
        add(0);
        add(1);
        add(1);
        add(2);
        add(1);
      }
    };
    test2 = Compare(g.BFS(1), list1);
    if (test2) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean BreadthTest3() {

    boolean test3 = true;
    BreadthSearch g = new BreadthSearch(4);
    g.add(0, 1);
    g.add(0, 2);
    g.add(1, 2);
    g.add(2, 0);
    g.add(2, 3);
    g.add(3, 3);

    // Test Case 3: 
    List < Integer > list3 = new ArrayList < Integer > () {
      {
        add(3);
        add(3);
        add(3);
        add(3);
      }
    };
    test3 = Compare(g.BFS(3), list3);

    if (test3) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean BreadthTest2() {
    boolean test1 = true;
    BreadthSearch g = new BreadthSearch(4);
    g.add(0, 1);
    g.add(0, 2);
    g.add(1, 2);
    g.add(2, 0);
    g.add(2, 3);
    g.add(3, 3);

    // Test Case 1:
    List < Integer > list1 = new ArrayList < Integer > () {
      {
        add(2);
        add(3);
        add(0);
        add(1);
        add(2);
        add(2);
        add(2);
        add(3);
      }
    };
    test1 = Compare(g.BFS(2), list1);
    if (test1) {
      return true;
    } else {
      return false;
    }
  }
}

