package com.bgasparotto.designpatterns.builder;

public class Phone {
    private long id;
    private String number;

    public Phone(long id, String number) {
        this.id = id;
        this.number = number;
    }

    public Phone(String number) {
        this(0, number);
    }

    public long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[id=");
        builder.append(id);
        builder.append(", number=");
        builder.append(number);
        builder.append("]");
        return builder.toString();
    }
}