package p066io.flutter.embedding.android;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.Locale;
import p099n3.C3768b;
import p168y3.C4462a;
import p168y3.C4473c;

@TargetApi(19)
/* renamed from: io.flutter.embedding.android.g */
public class C2911g extends View implements C4473c {

    /* renamed from: f */
    private ImageReader f19690f;

    /* renamed from: g */
    private Image f19691g;

    /* renamed from: h */
    private Bitmap f19692h;

    /* renamed from: i */
    private C4462a f19693i;

    /* renamed from: j */
    private C2913b f19694j;

    /* renamed from: k */
    private boolean f19695k;

    /* renamed from: io.flutter.embedding.android.g$a */
    static /* synthetic */ class C2912a {

        /* renamed from: a */
        static final /* synthetic */ int[] f19696a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                io.flutter.embedding.android.g$b[] r0 = p066io.flutter.embedding.android.C2911g.C2913b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19696a = r0
                io.flutter.embedding.android.g$b r1 = p066io.flutter.embedding.android.C2911g.C2913b.background     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f19696a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.flutter.embedding.android.g$b r1 = p066io.flutter.embedding.android.C2911g.C2913b.overlay     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p066io.flutter.embedding.android.C2911g.C2912a.<clinit>():void");
        }
    }

    /* renamed from: io.flutter.embedding.android.g$b */
    public enum C2913b {
        background,
        overlay
    }

    public C2911g(Context context, int i, int i2, C2913b bVar) {
        this(context, m22897g(i, i2), bVar);
    }

    C2911g(Context context, ImageReader imageReader, C2913b bVar) {
        super(context, (AttributeSet) null);
        this.f19695k = false;
        this.f19690f = imageReader;
        this.f19694j = bVar;
        m22898h();
    }

    /* renamed from: e */
    private void m22896e() {
        Image image = this.f19691g;
        if (image != null) {
            image.close();
            this.f19691g = null;
        }
    }

    @SuppressLint({"WrongConstant"})
    @TargetApi(19)
    /* renamed from: g */
    private static ImageReader m22897g(int i, int i2) {
        int i3;
        int i4;
        if (i <= 0) {
            m22899i("ImageReader width must be greater than 0, but given width=%d, set width=1", Integer.valueOf(i));
            i3 = 1;
        } else {
            i3 = i;
        }
        if (i2 <= 0) {
            m22899i("ImageReader height must be greater than 0, but given height=%d, set height=1", Integer.valueOf(i2));
            i4 = 1;
        } else {
            i4 = i2;
        }
        return Build.VERSION.SDK_INT >= 29 ? ImageReader.newInstance(i3, i4, 1, 3, 768) : ImageReader.newInstance(i3, i4, 1, 3);
    }

    /* renamed from: h */
    private void m22898h() {
        setAlpha(0.0f);
    }

    /* renamed from: i */
    private static void m22899i(String str, Object... objArr) {
        C3768b.m25593g("FlutterImageView", String.format(Locale.US, str, objArr));
    }

    @TargetApi(29)
    /* renamed from: k */
    private void m22900k() {
        if (Build.VERSION.SDK_INT >= 29) {
            HardwareBuffer hardwareBuffer = this.f19691g.getHardwareBuffer();
            this.f19692h = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
            hardwareBuffer.close();
            return;
        }
        Image.Plane[] planes = this.f19691g.getPlanes();
        if (planes.length == 1) {
            Image.Plane plane = planes[0];
            int rowStride = plane.getRowStride() / plane.getPixelStride();
            int height = this.f19691g.getHeight();
            Bitmap bitmap = this.f19692h;
            if (!(bitmap != null && bitmap.getWidth() == rowStride && this.f19692h.getHeight() == height)) {
                this.f19692h = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
            }
            ByteBuffer buffer = plane.getBuffer();
            buffer.rewind();
            this.f19692h.copyPixelsFromBuffer(buffer);
        }
    }

    /* renamed from: a */
    public void mo13324a() {
        if (this.f19695k) {
            setAlpha(0.0f);
            mo13327d();
            this.f19692h = null;
            m22896e();
            invalidate();
            this.f19695k = false;
        }
    }

    /* renamed from: b */
    public void mo13325b() {
    }

    /* renamed from: c */
    public void mo13326c(C4462a aVar) {
        if (C2912a.f19696a[this.f19694j.ordinal()] == 1) {
            aVar.mo16114v(this.f19690f.getSurface());
        }
        setAlpha(1.0f);
        this.f19693i = aVar;
        this.f19695k = true;
    }

    @TargetApi(19)
    /* renamed from: d */
    public boolean mo13327d() {
        if (!this.f19695k) {
            return false;
        }
        Image acquireLatestImage = this.f19690f.acquireLatestImage();
        if (acquireLatestImage != null) {
            m22896e();
            this.f19691g = acquireLatestImage;
            invalidate();
        }
        return acquireLatestImage != null;
    }

    /* renamed from: f */
    public void mo13328f() {
        this.f19690f.close();
    }

    public C4462a getAttachedRenderer() {
        return this.f19693i;
    }

    public ImageReader getImageReader() {
        return this.f19690f;
    }

    public Surface getSurface() {
        return this.f19690f.getSurface();
    }

    /* renamed from: j */
    public void mo13332j(int i, int i2) {
        if (this.f19693i != null) {
            if (i != this.f19690f.getWidth() || i2 != this.f19690f.getHeight()) {
                m22896e();
                mo13328f();
                this.f19690f = m22897g(i, i2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f19691g != null) {
            m22900k();
        }
        Bitmap bitmap = this.f19692h;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (!(i == this.f19690f.getWidth() && i2 == this.f19690f.getHeight()) && this.f19694j == C2913b.background && this.f19695k) {
            mo13332j(i, i2);
            this.f19693i.mo16114v(this.f19690f.getSurface());
        }
    }
}
