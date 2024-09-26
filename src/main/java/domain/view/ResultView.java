package domain.view;

public class ResultView {

    private GraphView graphView;

    private double distance;

    public ResultView(GraphView graphView, double distance) {
        this.graphView = graphView;
        this.distance = distance;
    }

    public void printDistance() {
        System.out.println("두 점 사이 거리는 " + distance);
    }
}
