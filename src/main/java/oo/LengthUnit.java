package oo;

public enum LengthUnit {
    M("m", 100), DM("dm", 10), CM("cm", 1);

    private String unit;
    private int ratio;

    private LengthUnit(String unit, int ratio) {
        this.unit = unit;
        this.ratio = ratio;
    }

    public int ratioToStandardUnit() {
        return ratio;
    }
}
