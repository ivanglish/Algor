package com.atlassian;

public interface Function2<T, U, R>
{
    R apply(T t, U u);
}
