package domain.exception;

public class ExceedRangeException extends Exception {
    private String message = "좌표 범위를 초과 했습니다.";

    public ExceedRangeException() {

    }
}
