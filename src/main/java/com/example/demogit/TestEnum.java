package com.example.demogit;

/**
 * @author 范晓明
 */

public enum TestEnum {
    TEST("1", "TEST");

    private String code;

    private String message;

    TestEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getValue(String code) {
        for (TestEnum e : TestEnum.values()) {
            if (e.getCode().equals(code)) {
                return e.getMessage();
            }
        }
        return null;
    }
}
