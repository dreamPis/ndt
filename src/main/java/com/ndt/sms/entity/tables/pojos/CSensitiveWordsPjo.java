/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;

import javax.annotation.Generated;


/**
 * 敏感词
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CSensitiveWordsPjo implements Serializable {

    private static final long serialVersionUID = 1640267774;

    private BigDecimal id;
    private String     word;

    public CSensitiveWordsPjo() {}

    public CSensitiveWordsPjo(CSensitiveWordsPjo value) {
        this.id = value.id;
        this.word = value.word;
    }

    public CSensitiveWordsPjo(
        BigDecimal id,
        String     word
    ) {
        this.id = id;
        this.word = word;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public CSensitiveWordsPjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public String getWord() {
        return this.word;
    }

    public CSensitiveWordsPjo setWord(String word) {
        this.word = word;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CSensitiveWordsPjo (");

        sb.append(id);
        sb.append(", ").append(word);

        sb.append(")");
        return sb.toString();
    }
}
