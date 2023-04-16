package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImplApi21;

public class AudioAttributesImplApi26 extends AudioAttributesImplApi21 {

    /* renamed from: androidx.media.AudioAttributesImplApi26$a */
    static class C1144a extends AudioAttributesImplApi21.C1143a {
        C1144a() {
        }

        /* renamed from: a */
        public AudioAttributesImpl mo3897a() {
            return new AudioAttributesImplApi26(this.f3045a.build());
        }
    }

    AudioAttributesImplApi26() {
    }

    AudioAttributesImplApi26(AudioAttributes audioAttributes) {
        super(audioAttributes, -1);
    }
}
