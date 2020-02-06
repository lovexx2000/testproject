package kr.re.kitri.kitribook.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

    @ExceptionHandler(value = BizException.class)
    public String handleBizException(BizException be) {
        if(be.getMessage().contains("KITRI-0023")) {
            return "23 에러";
        }
        else
        {
            return "정의되지 않은 에러";
        }

    }

    @ExceptionHandler(value = SQLException.class)
    public String handleSQLException(SQLException se) {
        System.out.println(se.getMessage());
        return "에러 발생함...";
    }
    @ExceptionHandler(value = ArithmeticException.class)
    public String handlerArithmeticException(ArithmeticException ae){
        System.out.println(ae.getMessage());
        return "잘못나눔";
    }

    //그외 예외는 모두 아래와 같다
    @ExceptionHandler(value = Exception.class)
    public String handleException(Exception e) {

        System.out.println(e.getMessage());
        return "기타 등등 예외.." + e.getMessage();
    }


}
