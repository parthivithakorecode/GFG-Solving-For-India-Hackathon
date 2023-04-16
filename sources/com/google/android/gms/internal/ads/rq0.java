package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

@TargetApi(14)
public final class rq0 extends Thread implements SurfaceTexture.OnFrameAvailableListener, pq0 {

    /* renamed from: G */
    private static final float[] f13808G = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};

    /* renamed from: A */
    private EGL10 f13809A;

    /* renamed from: B */
    private EGLDisplay f13810B;

    /* renamed from: C */
    private EGLContext f13811C;

    /* renamed from: D */
    private EGLSurface f13812D;

    /* renamed from: E */
    private volatile boolean f13813E;

    /* renamed from: F */
    private volatile boolean f13814F;

    /* renamed from: f */
    private final qq0 f13815f;

    /* renamed from: g */
    private final float[] f13816g = new float[9];

    /* renamed from: h */
    private final float[] f13817h = new float[9];

    /* renamed from: i */
    private final float[] f13818i = new float[9];

    /* renamed from: j */
    private final float[] f13819j = new float[9];

    /* renamed from: k */
    private final float[] f13820k = new float[9];

    /* renamed from: l */
    private final float[] f13821l = new float[9];

    /* renamed from: m */
    private final float[] f13822m = new float[9];

    /* renamed from: n */
    private float f13823n = Float.NaN;

    /* renamed from: o */
    private float f13824o;

    /* renamed from: p */
    private float f13825p;

    /* renamed from: q */
    private int f13826q;

    /* renamed from: r */
    private int f13827r;

    /* renamed from: s */
    private SurfaceTexture f13828s;

    /* renamed from: t */
    private SurfaceTexture f13829t;

    /* renamed from: u */
    private int f13830u;

    /* renamed from: v */
    private int f13831v;

    /* renamed from: w */
    private int f13832w;

    /* renamed from: x */
    private final FloatBuffer f13833x;

    /* renamed from: y */
    private final CountDownLatch f13834y;

    /* renamed from: z */
    private final Object f13835z;

    public rq0(Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = f13808G;
        int length = fArr.length;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f13833x = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        qq0 qq0 = new qq0(context);
        this.f13815f = qq0;
        qq0.mo10341a(this);
        this.f13834y = new CountDownLatch(1);
        this.f13835z = new Object();
    }

    /* renamed from: g */
    private static final void m16388g(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder sb = new StringBuilder(str.length() + 21);
            sb.append(str);
            sb.append(": glError ");
            sb.append(glGetError);
            Log.e("SphericalVideoRenderer", sb.toString());
        }
    }

    /* renamed from: h */
    private static final void m16389h(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = (fArr2[0] * fArr3[0]) + (fArr2[1] * fArr3[3]) + (fArr2[2] * fArr3[6]);
        fArr[1] = (fArr2[0] * fArr3[1]) + (fArr2[1] * fArr3[4]) + (fArr2[2] * fArr3[7]);
        fArr[2] = (fArr2[0] * fArr3[2]) + (fArr2[1] * fArr3[5]) + (fArr2[2] * fArr3[8]);
        fArr[3] = (fArr2[3] * fArr3[0]) + (fArr2[4] * fArr3[3]) + (fArr2[5] * fArr3[6]);
        fArr[4] = (fArr2[3] * fArr3[1]) + (fArr2[4] * fArr3[4]) + (fArr2[5] * fArr3[7]);
        fArr[5] = (fArr2[3] * fArr3[2]) + (fArr2[4] * fArr3[5]) + (fArr2[5] * fArr3[8]);
        fArr[6] = (fArr2[6] * fArr3[0]) + (fArr2[7] * fArr3[3]) + (fArr2[8] * fArr3[6]);
        fArr[7] = (fArr2[6] * fArr3[1]) + (fArr2[7] * fArr3[4]) + (fArr2[8] * fArr3[7]);
        fArr[8] = (fArr2[6] * fArr3[2]) + (fArr2[7] * fArr3[5]) + (fArr2[8] * fArr3[8]);
    }

    /* renamed from: i */
    private static final void m16390i(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d = (double) f;
        fArr[4] = (float) Math.cos(d);
        fArr[5] = (float) (-Math.sin(d));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d);
        fArr[8] = (float) Math.cos(d);
    }

    /* renamed from: j */
    private static final void m16391j(float[] fArr, float f) {
        double d = (double) f;
        fArr[0] = (float) Math.cos(d);
        fArr[1] = (float) (-Math.sin(d));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d);
        fArr[4] = (float) Math.cos(d);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    /* renamed from: k */
    private static final int m16392k(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        m16388g("createShader");
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            m16388g("shaderSource");
            GLES20.glCompileShader(glCreateShader);
            m16388g("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            m16388g("getShaderiv");
            if (iArr[0] == 0) {
                StringBuilder sb = new StringBuilder(37);
                sb.append("Could not compile shader ");
                sb.append(i);
                sb.append(":");
                Log.e("SphericalVideoRenderer", sb.toString());
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(glCreateShader));
                GLES20.glDeleteShader(glCreateShader);
                m16388g("deleteShader");
                return 0;
            }
        }
        return glCreateShader;
    }

    /* renamed from: a */
    public final SurfaceTexture mo10639a() {
        if (this.f13829t == null) {
            return null;
        }
        try {
            this.f13834y.await();
        } catch (InterruptedException unused) {
        }
        return this.f13828s;
    }

    /* renamed from: b */
    public final void mo10640b(int i, int i2) {
        synchronized (this.f13835z) {
            this.f13827r = i;
            this.f13826q = i2;
            this.f13813E = true;
            this.f13835z.notifyAll();
        }
    }

    /* renamed from: c */
    public final void mo10641c(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f13827r = i;
        this.f13826q = i2;
        this.f13829t = surfaceTexture;
    }

    /* renamed from: d */
    public final void mo10642d() {
        synchronized (this.f13835z) {
            this.f13814F = true;
            this.f13829t = null;
            this.f13835z.notifyAll();
        }
    }

    /* renamed from: e */
    public final void mo10643e(float f, float f2) {
        int i = this.f13827r;
        int i2 = this.f13826q;
        float f3 = i > i2 ? (float) i : (float) i2;
        this.f13824o -= (f * 1.7453293f) / f3;
        float f4 = this.f13825p - ((f2 * 1.7453293f) / f3);
        this.f13825p = f4;
        if (f4 < -1.5707964f) {
            this.f13825p = -1.5707964f;
            f4 = -1.5707964f;
        }
        if (f4 > 1.5707964f) {
            this.f13825p = 1.5707964f;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo10644f() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.f13812D;
        boolean z = false;
        if (!(eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE))) {
            z = this.f13809A.eglDestroySurface(this.f13810B, this.f13812D) | this.f13809A.eglMakeCurrent(this.f13810B, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f13812D = null;
        }
        EGLContext eGLContext = this.f13811C;
        if (eGLContext != null) {
            z |= this.f13809A.eglDestroyContext(this.f13810B, eGLContext);
            this.f13811C = null;
        }
        EGLDisplay eGLDisplay = this.f13810B;
        if (eGLDisplay == null) {
            return z;
        }
        boolean eglTerminate = this.f13809A.eglTerminate(eGLDisplay);
        this.f13810B = null;
        return eglTerminate | z;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f13832w++;
        synchronized (this.f13835z) {
            this.f13835z.notifyAll();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x037d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01bf A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            android.graphics.SurfaceTexture r0 = r15.f13829t
            if (r0 == 0) goto L_0x039c
            javax.microedition.khronos.egl.EGL r0 = javax.microedition.khronos.egl.EGLContext.getEGL()
            javax.microedition.khronos.egl.EGL10 r0 = (javax.microedition.khronos.egl.EGL10) r0
            r15.f13809A = r0
            java.lang.Object r1 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY
            javax.microedition.khronos.egl.EGLDisplay r0 = r0.eglGetDisplay(r1)
            r15.f13810B = r0
            javax.microedition.khronos.egl.EGLDisplay r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            r6 = 0
            if (r0 != r1) goto L_0x0020
        L_0x001d:
            r0 = r6
            goto L_0x0087
        L_0x0020:
            int[] r1 = new int[r3]
            javax.microedition.khronos.egl.EGL10 r7 = r15.f13809A
            boolean r0 = r7.eglInitialize(r0, r1)
            if (r0 != 0) goto L_0x002b
            goto L_0x001d
        L_0x002b:
            int[] r0 = new int[r5]
            javax.microedition.khronos.egl.EGLConfig[] r1 = new javax.microedition.khronos.egl.EGLConfig[r5]
            r7 = 11
            int[] r9 = new int[r7]
            r9 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344} // fill-array
            javax.microedition.khronos.egl.EGL10 r7 = r15.f13809A
            javax.microedition.khronos.egl.EGLDisplay r8 = r15.f13810B
            r11 = 1
            r10 = r1
            r12 = r0
            boolean r7 = r7.eglChooseConfig(r8, r9, r10, r11, r12)
            if (r7 != 0) goto L_0x0045
        L_0x0043:
            r0 = r4
            goto L_0x004b
        L_0x0045:
            r0 = r0[r6]
            if (r0 <= 0) goto L_0x0043
            r0 = r1[r6]
        L_0x004b:
            if (r0 != 0) goto L_0x004e
            goto L_0x001d
        L_0x004e:
            int[] r1 = new int[r2]
            r1 = {12440, 2, 12344} // fill-array
            javax.microedition.khronos.egl.EGL10 r7 = r15.f13809A
            javax.microedition.khronos.egl.EGLDisplay r8 = r15.f13810B
            javax.microedition.khronos.egl.EGLContext r9 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            javax.microedition.khronos.egl.EGLContext r1 = r7.eglCreateContext(r8, r0, r9, r1)
            r15.f13811C = r1
            if (r1 == 0) goto L_0x001d
            javax.microedition.khronos.egl.EGLContext r7 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            if (r1 != r7) goto L_0x0066
            goto L_0x001d
        L_0x0066:
            javax.microedition.khronos.egl.EGL10 r1 = r15.f13809A
            javax.microedition.khronos.egl.EGLDisplay r7 = r15.f13810B
            android.graphics.SurfaceTexture r8 = r15.f13829t
            javax.microedition.khronos.egl.EGLSurface r0 = r1.eglCreateWindowSurface(r7, r0, r8, r4)
            r15.f13812D = r0
            if (r0 == 0) goto L_0x001d
            javax.microedition.khronos.egl.EGLSurface r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE
            if (r0 != r1) goto L_0x0079
            goto L_0x001d
        L_0x0079:
            javax.microedition.khronos.egl.EGL10 r1 = r15.f13809A
            javax.microedition.khronos.egl.EGLDisplay r7 = r15.f13810B
            javax.microedition.khronos.egl.EGLContext r8 = r15.f13811C
            boolean r0 = r1.eglMakeCurrent(r7, r0, r0, r8)
            if (r0 != 0) goto L_0x0086
            goto L_0x001d
        L_0x0086:
            r0 = r5
        L_0x0087:
            com.google.android.gms.internal.ads.e10<java.lang.String> r1 = com.google.android.gms.internal.ads.m10.f10394U0
            com.google.android.gms.internal.ads.k10 r7 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r7 = r7.mo8579b(r1)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r1.mo6772l()
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x00a8
            com.google.android.gms.internal.ads.k10 r7 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r1 = r7.mo8579b(r1)
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x00aa
        L_0x00a8:
            java.lang.String r1 = "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}"
        L_0x00aa:
            r7 = 35633(0x8b31, float:4.9932E-41)
            int r1 = m16392k(r7, r1)
            if (r1 != 0) goto L_0x00b6
        L_0x00b3:
            r8 = r6
            goto L_0x0138
        L_0x00b6:
            com.google.android.gms.internal.ads.e10<java.lang.String> r7 = com.google.android.gms.internal.ads.m10.f10402V0
            com.google.android.gms.internal.ads.k10 r8 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r8 = r8.mo8579b(r7)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r7.mo6772l()
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x00d7
            com.google.android.gms.internal.ads.k10 r8 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r7 = r8.mo8579b(r7)
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x00d9
        L_0x00d7:
            java.lang.String r7 = "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}"
        L_0x00d9:
            r8 = 35632(0x8b30, float:4.9931E-41)
            int r7 = m16392k(r8, r7)
            if (r7 != 0) goto L_0x00e3
            goto L_0x00b3
        L_0x00e3:
            int r8 = android.opengl.GLES20.glCreateProgram()
            java.lang.String r9 = "createProgram"
            m16388g(r9)
            if (r8 == 0) goto L_0x0138
            android.opengl.GLES20.glAttachShader(r8, r1)
            java.lang.String r1 = "attachShader"
            m16388g(r1)
            android.opengl.GLES20.glAttachShader(r8, r7)
            java.lang.String r1 = "attachShader"
            m16388g(r1)
            android.opengl.GLES20.glLinkProgram(r8)
            java.lang.String r1 = "linkProgram"
            m16388g(r1)
            int[] r1 = new int[r5]
            r7 = 35714(0x8b82, float:5.0046E-41)
            android.opengl.GLES20.glGetProgramiv(r8, r7, r1, r6)
            java.lang.String r7 = "getProgramiv"
            m16388g(r7)
            r1 = r1[r6]
            if (r1 == r5) goto L_0x0130
            java.lang.String r1 = "SphericalVideoRenderer"
            java.lang.String r7 = "Could not link program: "
            android.util.Log.e(r1, r7)
            java.lang.String r1 = "SphericalVideoRenderer"
            java.lang.String r7 = android.opengl.GLES20.glGetProgramInfoLog(r8)
            android.util.Log.e(r1, r7)
            android.opengl.GLES20.glDeleteProgram(r8)
            java.lang.String r1 = "deleteProgram"
            m16388g(r1)
            goto L_0x00b3
        L_0x0130:
            android.opengl.GLES20.glValidateProgram(r8)
            java.lang.String r1 = "validateProgram"
            m16388g(r1)
        L_0x0138:
            r15.f13830u = r8
            android.opengl.GLES20.glUseProgram(r8)
            java.lang.String r1 = "useProgram"
            m16388g(r1)
            int r1 = r15.f13830u
            java.lang.String r7 = "aPosition"
            int r1 = android.opengl.GLES20.glGetAttribLocation(r1, r7)
            r9 = 3
            r10 = 5126(0x1406, float:7.183E-42)
            r11 = 0
            r12 = 12
            java.nio.FloatBuffer r13 = r15.f13833x
            r8 = r1
            android.opengl.GLES20.glVertexAttribPointer(r8, r9, r10, r11, r12, r13)
            java.lang.String r7 = "vertexAttribPointer"
            m16388g(r7)
            android.opengl.GLES20.glEnableVertexAttribArray(r1)
            java.lang.String r1 = "enableVertexAttribArray"
            m16388g(r1)
            int[] r1 = new int[r5]
            android.opengl.GLES20.glGenTextures(r5, r1, r6)
            java.lang.String r7 = "genTextures"
            m16388g(r7)
            r1 = r1[r6]
            r7 = 36197(0x8d65, float:5.0723E-41)
            android.opengl.GLES20.glBindTexture(r7, r1)
            java.lang.String r8 = "bindTextures"
            m16388g(r8)
            r8 = 10240(0x2800, float:1.4349E-41)
            r9 = 9729(0x2601, float:1.3633E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r8 = "texParameteri"
            m16388g(r8)
            r8 = 10241(0x2801, float:1.435E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r8 = "texParameteri"
            m16388g(r8)
            r8 = 10242(0x2802, float:1.4352E-41)
            r9 = 33071(0x812f, float:4.6342E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r8 = "texParameteri"
            m16388g(r8)
            r8 = 10243(0x2803, float:1.4354E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r7 = "texParameteri"
            m16388g(r7)
            int r7 = r15.f13830u
            java.lang.String r8 = "uVMat"
            int r7 = android.opengl.GLES20.glGetUniformLocation(r7, r8)
            r15.f13831v = r7
            r8 = 9
            float[] r8 = new float[r8]
            r8 = {1065353216, 0, 0, 0, 1065353216, 0, 0, 0, 1065353216} // fill-array
            android.opengl.GLES20.glUniformMatrix3fv(r7, r5, r6, r8, r6)
            int r7 = r15.f13830u
            if (r0 == 0) goto L_0x0362
            if (r7 != 0) goto L_0x01c3
            goto L_0x0362
        L_0x01c3:
            android.graphics.SurfaceTexture r0 = new android.graphics.SurfaceTexture
            r0.<init>(r1)
            r15.f13828s = r0
            r0.setOnFrameAvailableListener(r15)
            java.util.concurrent.CountDownLatch r0 = r15.f13834y
            r0.countDown()
            com.google.android.gms.internal.ads.qq0 r0 = r15.f13815f
            r0.mo10342b()
            r15.f13813E = r5     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
        L_0x01d9:
            boolean r0 = r15.f13814F     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            if (r0 != 0) goto L_0x030d
        L_0x01dd:
            int r0 = r15.f13832w     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            if (r0 <= 0) goto L_0x01ed
            android.graphics.SurfaceTexture r0 = r15.f13828s     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            r0.updateTexImage()     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            int r0 = r15.f13832w     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            int r0 = r0 + -1
            r15.f13832w = r0     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            goto L_0x01dd
        L_0x01ed:
            com.google.android.gms.internal.ads.qq0 r0 = r15.f13815f     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            float[] r1 = r15.f13816g     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            boolean r0 = r0.mo10344d(r1)     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            r1 = 5
            r7 = 4
            r8 = -1077342245(0xffffffffbfc90fdb, float:-1.5707964)
            if (r0 == 0) goto L_0x025e
            float r0 = r15.f13823n     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            boolean r0 = java.lang.Float.isNaN(r0)     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            if (r0 == 0) goto L_0x0253
            float[] r0 = r15.f13816g     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            float[] r9 = new float[r2]     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            r10 = 0
            r9[r6] = r10     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            r11 = 1065353216(0x3f800000, float:1.0)
            r9[r5] = r11     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            r9[r3] = r10     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            float[] r10 = new float[r2]     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            r11 = r0[r6]     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            r12 = r9[r6]     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            float r11 = r11 * r12
            r13 = r0[r5]     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            r14 = r9[r5]     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            float r13 = r13 * r14
            float r11 = r11 + r13
            r13 = r0[r3]     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            r9 = r9[r3]     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            float r13 = r13 * r9
            float r11 = r11 + r13
            r10[r6] = r11     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            r11 = r0[r2]     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            float r11 = r11 * r12
            r13 = r0[r7]     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            float r13 = r13 * r14
            float r11 = r11 + r13
            r13 = r0[r1]     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            float r13 = r13 * r9
            float r11 = r11 + r13
            r10[r5] = r11     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            r11 = 6
            r11 = r0[r11]     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            float r11 = r11 * r12
            r12 = 7
            r12 = r0[r12]     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            float r12 = r12 * r14
            float r11 = r11 + r12
            r12 = 8
            r0 = r0[r12]     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            float r0 = r0 * r9
            float r11 = r11 + r0
            r10[r3] = r11     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            r0 = r10[r5]     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            double r11 = (double) r0     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            r0 = r10[r6]     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            double r9 = (double) r0     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            double r9 = java.lang.Math.atan2(r11, r9)     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            float r0 = (float) r9     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            float r0 = r0 + r8
            float r0 = -r0
            r15.f13823n = r0     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
        L_0x0253:
            float[] r0 = r15.f13821l     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            float r8 = r15.f13823n     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            float r9 = r15.f13824o     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            float r8 = r8 + r9
            m16391j(r0, r8)     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            goto L_0x026a
        L_0x025e:
            float[] r0 = r15.f13816g     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            m16390i(r0, r8)     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            float[] r0 = r15.f13821l     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            float r8 = r15.f13824o     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            m16391j(r0, r8)     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
        L_0x026a:
            float[] r0 = r15.f13817h     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            r8 = 1070141403(0x3fc90fdb, float:1.5707964)
            m16390i(r0, r8)     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            float[] r0 = r15.f13818i     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            float[] r8 = r15.f13821l     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            float[] r9 = r15.f13817h     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            m16389h(r0, r8, r9)     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            float[] r0 = r15.f13819j     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            float[] r8 = r15.f13816g     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            float[] r9 = r15.f13818i     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            m16389h(r0, r8, r9)     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            float[] r0 = r15.f13820k     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            float r8 = r15.f13825p     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            m16390i(r0, r8)     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            float[] r0 = r15.f13822m     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            float[] r8 = r15.f13820k     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            float[] r9 = r15.f13819j     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            m16389h(r0, r8, r9)     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            int r0 = r15.f13831v     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            float[] r8 = r15.f13822m     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            android.opengl.GLES20.glUniformMatrix3fv(r0, r5, r6, r8, r6)     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            android.opengl.GLES20.glDrawArrays(r1, r6, r7)     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            java.lang.String r0 = "drawArrays"
            m16388g(r0)     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            android.opengl.GLES20.glFinish()     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            javax.microedition.khronos.egl.EGL10 r0 = r15.f13809A     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            javax.microedition.khronos.egl.EGLDisplay r1 = r15.f13810B     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            javax.microedition.khronos.egl.EGLSurface r7 = r15.f13812D     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            r0.eglSwapBuffers(r1, r7)     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            boolean r0 = r15.f13813E     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            if (r0 == 0) goto L_0x02f3
            int r0 = r15.f13827r     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            int r1 = r15.f13826q     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            android.opengl.GLES20.glViewport(r6, r6, r0, r1)     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            java.lang.String r0 = "viewport"
            m16388g(r0)     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            int r0 = r15.f13830u     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            java.lang.String r1 = "uFOVx"
            int r0 = android.opengl.GLES20.glGetUniformLocation(r0, r1)     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            int r1 = r15.f13830u     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            java.lang.String r7 = "uFOVy"
            int r1 = android.opengl.GLES20.glGetUniformLocation(r1, r7)     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            int r7 = r15.f13827r     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            int r8 = r15.f13826q     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            r9 = 1063216883(0x3f5f66f3, float:0.87266463)
            if (r7 <= r8) goto L_0x02e7
            android.opengl.GLES20.glUniform1f(r0, r9)     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            int r0 = r15.f13826q     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            float r0 = (float) r0     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            float r0 = r0 * r9
            int r7 = r15.f13827r     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            float r7 = (float) r7     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            float r0 = r0 / r7
            android.opengl.GLES20.glUniform1f(r1, r0)     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            goto L_0x02f1
        L_0x02e7:
            float r7 = (float) r7     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            float r7 = r7 * r9
            float r8 = (float) r8     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            float r7 = r7 / r8
            android.opengl.GLES20.glUniform1f(r0, r7)     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
            android.opengl.GLES20.glUniform1f(r1, r9)     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
        L_0x02f1:
            r15.f13813E = r6     // Catch:{ IllegalStateException -> 0x033c, all -> 0x031d }
        L_0x02f3:
            java.lang.Object r0 = r15.f13835z     // Catch:{ InterruptedException -> 0x01d9 }
            monitor-enter(r0)     // Catch:{ InterruptedException -> 0x01d9 }
            boolean r1 = r15.f13814F     // Catch:{ all -> 0x030a }
            if (r1 != 0) goto L_0x0307
            boolean r1 = r15.f13813E     // Catch:{ all -> 0x030a }
            if (r1 != 0) goto L_0x0307
            int r1 = r15.f13832w     // Catch:{ all -> 0x030a }
            if (r1 != 0) goto L_0x0307
            java.lang.Object r1 = r15.f13835z     // Catch:{ all -> 0x030a }
            r1.wait()     // Catch:{ all -> 0x030a }
        L_0x0307:
            monitor-exit(r0)     // Catch:{ all -> 0x030a }
            goto L_0x01d9
        L_0x030a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x030a }
            throw r1     // Catch:{ InterruptedException -> 0x01d9 }
        L_0x030d:
            com.google.android.gms.internal.ads.qq0 r0 = r15.f13815f
            r0.mo10343c()
            android.graphics.SurfaceTexture r0 = r15.f13828s
            r0.setOnFrameAvailableListener(r4)
            r15.f13828s = r4
            r15.mo10644f()
            return
        L_0x031d:
            r0 = move-exception
            java.lang.String r1 = "SphericalVideoProcessor died."
            com.google.android.gms.internal.ads.io0.m11129e(r1, r0)     // Catch:{ all -> 0x0351 }
            com.google.android.gms.internal.ads.tn0 r1 = p054h1.C2694t.m21607p()     // Catch:{ all -> 0x0351 }
            java.lang.String r2 = "SphericalVideoProcessor.run.2"
            r1.mo11034s(r0, r2)     // Catch:{ all -> 0x0351 }
            com.google.android.gms.internal.ads.qq0 r0 = r15.f13815f
            r0.mo10343c()
            android.graphics.SurfaceTexture r0 = r15.f13828s
            r0.setOnFrameAvailableListener(r4)
            r15.f13828s = r4
            r15.mo10644f()
            return
        L_0x033c:
            java.lang.String r0 = "SphericalVideoProcessor halted unexpectedly."
            com.google.android.gms.internal.ads.io0.m11131g(r0)     // Catch:{ all -> 0x0351 }
            com.google.android.gms.internal.ads.qq0 r0 = r15.f13815f
            r0.mo10343c()
            android.graphics.SurfaceTexture r0 = r15.f13828s
            r0.setOnFrameAvailableListener(r4)
            r15.f13828s = r4
            r15.mo10644f()
            return
        L_0x0351:
            r0 = move-exception
            com.google.android.gms.internal.ads.qq0 r1 = r15.f13815f
            r1.mo10343c()
            android.graphics.SurfaceTexture r1 = r15.f13828s
            r1.setOnFrameAvailableListener(r4)
            r15.f13828s = r4
            r15.mo10644f()
            throw r0
        L_0x0362:
            javax.microedition.khronos.egl.EGL10 r0 = r15.f13809A
            int r0 = r0.eglGetError()
            java.lang.String r0 = android.opengl.GLUtils.getEGLErrorString(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "EGL initialization failed: "
            int r2 = r0.length()
            if (r2 == 0) goto L_0x037d
            java.lang.String r0 = r1.concat(r0)
            goto L_0x0382
        L_0x037d:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x0382:
            com.google.android.gms.internal.ads.io0.m11128d(r0)
            com.google.android.gms.internal.ads.tn0 r1 = p054h1.C2694t.m21607p()
            java.lang.Throwable r2 = new java.lang.Throwable
            r2.<init>(r0)
            java.lang.String r0 = "SphericalVideoProcessor.run.1"
            r1.mo11034s(r2, r0)
            r15.mo10644f()
            java.util.concurrent.CountDownLatch r0 = r15.f13834y
            r0.countDown()
            return
        L_0x039c:
            java.lang.String r0 = "SphericalVideoProcessor started with no output texture."
            com.google.android.gms.internal.ads.io0.m11128d(r0)
            java.util.concurrent.CountDownLatch r0 = r15.f13834y
            r0.countDown()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rq0.run():void");
    }

    public final void zza() {
        synchronized (this.f13835z) {
            this.f13835z.notifyAll();
        }
    }
}
