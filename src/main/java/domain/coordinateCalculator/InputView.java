package domain.coordinateCalculator;

import java.util.Arrays;
import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String WRONG_INPUT_PATTERN = "잘못된 입력 입니다.";
    private static final String COORDINATE_INPUT = "좌표를 입력하세요.";

    private String input;

    public String[] inputCoordinate() {
        System.out.println(COORDINATE_INPUT);
        this.input = scanner.next();
//        validateInputValue();
        return splitInputCoordinate();
    }

    private String[] splitInputCoordinate() {
        return Arrays.stream(this.input.split("-"))
                .map(value -> value.replaceAll("[()]", ""))
                .toArray(String[]::new);

    }

    private void validateInputValue() {
        //정규표현으로 validation을 하는게 좋을듯
        //^(
        if (!this.input.matches("^([0-9][,][0-9]-[0-9][,][0-9])")) {
            System.out.println(WRONG_INPUT_PATTERN);
            inputCoordinate();
        }
    }
}
