/* Class40 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class40
{
	protected int anInt621;
	protected int anInt622;
	static int anInt623;
	static int anInt624;
	static Class5 aClass5_625 = new Class5(64);
	static int anInt626;
	protected int anInt627;
	static int[] anIntArray628 = { 8, 11, 4, 6, 9, 7, 10 };
	static RSString aClass16_629 = Class38_Sub6.method1076((byte) 86, "null");
	static Class105 aClass105_630;
	static volatile long aLong631 = 0L;
	static RSString aClass16_632 = Class38_Sub6.method1076((byte) 86, "l");
	
	static final void method1105(byte b, int i, int i_0_, int i_1_, int i_2_) {
		anInt623++;
		int i_3_ = i_0_;
		if (b > -109) {
			method1108(4);
		}
		int i_4_ = -i_0_;
		int i_5_ = -1;
		int i_6_ = 0;
		Class23_Sub13_Sub6.method632(i + i_0_, (byte) -30, i_1_, Class4.anIntArrayArray98[i_2_], i - i_0_);
		while (i_6_ < i_3_) {
			i_5_ += 2;
			i_6_++;
			i_4_ += i_5_;
			if ((i_4_ ^ 0xffffffff) <= -1) {
				i_3_--;
				int[] is = Class4.anIntArrayArray98[i_2_ - -i_3_];
				i_4_ -= i_3_ << 1;
				int i_7_ = i_6_ + i;
				int[] is_8_ = Class4.anIntArrayArray98[i_2_ - i_3_];
				int i_9_ = i + -i_6_;
				Class23_Sub13_Sub6.method632(i_7_, (byte) -30, i_1_, is, i_9_);
				Class23_Sub13_Sub6.method632(i_7_, (byte) -30, i_1_, is_8_, i_9_);
			}
			int i_10_ = i - -i_3_;
			int i_11_ = i - i_3_;
			int[] is = Class4.anIntArrayArray98[-i_6_ + i_2_];
			int[] is_12_ = Class4.anIntArrayArray98[i_6_ + i_2_];
			Class23_Sub13_Sub6.method632(i_10_, (byte) -30, i_1_, is_12_, i_11_);
			Class23_Sub13_Sub6.method632(i_10_, (byte) -30, i_1_, is, i_11_);
		}
	}
	
	static final int method1106(int i, int i_13_, int i_14_) {
		anInt626++;
		int i_15_ = 0;
		while (i > 0) {
			i--;
			i_15_ = i_13_ & 0x1 | i_15_ << 1;
			i_13_ >>>= 1;
		}
		if (i_14_ != 32768) {
			return 99;
		}
		return i_15_;
	}
	
	static final int method1107(int i) {
		int i_16_ = 3;
		if (Class23_Sub4_Sub17.anInt3178 < 310) {
			int i_17_ = Class23_Sub13_Sub1.anInt3673 >> 7;
			int i_18_ = Class53.anInt838 >> 7;
			if ((Class23_Sub4_Sub30.aByteArrayArrayArray3379[Class23_Sub13_Sub11.anInt3916][i_17_][i_18_] & 0x4 ^ 0xffffffff) != -1) {
				i_16_ = Class23_Sub13_Sub11.anInt3916;
			}
			int i_19_ = Class105.aClass38_Sub7_Sub2_1812.anInt2674 >> 7;
			int i_20_ = Class105.aClass38_Sub7_Sub2_1812.anInt2659 >> 7;
			int i_21_;
			if ((i_19_ ^ 0xffffffff) >= (i_17_ ^ 0xffffffff)) {
				i_21_ = -i_19_ + i_17_;
			} else {
				i_21_ = -i_17_ + i_19_;
			}
			int i_22_;
			if ((i_20_ ^ 0xffffffff) >= (i_18_ ^ 0xffffffff)) {
				i_22_ = -i_20_ + i_18_;
			} else {
				i_22_ = i_20_ + -i_18_;
			}
			if (i_22_ < i_21_) {
				int i_23_ = i_22_ * 65536 / i_21_;
				int i_24_ = 32768;
				while ((i_17_ ^ 0xffffffff) != (i_19_ ^ 0xffffffff)) {
					i_24_ += i_23_;
					if ((i_19_ ^ 0xffffffff) >= (i_17_ ^ 0xffffffff)) {
						if (i_17_ > i_19_) {
							i_17_--;
						}
					} else {
						i_17_++;
					}
					if ((Class23_Sub4_Sub30.aByteArrayArrayArray3379[Class23_Sub13_Sub11.anInt3916][i_17_][i_18_] & 0x4 ^ 0xffffffff) != -1) {
						i_16_ = Class23_Sub13_Sub11.anInt3916;
					}
					if ((i_24_ ^ 0xffffffff) <= -65537) {
						i_24_ -= 65536;
						if ((i_20_ ^ 0xffffffff) >= (i_18_ ^ 0xffffffff)) {
							if ((i_20_ ^ 0xffffffff) > (i_18_ ^ 0xffffffff)) {
								i_18_--;
							}
						} else {
							i_18_++;
						}
						if ((0x4 & Class23_Sub4_Sub30.aByteArrayArrayArray3379[Class23_Sub13_Sub11.anInt3916][i_17_][i_18_]) != 0) {
							i_16_ = Class23_Sub13_Sub11.anInt3916;
						}
					}
				}
			} else {
				int i_25_ = 65536 * i_21_ / i_22_;
				int i_26_ = 32768;
				while (i_20_ != i_18_) {
					i_26_ += i_25_;
					if (i_18_ >= i_20_) {
						if ((i_18_ ^ 0xffffffff) < (i_20_ ^ 0xffffffff)) {
							i_18_--;
						}
					} else {
						i_18_++;
					}
					if ((0x4 & Class23_Sub4_Sub30.aByteArrayArrayArray3379[Class23_Sub13_Sub11.anInt3916][i_17_][i_18_]) != 0) {
						i_16_ = Class23_Sub13_Sub11.anInt3916;
					}
					if (i_26_ >= 65536) {
						i_26_ -= 65536;
						if ((i_19_ ^ 0xffffffff) >= (i_17_ ^ 0xffffffff)) {
							if (i_19_ < i_17_) {
								i_17_--;
							}
						} else {
							i_17_++;
						}
						if ((0x4 & Class23_Sub4_Sub30.aByteArrayArrayArray3379[Class23_Sub13_Sub11.anInt3916][i_17_][i_18_] ^ 0xffffffff) != -1) {
							i_16_ = Class23_Sub13_Sub11.anInt3916;
						}
					}
				}
			}
		}
		if ((0x4 & Class23_Sub4_Sub30.aByteArrayArrayArray3379[Class23_Sub13_Sub11.anInt3916][Class105.aClass38_Sub7_Sub2_1812.anInt2674 >> 7][Class105.aClass38_Sub7_Sub2_1812.anInt2659 >> 7] ^ 0xffffffff) != -1) {
			i_16_ = Class23_Sub13_Sub11.anInt3916;
		}
		if (i != -175122297) {
			aClass5_625 = null;
		}
		anInt624++;
		return i_16_;
	}
	
	public static void method1108(int i) {
		int i_27_ = 16 % ((46 - i) / 57);
		aClass105_630 = null;
		aClass16_632 = null;
		anIntArray628 = null;
		aClass16_629 = null;
		aClass5_625 = null;
	}
}
