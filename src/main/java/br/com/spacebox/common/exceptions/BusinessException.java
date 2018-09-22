package br.com.spacebox.common.exceptions;

import java.util.ArrayList;
import java.util.List;

public class BusinessException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private List<String> erros = new ArrayList<>();

    public BusinessException(String error) {
        this.erros.add(error);
    }

    public BusinessException(List<String> erros) {
        this.erros = erros;
    }

    public void addError(String error) {
        this.erros.add(error);
    }

    public List<String> getErros() {
        return this.erros;
    }
}