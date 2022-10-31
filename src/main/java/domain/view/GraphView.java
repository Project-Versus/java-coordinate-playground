package domain.view;


import domain.Coordinate;

import java.util.List;

public class GraphView {
    private static final int AXIS_RANGE = 23;

    private static final String Y_AXIS_DRAW = "|";
    private static final String X_AXIS_DRAW = " --";

    private List<Coordinate> coordinates;

    public GraphView(List<Coordinate> coordinates) {
        yAxis();
        xAxis();
        this.coordinates = coordinates;
        System.out.println("\n");
    }

    public void yAxis() {
        for (int y = AXIS_RANGE; y >= 0; y--) {
            markYaxisLine(y);
        }
    }

    private void markYaxisLine(int index) {
        if (index % 2 == 1) {
            int number = index + 1;
            System.out.printf("%2d%3s", number, Y_AXIS_DRAW + "\n");
            return;
        }
        System.out.printf("%5s", Y_AXIS_DRAW + "\n");
    }

    public void xAxis() {
        System.out.printf("%4s", "+");
        StringBuilder xAxis = new StringBuilder();
        StringBuilder xAxisNumberLine = new StringBuilder();

        for (int x = 0; x <= AXIS_RANGE; x++) {
            xAxis.append(X_AXIS_DRAW);
            markXaxisNumberLine(x, xAxisNumberLine);
        }
        System.out.println(xAxis);
        System.out.printf("%2d", 0);
        System.out.printf(" "+xAxisNumberLine);
    }

    private void markXaxisNumberLine(int index, StringBuilder xAxisNumberLine) {
        if (index % 2 == 1) {
            int number = index + 1;
            xAxisNumberLine.append("     ").append(number);
        }
    }
}
