/* Class23_Sub4_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub4_Sub11 extends Class23_Sub4
{
	static RSString aClass16_3063;
	static int anInt3064;
	private static RSString aClass16_3065;
	private static RSString aClass16_3066;
	static int anInt3067 = 0;
	static RSString aClass16_3068;
	static int anInt3069;
	static int anInt3070;
	static int anInt3071;
	static Class105 aClass105_3072;
	static int anInt3073;
	
	public Class23_Sub4_Sub11() {
		super(0, true);
	}
	
	private final int method305(boolean bool, int i, int i_0_) {
		anInt3073++;
		if (bool != true) {
			aClass105_3072 = null;
		}
		int i_1_ = i - -(i_0_ * 57);
		i_1_ = i_1_ << 1 ^ i_1_;
		return -(((789221 + 15731 * (i_1_ * i_1_)) * i_1_ - -1376312589 & 0x7fffffff) / 262144) + 4096;
	}
	
	static final int method306(int i, int i_2_, int i_3_) {
		if (i < 106) {
			method307(null, 35, 103, 40, null);
		}
		anInt3069++;
		int i_4_ = 1;
		while (i_2_ > 1) {
			if ((0x1 & i_2_ ^ 0xffffffff) != -1) {
				i_4_ *= i_3_;
			}
			i_2_ >>= 1;
			i_3_ *= i_3_;
		}
		if (i_2_ == 1) {
			return i_4_ * i_3_;
		}
		return i_4_;
	}
	
	static final Class23_Sub13_Sub8 method307(Class105 class105, int i, int i_5_, int i_6_, Class105 class105_7_) {
		anInt3070++;
		if (!Class23_Sub4_Sub29.method385(class105, 0, i_6_, i_5_)) {
			return null;
		}
		if (i != 21095) {
			method306(-18, 20, -34);
		}
		return Class14.method128(class105_7_.method1544(i_5_, 0, i_6_), false);
	}
	
	public static void method308(byte b) {
		if (b < -67) {
			aClass16_3066 = null;
			aClass16_3063 = null;
			aClass105_3072 = null;
			aClass16_3068 = null;
			aClass16_3065 = null;
		}
	}
	
	final int[] method260(int i, int i_8_) {
		int[] is = aClass99_2115.method1500(i_8_, (byte) -126);
		anInt3064++;
		if (aClass99_2115.aBoolean1681) {
			int i_9_ = Class23_Sub13_Sub16.anIntArray4049[i_8_];
			for (int i_10_ = 0; (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff) < (i_10_ ^ 0xffffffff); i_10_++)
				is[i_10_] = method305(true, Class61.anIntArray967[i_10_], i_9_) % 4096;
		}
		if (i != 0) {
			anInt3067 = -87;
		}
		return is;
	}
	
	static {
		aClass16_3066 = Class38_Sub6.method1076((byte) 86, "Click to switch");
		aClass16_3068 = aClass16_3066;
		anInt3071 = 0;
		aClass16_3065 = Class38_Sub6.method1076((byte) 86, "Login limit exceeded)3");
		aClass16_3063 = aClass16_3065;
	}
}
