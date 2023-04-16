package androidx.window.core;

import android.graphics.Rect;
import java.util.Objects;
import kotlin.jvm.internal.C3357i;

public final class Bounds {
    private final int bottom;
    private final int left;
    private final int right;
    private final int top;

    public Bounds(int i, int i2, int i3, int i4) {
        this.left = i;
        this.top = i2;
        this.right = i3;
        this.bottom = i4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Bounds(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        C3357i.m24508e(rect, "rect");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C3357i.m24504a(Bounds.class, obj == null ? null : obj.getClass())) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        Bounds bounds = (Bounds) obj;
        return this.left == bounds.left && this.top == bounds.top && this.right == bounds.right && this.bottom == bounds.bottom;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getHeight() {
        return this.bottom - this.top;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getTop() {
        return this.top;
    }

    public final int getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return (((((this.left * 31) + this.top) * 31) + this.right) * 31) + this.bottom;
    }

    public final boolean isEmpty() {
        return getHeight() == 0 || getWidth() == 0;
    }

    public final boolean isZero() {
        return getHeight() == 0 && getWidth() == 0;
    }

    public final Rect toRect() {
        return new Rect(this.left, this.top, this.right, this.bottom);
    }

    public String toString() {
        return Bounds.class.getSimpleName() + " { [" + this.left + ',' + this.top + ',' + this.right + ',' + this.bottom + "] }";
    }
}
