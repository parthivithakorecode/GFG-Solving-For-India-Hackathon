package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

abstract class ac3<T> extends AtomicReference<Runnable> implements Runnable {

    /* renamed from: f */
    private static final Runnable f4070f = new zb3((yb3) null);

    /* renamed from: g */
    private static final Runnable f4071g = new zb3((yb3) null);

    ac3() {
    }

    /* renamed from: c */
    private final void m6017c(Thread thread) {
        Runnable runnable = (Runnable) get();
        xb3 xb3 = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (!(runnable instanceof xb3)) {
                if (runnable != f4071g) {
                    break;
                }
            } else {
                xb3 = (xb3) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = f4071g;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(xb3);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract T mo5229a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract String mo5230b();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo5231d(Throwable th);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo5232e(T t);

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract boolean mo5233f();

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo5234g() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            xb3 xb3 = new xb3(this, (wb3) null);
            ac3.super.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, xb3)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(f4070f)) == f4071g) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(f4070f)) == f4071g) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet((Object) null, currentThread)) {
            boolean z = !mo5233f();
            if (z) {
                try {
                    obj = mo5229a();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, f4070f)) {
                        m6017c(currentThread);
                    }
                    mo5231d(th);
                    return;
                }
            }
            if (!compareAndSet(currentThread, f4070f)) {
                m6017c(currentThread);
            }
            if (z) {
                mo5232e(obj);
            }
        }
    }

    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f4070f) {
            str = "running=[DONE]";
        } else if (runnable instanceof xb3) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append("]");
            str = sb.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String b = mo5230b();
        StringBuilder sb2 = new StringBuilder(str.length() + 2 + String.valueOf(b).length());
        sb2.append(str);
        sb2.append(", ");
        sb2.append(b);
        return sb2.toString();
    }
}
