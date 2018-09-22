package br.com.spacebox.common.validation;

import br.com.spacebox.common.exceptions.BusinessException;

import java.util.List;
import java.util.Optional;

public class FluentValidationResult {
    private boolean valid;

    public boolean isValid() {
        return valid;
    }

    private FluentValidationResult(boolean valid) {
        this.valid = valid;
    }

    public static FluentValidationResult ok() {
        return new FluentValidationResult(true);
    }

    public static FluentValidationResult fail() {
        return new FluentValidationResult(false);
    }

    public Optional<String> getFieldNameIfInvalid(String field) {
        return this.valid ? Optional.empty() : Optional.of(field);
    }

    public void ifInvalidThrows(String message) {
        if (!valid) {
            throw new BusinessException(message);
        }
    }

    public void addMessage(String message, List<String> target) {
        if (!valid) {
            target.add(message);
        }
    }
}