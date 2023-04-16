package p115p5;

import android.media.MediaPlayer;
import kotlin.jvm.internal.C3357i;
import p101n5.C3795f;
import p108o5.C3870l;

/* renamed from: p5.a */
public final class C3930a implements C3931b {

    /* renamed from: a */
    private final C3795f f22067a;

    public C3930a(C3795f fVar) {
        C3357i.m24508e(fVar, "dataSource");
        this.f22067a = fVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C3930a(byte[] bArr) {
        this(new C3795f(bArr));
        C3357i.m24508e(bArr, "bytes");
    }

    /* renamed from: a */
    public void mo15383a(MediaPlayer mediaPlayer) {
        C3357i.m24508e(mediaPlayer, "mediaPlayer");
        mediaPlayer.setDataSource(this.f22067a);
    }

    /* renamed from: b */
    public void mo15384b(C3870l lVar) {
        C3357i.m24508e(lVar, "soundPoolPlayer");
        throw new IllegalStateException("Bytes sources are not supported on LOW_LATENCY mode yet.".toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3930a) && C3357i.m24504a(this.f22067a, ((C3930a) obj).f22067a);
    }

    public int hashCode() {
        return this.f22067a.hashCode();
    }

    public String toString() {
        return "BytesSource(dataSource=" + this.f22067a + ')';
    }
}
