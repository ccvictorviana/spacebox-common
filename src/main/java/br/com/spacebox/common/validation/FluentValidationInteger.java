package br.com.spacebox.common.validation;

public class FluentValidationInteger {
    public static final FluentValidation<Integer> notNull = FluentValidationImpl.from(s -> s != null);
    public static final FluentValidation<Integer> greaterThanZero = FluentValidationImpl.from(s -> s > 0);

    public static final FluentValidation<Integer> integerMoreThan(int limit) {
        return FluentValidationImpl.from(s -> s > limit);
    }

    public static final FluentValidation<Integer> integerLessThan(int size) {
        return FluentValidationImpl.from(s -> s < size);
    }

    public static final FluentValidation<Integer> integerBetween(int morethan, int lessThan) {
        return integerMoreThan(morethan).and(integerLessThan(lessThan));
    }

    public static final FluentValidation<Integer> notNullAndEmpty() {
        return notNull.and(greaterThanZero);
    }
}