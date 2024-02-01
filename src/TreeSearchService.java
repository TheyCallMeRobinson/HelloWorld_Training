import java.util.*;

public class TreeSearchService {

    public static List<String> depthFirstSearch(CustomTree tree) {
        Stack<Node> depthFirstStack = new Stack<>();
        depthFirstStack.push(tree.getRoot());
        List<String> output = new ArrayList<>();

        while (!depthFirstStack.empty()) {
            Node node = depthFirstStack.pop();
            output.add(node.getValue());
            List<Node> adjacentNodes = node.getAdjacentNodes();
            for (int i = adjacentNodes.size() - 1; i >= 0; i--) {
                depthFirstStack.push(adjacentNodes.get(i));
            }
        }

        return output;
    }

    public static List<String> breadthFirstSearch(CustomTree tree) {
        Queue<Node> breadthFirstQueue = new LinkedList<>();
        breadthFirstQueue.add(tree.getRoot());
        List<String> output = new ArrayList<>();

        while (!breadthFirstQueue.isEmpty()) {
            Node node = breadthFirstQueue.poll();
            output.add(node.getValue());
            List<Node> adjacentNodes = node.getAdjacentNodes();
            for (int i = adjacentNodes.size() - 1; i >= 0; i--) {
                breadthFirstQueue.add(adjacentNodes.get(i));
            }
        }

        return output;
    }
}
