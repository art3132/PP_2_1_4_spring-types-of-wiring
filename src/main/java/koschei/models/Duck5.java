package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Duck5 {

    private final Needle7 needle;

    @Autowired
    public Duck5 (Needle7 needle) {
        this.needle = needle;
    }

    @Override
    public String toString() {
        return ", в утке яйцо " + needle.toString();
    }
}
