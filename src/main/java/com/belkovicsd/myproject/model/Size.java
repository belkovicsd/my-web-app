package com.belkovicsd.myproject.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Size {

    XS("168-173"),
    S("171–176"),
    M("174–179"),
    L("177–182"),
    XL("180–184"),
    XXL("182–186");

    private final String heightInCm;

}