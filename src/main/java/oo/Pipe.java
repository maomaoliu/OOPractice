package oo;

public class Pipe {
    private float length;
    private LengthUnit lengthUnit;

    public Pipe(float length, LengthUnit lengthUnit) {
        this.length = length;
        this.lengthUnit = lengthUnit;
    }

    public Pipe add(Pipe pipe) {
        return new Pipe(transformToCm(this) + transformToCm(pipe), LengthUnit.CM);
    }

    public Pipe minus(Pipe pipe) {
        return new Pipe(transformToCm(this) - transformToCm(pipe), LengthUnit.CM);
    }

    private float transformToCm(Pipe pipe) {
        return pipe.length * pipe.lengthUnit.ratioToStandardUnit();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pipe pipe = (Pipe) o;

        if (transformToCm(this) != transformToCm(pipe)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (length != +0.0f ? Float.floatToIntBits(length) : 0);
        result = 31 * result + lengthUnit.hashCode();
        return result;
    }
}
