package com.deu.synabro.entity.enums;

public enum BoardType {
    notice ("공지사항"),
    education ("교육 공지사항");

    private String value;

    BoardType(String value){
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
