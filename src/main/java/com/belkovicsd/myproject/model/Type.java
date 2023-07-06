package com.belkovicsd.myproject.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Type {

    SHIRT("Shirt"),
    SHORT("Short"),
    JACKET("Jacket");

    private final String name;

}