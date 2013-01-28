package oo;

public class Pipe {
    private LengthUnit lengthUnit;

    private float length;

    public Pipe(float length, LengthUnit lengthUnit) {
        this.length = length;
        this.lengthUnit = lengthUnit;
    }

    public float toStandardUnit() {
        return length * lengthUnit.ratioToStandardUnit();
    }

    public LengthUnit getLengthUnit() {
        return lengthUnit;
    }

    public float getLength() {
        return length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pipe pipe = (Pipe) o;

        return this.toStandardUnit() == pipe.toStandardUnit();

    }

    @Override
    public int hashCode() {
        int result = (length != +0.0f ? Float.floatToIntBits(length) : 0);
        result = 31 * result + lengthUnit.hashCode();
        return result;
    }
}
