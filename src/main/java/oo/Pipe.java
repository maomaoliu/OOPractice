package oo;

public class Pipe {
    private float length;
    private String unit;

    public Pipe(float length, String unit) {
        this.length = length;
        this.unit = unit;
    }

    public Pipe add(Pipe pipe) {
        float pipeLength = this.length;
        if(this.unit.equals("m")){
            pipeLength = this.length * 100;
        }
        return new Pipe(pipeLength + pipe.length, pipe.unit);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pipe pipe = (Pipe) o;

        if (Float.compare(pipe.length, length) != 0) return false;
        if (!unit.equals(pipe.unit)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (length != +0.0f ? Float.floatToIntBits(length) : 0);
        result = 31 * result + unit.hashCode();
        return result;
    }
}
