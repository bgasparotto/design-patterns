package com.bgasparotto.designpatterns.nullobject;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Discount {
    private BigDecimal value;
    private LocalDateTime date;

    public BigDecimal getValue() {
        return value;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[value=");
        builder.append(value);
        builder.append(", date=");
        builder.append(date);
        builder.append("]");
        return builder.toString();
    }
}