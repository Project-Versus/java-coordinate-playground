package domain.view;

import domain.Coordinate;

import java.util.*;
import java.util.stream.Collectors;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String WRONG_INPUT_PATTERN = "잘못된 입력 입니다.";
    private static final String COORDINATE_INPUT = "좌표를 입력하세요.";

    private String input;

    public List<Coordinate> inputCoordinate() throws RuntimeException {
        System.out.println(COORDINATE_INPUT);
        this.input = scanner.next();
//        validateInputValue();
        String[][] coordinates = splitInputCoordinate();

        //intent가 두번이라 해결 방법이 있을까?..
        return Arrays.stream(coordinates).map(coordinate -> {
                    try {
                        return createCoordinate(coordinate);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
        ).collect(Collectors.toList());
    }

    private String[][] splitInputCoordinate() {
        return Arrays.stream(this.input.split("-"))
                .map(value -> Arrays.stream(value.replaceAll("[()]", "").split(",")).toArray(String[]::new))
                .toArray(String[][]::new);

    }

    private void validateInputValue() {
        //정규표현으로 validation을 하는게 좋을듯
        //^(
        if (!this.input.matches("^([0-9][,][0-9]-[0-9][,][0-9])")) {
            System.out.println(WRONG_INPUT_PATTERN);
            inputCoordinate();
        }
    }

    private Coordinate createCoordinate(String[] coordinate) throws Exception {
        return new Coordinate(coordinate[0], coordinate[1]);
    }
}
