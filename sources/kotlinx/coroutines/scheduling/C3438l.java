package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.C3379f0;

/* renamed from: kotlinx.coroutines.scheduling.l */
public final class C3438l {

    /* renamed from: a */
    public static final long f20969a = C3383h0.m24598e("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, (Object) null);

    /* renamed from: b */
    public static final int f20970b = C3383h0.m24597d("kotlinx.coroutines.scheduler.core.pool.size", C4357f.m26993a(C3379f0.m24574a(), 2), 1, 0, 8, (Object) null);

    /* renamed from: c */
    public static final int f20971c = C3383h0.m24597d("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, (Object) null);

    /* renamed from: d */
    public static final long f20972d = TimeUnit.SECONDS.toNanos(C3383h0.m24598e("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, (Object) null));

    /* renamed from: e */
    public static C3433g f20973e = C3431e.f20959a;

    /* renamed from: f */
    public static final C3435i f20974f = new C3436j(0);

    /* renamed from: g */
    public static final C3435i f20975g = new C3436j(1);
}
