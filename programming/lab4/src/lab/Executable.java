package lab;

public interface Executable<T, R> {
    R execute(T arg) throws PlotHoleException;
}
