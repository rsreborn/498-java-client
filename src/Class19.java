/* Class19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class19
{
	static int anInt321 = 1;
	static RSString aClass16_322;
	static RSString aClass16_323;
	static int anInt324;
	static volatile int anInt325 = 0;
	static int anInt326;
	private static RSString aClass16_327;
	
	public static void method197(int i) {
		aClass16_327 = null;
		aClass16_323 = null;
		aClass16_322 = null;
		if (i != -13488) {
			aClass16_327 = null;
		}
	}
	
	static final void method198(byte[] bs, int i) {
		anInt324++;
		int i_0_ = Class23_Sub4_Sub12.anInt3089 >> 2 << 10;
		if (i != -1) {
			aClass16_327 = null;
		}
		int i_1_ = 0;
		int i_2_ = Class23_Sub20.anInt2400 >> 1;
		byte[][] bs_3_ = new byte[Class70.anInt1238][Class38_Sub7.anInt2697];
		while (i_1_ < bs.length) {
			int i_4_ = -Class102.anInt1702 + (0xff & bs[i_1_++]) * 64;
			int i_5_ = -Class29.anInt445 + 64 * (bs[i_1_++] & 0xff);
			if (i_4_ > 0 && i_5_ > 0 && i_4_ - -64 < Class70.anInt1238 && Class38_Sub7.anInt2697 > i_5_ - -64) {
				for (int i_6_ = 0; i_6_ < 64; i_6_++) {
					int i_7_ = -i_5_ + Class38_Sub7.anInt2697 + -1;
					byte[] bs_8_ = bs_3_[i_4_ + i_6_];
					for (int i_9_ = -64; (i_9_ ^ 0xffffffff) > -1; i_9_++)
						bs_8_[i_7_--] = bs[i_1_++];
				}
			} else {
				i_1_ += 4096;
			}
		}
		int i_10_ = Class70.anInt1238;
		int i_11_ = Class38_Sub7.anInt2697;
		int[] is = new int[i_11_];
		int[] is_12_ = new int[i_11_];
		int[] is_13_ = new int[i_11_];
		int[] is_14_ = new int[i_11_];
		int[] is_15_ = new int[i_11_];
		for (int i_16_ = -5; i_16_ < i_10_; i_16_++) {
			for (int i_17_ = 0; i_11_ > i_17_; i_17_++) {
				int i_18_ = i_16_ - -5;
				if ((i_18_ ^ 0xffffffff) > (i_10_ ^ 0xffffffff)) {
					int i_19_ = bs_3_[i_18_][i_17_] & 0xff;
					if ((i_19_ ^ 0xffffffff) < -1) {
						Class23_Sub13_Sub24 class23_sub13_sub24 = Class23_Sub4_Sub9.method300(1, i_19_ + -1);
						is[i_17_] += class23_sub13_sub24.anInt4263;
						is_12_[i_17_] += class23_sub13_sub24.anInt4270;
						is_13_[i_17_] += class23_sub13_sub24.anInt4264;
						is_14_[i_17_] += class23_sub13_sub24.anInt4268;
						is_15_[i_17_]++;
					}
				}
				int i_20_ = -5 + i_16_;
				if ((i_20_ ^ 0xffffffff) <= -1) {
					int i_21_ = bs_3_[i_20_][i_17_] & 0xff;
					if (i_21_ > 0) {
						Class23_Sub13_Sub24 class23_sub13_sub24 = Class23_Sub4_Sub9.method300(1, -1 + i_21_);
						is[i_17_] -= class23_sub13_sub24.anInt4263;
						is_12_[i_17_] -= class23_sub13_sub24.anInt4270;
						is_13_[i_17_] -= class23_sub13_sub24.anInt4264;
						is_14_[i_17_] -= class23_sub13_sub24.anInt4268;
						is_15_[i_17_]--;
					}
				}
			}
			if ((i_16_ ^ 0xffffffff) <= -1) {
				int[][] is_22_ = Class102.anIntArrayArrayArray1713[i_16_ >> 6];
				int i_23_ = 0;
				int i_24_ = 0;
				int i_25_ = 0;
				int i_26_ = 0;
				int i_27_ = 0;
				for (int i_28_ = -5; i_28_ < i_11_; i_28_++) {
					int i_29_ = i_28_ - -5;
					if (i_29_ < i_11_) {
						i_26_ += is_14_[i_29_];
						i_23_ += is[i_29_];
						i_25_ += is_12_[i_29_];
						i_27_ += is_15_[i_29_];
						i_24_ += is_13_[i_29_];
					}
					int i_30_ = i_28_ - 5;
					if (i_30_ >= 0) {
						i_23_ -= is[i_30_];
						i_25_ -= is_12_[i_30_];
						i_24_ -= is_13_[i_30_];
						i_26_ -= is_14_[i_30_];
						i_27_ -= is_15_[i_30_];
					}
					if ((i_28_ ^ 0xffffffff) <= -1 && (i_27_ ^ 0xffffffff) < -1) {
						int i_31_ = i_28_ >> 6;
						int i_32_ = (i_26_ ^ 0xffffffff) != -1 ? Class23_Sub13_Sub13.method762((byte) 69, i_24_ / i_27_, i_23_ * 256 / i_26_, i_25_ / i_27_) : 0;
						if ((bs_3_[i_16_][i_28_] ^ 0xffffffff) == -1) {
							if (is_22_[i_31_] != null) {
								is_22_[i_31_][Class24.method919(4032, i_28_ << 6) - -Class24.method919(63, i_16_)] = 0;
							}
						} else {
							if (is_22_[i_31_] == null) {
								is_22_[i_31_] = Class102.anIntArrayArrayArray1713[i_16_ >> 6][i_31_] = new int[4096];
							}
							int i_33_ = i_2_ + (i_32_ & 0x7f);
							if ((i_33_ ^ 0xffffffff) <= -1) {
								if (i_33_ > 127) {
									i_33_ = 127;
								}
							} else {
								i_33_ = 0;
							}
							int i_34_ = (0x380 & i_32_) + (i_32_ + i_0_ & 0xfc00) - -i_33_;
							is_22_[i_31_][Class24.method919(i_28_ << 6, 4032) + Class24.method919(63, i_16_)] = Class76.anIntArray1397[Class14.method135(-56, 96, i_34_)];
						}
					}
				}
			}
		}
	}
	
	static final boolean method199(int i, int i_35_, int i_36_) {
		int i_37_ = Class92.anIntArrayArrayArray1573[i][i_35_][i_36_];
		if (i_37_ == -Class73.anInt1321) {
			return false;
		}
		if (i_37_ == Class73.anInt1321) {
			return true;
		}
		int i_38_ = i_35_ << 7;
		int i_39_ = i_36_ << 7;
		if (Class23_Sub13_Sub23.method846(i_38_ + 1, Class17.anIntArrayArrayArray301[i][i_35_][i_36_], i_39_ + 1) && Class23_Sub13_Sub23.method846(i_38_ + 128 - 1, Class17.anIntArrayArrayArray301[i][i_35_ + 1][i_36_], i_39_ + 1) && Class23_Sub13_Sub23.method846(i_38_ + 128 - 1, Class17.anIntArrayArrayArray301[i][i_35_ + 1][i_36_ + 1], i_39_ + 128 - 1) && Class23_Sub13_Sub23.method846(i_38_ + 1, Class17.anIntArrayArrayArray301[i][i_35_][i_36_ + 1], i_39_ + 128 - 1)) {
			Class92.anIntArrayArrayArray1573[i][i_35_][i_36_] = Class73.anInt1321;
			return true;
		}
		Class92.anIntArrayArrayArray1573[i][i_35_][i_36_] = -Class73.anInt1321;
		return false;
	}
	
	static {
		aClass16_322 = Class38_Sub6.method1076((byte) 86, "Sprites geladen)3");
		aClass16_327 = Class38_Sub6.method1076((byte) 86, "Location");
		aClass16_323 = aClass16_327;
	}
}
