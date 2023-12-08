package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PasswordGeneratorBuilder {
    boolean useLower;
    boolean useUpper;
    boolean useDigits;
    boolean usePunctuation;

    public PasswordGeneratorBuilder() {
        this.useLower = false;
        this.useUpper = false;
        this.useDigits = false;
        this.usePunctuation = false;
    }

    public PasswordGeneratorBuilder useLower(boolean useLower) {
        this.useLower = useLower;
        return this;
    }

    public PasswordGeneratorBuilder useUpper(boolean useUpper) {
        this.useUpper = useUpper;
        return this;
    }

    public PasswordGeneratorBuilder useDigits(boolean useDigits) {
        this.useDigits = useDigits;
        return this;
    }

    public PasswordGeneratorBuilder usePunctuation(boolean usePunctuation) {
        this.usePunctuation = usePunctuation;
        return this;
    }

    public PasswordGenerator build() {
        return new PasswordGenerator(this);
    }
}
