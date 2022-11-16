/* Class6_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.SourceDataLine;

public class Class6_Sub2 extends Class6
{
	private AudioFormat anAudioFormat1982;
	private byte[] aByteArray1983;
	private boolean aBoolean1984 = false;
	private int anInt1985;
	private SourceDataLine aSourceDataLine1986;
	static Class aClass1987;
	
	final int method80() {
		return anInt1985 - (aSourceDataLine1986.available() >> (!CacheIndex.aBoolean257 ? 1 : 2));
	}
	
	final void method83() {
		if (null != aSourceDataLine1986) {
			aSourceDataLine1986.close();
			aSourceDataLine1986 = null;
		}
	}
	
	final void method81(Component component) {
		Mixer.Info[] infos = AudioSystem.getMixerInfo();
		if (infos != null) {
			Mixer.Info[] infos_0_ = infos;
			for (int i = 0; i < infos_0_.length; i++) {
				Mixer.Info info = infos_0_[i];
				if (null != info) {
					String string = info.getName();
					if (null != string && (string.toLowerCase().indexOf("soundmax") ^ 0xffffffff) <= -1) {
						aBoolean1984 = true;
					}
				}
			}
		}
		anAudioFormat1982 = new AudioFormat((float) Class32.anInt498, 16, CacheIndex.aBoolean257 ? 2 : 1, true, false);
		aByteArray1983 = new byte[256 << (CacheIndex.aBoolean257 ? 2 : 1)];
	}
	
	final void method86(int i) throws LineUnavailableException {
		try {
			DataLine.Info info = new DataLine.Info(aClass1987 == null ? aClass1987 = method89("javax.sound.sampled.SourceDataLine") : aClass1987, anAudioFormat1982, i << (CacheIndex.aBoolean257 ? 2 : 1));
			aSourceDataLine1986 = (SourceDataLine) AudioSystem.getLine(info);
			aSourceDataLine1986.open();
			aSourceDataLine1986.start();
			anInt1985 = i;
		} catch (LineUnavailableException lineunavailableexception) {
			if (Class98.method1492((byte) 40, i) != 1) {
				method86(RuntimeException_Sub1.method1586((byte) -23, i));
			} else {
				aSourceDataLine1986 = null;
				throw lineunavailableexception;
			}
		}
	}
	
	final void method82() throws LineUnavailableException {
		aSourceDataLine1986.flush();
		if (aBoolean1984) {
			aSourceDataLine1986.close();
			aSourceDataLine1986 = null;
			DataLine.Info info = new DataLine.Info(aClass1987 == null ? aClass1987 = method89("javax.sound.sampled.SourceDataLine") : aClass1987, anAudioFormat1982, anInt1985 << (!CacheIndex.aBoolean257 ? 1 : 2));
			aSourceDataLine1986 = (SourceDataLine) AudioSystem.getLine(info);
			aSourceDataLine1986.open();
			aSourceDataLine1986.start();
		}
	}
	
	Class6_Sub2() {
		/* empty */
	}
	
	final void method79() {
		int i = 256;
		if (CacheIndex.aBoolean257) {
			i <<= 1;
		}
		for (int i_1_ = 0; i_1_ < i; i_1_++) {
			int i_2_ = anIntArray132[i_1_];
			if ((i_2_ + 8388608 & ~0xffffff) != 0) {
				i_2_ = 0x7fffff ^ i_2_ >> 31;
			}
			aByteArray1983[i_1_ * 2] = (byte) (i_2_ >> 8);
			aByteArray1983[i_1_ * 2 + 1] = (byte) (i_2_ >> 16);
		}
		aSourceDataLine1986.write(aByteArray1983, 0, i << 1);
	}
	
	static Class method89(String string) {
		Class var_class;
		try {
			var_class = Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw (NoClassDefFoundError) new NoClassDefFoundError().initCause(classnotfoundexception);
		}
		return var_class;
	}
}
