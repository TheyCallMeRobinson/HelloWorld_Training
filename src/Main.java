import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Node f = new Node("F", new ArrayList<>());
        Node e = new Node("E", new ArrayList<>());
        Node d = new Node("D", new ArrayList<>());
        Node b = new Node("B", new ArrayList<>());
        Node c = new Node("C", new ArrayList<>());
        Node a = new Node("A", new ArrayList<>());

        b.getAdjacentNodes().add(d);
        b.getAdjacentNodes().add(e);

        c.getAdjacentNodes().add(f);

        a.getAdjacentNodes().add(b);
        a.getAdjacentNodes().add(c);

        CustomTree customTree = new CustomTree(a);

        System.out.println(TreeSearchService.depthFirstSearch(customTree));
        System.out.println(TreeSearchService.breadthFirstSearch(customTree));
    }
}
