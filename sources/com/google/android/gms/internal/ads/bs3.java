package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class bs3 implements Iterator<po3> {

    /* renamed from: f */
    private final ArrayDeque<ds3> f5030f;

    /* renamed from: g */
    private po3 f5031g;

    /* synthetic */ bs3(uo3 uo3, as3 as3) {
        po3 po3;
        if (uo3 instanceof ds3) {
            ds3 ds3 = (ds3) uo3;
            ArrayDeque<ds3> arrayDeque = new ArrayDeque<>(ds3.mo6629r());
            this.f5030f = arrayDeque;
            arrayDeque.push(ds3);
            po3 = m7042b(ds3.f5907k);
        } else {
            this.f5030f = null;
            po3 = (po3) uo3;
        }
        this.f5031g = po3;
    }

    /* renamed from: b */
    private final po3 m7042b(uo3 uo3) {
        while (uo3 instanceof ds3) {
            ds3 ds3 = (ds3) uo3;
            this.f5030f.push(ds3);
            uo3 = ds3.f5907k;
        }
        return (po3) uo3;
    }

    /* renamed from: a */
    public final po3 next() {
        po3 po3;
        po3 po32 = this.f5031g;
        if (po32 != null) {
            do {
                ArrayDeque<ds3> arrayDeque = this.f5030f;
                po3 = null;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    this.f5031g = po3;
                } else {
                    po3 = m7042b(this.f5030f.pop().f5908l);
                }
            } while (po3.mo11271k());
            this.f5031g = po3;
            return po32;
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.f5031g != null;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
