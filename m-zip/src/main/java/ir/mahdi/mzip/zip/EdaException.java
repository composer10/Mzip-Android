package ir.mahdi.mzip.zip;

/**
 * 커스텀 Exception 클래스
 *
 * @author EDA
 * @since 2019-01-08
 */
public class EdaException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String errMsg = "";

    public EdaException() {
        super();
    }

    public EdaException(Throwable cause) {
        super(cause);
    }

    public EdaException(Throwable cause, String errMsg) {
        super(errMsg, cause);

        this.errMsg = errMsg;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}