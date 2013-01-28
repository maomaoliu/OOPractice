package oo;

public class Pipe {
    private LengthUnit lengthUnit;

    private float length;

    public Pipe(float length, LengthUnit lengthUnit) {
        this.length = length;
        this.lengthUnit = lengthUnit;
    }

    public float transformToCm() {
        return getLength() * getLengthUnit().ratioToStandardUnit();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pipe pipe = (Pipe) o;

        if (this.transformToCm() != pipe.transformToCm()) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (length != +0.0f ? Float.floatToIntBits(length) : 0);
        result = 31 * result + lengthUnit.hashCode();
        return result;
    }

    public float getLength() {
        return length;
    }

    public LengthUnit getLengthUnit() {
        return lengthUnit;
    }
}
