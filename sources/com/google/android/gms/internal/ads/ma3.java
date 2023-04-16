package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import javax.annotation.CheckForNull;

abstract class ma3<I, O, F, T> extends hb3<O> implements Runnable {

    /* renamed from: o */
    public static final /* synthetic */ int f10786o = 0;
    @CheckForNull

    /* renamed from: m */
    cc3<? extends I> f10787m;
    @CheckForNull

    /* renamed from: n */
    F f10788n;

    ma3(cc3<? extends I> cc3, F f) {
        Objects.requireNonNull(cc3);
        this.f10787m = cc3;
        Objects.requireNonNull(f);
        this.f10788n = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public abstract T mo8645F(F f, I i);

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public abstract void mo8646G(T t);

    /* access modifiers changed from: protected */
    @CheckForNull
    /* renamed from: i */
    public final String mo7548i() {
        String str;
        cc3<? extends I> cc3 = this.f10787m;
        F f = this.f10788n;
        String i = super.mo7548i();
        if (cc3 != null) {
            String obj = cc3.toString();
            StringBuilder sb = new StringBuilder(obj.length() + 16);
            sb.append("inputFuture=[");
            sb.append(obj);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = "";
        }
        if (f != null) {
            String obj2 = f.toString();
            StringBuilder sb2 = new StringBuilder(str.length() + 11 + obj2.length());
            sb2.append(str);
            sb2.append("function=[");
            sb2.append(obj2);
            sb2.append("]");
            return sb2.toString();
        } else if (i != null) {
            return i.length() != 0 ? str.concat(i) : new String(str);
        } else {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo7551j() {
        mo7553u(this.f10787m);
        this.f10787m = null;
        this.f10788n = null;
    }

    public final void run() {
        cc3<? extends I> cc3 = this.f10787m;
        F f = this.f10788n;
        boolean z = true;
        boolean isCancelled = isCancelled() | (cc3 == null);
        if (f != null) {
            z = false;
        }
        if (!isCancelled && !z) {
            this.f10787m = null;
            if (cc3.isCancelled()) {
                mo7556y(cc3);
                return;
            }
            try {
                try {
                    Object F = mo8645F(f, rb3.m16138p(cc3));
                    this.f10788n = null;
                    mo8646G(F);
                } catch (Throwable th) {
                    this.f10788n = null;
                    throw th;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e) {
                mo7555x(e.getCause());
            } catch (RuntimeException e2) {
                mo7555x(e2);
            } catch (Error e3) {
                mo7555x(e3);
            }
        }
    }
}
