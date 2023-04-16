package p108o5;

import android.media.MediaPlayer;
import android.os.Build;
import kotlin.jvm.internal.C3357i;
import p101n5.C3785a;
import p115p5.C3931b;

/* renamed from: o5.i */
public final class C3867i implements C3868j {

    /* renamed from: a */
    private final C3872m f21895a;

    /* renamed from: b */
    private final MediaPlayer f21896b;

    public C3867i(C3872m mVar) {
        C3357i.m24508e(mVar, "wrappedPlayer");
        this.f21895a = mVar;
        this.f21896b = m25888s(mVar);
    }

    /* renamed from: s */
    private final MediaPlayer m25888s(C3872m mVar) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnPreparedListener(new C3865g(mVar));
        mediaPlayer.setOnCompletionListener(new C3863e(mVar));
        mediaPlayer.setOnSeekCompleteListener(new C3866h(mVar));
        mediaPlayer.setOnErrorListener(new C3864f(mVar));
        mediaPlayer.setOnBufferingUpdateListener(new C3862d(mVar));
        return mediaPlayer;
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static final void m25889t(C3872m mVar, MediaPlayer mediaPlayer) {
        C3357i.m24508e(mVar, "$wrappedPlayer");
        mVar.mo15343w();
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static final void m25890u(C3872m mVar, MediaPlayer mediaPlayer) {
        C3357i.m24508e(mVar, "$wrappedPlayer");
        mVar.mo15341u();
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static final void m25891v(C3872m mVar, MediaPlayer mediaPlayer) {
        C3357i.m24508e(mVar, "$wrappedPlayer");
        mVar.mo15344x();
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static final boolean m25892w(C3872m mVar, MediaPlayer mediaPlayer, int i, int i2) {
        C3357i.m24508e(mVar, "$wrappedPlayer");
        return mVar.mo15342v(i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static final void m25893x(C3872m mVar, MediaPlayer mediaPlayer, int i) {
        C3357i.m24508e(mVar, "$wrappedPlayer");
        mVar.mo15340t(i);
    }

    /* renamed from: a */
    public void mo15298a() {
        this.f21896b.reset();
        this.f21896b.release();
    }

    /* renamed from: b */
    public void mo15299b() {
        this.f21896b.pause();
    }

    /* renamed from: c */
    public void mo15300c() {
        this.f21896b.reset();
    }

    /* renamed from: d */
    public void mo15301d(boolean z) {
        this.f21896b.setLooping(z);
    }

    /* renamed from: e */
    public void mo15302e(C3785a aVar) {
        C3357i.m24508e(aVar, "context");
        this.f21895a.mo15328f().setSpeakerphoneOn(aVar.mo15025g());
        aVar.mo15026h(this.f21896b);
        if (aVar.mo15023e()) {
            this.f21896b.setWakeMode(this.f21895a.mo15327e(), 1);
        }
    }

    /* renamed from: f */
    public boolean mo15303f() {
        return this.f21896b.isPlaying();
    }

    /* renamed from: g */
    public void mo15304g() {
        this.f21896b.prepareAsync();
    }

    /* renamed from: h */
    public void mo15305h(C3931b bVar) {
        C3357i.m24508e(bVar, "source");
        mo15300c();
        bVar.mo15383a(this.f21896b);
    }

    /* renamed from: i */
    public Integer mo15306i() {
        Integer valueOf = Integer.valueOf(this.f21896b.getDuration());
        if (!(valueOf.intValue() == -1)) {
            return valueOf;
        }
        return null;
    }

    /* renamed from: j */
    public void mo15307j(float f) {
        if (Build.VERSION.SDK_INT >= 23) {
            MediaPlayer mediaPlayer = this.f21896b;
            mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(f));
            return;
        }
        throw new IllegalStateException("Changing the playback rate is only available for Android M/23+ or using LOW_LATENCY mode.".toString());
    }

    /* renamed from: k */
    public void mo15308k(int i) {
        this.f21896b.seekTo(i);
    }

    /* renamed from: l */
    public void mo15309l(float f) {
        this.f21896b.setVolume(f, f);
    }

    /* renamed from: m */
    public Integer mo15310m() {
        return Integer.valueOf(this.f21896b.getCurrentPosition());
    }

    public void start() {
        this.f21896b.start();
    }

    public void stop() {
        this.f21896b.stop();
    }
}
