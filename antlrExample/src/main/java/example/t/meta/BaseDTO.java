package example.t.meta;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Created by BJY on 2014/7/6.
 */
public class BaseDTO {
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
