package oo;

import java.util.ArrayList;
import java.util.List;

public class Plumber {

    public Pipe join(Pipe pipe1, Pipe pipe2) {
        return new Pipe(pipe1.toStandardUnit() + pipe2.toStandardUnit(), LengthUnit.CM);
    }

    public List<Pipe> inciseByScale(Pipe pipe, float scale) {
        List<Pipe> pipes = new ArrayList<Pipe>();
        pipes.add(new Pipe(pipe.toStandardUnit() * scale, LengthUnit.CM));
        pipes.add(new Pipe(pipe.toStandardUnit() * (1 - scale), LengthUnit.CM));
        return pipes;
    }
}
