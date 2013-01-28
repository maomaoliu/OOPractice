package oo;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PipeTest {
    @Test
    public void pipeCanAddPipeWithSameUnit() {
        Pipe pipe = new Pipe(5, "cm");
        Pipe result = pipe.add(new Pipe(5, "cm"));
        assertThat(result, is(new Pipe(10, "cm")));
    }

    @Test
    public void pipeCanAddPipeWithDifferentUnit() {
        Pipe pipe = new Pipe(2, "m");
        Pipe resultPipe = pipe.add(new Pipe(30, "cm"));
        assertThat(resultPipe, is(new Pipe(230, "cm")));
    }
}
