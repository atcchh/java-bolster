package com.cango.monitor.model;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Created by caoyanfei079 on 7/22/14.
 */
public class BaseModel {
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
    public int hasCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
    public boolean equals(Object target) {
        return EqualsBuilder.reflectionEquals(this, target);
    }
}
