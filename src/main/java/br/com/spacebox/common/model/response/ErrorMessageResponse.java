package br.com.spacebox.common.model.response;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ErrorMessageResponse {
    private List<String> errors;

    public ErrorMessageResponse(List<String> errors) {
        this.errors = errors;
    }

    public ErrorMessageResponse(String error) {
        this(Collections.singletonList(error));
    }

    public ErrorMessageResponse(String... errors) {
        this(Arrays.asList(errors));
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}
