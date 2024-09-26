package exception;

public class ExceedRangeException extends Exception {
    public ExceedRangeException() {
        super("좌표 범위를 초과 했습니다.");
    }
}
