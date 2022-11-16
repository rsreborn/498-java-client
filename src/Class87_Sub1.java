/* Class87_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class87_Sub1 extends Class87
{
	private static RSString aClass16_2770;
	private final int anInt2771;
	static RSString aClass16_2772;
	static int anInt2773;
	private final int anInt2774;
	static RSString aClass16_2775;
	static int anInt2776;
	private final int anInt2777;
	static RSString aClass16_2778;
	private static RSString aClass16_2779 = Class38_Sub6.method1076((byte) 86, "Please try using a different world)3");
	static RSString aClass16_2780;
	static RSString aClass16_2781;
	static int anInt2782;
	static RSString aClass16_2783;
	static int anInt2784;
	private final int anInt2785;
	static RSString aClass16_2786;
	static RSString aClass16_2787;
	static int anInt2788;
	static RSString aClass16_2789;
	static RSString aClass16_2790;
	
	static final Class6 method1410(int i, int i_0_, byte b, Class9 class9, Component component) {
		anInt2782++;
		if ((Class32.anInt498 ^ 0xffffffff) == -1) {
			throw new IllegalStateException();
		}
		if ((i_0_ ^ 0xffffffff) > -1 || i_0_ >= 2) {
			throw new IllegalArgumentException();
		}
		if (i < 256) {
			i = 256;
		}
		try {
			Class6 class6 = (Class6) Class.forName("Class6_Sub2").newInstance();
			class6.anIntArray132 = new int[(!CacheIndex.aBoolean257 ? 1 : 2) * 256];
			class6.anInt158 = i;
			class6.method81(component);
			class6.anInt150 = (i & ~0x3ff) - -1024;
			if (b <= 23) {
				return null;
			}
			if (class6.anInt150 > 16384) {
				class6.anInt150 = 16384;
			}
			class6.method86(class6.anInt150);
			if ((Class64.anInt1030 ^ 0xffffffff) < -1 && Class28.aClass33_428 == null) {
				Class28.aClass33_428 = new Class33();
				Class28.aClass33_428.aClass9_510 = class9;
				class9.method104(Class64.anInt1030, Class28.aClass33_428, (byte) 72);
			}
			if (Class28.aClass33_428 != null) {
				if (Class28.aClass33_428.aClass6Array512[i_0_] != null) {
					throw new IllegalArgumentException();
				}
				Class28.aClass33_428.aClass6Array512[i_0_] = class6;
			}
			return class6;
		} catch (Throwable throwable) {
			try {
				Class6_Sub1 class6_sub1 = new Class6_Sub1(class9, i_0_);
				class6_sub1.anInt158 = i;
				class6_sub1.anIntArray132 = new int[256 * (CacheIndex.aBoolean257 ? 2 : 1)];
				class6_sub1.method81(component);
				class6_sub1.anInt150 = 16384;
				class6_sub1.method86(class6_sub1.anInt150);
				if ((Class64.anInt1030 ^ 0xffffffff) < -1 && Class28.aClass33_428 == null) {
					Class28.aClass33_428 = new Class33();
					Class28.aClass33_428.aClass9_510 = class9;
					class9.method104(Class64.anInt1030, Class28.aClass33_428, (byte) 72);
				}
				if (Class28.aClass33_428 != null) {
					if (Class28.aClass33_428.aClass6Array512[i_0_] != null) {
						throw new IllegalArgumentException();
					}
					Class28.aClass33_428.aClass6Array512[i_0_] = class6_sub1;
				}
				return class6_sub1;
			} catch (Throwable throwable_1_) {
				return new Class6();
			}
		}
	}
	
	Class87_Sub1(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		super(i_5_, i_6_, i_7_);
		anInt2777 = i;
		anInt2771 = i_4_;
		anInt2774 = i_3_;
		anInt2785 = i_2_;
	}
	
	final void method1409(int i, int i_8_, int i_9_) {
		anInt2784++;
		if (i_8_ <= 31) {
			method1411((byte) 115);
		}
	}
	
	final void method1408(int i, int i_10_, int i_11_) {
		if (i_11_ >= -101) {
			method1410(-5, -52, (byte) -70, null, null);
		}
		anInt2776++;
		int i_12_ = anInt2774 * i >> 12;
		int i_13_ = i * anInt2777 >> 12;
		int i_14_ = i_10_ * anInt2771 >> 12;
		int i_15_ = i_10_ * anInt2785 >> 12;
		Class28.method940(i_13_, i_14_, anInt1487, i_12_, (byte) 120, anInt1481, i_15_, anInt1494);
	}
	
	final void method1406(int i, int i_16_, int i_17_) {
		anInt2773++;
		int i_18_ = i_17_ * anInt2777 >> 12;
		int i_19_ = anInt2785 * i_16_ >> 12;
		if (i != 1) {
			aClass16_2786 = null;
		}
		int i_20_ = anInt2774 * i_17_ >> 12;
		int i_21_ = anInt2771 * i_16_ >> 12;
		Class23_Sub24.method901(i_18_, i_20_, i_21_, anInt1481, i_19_, -4838);
	}
	
	public static void method1411(byte b) {
		aClass16_2790 = null;
		aClass16_2786 = null;
		aClass16_2783 = null;
		aClass16_2772 = null;
		aClass16_2787 = null;
		aClass16_2770 = null;
		aClass16_2775 = null;
		aClass16_2778 = null;
		aClass16_2780 = null;
		aClass16_2779 = null;
		aClass16_2781 = null;
		aClass16_2789 = null;
		if (b <= 44) {
			aClass16_2780 = null;
		}
	}
	
	static {
		aClass16_2770 = Class38_Sub6.method1076((byte) 86, "Members object");
		aClass16_2772 = aClass16_2779;
		aClass16_2781 = aClass16_2779;
		aClass16_2778 = aClass16_2779;
		aClass16_2787 = aClass16_2779;
		aClass16_2783 = Class38_Sub6.method1076((byte) 86, "gr-Un:");
		aClass16_2789 = aClass16_2770;
		aClass16_2780 = Class38_Sub6.method1076((byte) 86, ":chalreq:");
		aClass16_2775 = aClass16_2779;
		anInt2788 = -1;
		aClass16_2786 = Class38_Sub6.method1076((byte) 86, "zur-Uck auf die RuneScape)2Webseite gehen");
		aClass16_2790 = aClass16_2779;
	}
}
