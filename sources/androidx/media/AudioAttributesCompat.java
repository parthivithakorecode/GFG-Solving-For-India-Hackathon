package androidx.media;

import android.media.AudioAttributes;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi21;
import androidx.media.AudioAttributesImplApi26;
import androidx.media.AudioAttributesImplBase;
import p082l0.C3443b;

public class AudioAttributesCompat implements C3443b {

    /* renamed from: b */
    private static final SparseIntArray f3038b;

    /* renamed from: c */
    static boolean f3039c;

    /* renamed from: d */
    private static final int[] f3040d = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};

    /* renamed from: a */
    public AudioAttributesImpl f3041a;

    /* renamed from: androidx.media.AudioAttributesCompat$a */
    public static class C1141a {

        /* renamed from: a */
        final AudioAttributesImpl.C1142a f3042a;

        public C1141a() {
            AudioAttributesImpl.C1142a aVar;
            if (AudioAttributesCompat.f3039c) {
                aVar = new AudioAttributesImplBase.C1145a();
            } else {
                int i = Build.VERSION.SDK_INT;
                aVar = i >= 26 ? new AudioAttributesImplApi26.C1144a() : i >= 21 ? new AudioAttributesImplApi21.C1143a() : new AudioAttributesImplBase.C1145a();
            }
            this.f3042a = aVar;
        }

        /* renamed from: a */
        public AudioAttributesCompat mo3895a() {
            return new AudioAttributesCompat(this.f3042a.mo3897a());
        }

        /* renamed from: b */
        public C1141a mo3896b(int i) {
            this.f3042a.mo3898b(i);
            return this;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3038b = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    AudioAttributesCompat() {
    }

    AudioAttributesCompat(AudioAttributesImpl audioAttributesImpl) {
        this.f3041a = audioAttributesImpl;
    }

    /* renamed from: a */
    static int m4657a(boolean z, int i, int i2) {
        if ((i & 1) == 1) {
            return z ? 1 : 7;
        }
        if ((i & 4) == 4) {
            return z ? 0 : 6;
        }
        switch (i2) {
            case 0:
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                return z ? 0 : 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            default:
                if (!z) {
                    return 3;
                }
                throw new IllegalArgumentException("Unknown usage value " + i2 + " in audio attributes");
        }
    }

    /* renamed from: b */
    static String m4658b(int i) {
        switch (i) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 16:
                return "USAGE_ASSISTANT";
            default:
                return "unknown usage " + i;
        }
    }

    /* renamed from: c */
    public static AudioAttributesCompat m4659c(Object obj) {
        if (f3039c) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return new AudioAttributesCompat(new AudioAttributesImplApi26((AudioAttributes) obj));
        }
        if (i >= 21) {
            return new AudioAttributesCompat(new AudioAttributesImplApi21((AudioAttributes) obj));
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesImpl audioAttributesImpl = this.f3041a;
        AudioAttributesImpl audioAttributesImpl2 = ((AudioAttributesCompat) obj).f3041a;
        return audioAttributesImpl == null ? audioAttributesImpl2 == null : audioAttributesImpl.equals(audioAttributesImpl2);
    }

    public int hashCode() {
        return this.f3041a.hashCode();
    }

    public String toString() {
        return this.f3041a.toString();
    }
}
