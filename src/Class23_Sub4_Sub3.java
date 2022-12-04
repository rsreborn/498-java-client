/* Class23_Sub4_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub4_Sub3 extends Class23_Sub4
{
	static int anInt2935;
	static int anInt2936;
	static int anInt2937;
	static RSString aClass16_2938;
	static Class9 aClass9_2939;
	static int anInt2940 = -1;
	static RSString aClass16_2941 = Class38_Sub6.method1076((byte) 86, "Spielwelt erstellt)3");
	static int anInt2942;
	static Class105 aClass105_2943;
	static int anInt2944;
	private int anInt2945 = 32768;
	static Class81 aClass81_2946;
	static int[] anIntArray2947;
	static int anInt2948;
	static int anInt2949;
	static int anInt2950;
	static RSString[] aClass16Array2951;
	
	final int[] method260(int i, int i_0_) {
		anInt2937++;
		int[] is = aClass99_2115.method1500(i_0_, (byte) -110);
		if (i != 0) {
			return null;
		}
		if (aClass99_2115.aBoolean1681) {
			int[] is_1_ = this.method261(i_0_, 1, (byte) 18);
			int[] is_2_ = this.method261(i_0_, 2, (byte) 18);
			for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff); i_3_++) {
				int i_4_ = 0xff & is_1_[i_3_] >> 4;
				int i_5_ = anInt2945 * is_2_[i_3_] >> 12;
				int i_6_ = Class55.anIntArray870[i_4_] * i_5_ >> 12;
				int i_7_ = i_5_ * Class47.anIntArray739[i_4_] >> 12;
				int i_8_ = Class95.anInt1611 & (i_6_ >> 12) + i_3_;
				int i_9_ = Class23_Sub4_Sub1.anInt2892 & (i_7_ >> 12) + i_0_;
				int[] is_10_ = this.method261(i_9_, 0, (byte) 18);
				is[i_3_] = is_10_[i_8_];
			}
		}
		return is;
	}
	
	public static void method280(int i) {
		aClass16_2941 = null;
		aClass105_2943 = null;
		aClass81_2946 = null;
		aClass9_2939 = null;
		aClass16Array2951 = null;
		aClass16_2938 = null;
		if (i != 0) {
			aClass16_2941 = null;
		}
		anIntArray2947 = null;
	}
	
	static final Class64 method281(byte b, Class64 class64) {
		anInt2942++;
		int i = Class95.method1470((byte) -53, Class47.method1142(class64, 103));
		if ((i ^ 0xffffffff) == -1) {
			return null;
		}
		if (b < 17) {
			anIntArray2947 = null;
		}
		for (int i_11_ = 0; i_11_ < i; i_11_++) {
			class64 = Class23_Sub24.method905(class64.anInt1056, (byte) 111);
			if (class64 == null) {
				return null;
			}
		}
		return class64;
	}
	
	final int[][] method258(int i, byte b) {
		anInt2936++;
		if (b != 9) {
			aClass16_2941 = null;
		}
		int[][] is = aClass103_2108.method1518(b + -29668, i);
		if (aClass103_2108.aBoolean1733) {
			int[] is_12_ = this.method261(i, 1, (byte) 18);
			int[] is_13_ = this.method261(i, 2, (byte) 18);
			int[] is_14_ = is[2];
			int[] is_15_ = is[0];
			int[] is_16_ = is[1];
			for (int i_17_ = 0; (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff) < (i_17_ ^ 0xffffffff); i_17_++) {
				int i_18_ = (is_12_[i_17_] * 255 & 0xffd76) >> 12;
				int i_19_ = anInt2945 * is_13_[i_17_] >> 12;
				int i_20_ = Class55.anIntArray870[i_18_] * i_19_ >> 12;
				int i_21_ = i_19_ * Class47.anIntArray739[i_18_] >> 12;
				int i_22_ = (i_21_ >> 12) + i & Class23_Sub4_Sub1.anInt2892;
				int i_23_ = Class95.anInt1611 & i_17_ - -(i_20_ >> 12);
				int[][] is_24_ = this.method256(0, (byte) -69, i_22_);
				is_15_[i_17_] = is_24_[0][i_23_];
				is_16_[i_17_] = is_24_[1][i_23_];
				is_14_[i_17_] = is_24_[2][i_23_];
			}
		}
		return is;
	}
	
	final void method265(int i) {
		anInt2948++;
		if (i != -21746) {
			aClass16_2941 = null;
		}
		Class33.method968(2);
	}
	
	static final void method282(int i, int i_25_, int i_26_, int i_27_, int i_28_) {
		anInt2944++;
		int i_29_ = -18 / ((i_28_ - 13) / 48);
		Class23_Sub17 class23_sub17 = (Class23_Sub17) Class23_Sub4_Sub7.anOa2997.a((byte) -84, (long) i_27_);
		if (class23_sub17 == null) {
			class23_sub17 = new Class23_Sub17();
			Class23_Sub4_Sub7.anOa2997.a(class23_sub17, (byte) -14, (long) i_27_);
		}
		if ((i ^ 0xffffffff) <= (class23_sub17.anIntArray2373.length ^ 0xffffffff)) {
			int[] is = new int[1 + i];
			int[] is_30_ = new int[i + 1];
			for (int i_31_ = 0; (class23_sub17.anIntArray2373.length ^ 0xffffffff) < (i_31_ ^ 0xffffffff); i_31_++) {
				is[i_31_] = class23_sub17.anIntArray2373[i_31_];
				is_30_[i_31_] = class23_sub17.anIntArray2364[i_31_];
			}
			for (int i_32_ = class23_sub17.anIntArray2373.length; (i_32_ ^ 0xffffffff) > (i ^ 0xffffffff); i_32_++) {
				is[i_32_] = -1;
				is_30_[i_32_] = 0;
			}
			class23_sub17.anIntArray2373 = is;
			class23_sub17.anIntArray2364 = is_30_;
		}
		class23_sub17.anIntArray2373[i] = i_26_;
		class23_sub17.anIntArray2364[i] = i_25_;
	}
	
	public Class23_Sub4_Sub3() {
		super(3, false);
	}
	
	final void method255(Buffer class23_sub5, int i, int i_33_) {
		int i_34_ = i;
		do {
			if ((i_34_ ^ 0xffffffff) != -1) {
				if (i_34_ != 1) {
					break;
				}
			} else {
				anInt2945 = class23_sub5.getUShortBE() << 4;
				break;
			}
			aBoolean2117 = class23_sub5.readUByte() == 1;
		} while (false);
		if (i_33_ != 1000) {
			method260(98, 115);
		}
		anInt2949++;
	}
	
	static final void method283(byte b) {
		int[] is = new int[Class30.anInt477];
		anInt2935++;
		int i = 0;
		for (int i_35_ = 0; (Class30.anInt477 ^ 0xffffffff) < (i_35_ ^ 0xffffffff); i_35_++) {
			ItemDefinition class23_sub13_sub11 = Class23_Sub13_Sub24.method853(-25, i_35_);
			if ((class23_sub13_sub11.anInt3931 ^ 0xffffffff) <= -1 || class23_sub13_sub11.anInt3939 >= 0) {
				is[i++] = i_35_;
			}
		}
		Class102.anIntArray1710 = new int[i];
		if (b <= -107) {
			for (int i_36_ = 0; i > i_36_; i_36_++)
				Class102.anIntArray1710[i_36_] = is[i_36_];
		}
	}
	
	static {
		aClass16_2938 = Class38_Sub6.method1076((byte) 86, "logo");
		aClass81_2946 = new Class81(4);
		aClass16Array2951 = new RSString[1000];
	}
}
