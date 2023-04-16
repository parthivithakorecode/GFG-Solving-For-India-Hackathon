package p106o3;

import java.nio.ByteBuffer;
import p106o3.C3838c;

/* renamed from: o3.b */
public final /* synthetic */ class C3837b implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C3838c f21841f;

    /* renamed from: g */
    public final /* synthetic */ String f21842g;

    /* renamed from: h */
    public final /* synthetic */ int f21843h;

    /* renamed from: i */
    public final /* synthetic */ C3838c.C3844f f21844i;

    /* renamed from: j */
    public final /* synthetic */ ByteBuffer f21845j;

    /* renamed from: k */
    public final /* synthetic */ long f21846k;

    public /* synthetic */ C3837b(C3838c cVar, String str, int i, C3838c.C3844f fVar, ByteBuffer byteBuffer, long j) {
        this.f21841f = cVar;
        this.f21842g = str;
        this.f21843h = i;
        this.f21844i = fVar;
        this.f21845j = byteBuffer;
        this.f21846k = j;
    }

    public final void run() {
        this.f21841f.m25842m(this.f21842g, this.f21843h, this.f21844i, this.f21845j, this.f21846k);
    }
}
