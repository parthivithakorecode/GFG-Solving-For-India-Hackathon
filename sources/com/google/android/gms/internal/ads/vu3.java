package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class vu3 implements Iterator<C2063p7>, Closeable, C2100q7 {

    /* renamed from: l */
    private static final C2063p7 f16410l = new uu3("eof ");

    /* renamed from: m */
    private static final cv3 f16411m = cv3.m7583b(vu3.class);

    /* renamed from: f */
    protected C1952m7 f16412f;

    /* renamed from: g */
    protected wu3 f16413g;

    /* renamed from: h */
    C2063p7 f16414h = null;

    /* renamed from: i */
    long f16415i = 0;

    /* renamed from: j */
    long f16416j = 0;

    /* renamed from: k */
    private final List<C2063p7> f16417k = new ArrayList();

    public void close() {
    }

    public final boolean hasNext() {
        C2063p7 p7Var = this.f16414h;
        if (p7Var == f16410l) {
            return false;
        }
        if (p7Var != null) {
            return true;
        }
        try {
            this.f16414h = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f16414h = f16410l;
            return false;
        }
    }

    /* renamed from: m */
    public final C2063p7 next() {
        C2063p7 a;
        C2063p7 p7Var = this.f16414h;
        if (p7Var == null || p7Var == f16410l) {
            wu3 wu3 = this.f16413g;
            if (wu3 == null || this.f16415i >= this.f16416j) {
                this.f16414h = f16410l;
                throw new NoSuchElementException();
            }
            try {
                synchronized (wu3) {
                    this.f16413g.mo6279b(this.f16415i);
                    a = this.f16412f.mo8890a(this.f16413g, this);
                    this.f16415i = this.f16413g.mo6278a();
                }
                return a;
            } catch (EOFException unused) {
                throw new NoSuchElementException();
            } catch (IOException unused2) {
                throw new NoSuchElementException();
            }
        } else {
            this.f16414h = null;
            return p7Var;
        }
    }

    /* renamed from: n */
    public final List<C2063p7> mo11523n() {
        return (this.f16413g == null || this.f16414h == f16410l) ? this.f16417k : new bv3(this.f16417k, this);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.f16417k.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(this.f16417k.get(i).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u */
    public final void mo11526u(wu3 wu3, long j, C1952m7 m7Var) {
        this.f16413g = wu3;
        this.f16415i = wu3.mo6278a();
        wu3.mo6279b(wu3.mo6278a() + j);
        this.f16416j = wu3.mo6278a();
        this.f16412f = m7Var;
    }
}
