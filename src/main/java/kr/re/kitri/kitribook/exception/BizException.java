package kr.re.kitri.kitribook.exception;

public class BizException extends RuntimeException {
        public BizException(){
            super();
        }

        public BizException(String msg){
            super(msg);
        }

        public BizException( String msg,Exception e) {
            super(msg,e);
        }
}
