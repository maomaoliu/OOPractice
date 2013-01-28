package oo;

public class Plumber {

    public Pipe join(Pipe pipe1, Pipe pipe2) {
        return new Pipe(pipe1.transformToCm() + pipe2.transformToCm(), LengthUnit.CM);
    }

    public Pipe incise(Pipe basePipe, Pipe pipe) {
        return new Pipe(basePipe.transformToCm() - pipe.transformToCm(), LengthUnit.CM);
    }

}
