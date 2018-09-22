package br.com.spacebox.common.validation;

public class FluentValidationLong {
    public static final FluentValidation<Long> notNull = FluentValidationImpl.from(s -> s != null);
    public static final FluentValidation<Long> greaterThanZero = FluentValidationImpl.from(s -> s > 0);

    public static final FluentValidation<Long> longMoreThan(int limit) {
        return FluentValidationImpl.from(s -> s > limit);
    }

    public static final FluentValidation<Long> longLessThan(int size) {
        return FluentValidationImpl.from(s -> s < size);
    }

    public static final FluentValidation<Long> longBetween(int morethan, int lessThan) {
        return longMoreThan(morethan).and(longLessThan(lessThan));
    }

    public static final FluentValidation<Long> notNullAndEmpty() {
        return notNull.and(greaterThanZero);
    }
}