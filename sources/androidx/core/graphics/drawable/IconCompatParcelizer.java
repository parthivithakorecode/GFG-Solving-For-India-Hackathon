package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.C1210a;

public class IconCompatParcelizer {
    public static IconCompat read(C1210a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1958a = aVar.mo4192p(iconCompat.f1958a, 1);
        iconCompat.f1960c = aVar.mo4186j(iconCompat.f1960c, 2);
        iconCompat.f1961d = aVar.mo4194r(iconCompat.f1961d, 3);
        iconCompat.f1962e = aVar.mo4192p(iconCompat.f1962e, 4);
        iconCompat.f1963f = aVar.mo4192p(iconCompat.f1963f, 5);
        iconCompat.f1964g = (ColorStateList) aVar.mo4194r(iconCompat.f1964g, 6);
        iconCompat.f1966i = aVar.mo4196t(iconCompat.f1966i, 7);
        iconCompat.f1967j = aVar.mo4196t(iconCompat.f1967j, 8);
        iconCompat.mo2604v();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, C1210a aVar) {
        aVar.mo4200x(true, true);
        iconCompat.mo2605w(aVar.mo4182f());
        int i = iconCompat.f1958a;
        if (-1 != i) {
            aVar.mo4172F(i, 1);
        }
        byte[] bArr = iconCompat.f1960c;
        if (bArr != null) {
            aVar.mo4168B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f1961d;
        if (parcelable != null) {
            aVar.mo4174H(parcelable, 3);
        }
        int i2 = iconCompat.f1962e;
        if (i2 != 0) {
            aVar.mo4172F(i2, 4);
        }
        int i3 = iconCompat.f1963f;
        if (i3 != 0) {
            aVar.mo4172F(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f1964g;
        if (colorStateList != null) {
            aVar.mo4174H(colorStateList, 6);
        }
        String str = iconCompat.f1966i;
        if (str != null) {
            aVar.mo4176J(str, 7);
        }
        String str2 = iconCompat.f1967j;
        if (str2 != null) {
            aVar.mo4176J(str2, 8);
        }
    }
}
