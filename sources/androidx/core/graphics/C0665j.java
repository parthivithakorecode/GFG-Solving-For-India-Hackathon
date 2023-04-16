package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.core.content.res.C0615e;
import androidx.core.provider.C0708g;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: androidx.core.graphics.j */
public class C0665j extends C0666k {
    /* renamed from: k */
    private Font m2769k(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int l = m2770l(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int l2 = m2770l(fontStyle, font2.getStyle());
            if (l2 < l) {
                font = font2;
                l = l2;
            }
        }
        return font;
    }

    /* renamed from: l */
    private static int m2770l(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    /* renamed from: b */
    public Typeface mo2657b(Context context, C0615e.C0618c cVar, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (C0615e.C0619d dVar : cVar.mo2563a()) {
                try {
                    Font build = new Font.Builder(resources, dVar.mo2565b()).setWeight(dVar.mo2568e()).setSlant(dVar.mo2569f() ? 1 : 0).setTtcIndex(dVar.mo2566c()).setFontVariationSettings(dVar.mo2567d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(m2769k(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: c */
    public Typeface mo2658c(Context context, CancellationSignal cancellationSignal, C0708g.C0710b[] bVarArr, int i) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (C0708g.C0710b bVar : bVarArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(bVar.mo2717d(), "r", cancellationSignal);
                    if (openFileDescriptor != null) {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(bVar.mo2718e()).setSlant(bVar.mo2719f() ? 1 : 0).setTtcIndex(bVar.mo2716c()).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } else if (openFileDescriptor == null) {
                    }
                    openFileDescriptor.close();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(m2769k(build2, i).getStyle()).build();
            throw th;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Typeface mo2668d(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* renamed from: e */
    public Typeface mo2660e(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C0708g.C0710b mo2669h(C0708g.C0710b[] bVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
