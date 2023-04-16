package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

public final class ro2 {
    /* renamed from: a */
    public static <T> void m16376a(AtomicReference<T> atomicReference, qo2<T> qo2) {
        T t = atomicReference.get();
        if (t != null) {
            try {
                qo2.mo5228c(t);
            } catch (RemoteException e) {
                io0.m11133i("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                io0.m11132h("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
    }
}
