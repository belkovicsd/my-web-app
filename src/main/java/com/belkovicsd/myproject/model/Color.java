package com.belkovicsd.myproject.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Color {

    BLACK("Black"),
    WHITE("White"),
    RED("Red"),
    BLUE("Blue"),
    GREEN("Green");

    private final String color;

}