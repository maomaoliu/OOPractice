package oo;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PipeTest {

    private Plumber plumber;

    @Before
    public void setUp() throws Exception {
        plumber = new Plumber();
    }

    @Test
    public void pipeCanAddPipeWithSameUnit() {
        Pipe pipe = new Pipe(5, LengthUnit.CM);
        Pipe result = plumber.join(pipe, new Pipe(5, LengthUnit.CM));
        assertThat(result, is(new Pipe(10, LengthUnit.CM)));
    }

    @Test
    public void pipeCanAddPipeWithDifferentUnit() {
        Pipe pipe = new Pipe(2, LengthUnit.M);
        Pipe resultPipe = plumber.join(pipe, new Pipe(30, LengthUnit.CM));
        assertThat(resultPipe, is(new Pipe(230, LengthUnit.CM)));
    }

    @Test
    public void pipeCanAddPipeWithDMAndM() {
        Pipe pipe = new Pipe(2, LengthUnit.DM);
        Pipe resultPipe = plumber.join(pipe, new Pipe(3, LengthUnit.M));
        assertThat(resultPipe, is(new Pipe(320, LengthUnit.CM)));
    }

    @Test
    public void oneMeterShouldEqualTo100CM() {
        assertThat(new Pipe(1, LengthUnit.M), is(new Pipe(100, LengthUnit.CM)));
    }

    @Test
    public void pipeCanMinusWithDifferentUnit() {
        Pipe pipe = new Pipe(2, LengthUnit.M);
        List<Pipe> resultPipes = plumber.inciseByScale(pipe, 0.3f);
        assertThat(resultPipes.size(), is(2));
        assertThat(resultPipes.get(0), is(new Pipe(0.6f, LengthUnit.M)));
        assertThat(resultPipes.get(1), is(new Pipe(1.4f, LengthUnit.M)));
    }

}
