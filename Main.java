import Graph.*;
import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(String[] args) {
    BreadthTest bt = new BreadthTest();
    DepthTest dt = new DepthTest();
    boolean breadthTest = true;
    boolean depthTest = true;
    if (bt.BreadthTest0() && bt.BreadthTest1() && bt.BreadthTest2() && bt.BreadthTest3()) {
      breadthTest = true;
    } else {
      breadthTest = false;
    }
    if (dt.DepthTest0() && dt.DepthTest1() && dt.DepthTest2() && dt.DepthTest3()) {
      depthTest = true;
    } else {
      depthTest = false;
    }
    if (breadthTest == false) {
      System.out.println("Check your Breadth Test algorithm again");
    } else if (depthTest == false) {
      System.out.println("Check your Depth Test algorithm again");
    } else {
      System.out.println("All Tests Passed!");
    }
  }

}