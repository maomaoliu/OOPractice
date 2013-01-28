package oo;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Plumber {

    public Pipe join(Pipe pipe1, Pipe pipe2) {
        return new Pipe(pipe1.transformToCm() + pipe2.transformToCm(), LengthUnit.CM);
    }

    public List<Pipe> inciseByScale(Pipe pipe, float scale) {
        List<Pipe> pipes = new ArrayList<Pipe>();
        pipes.add(new Pipe(pipe.transformToCm() * scale, LengthUnit.CM));
        pipes.add(new Pipe(pipe.transformToCm() * (1 - scale), LengthUnit.CM));
        return pipes;
    }
}
