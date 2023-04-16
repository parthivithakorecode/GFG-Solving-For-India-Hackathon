package p163x4;

import java.util.NoSuchElementException;
import p086l4.C3598v;

/* renamed from: x4.b */
public final class C4352b extends C3598v {

    /* renamed from: f */
    private final int f22698f;

    /* renamed from: g */
    private final int f22699g;

    /* renamed from: h */
    private boolean f22700h;

    /* renamed from: i */
    private int f22701i;

    public C4352b(int i, int i2, int i3) {
        this.f22698f = i3;
        this.f22699g = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f22700h = z;
        this.f22701i = !z ? i2 : i;
    }

    /* renamed from: a */
    public int mo14726a() {
        int i = this.f22701i;
        if (i != this.f22699g) {
            this.f22701i = this.f22698f + i;
        } else if (this.f22700h) {
            this.f22700h = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    public boolean hasNext() {
        return this.f22700h;
    }
}
