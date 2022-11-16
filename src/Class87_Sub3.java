/* Class87_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class87_Sub3 extends Class87
{
	private final int anInt2807;
	static int anInt2808;
	static int anInt2809;
	static int anInt2810;
	private final int anInt2811;
	static oa anOa2812;
	static int anInt2813;
	static int anInt2814;
	private final int anInt2815;
	static RSString[] aClass16Array2816 = new RSString[200];
	private final int anInt2817;
	static int anInt2818;
	static int anInt2819;
	static int anInt2820;
	static RSString aClass16_2821;
	static int anInt2822;
	static RSString aClass16_2823;
	private static RSString aClass16_2824;
	static RSString aClass16_2825;
	static RSString aClass16_2826;
	
	static final long method1416(int i, int i_0_, int i_1_) {
		Class23_Sub1 class23_sub1 = Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i][i_0_][i_1_];
		if (class23_sub1 == null) {
			return 0L;
		}
		for (int i_2_ = 0; i_2_ < class23_sub1.anInt2029; i_2_++) {
			Class39 class39 = class23_sub1.aClass39Array2028[i_2_];
			if ((class39.aLong603 >> 29 & 0x3L) == 2L && class39.anInt601 == i_0_ && class39.anInt607 == i_1_) {
				return class39.aLong603;
			}
		}
		return 0L;
	}
	
	final void method1409(int i, int i_3_, int i_4_) {
		anInt2810++;
		if (i_3_ <= 31) {
			method1416(102, 104, -88);
		}
		int i_5_ = anInt2811 * i >> 12;
		int i_6_ = i_4_ * anInt2815 >> 12;
		int i_7_ = anInt2807 * i >> 12;
		int i_8_ = anInt2817 * i_4_ >> 12;
		Class55.method1180(i_8_, i_5_, i_6_, i_7_, anInt1487, (byte) 122);
	}
	
	static final void method1417(byte b) {
		anInt2819++;
		try {
			if (Class46.anInt708 == 1) {
				int i = Class81.aClass23_Sub10_Sub2_1437.method556(0);
				if (i > 0 && Class81.aClass23_Sub10_Sub2_1437.method570(-92)) {
					i -= Class23_Sub13_Sub5.anInt3720;
					if (i < 0) {
						i = 0;
					}
					Class81.aClass23_Sub10_Sub2_1437.method579(2, i);
					return;
				}
				Class81.aClass23_Sub10_Sub2_1437.method551((byte) 24);
				Class81.aClass23_Sub10_Sub2_1437.method583(-86);
				Class23_Sub4_Sub2.aClass14_2911 = null;
				if (Class87.aClass105_1496 != null) {
					Class46.anInt708 = 2;
				} else {
					Class46.anInt708 = 0;
				}
				Class23_Sub4_Sub4.aClass23_Sub18_2952 = null;
			}
		} catch (Exception exception) {
			exception.printStackTrace();
			Class81.aClass23_Sub10_Sub2_1437.method551((byte) 24);
			Class23_Sub4_Sub4.aClass23_Sub18_2952 = null;
			Class23_Sub4_Sub2.aClass14_2911 = null;
			Class46.anInt708 = 0;
			Class87.aClass105_1496 = null;
		}
		int i = 107 % ((b - -74) / 46);
	}
	
	static final int method1418(int i, int i_9_) {
		if (i != 0) {
			anInt2820 = 69;
		}
		anInt2818++;
		return 0x7f & i_9_;
	}
	
	static final void method1419(Class64 class64, boolean bool, int i, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_) {
		if (!Class86.aBoolean1867) {
			Class8.anInt177 = 0;
		} else {
			Class8.anInt177 = 32;
		}
		Class86.aBoolean1867 = bool;
		if (Class8.anInt175 != 0) {
			if (i > i_11_ || i_11_ >= 16 + i || i_13_ < i_12_ || (i_13_ ^ 0xffffffff) <= (i_12_ - -16 ^ 0xffffffff)) {
				if ((i ^ 0xffffffff) >= (i_11_ ^ 0xffffffff) && (i_11_ ^ 0xffffffff) > (16 + i ^ 0xffffffff) && (-16 + i_10_ + i_12_ ^ 0xffffffff) >= (i_13_ ^ 0xffffffff) && i_10_ + i_12_ > i_13_) {
					class64.anInt1083 += 4;
					Class91.method1450((byte) 29, class64);
				} else if (i + -Class8.anInt177 <= i_11_ && (i_11_ ^ 0xffffffff) > (i + 16 - -Class8.anInt177 ^ 0xffffffff) && (16 + i_12_ ^ 0xffffffff) >= (i_13_ ^ 0xffffffff) && (-16 + i_12_ - -i_10_ ^ 0xffffffff) < (i_13_ ^ 0xffffffff)) {
					int i_15_ = (-32 + i_10_) * i_10_ / i_14_;
					if (i_15_ < 8) {
						i_15_ = 8;
					}
					int i_16_ = -(i_15_ / 2) + -16 + (i_13_ - i_12_);
					int i_17_ = -32 + i_10_ - i_15_;
					class64.anInt1083 = i_16_ * (i_14_ + -i_10_) / i_17_;
					Class91.method1450((byte) 29, class64);
					Class86.aBoolean1867 = true;
				}
			} else {
				class64.anInt1083 -= 4;
				Class91.method1450((byte) 29, class64);
			}
		}
		anInt2813++;
		if (Class48.anInt749 != 0) {
			int i_18_ = class64.anInt1128;
			if (i_11_ >= i + -i_18_ && (i_13_ ^ 0xffffffff) <= (i_12_ ^ 0xffffffff) && (i - -16 ^ 0xffffffff) < (i_11_ ^ 0xffffffff) && (i_12_ + i_10_ ^ 0xffffffff) <= (i_13_ ^ 0xffffffff)) {
				class64.anInt1083 += 45 * Class48.anInt749;
				Class91.method1450((byte) 29, class64);
			}
		}
	}
	
	final void method1408(int i, int i_19_, int i_20_) {
		if (i_20_ >= -101) {
			method1421(-59, -59, -20);
		}
		anInt2814++;
	}
	
	public static void method1420(int i) {
		anOa2812 = null;
		aClass16Array2816 = null;
		aClass16_2823 = null;
		if (i <= -92) {
			aClass16_2824 = null;
			aClass16_2825 = null;
			aClass16_2821 = null;
			aClass16_2826 = null;
		}
	}
	
	static final Class24 method1421(int i, int i_21_, int i_22_) {
		Class23_Sub1 class23_sub1 = Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i][i_21_][i_22_];
		if (class23_sub1 == null) {
			return null;
		}
		return class23_sub1.aClass24_2038;
	}
	
	Class87_Sub3(int i, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_) {
		super(-1, i_26_, i_27_);
		anInt2817 = i_25_;
		anInt2807 = i;
		anInt2811 = i_24_;
		anInt2815 = i_23_;
	}
	
	final void method1406(int i, int i_28_, int i_29_) {
		if (i != 1) {
			method1420(115);
		}
		anInt2808++;
	}
	
	static {
		anOa2812 = new oa(4096);
		anInt2820 = 0;
		aClass16_2821 = Class38_Sub6.method1076((byte) 86, " x ");
		anInt2822 = 0;
		aClass16_2824 = Class38_Sub6.method1076((byte) 86, "Create a free account");
		aClass16_2823 = aClass16_2824;
		aClass16_2826 = Class38_Sub6.method1076((byte) 86, "Ung-Ultiges Anmelde)2Paket)3");
		aClass16_2825 = Class38_Sub6.method1076((byte) 86, "; version=1; path=)4; domain=");
	}
}
