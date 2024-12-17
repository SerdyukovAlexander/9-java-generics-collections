package com.example.task01;

import java.util.Objects;
import java.util.function.BiConsumer;

public class Pair<A, B>
{
    private final A first;
    private final B second;

    private Pair(A first, B last)
    {
        this.first = first;
        this.second = last;
    }

    public static <A, B> Pair<A, B> of(A first, B second)
    {
        return new Pair<>(first, second);
    }

    public A getFirst()
    {
        return first;
    }

    public B getSecond()
    {
        return second;
    }

    public void ifPresent(BiConsumer<? super A, ? super B> action)
    {
        if (first != null && second != null)
        {
            action.accept(first, second);
        }
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }

        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }

        Pair<?, ?> pair = (Pair<?, ?>) obj;

        return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(first, second);
    }
}
