package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;

public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a */
    public AudioAttributes f3043a;

    /* renamed from: b */
    public int f3044b;

    /* renamed from: androidx.media.AudioAttributesImplApi21$a */
    static class C1143a implements AudioAttributesImpl.C1142a {

        /* renamed from: a */
        final AudioAttributes.Builder f3045a = new AudioAttributes.Builder();

        C1143a() {
        }

        /* renamed from: a */
        public AudioAttributesImpl mo3897a() {
            return new AudioAttributesImplApi21(this.f3045a.build());
        }

        /* renamed from: c */
        public C1143a mo3898b(int i) {
            this.f3045a.setLegacyStreamType(i);
            return this;
        }
    }

    AudioAttributesImplApi21() {
        this.f3044b = -1;
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes, int i) {
        this.f3044b = -1;
        this.f3043a = audioAttributes;
        this.f3044b = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f3043a.equals(((AudioAttributesImplApi21) obj).f3043a);
    }

    public int hashCode() {
        return this.f3043a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f3043a;
    }
}
