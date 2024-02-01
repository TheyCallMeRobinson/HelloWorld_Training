import java.util.List;

public class Node {
    private String value;
    private List<Node> adjacentNodes;

    public Node(String value, List<Node> adjacentNodes) {
        this.value = value;
        this.adjacentNodes = adjacentNodes;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<Node> getAdjacentNodes() {
        return adjacentNodes;
    }

    public void setAdjacentNodes(List<Node> adjacentNodes) {
        this.adjacentNodes = adjacentNodes;
    }
}
