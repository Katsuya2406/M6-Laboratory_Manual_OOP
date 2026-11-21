// Medicine.java

import java.util.Objects;

public class Medicine {
    private final String code;
    private final String name;
    private final int stock;

    public Medicine(String code, String name, int stock) {
        this.code = code;
        this.name = name;
        this.stock = stock;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Medicine)) {
            return false;
        }
        Medicine other = (Medicine) o;
        return Objects.equals(code, other.code);
    }

    @Override
    public int hashCode() {
        return code.hashCode();
    }

    @Override
    public String toString() {
        return code + " " + name + " x" + stock;
    }
}