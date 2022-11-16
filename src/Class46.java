/* Class46 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class46
{
	protected Class38 aClass38_702;
	protected int anInt703;
	protected Class38 aClass38_704;
	protected int anInt705;
	protected int anInt706;
	static RSString aClass16_707;
	static int anInt708 = 0;
	protected int anInt709;
	static int anInt710;
	protected long aLong711;
	static Class42 aClass42_712;
	static RSString[] aClass16Array713;
	static RSString aClass16_714 = Class38_Sub6.method1076((byte) 86, "::");
	static int anInt715;
	static int anInt716;
	static int anInt717;
	protected Class38 aClass38_718;
	private static RSString aClass16_719 = Class38_Sub6.method1076((byte) 86, "OFF");
	
	static final void method1138(int i, int i_0_, byte b, int i_1_, int i_2_, int i_3_) {
		Class23_Sub13_Sub6.method632(i_2_ + i_3_, (byte) -30, i, Class4.anIntArrayArray98[i_0_], i_3_ - i_2_);
		anInt710++;
		if (b != 58) {
			anInt715 = -26;
		}
		int i_4_ = i_1_;
		int i_5_ = i_2_ * i_2_;
		int i_6_ = 0;
		int i_7_ = i_1_ * i_1_;
		int i_8_ = i_7_ << 1;
		int i_9_ = i_1_ << 1;
		int i_10_ = i_5_ << 1;
		int i_11_ = i_7_ << 2;
		int i_12_ = i_7_ + -(i_10_ * (-1 + i_9_));
		int i_13_ = i_5_ * (1 - i_9_) - -i_8_;
		int i_14_ = ((i_4_ << 1) + -3) * i_10_;
		int i_15_ = i_5_ << 2;
		int i_16_ = (3 + (i_6_ << 1)) * i_8_;
		int i_17_ = i_15_ * (i_4_ - 1);
		int i_18_ = i_11_ * (i_6_ + 1);
		while (i_4_ > 0) {
			i_4_--;
			if ((i_13_ ^ 0xffffffff) > -1) {
				while (i_13_ < 0) {
					i_13_ += i_16_;
					i_12_ += i_18_;
					i_18_ += i_11_;
					i_16_ += i_11_;
					i_6_++;
				}
			}
			int i_19_ = -i_4_ + i_0_;
			int i_20_ = i_4_ + i_0_;
			if ((i_12_ ^ 0xffffffff) > -1) {
				i_12_ += i_18_;
				i_18_ += i_11_;
				i_13_ += i_16_;
				i_6_++;
				i_16_ += i_11_;
			}
			i_13_ += -i_17_;
			i_17_ -= i_15_;
			i_12_ += -i_14_;
			int i_21_ = i_3_ - i_6_;
			i_14_ -= i_15_;
			int i_22_ = i_3_ - -i_6_;
			Class23_Sub13_Sub6.method632(i_22_, (byte) -30, i, Class4.anIntArrayArray98[i_19_], i_21_);
			Class23_Sub13_Sub6.method632(i_22_, (byte) -30, i, Class4.anIntArrayArray98[i_20_], i_21_);
		}
	}
	
	static final RSString method1139(byte[] bs, int i, int i_23_, int i_24_) {
		anInt716++;
		RSString class16 = new RSString();
		class16.aByteArray1906 = new byte[i_23_];
		class16.anInt1896 = i;
		for (int i_25_ = i_24_; (i_25_ ^ 0xffffffff) > (i_23_ + i_24_ ^ 0xffffffff); i_25_++) {
			if (bs[i_25_] != 0) {
				class16.aByteArray1906[class16.anInt1896++] = bs[i_25_];
			}
		}
		return class16;
	}
	
	public static void method1140(byte b) {
		aClass16_719 = null;
		aClass16_714 = null;
		if (b != 39) {
			method1141((byte) 23, null);
		}
		aClass16_707 = null;
		aClass16Array713 = null;
		aClass42_712 = null;
	}
	
	static final void method1141(byte b, Class64 class64) {
		anInt717++;
		int i = class64.anInt1149;
		if (i == 324) {
			if (Class4.anInt88 == -1) {
				Class4.anInt88 = class64.anInt1072;
				Class71_Sub1_Sub1.anInt4457 = class64.anInt1089;
			}
			if (Class82.aClass51_1440.aBoolean797) {
				class64.anInt1072 = Class4.anInt88;
			} else {
				class64.anInt1072 = Class71_Sub1_Sub1.anInt4457;
			}
		} else {
			if (b < 14) {
				method1138(105, 85, (byte) -109, 124, 48, 3);
			}
			if (i == 325) {
				if ((Class4.anInt88 ^ 0xffffffff) == 0) {
					Class4.anInt88 = class64.anInt1072;
					Class71_Sub1_Sub1.anInt4457 = class64.anInt1089;
				}
				if (!Class82.aClass51_1440.aBoolean797) {
					class64.anInt1072 = Class4.anInt88;
				} else {
					class64.anInt1072 = Class71_Sub1_Sub1.anInt4457;
				}
			} else if (i == 327) {
				class64.anInt1107 = 150;
				class64.anInt1110 = (int) (256.0 * Math.sin((double) Class89.anInt1511 / 40.0)) & 0x7ff;
				class64.anInt1091 = -1;
				class64.anInt1111 = 5;
			} else if (i == 328) {
				if (Class105.aClass38_Sub7_Sub2_1812.aClass16_4389 == null) {
					class64.anInt1091 = 0;
				} else {
					class64.anInt1107 = 150;
					class64.anInt1110 = 0x7ff & (int) (Math.sin((double) Class89.anInt1511 / 40.0) * 256.0);
					class64.anInt1111 = 5;
					class64.anInt1091 = ((int) Class105.aClass38_Sub7_Sub2_1812.aClass16_4389.method184(-48) << 11) - -2047;
					class64.anInt1006 = Class105.aClass38_Sub7_Sub2_1812.anInt2634;
					class64.anInt1100 = Class105.aClass38_Sub7_Sub2_1812.anInt2642;
				}
			}
		}
	}
	
	Class46() {
		/* empty */
	}
	
	static {
		aClass16_707 = aClass16_719;
	}
}
