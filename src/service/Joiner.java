package service;


@FunctionalInterface
public interface Joiner<T>{
    T join(T first, T second);
}
