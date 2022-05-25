package ch08.exercises;

public class Exercise9 {
    public static void main(String[] args) throws Exception{
//        throw new UnsupportedFunctionException("Not supported function.", 100);
        throw new UnsupportedFunctionException("Not valid function.");
    }
}

class UnsupportedFunctionException extends RuntimeException {
    private final int ERR_CODE;

    UnsupportedFunctionException(String msg, int errCode) {
        super(msg);
        ERR_CODE = errCode;
    }

    UnsupportedFunctionException(String msg) {
        this(msg, 100);
    }

    public int getErrorCode() {
        return ERR_CODE;
    }

    @Override
    public String getMessage() {
        return "[" + getErrorCode() + "] " + super.getMessage();
    }
}
