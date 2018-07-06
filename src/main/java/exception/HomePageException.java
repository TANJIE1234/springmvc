package exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author tanjie
 * @date 2018-07-05
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND,reason = "homePageNotFound")
public class HomePageException extends RuntimeException {
}
