package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p054h1.C2694t;
import p069j1.C3163g2;
import p069j1.C3202r1;

@TargetApi(14)
public final class xp0 extends zp0 implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: z */
    private static final Map<Integer, String> f17277z;

    /* renamed from: h */
    private final tq0 f17278h;

    /* renamed from: i */
    private final uq0 f17279i;

    /* renamed from: j */
    private final boolean f17280j;

    /* renamed from: k */
    private int f17281k = 0;

    /* renamed from: l */
    private int f17282l = 0;

    /* renamed from: m */
    private MediaPlayer f17283m;

    /* renamed from: n */
    private Uri f17284n;

    /* renamed from: o */
    private int f17285o;

    /* renamed from: p */
    private int f17286p;

    /* renamed from: q */
    private int f17287q;

    /* renamed from: r */
    private int f17288r;

    /* renamed from: s */
    private int f17289s;

    /* renamed from: t */
    private rq0 f17290t;

    /* renamed from: u */
    private final boolean f17291u;

    /* renamed from: v */
    private int f17292v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public yp0 f17293w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f17294x = false;

    /* renamed from: y */
    private Integer f17295y = null;

    static {
        HashMap hashMap = new HashMap();
        f17277z = hashMap;
        int i = Build.VERSION.SDK_INT;
        if (i >= 17) {
            hashMap.put(-1004, "MEDIA_ERROR_IO");
            hashMap.put(-1007, "MEDIA_ERROR_MALFORMED");
            hashMap.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
            hashMap.put(-110, "MEDIA_ERROR_TIMED_OUT");
            hashMap.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        hashMap.put(100, "MEDIA_ERROR_SERVER_DIED");
        hashMap.put(1, "MEDIA_ERROR_UNKNOWN");
        hashMap.put(1, "MEDIA_INFO_UNKNOWN");
        hashMap.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        hashMap.put(701, "MEDIA_INFO_BUFFERING_START");
        hashMap.put(702, "MEDIA_INFO_BUFFERING_END");
        hashMap.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        hashMap.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        hashMap.put(802, "MEDIA_INFO_METADATA_UPDATE");
        if (i >= 19) {
            hashMap.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            hashMap.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }

    public xp0(Context context, tq0 tq0, boolean z, boolean z2, sq0 sq0, uq0 uq0) {
        super(context);
        setSurfaceTextureListener(this);
        this.f17278h = tq0;
        this.f17279i = uq0;
        this.f17291u = z;
        this.f17280j = z2;
        uq0.mo11284a(this);
    }

    /* renamed from: D */
    private final void m19583D() {
        C3202r1.m24015k("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.f17284n != null && surfaceTexture != null) {
            m19585F(false);
            try {
                C2694t.m21603l();
                MediaPlayer mediaPlayer = new MediaPlayer();
                this.f17283m = mediaPlayer;
                mediaPlayer.setOnBufferingUpdateListener(this);
                this.f17283m.setOnCompletionListener(this);
                this.f17283m.setOnErrorListener(this);
                this.f17283m.setOnInfoListener(this);
                this.f17283m.setOnPreparedListener(this);
                this.f17283m.setOnVideoSizeChangedListener(this);
                this.f17287q = 0;
                if (this.f17291u) {
                    rq0 rq0 = new rq0(getContext());
                    this.f17290t = rq0;
                    rq0.mo10641c(surfaceTexture, getWidth(), getHeight());
                    this.f17290t.start();
                    SurfaceTexture a = this.f17290t.mo10639a();
                    if (a != null) {
                        surfaceTexture = a;
                    } else {
                        this.f17290t.mo10642d();
                        this.f17290t = null;
                    }
                }
                this.f17283m.setDataSource(getContext(), this.f17284n);
                C2694t.m21604m();
                this.f17283m.setSurface(new Surface(surfaceTexture));
                this.f17283m.setAudioStreamType(3);
                this.f17283m.setScreenOnWhilePlaying(true);
                this.f17283m.prepareAsync();
                m19586G(1);
            } catch (IOException | IllegalArgumentException | IllegalStateException e) {
                io0.m11132h("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f17284n)), e);
                onError(this.f17283m, 1, 0);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034 A[LOOP:0: B:10:0x0034->B:15:0x004f, LOOP_START] */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m19584E() {
        /*
            r7 = this;
            boolean r0 = r7.f17280j
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r7.m19588I()
            if (r0 == 0) goto L_0x0059
            android.media.MediaPlayer r0 = r7.f17283m
            int r0 = r0.getCurrentPosition()
            if (r0 <= 0) goto L_0x0059
            int r0 = r7.f17282l
            r1 = 3
            if (r0 == r1) goto L_0x0059
            java.lang.String r0 = "AdMediaPlayerView nudging MediaPlayer"
            p069j1.C3202r1.m24015k(r0)
            r0 = 0
            r7.m19587H(r0)
            android.media.MediaPlayer r0 = r7.f17283m
            r0.start()
            android.media.MediaPlayer r0 = r7.f17283m
            int r0 = r0.getCurrentPosition()
            e2.d r1 = p054h1.C2694t.m21592a()
            long r1 = r1.mo12462a()
        L_0x0034:
            boolean r3 = r7.m19588I()
            if (r3 == 0) goto L_0x0051
            android.media.MediaPlayer r3 = r7.f17283m
            int r3 = r3.getCurrentPosition()
            if (r3 != r0) goto L_0x0051
            e2.d r3 = p054h1.C2694t.m21592a()
            long r3 = r3.mo12462a()
            long r3 = r3 - r1
            r5 = 250(0xfa, double:1.235E-321)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0034
        L_0x0051:
            android.media.MediaPlayer r0 = r7.f17283m
            r0.pause()
            r7.mo8759m()
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xp0.m19584E():void");
    }

    /* renamed from: F */
    private final void m19585F(boolean z) {
        C3202r1.m24015k("AdMediaPlayerView release");
        rq0 rq0 = this.f17290t;
        if (rq0 != null) {
            rq0.mo10642d();
            this.f17290t = null;
        }
        MediaPlayer mediaPlayer = this.f17283m;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f17283m.release();
            this.f17283m = null;
            m19586G(0);
            if (z) {
                this.f17282l = 0;
            }
        }
    }

    /* renamed from: G */
    private final void m19586G(int i) {
        if (i == 3) {
            this.f17279i.mo11286c();
            this.f18318g.mo11898b();
        } else if (this.f17281k == 3) {
            this.f17279i.mo11288e();
            this.f18318g.mo11899c();
        }
        this.f17281k = i;
    }

    /* renamed from: H */
    private final void m19587H(float f) {
        MediaPlayer mediaPlayer = this.f17283m;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f, f);
            } catch (IllegalStateException unused) {
            }
        } else {
            io0.m11131g("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.f17281k;
     */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m19588I() {
        /*
            r2 = this;
            android.media.MediaPlayer r0 = r2.f17283m
            if (r0 == 0) goto L_0x000f
            int r0 = r2.f17281k
            r1 = -1
            if (r0 == r1) goto L_0x000f
            if (r0 == 0) goto L_0x000f
            r1 = 1
            if (r0 == r1) goto L_0x000f
            return r1
        L_0x000f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xp0.m19588I():boolean");
    }

    /* renamed from: L */
    static /* bridge */ /* synthetic */ void m19591L(xp0 xp0, MediaPlayer mediaPlayer) {
        MediaPlayer.TrackInfo[] trackInfo;
        String string;
        String str;
        MediaFormat format;
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10596r1)).booleanValue() && xp0.f17278h != null && mediaPlayer != null && Build.VERSION.SDK_INT >= 19 && (trackInfo = mediaPlayer.getTrackInfo()) != null) {
            HashMap hashMap = new HashMap();
            for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                if (trackInfo2 != null) {
                    int trackType = trackInfo2.getTrackType();
                    if (trackType == 1) {
                        MediaFormat format2 = trackInfo2.getFormat();
                        if (format2 != null) {
                            if (format2.containsKey("frame-rate")) {
                                try {
                                    hashMap.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                } catch (ClassCastException unused) {
                                    hashMap.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                }
                            }
                            if (format2.containsKey("bitrate")) {
                                Integer valueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                xp0.f17295y = valueOf;
                                hashMap.put("bitRate", String.valueOf(valueOf));
                            }
                            if (format2.containsKey("width") && format2.containsKey("height")) {
                                int integer = format2.getInteger("width");
                                int integer2 = format2.getInteger("height");
                                StringBuilder sb = new StringBuilder(23);
                                sb.append(integer);
                                sb.append("x");
                                sb.append(integer2);
                                hashMap.put("resolution", sb.toString());
                            }
                            if (format2.containsKey("mime")) {
                                hashMap.put("videoMime", format2.getString("mime"));
                            }
                            if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                string = format2.getString("codecs-string");
                                str = "videoCodec";
                            }
                        }
                    } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                        if (format.containsKey("mime")) {
                            hashMap.put("audioMime", format.getString("mime"));
                        }
                        if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                            string = format.getString("codecs-string");
                            str = "audioCodec";
                        }
                    }
                    hashMap.put(str, string);
                }
            }
            if (!hashMap.isEmpty()) {
                xp0.f17278h.mo6424t("onMetadataEvent", hashMap);
            }
        }
    }

    /* renamed from: g */
    public final int mo8753g() {
        if (m19588I()) {
            return this.f17283m.getCurrentPosition();
        }
        return 0;
    }

    /* renamed from: h */
    public final int mo8754h() {
        if (Build.VERSION.SDK_INT < 26 || !m19588I()) {
            return -1;
        }
        return this.f17283m.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    /* renamed from: i */
    public final int mo8755i() {
        if (m19588I()) {
            return this.f17283m.getDuration();
        }
        return -1;
    }

    /* renamed from: j */
    public final int mo8756j() {
        MediaPlayer mediaPlayer = this.f17283m;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    /* renamed from: k */
    public final int mo8757k() {
        MediaPlayer mediaPlayer = this.f17283m;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    /* renamed from: l */
    public final long mo8758l() {
        return 0;
    }

    /* renamed from: m */
    public final void mo8759m() {
        m19587H(this.f18318g.mo11897a());
    }

    /* renamed from: n */
    public final long mo8760n() {
        if (this.f17295y != null) {
            return (mo8761o() * ((long) this.f17287q)) / 100;
        }
        return -1;
    }

    /* renamed from: o */
    public final long mo8761o() {
        if (this.f17295y != null) {
            return ((long) mo8755i()) * ((long) this.f17295y.intValue());
        }
        return -1;
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.f17287q = i;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        C3202r1.m24015k("AdMediaPlayerView completion");
        m19586G(5);
        this.f17282l = 5;
        C3163g2.f20465i.post(new qp0(this));
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Map<Integer, String> map = f17277z;
        String str = map.get(Integer.valueOf(i));
        String str2 = map.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        io0.m11131g(sb.toString());
        m19586G(-1);
        this.f17282l = -1;
        C3163g2.f20465i.post(new rp0(this, str, str2));
        return true;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        Map<Integer, String> map = f17277z;
        String str = map.get(Integer.valueOf(i));
        String str2 = map.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        C3202r1.m24015k(sb.toString());
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005e, code lost:
        if (r1 > r6) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f17285o
            int r0 = android.view.TextureView.getDefaultSize(r0, r6)
            int r1 = r5.f17286p
            int r1 = android.view.TextureView.getDefaultSize(r1, r7)
            int r2 = r5.f17285o
            if (r2 <= 0) goto L_0x007a
            int r2 = r5.f17286p
            if (r2 <= 0) goto L_0x007a
            com.google.android.gms.internal.ads.rq0 r2 = r5.f17290t
            if (r2 != 0) goto L_0x007a
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L_0x0042
            if (r1 != r2) goto L_0x0041
            int r0 = r5.f17285o
            int r1 = r0 * r7
            int r2 = r5.f17286p
            int r3 = r6 * r2
            if (r1 >= r3) goto L_0x003c
            int r0 = r1 / r2
        L_0x003a:
            r1 = r7
            goto L_0x007a
        L_0x003c:
            if (r1 <= r3) goto L_0x0060
            int r1 = r3 / r0
            goto L_0x0052
        L_0x0041:
            r0 = r2
        L_0x0042:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L_0x0054
            int r0 = r5.f17286p
            int r0 = r0 * r6
            int r2 = r5.f17285o
            int r0 = r0 / r2
            if (r1 != r3) goto L_0x0051
            if (r0 <= r7) goto L_0x0051
            goto L_0x0060
        L_0x0051:
            r1 = r0
        L_0x0052:
            r0 = r6
            goto L_0x007a
        L_0x0054:
            if (r1 != r2) goto L_0x0064
            int r1 = r5.f17285o
            int r1 = r1 * r7
            int r2 = r5.f17286p
            int r1 = r1 / r2
            if (r0 != r3) goto L_0x0062
            if (r1 <= r6) goto L_0x0062
        L_0x0060:
            r0 = r6
            goto L_0x003a
        L_0x0062:
            r0 = r1
            goto L_0x003a
        L_0x0064:
            int r2 = r5.f17285o
            int r4 = r5.f17286p
            if (r1 != r3) goto L_0x0070
            if (r4 <= r7) goto L_0x0070
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L_0x0072
        L_0x0070:
            r1 = r2
            r7 = r4
        L_0x0072:
            if (r0 != r3) goto L_0x0062
            if (r1 <= r6) goto L_0x0062
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L_0x0052
        L_0x007a:
            r5.setMeasuredDimension(r0, r1)
            com.google.android.gms.internal.ads.rq0 r6 = r5.f17290t
            if (r6 == 0) goto L_0x0084
            r6.mo10640b(r0, r1)
        L_0x0084:
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 16
            if (r6 != r7) goto L_0x009d
            int r6 = r5.f17288r
            if (r6 <= 0) goto L_0x0090
            if (r6 != r0) goto L_0x0096
        L_0x0090:
            int r6 = r5.f17289s
            if (r6 <= 0) goto L_0x0099
            if (r6 == r1) goto L_0x0099
        L_0x0096:
            r5.m19584E()
        L_0x0099:
            r5.f17288r = r0
            r5.f17289s = r1
        L_0x009d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xp0.onMeasure(int, int):void");
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        C3202r1.m24015k("AdMediaPlayerView prepared");
        m19586G(2);
        this.f17279i.mo11285b();
        C3163g2.f20465i.post(new pp0(this, mediaPlayer));
        this.f17285o = mediaPlayer.getVideoWidth();
        this.f17286p = mediaPlayer.getVideoHeight();
        int i = this.f17292v;
        if (i != 0) {
            mo8771t(i);
        }
        m19584E();
        int i2 = this.f17285o;
        int i3 = this.f17286p;
        StringBuilder sb = new StringBuilder(62);
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i2);
        sb.append(" x ");
        sb.append(i3);
        io0.m11130f(sb.toString());
        if (this.f17282l == 3) {
            mo8770r();
        }
        mo8759m();
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C3202r1.m24015k("AdMediaPlayerView surface created");
        m19583D();
        C3163g2.f20465i.post(new sp0(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C3202r1.m24015k("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.f17283m;
        if (mediaPlayer != null && this.f17292v == 0) {
            this.f17292v = mediaPlayer.getCurrentPosition();
        }
        rq0 rq0 = this.f17290t;
        if (rq0 != null) {
            rq0.mo10642d();
        }
        C3163g2.f20465i.post(new up0(this));
        m19585F(true);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C3202r1.m24015k("AdMediaPlayerView surface changed");
        int i3 = this.f17282l;
        boolean z = false;
        if (this.f17285o == i && this.f17286p == i2) {
            z = true;
        }
        if (this.f17283m != null && i3 == 3 && z) {
            int i4 = this.f17292v;
            if (i4 != 0) {
                mo8771t(i4);
            }
            mo8770r();
        }
        rq0 rq0 = this.f17290t;
        if (rq0 != null) {
            rq0.mo10640b(i, i2);
        }
        C3163g2.f20465i.post(new tp0(this, i, i2));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f17279i.mo11289f(this);
        this.f18317f.mo9584a(surfaceTexture, this.f17293w);
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i2);
        C3202r1.m24015k(sb.toString());
        this.f17285o = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.f17286p = videoHeight;
        if (this.f17285o != 0 && videoHeight != 0) {
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb = new StringBuilder(58);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i);
        C3202r1.m24015k(sb.toString());
        C3163g2.f20465i.post(new op0(this, i));
        super.onWindowVisibilityChanged(i);
    }

    /* renamed from: p */
    public final String mo8768p() {
        String str = true != this.f17291u ? "" : " spherical";
        return str.length() != 0 ? "MediaPlayer".concat(str) : new String("MediaPlayer");
    }

    /* renamed from: q */
    public final void mo8769q() {
        C3202r1.m24015k("AdMediaPlayerView pause");
        if (m19588I() && this.f17283m.isPlaying()) {
            this.f17283m.pause();
            m19586G(4);
            C3163g2.f20465i.post(new wp0(this));
        }
        this.f17282l = 4;
    }

    /* renamed from: r */
    public final void mo8770r() {
        C3202r1.m24015k("AdMediaPlayerView play");
        if (m19588I()) {
            this.f17283m.start();
            m19586G(3);
            this.f18317f.mo9585b();
            C3163g2.f20465i.post(new vp0(this));
        }
        this.f17282l = 3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final /* synthetic */ void mo11888s(int i) {
        yp0 yp0 = this.f17293w;
        if (yp0 != null) {
            yp0.onWindowVisibilityChanged(i);
        }
    }

    /* renamed from: t */
    public final void mo8771t(int i) {
        StringBuilder sb = new StringBuilder(34);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i);
        C3202r1.m24015k(sb.toString());
        if (m19588I()) {
            this.f17283m.seekTo(i);
            this.f17292v = 0;
            return;
        }
        this.f17292v = i;
    }

    public final String toString() {
        String name = xp0.class.getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }

    /* renamed from: u */
    public final void mo8772u(yp0 yp0) {
        this.f17293w = yp0;
    }

    /* renamed from: v */
    public final void mo8773v(String str) {
        Uri parse = Uri.parse(str);
        C1971mq c = C1971mq.m13448c(parse);
        if (c == null || c.f10993f != null) {
            if (c != null) {
                parse = Uri.parse(c.f10993f);
            }
            this.f17284n = parse;
            this.f17292v = 0;
            m19583D();
            requestLayout();
            invalidate();
        }
    }

    /* renamed from: w */
    public final void mo8774w() {
        C3202r1.m24015k("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.f17283m;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f17283m.release();
            this.f17283m = null;
            m19586G(0);
            this.f17282l = 0;
        }
        this.f17279i.mo11287d();
    }

    /* renamed from: y */
    public final void mo8775y(float f, float f2) {
        rq0 rq0 = this.f17290t;
        if (rq0 != null) {
            rq0.mo10643e(f, f2);
        }
    }
}
