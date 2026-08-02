package io.github.moehreag.legacylwjgl3.util;

public class Triple<A, B, C> {
    private final A left;
    private final B middle;
    private final C right;

    public Triple(A left, B middle, C right) {
        this.left = left;
        this.middle = middle;
        this.right = right;
    }

    public A getLeft() {
        return left;
    }

    public B getMiddle() {
        return middle;
    }

    public C getRight() {
        return right;
    }

    public static <A, B, C> Triple<A, B, C> of(A a, B b, C c) {
        return new Triple<>(a, b, c);
    }
}