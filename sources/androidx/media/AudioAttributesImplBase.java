package androidx.media;

import androidx.media.AudioAttributesImpl;
import java.util.Arrays;

public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    public int f3046a = 0;

    /* renamed from: b */
    public int f3047b = 0;

    /* renamed from: c */
    public int f3048c = 0;

    /* renamed from: d */
    public int f3049d = -1;

    /* renamed from: androidx.media.AudioAttributesImplBase$a */
    static class C1145a implements AudioAttributesImpl.C1142a {

        /* renamed from: a */
        private int f3050a = 0;

        /* renamed from: b */
        private int f3051b = 0;

        /* renamed from: c */
        private int f3052c = 0;

        /* renamed from: d */
        private int f3053d = -1;

        C1145a() {
        }

        /* renamed from: a */
        public AudioAttributesImpl mo3897a() {
            return new AudioAttributesImplBase(this.f3051b, this.f3052c, this.f3050a, this.f3053d);
        }

        /* renamed from: c */
        public C1145a mo3898b(int i) {
            if (i != 10) {
                this.f3053d = i;
                return this;
            }
            throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
        }
    }

    AudioAttributesImplBase() {
    }

    AudioAttributesImplBase(int i, int i2, int i3, int i4) {
        this.f3047b = i;
        this.f3048c = i2;
        this.f3046a = i3;
        this.f3049d = i4;
    }

    /* renamed from: a */
    public int mo3903a() {
        return this.f3047b;
    }

    /* renamed from: b */
    public int mo3904b() {
        int i = this.f3048c;
        int c = mo3905c();
        if (c == 6) {
            i |= 4;
        } else if (c == 7) {
            i |= 1;
        }
        return i & 273;
    }

    /* renamed from: c */
    public int mo3905c() {
        int i = this.f3049d;
        return i != -1 ? i : AudioAttributesCompat.m4657a(false, this.f3048c, this.f3046a);
    }

    /* renamed from: d */
    public int mo3906d() {
        return this.f3046a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f3047b == audioAttributesImplBase.mo3903a() && this.f3048c == audioAttributesImplBase.mo3904b() && this.f3046a == audioAttributesImplBase.mo3906d() && this.f3049d == audioAttributesImplBase.f3049d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3047b), Integer.valueOf(this.f3048c), Integer.valueOf(this.f3046a), Integer.valueOf(this.f3049d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f3049d != -1) {
            sb.append(" stream=");
            sb.append(this.f3049d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.m4658b(this.f3046a));
        sb.append(" content=");
        sb.append(this.f3047b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f3048c).toUpperCase());
        return sb.toString();
    }
}
