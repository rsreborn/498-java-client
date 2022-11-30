/* Class23_Sub4_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub4_Sub15 extends Class23_Sub4
{
	static int anInt3137;
	static int anInt3138;
	static int anInt3139;
	static int anInt3140;
	static int anInt3141;
	static int anInt3142;
	static int anInt3143;
	static int anInt3144;
	static int anInt3145;
	static byte aByte3146;
	static int anInt3147;
	
	final int[][] method258(int i, byte b) {
		if (b != 9) {
			anInt3138 = 96;
		}
		anInt3137++;
		int[][] is = aClass103_2108.method1518(-29659, i);
		if (aClass103_2108.aBoolean1733) {
			int[] is_0_ = is[0];
			int[] is_1_ = is[1];
			int[] is_2_ = is[2];
			for (int i_3_ = 0; i_3_ < Class23_Sub4_Sub33.anInt3428; i_3_++) {
				method328(b ^ ~0x2f, i_3_, i);
				int[][] is_4_ = this.method256(0, (byte) -99, Class29.anInt463);
				is_0_[i_3_] = is_4_[0][Class63.anInt985];
				is_1_[i_3_] = is_4_[1][Class63.anInt985];
				is_2_[i_3_] = is_4_[2][Class63.anInt985];
			}
		}
		return is;
	}
	
	static final void method325(int i, boolean bool, int i_5_, byte b, int i_6_, byte[] bs, Class72[] class72s, int i_7_, int i_8_, int i_9_, int i_10_) {
		if (b == 11) {
			anInt3143++;
			if (!bool) {
				for (int i_11_ = 0; i_11_ < 8; i_11_++) {
					for (int i_12_ = 0; i_12_ < 8; i_12_++) {
						if ((i_7_ + i_11_ ^ 0xffffffff) < -1 && i_7_ - -i_11_ < 103 && i_8_ - -i_12_ > 0 && i_8_ + i_12_ < 103) {
							class72s[i_5_].anIntArrayArray1290[i_7_ - -i_11_][i_12_ + i_8_] = Class24.method919(class72s[i_5_].anIntArrayArray1290[i_7_ - -i_11_][i_12_ + i_8_], -16777217);
						}
					}
				}
			}
			int i_13_;
			if (bool) {
				i_13_ = 1;
			} else {
				i_13_ = 4;
			}
			Buffer class23_sub5 = new Buffer(bs);
			for (int i_14_ = 0; i_14_ < i_13_; i_14_++) {
				for (int i_15_ = 0; i_15_ < 64; i_15_++) {
					for (int i_16_ = 0; i_16_ < 64; i_16_++) {
						if ((i_14_ ^ 0xffffffff) != (i_9_ ^ 0xffffffff) || (i_15_ ^ 0xffffffff) > (i ^ 0xffffffff) || 8 + i <= i_15_ || (i_16_ ^ 0xffffffff) > (i_10_ ^ 0xffffffff) || i_16_ >= 8 + i_10_) {
							Class72.method1301(-1, class23_sub5, 0, -1, bool, 0, (byte) -122, 0, 0);
						} else {
							Class72.method1301(Class23_Sub4_Sub36.method413(i_6_, (byte) 83, i_16_ & 0x7, 0x7 & i_15_) + i_8_, class23_sub5, i_5_, i_7_ + Class55.method1181((byte) 96, 0x7 & i_15_, 0x7 & i_16_, i_6_), bool, 0, (byte) -122, i_6_, 0);
						}
					}
				}
			}
		}
	}
	
	public Class23_Sub4_Sub15() {
		super(1, false);
	}
	
	static final void method326(boolean bool) {
		if (bool != true) {
			method326(false);
		}
		anInt3144++;
		if (Class23_Sub24.aClass34_2440 != null) {
			Class23_Sub24.aClass34_2440.method976(false);
			Class23_Sub24.aClass34_2440 = null;
		}
		Class23_Sub10_Sub2.method560(117);
		Class23_Sub13_Sub1.method603();
		for (int i = 0; i < 4; i++)
			Class4.aClass72Array85[i].method1298(113);
		Class23_Sub4_Sub22.method355((byte) -94);
		System.gc();
		Class23_Sub4_Sub16.method333(-257, 2);
		Class105.aBoolean1806 = false;
		Class83.anInt1460 = -1;
		Class23_Sub4_Sub18.method336(-11211);
		Class103.method1521(10, 27172);
	}
	
	static final boolean method327(int i, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_) {
		if (i_17_ == i_18_ && i_19_ == i_20_) {
			if (!Class19.method199(i, i_17_, i_19_)) {
				return false;
			}
			int i_22_ = i_17_ << 7;
			int i_23_ = i_19_ << 7;
			if (Class23_Sub13_Sub23.method846(i_22_ + 1, Class17.anIntArrayArrayArray301[i][i_17_][i_19_] + i_21_, i_23_ + 1) && Class23_Sub13_Sub23.method846(i_22_ + 128 - 1, Class17.anIntArrayArrayArray301[i][i_17_ + 1][i_19_] + i_21_, i_23_ + 1) && Class23_Sub13_Sub23.method846(i_22_ + 128 - 1, Class17.anIntArrayArrayArray301[i][i_17_ + 1][i_19_ + 1] + i_21_, i_23_ + 128 - 1) && Class23_Sub13_Sub23.method846(i_22_ + 1, Class17.anIntArrayArrayArray301[i][i_17_][i_19_ + 1] + i_21_, i_23_ + 128 - 1)) {
				return true;
			}
			return false;
		}
		for (int i_24_ = i_17_; i_24_ <= i_18_; i_24_++) {
			for (int i_25_ = i_19_; i_25_ <= i_20_; i_25_++) {
				if (Class92.anIntArrayArrayArray1573[i][i_24_][i_25_] == -Class73.anInt1321) {
					return false;
				}
			}
		}
		int i_26_ = (i_17_ << 7) + 1;
		int i_27_ = (i_19_ << 7) + 2;
		int i_28_ = Class17.anIntArrayArrayArray301[i][i_17_][i_19_] + i_21_;
		if (!Class23_Sub13_Sub23.method846(i_26_, i_28_, i_27_)) {
			return false;
		}
		int i_29_ = (i_18_ << 7) - 1;
		if (!Class23_Sub13_Sub23.method846(i_29_, i_28_, i_27_)) {
			return false;
		}
		int i_30_ = (i_20_ << 7) - 1;
		if (!Class23_Sub13_Sub23.method846(i_26_, i_28_, i_30_)) {
			return false;
		}
		if (!Class23_Sub13_Sub23.method846(i_29_, i_28_, i_30_)) {
			return false;
		}
		return true;
	}
	
	private final void method328(int i, int i_31_, int i_32_) {
		anInt3142++;
		int i_33_ = Class61.anIntArray967[i_31_];
		int i_34_ = Class23_Sub13_Sub16.anIntArray4049[i_32_];
		float f = (float) Math.atan2((double) (-2048 + i_33_), (double) (-2048 + i_34_));
		if (!((double) f >= -3.141592653589793) || !((double) f <= -2.356194490192345)) {
			if (!((double) f <= -1.5707963267948966) || !((double) f >= -2.356194490192345)) {
				if (!((double) f <= -0.7853981633974483) || !((double) f >= -1.5707963267948966)) {
					if (f <= 0.0F && (double) f >= -0.7853981633974483) {
						Class29.anInt463 = Class102.anInt1706 + -i_32_;
						Class63.anInt985 = i_31_;
					} else if (f >= 0.0F && (double) f <= 0.7853981633974483) {
						Class29.anInt463 = -i_32_ + Class102.anInt1706;
						Class63.anInt985 = Class23_Sub4_Sub33.anInt3428 + -i_31_;
					} else if ((double) f >= 0.7853981633974483 && (double) f <= 1.5707963267948966) {
						Class63.anInt985 = Class23_Sub4_Sub33.anInt3428 - i_32_;
						Class29.anInt463 = -i_31_ + Class102.anInt1706;
					} else if (!((double) f >= 1.5707963267948966) || !((double) f <= 2.356194490192345)) {
						if ((double) f >= 2.356194490192345 && (double) f <= 3.141592653589793) {
							Class29.anInt463 = i_32_;
							Class63.anInt985 = Class23_Sub4_Sub33.anInt3428 + -i_31_;
						}
					} else {
						Class29.anInt463 = -i_31_ + Class102.anInt1706;
						Class63.anInt985 = i_32_;
					}
				} else {
					Class29.anInt463 = i_31_;
					Class63.anInt985 = -i_32_ + Class23_Sub4_Sub33.anInt3428;
				}
			} else {
				Class29.anInt463 = i_31_;
				Class63.anInt985 = i_32_;
			}
		} else {
			Class29.anInt463 = i_32_;
			Class63.anInt985 = i_31_;
		}
		Class63.anInt985 &= Class95.anInt1611;
		Class29.anInt463 &= Class23_Sub4_Sub1.anInt2892;
		if (i > -19) {
			method327(72, -62, -93, -37, -13, -119);
		}
	}
	
	final int[] method260(int i, int i_35_) {
		if (i != 0) {
			return null;
		}
		anInt3147++;
		int[] is = aClass99_2115.method1500(i_35_, (byte) -125);
		if (aClass99_2115.aBoolean1681) {
			for (int i_36_ = 0; (i_36_ ^ 0xffffffff) > (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff); i_36_++) {
				method328(-127, i_36_, i_35_);
				int[] is_37_ = this.method261(Class29.anInt463, 0, (byte) 18);
				is[i_36_] = is_37_[Class63.anInt985];
			}
		}
		return is;
	}
	
	final void method255(Buffer class23_sub5, int i, int i_38_) {
		anInt3140++;
		if ((i ^ 0xffffffff) == -1) {
			aBoolean2117 = class23_sub5.readByte() == 1;
		}
		if (i_38_ != 1000) {
			method260(100, -76);
		}
	}
}
