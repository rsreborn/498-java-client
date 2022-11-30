/* Class33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

public class Class33 implements Runnable
{
	protected Class9 aClass9_510;
	volatile boolean aBoolean511;
	volatile Class6[] aClass6Array512 = new Class6[2];
	static int anInt513;
	static int anInt514;
	static int anInt515;
	static Class5 aClass5_516 = new Class5(200);
	volatile boolean aBoolean517;
	static RSString aClass16_518 = Class38_Sub6.method1076((byte) 86, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");
	static RSString aClass16_519 = Class38_Sub6.method1076((byte) 86, "<img=0>");
	static BigInteger rsaKey;
	static int anInt521;
	static RSString aClass16_522 = Class38_Sub6.method1076((byte) 86, "p12_full");
	
	static final int method967(byte b, int i, int i_0_) {
		anInt515++;
		if ((i_0_ ^ 0xffffffff) == 1) {
			return 12345678;
		}
		if (b < 42) {
			return 124;
		}
		if ((i_0_ ^ 0xffffffff) == 0) {
			if (i < 2) {
				i = 2;
			} else if (i > 126) {
				i = 126;
			}
			return i;
		}
		i = (i_0_ & 0x7f) * i >> 7;
		if (i < 2) {
			i = 2;
		} else if (i > 126) {
			i = 126;
		}
		return (0xff80 & i_0_) + i;
	}
	
	static final void method968(int i) {
		if (i == 2) {
			if (Class47.anIntArray739 == null || Class55.anIntArray870 == null) {
				Class55.anIntArray870 = new int[256];
				Class47.anIntArray739 = new int[256];
				for (int i_1_ = 0; i_1_ < 256; i_1_++) {
					double d = (double) i_1_ / 255.0 * 6.283185307179586;
					Class47.anIntArray739[i_1_] = (int) (4096.0 * Math.sin(d));
					Class55.anIntArray870[i_1_] = (int) (Math.cos(d) * 4096.0);
				}
			}
			anInt514++;
		}
	}
	
	public static void method969(byte b) {
		if (b <= 66) {
			aClass5_516 = null;
		}
		aClass16_519 = null;
		rsaKey = null;
		aClass5_516 = null;
		aClass16_518 = null;
		aClass16_522 = null;
	}
	
	public final void run() {
		anInt513++;
		aBoolean517 = true;
		try {
			while (!aBoolean511) {
				for (int i = 0; i < 2; i++) {
					Class6 class6 = aClass6Array512[i];
					if (class6 != null) {
						class6.method85((byte) -39);
					}
				}
				Class105.method1545((byte) -82, 10L);
				Class87.method1405(null, 0, aClass9_510);
			}
		} catch (Exception exception) {
			Class26.method925(95, exception, null);
		} finally {
			aBoolean517 = false;
		}
	}
	
	Class33() {
		aBoolean511 = false;
		aBoolean517 = false;
	}
	
	static {
		rsaKey = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
	}
}
