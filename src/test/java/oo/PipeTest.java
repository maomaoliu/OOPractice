package oo;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PipeTest {

    @Test
    public void pipeCanAddPipeWithSameUnit() {
        Pipe pipe = new Pipe(5, LengthUnit.CM);
        Pipe result = pipe.add(new Pipe(5, LengthUnit.CM));
        assertThat(result, is(new Pipe(10, LengthUnit.CM)));
    }

    @Test
    public void pipeCanAddPipeWithDifferentUnit() {
        Pipe pipe = new Pipe(2, LengthUnit.M);
        Pipe resultPipe = pipe.add(new Pipe(30, LengthUnit.CM));
        assertThat(resultPipe, is(new Pipe(230, LengthUnit.CM)));
    }

    @Test
    public void pipeCanAddPipeWithDMAndM() {
        Pipe pipe = new Pipe(2, LengthUnit.DM);
        Pipe resultPipe = pipe.add(new Pipe(3, LengthUnit.M));
        assertThat(resultPipe, is(new Pipe(320, LengthUnit.CM)));
    }

    @Test
    public void oneMeterShouldEqualTo100CM() {
        assertThat(new Pipe(1, LengthUnit.M), is(new Pipe(100, LengthUnit.CM)));
    }

    @Test
    public void pipeCanMinusWithDifferentUnit() {
        Pipe pipe = new Pipe(2, LengthUnit.M);
        Pipe resultPipe = pipe.minus(new Pipe(100, LengthUnit.CM));
        assertThat(resultPipe, is(new Pipe(1, LengthUnit.M)));
    }

}
