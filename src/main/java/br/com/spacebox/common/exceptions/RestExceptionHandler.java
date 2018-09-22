package br.com.spacebox.common.exceptions;

import br.com.spacebox.common.messages.EMessage;
import br.com.spacebox.common.messages.MessageSourceCustom;
import br.com.spacebox.common.model.response.ErrorMessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class RestExceptionHandler {

    @Autowired
    private MessageSourceCustom messageSourceCustom;

    @ExceptionHandler({BusinessException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ErrorMessageResponse handleBusinessException(BusinessException ex) {
        List<String> result = new ArrayList<>(ex.getErros());

        if (result.isEmpty()) {
            result.add(messageSourceCustom.getMessage(EMessage.GENERIC_ERROR));
        }

        return new ErrorMessageResponse(result);
    }
}