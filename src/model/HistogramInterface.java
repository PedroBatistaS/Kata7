package model;

import java.util.Set;

public interface HistogramInterface<T> {
    public Integer get(T key);
    public Set<T> keySet();
    public void increment(T key);
}