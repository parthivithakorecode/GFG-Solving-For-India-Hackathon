package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.C1210a;

public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(C1210a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f3043a = (AudioAttributes) aVar.mo4194r(audioAttributesImplApi21.f3043a, 1);
        audioAttributesImplApi21.f3044b = aVar.mo4192p(audioAttributesImplApi21.f3044b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, C1210a aVar) {
        aVar.mo4200x(false, false);
        aVar.mo4174H(audioAttributesImplApi21.f3043a, 1);
        aVar.mo4172F(audioAttributesImplApi21.f3044b, 2);
    }
}
