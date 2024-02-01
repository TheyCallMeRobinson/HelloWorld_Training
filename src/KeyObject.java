public class KeyObject {
    private final int fieldInt;
    private final double fieldDouble;
    private final boolean fieldBool;

    public KeyObject(int fieldInt, double fieldDouble, boolean fieldBool) {
        this.fieldInt = fieldInt;
        this.fieldDouble = fieldDouble;
        this.fieldBool = fieldBool;
    }

    @Override
    public int hashCode() {
        int hashCode = 0;

        hashCode += fieldInt;
        hashCode += (int) fieldDouble * 1_000_000;
        if (fieldBool) {
            hashCode *= 2;
        }

        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        return hashCode() == obj.hashCode();
    }
}
