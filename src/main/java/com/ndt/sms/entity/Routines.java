/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity;


import com.ndt.sms.entity.routines.Ndtflowcompleter;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Configuration;


/**
 * Convenience access to all stored procedures and functions in ndt
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Routines {

    /**
     * Call <code>ndt.ndtflowcompleter</code>
     */
    public static void ndtflowcompleter(Configuration configuration, String docNo, BigDecimal amount) {
        Ndtflowcompleter p = new Ndtflowcompleter();
        p.setDocNo(docNo);
        p.setAmount(amount);

        p.execute(configuration);
    }
}
