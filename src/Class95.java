/* Class95 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class95
{
	static int anInt1611;
	static int anInt1612;
	static byte aByte1613;
	static int anInt1614;
	static Class105 aClass105_1615;
	static int anInt1616;
	static int anInt1617 = 0;
	static Class105 aClass105_1618;
	static int anInt1619;
	static RSString aClass16_1620;
	static RSString aClass16_1621;
	
	static final void method1467(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		int i_7_ = 0;
		anInt1614++;
		int i_8_ = i_0_;
		int i_9_ = -i_6_ + i_2_;
		if (i_4_ != -13805) {
			anInt1611 = 62;
		}
		int i_10_ = -i_6_ + i_0_;
		int i_11_ = i_2_ * i_2_;
		int i_12_ = 0;
		int i_13_ = i_9_ * i_9_;
		int i_14_ = i_0_ * i_0_;
		int i_15_ = i_10_ * i_10_;
		int i_16_ = i_14_ << 1;
		int i_17_ = i_11_ << 1;
		int i_18_ = i_15_ << 1;
		int i_19_ = i_0_ << 1;
		int i_20_ = i_13_ << 1;
		int i_21_ = i_14_ - (-1 + i_19_) * i_17_;
		int i_22_ = i_10_ << 1;
		int i_23_ = i_11_ * (-i_19_ + 1) + i_16_;
		int i_24_ = i_18_ + i_13_ * (1 + -i_22_);
		int i_25_ = i_15_ + -((-1 + i_22_) * i_20_);
		int i_26_ = i_11_ << 2;
		int i_27_ = i_14_ << 2;
		int i_28_ = i_13_ << 2;
		int i_29_ = i_16_ * 3;
		int i_30_ = i_15_ << 2;
		int i_31_ = (i_19_ - 3) * i_17_;
		int i_32_ = i_18_ * 3;
		int i_33_ = i_27_;
		int i_34_ = i_20_ * (i_22_ - 3);
		int i_35_ = i_26_ * (-1 + i_0_);
		int i_36_ = (i_10_ + -1) * i_28_;
		int i_37_ = i_30_;
		if (i >= Class88.anInt1503 && (Class23_Sub4_Sub33.anInt3435 ^ 0xffffffff) <= (i ^ 0xffffffff)) {
			int[] is = Class4.anIntArrayArray98[i];
			int i_38_ = Class23_Sub4_Sub32.method405(94, Class23_Sub13_Sub6.anInt3728, -i_2_ + i_5_, Class35.anInt554);
			int i_39_ = Class23_Sub4_Sub32.method405(i_4_ + 13856, Class23_Sub13_Sub6.anInt3728, i_2_ + i_5_, Class35.anInt554);
			int i_40_ = Class23_Sub4_Sub32.method405(69, Class23_Sub13_Sub6.anInt3728, -i_9_ + i_5_, Class35.anInt554);
			int i_41_ = Class23_Sub4_Sub32.method405(117, Class23_Sub13_Sub6.anInt3728, i_5_ + i_9_, Class35.anInt554);
			Class23_Sub13_Sub6.method632(i_40_, (byte) -30, i_3_, is, i_38_);
			Class23_Sub13_Sub6.method632(i_41_, (byte) -30, i_1_, is, i_40_);
			Class23_Sub13_Sub6.method632(i_39_, (byte) -30, i_3_, is, i_41_);
		}
		while ((i_8_ ^ 0xffffffff) < -1) {
			if ((i_23_ ^ 0xffffffff) > -1) {
				while (i_23_ < 0) {
					i_23_ += i_29_;
					i_21_ += i_33_;
					i_33_ += i_27_;
					i_7_++;
					i_29_ += i_27_;
				}
			}
			if ((i_21_ ^ 0xffffffff) > -1) {
				i_21_ += i_33_;
				i_33_ += i_27_;
				i_23_ += i_29_;
				i_7_++;
				i_29_ += i_27_;
			}
			i_21_ += -i_31_;
			i_23_ += -i_35_;
			boolean bool = (i_10_ ^ 0xffffffff) <= (i_8_ ^ 0xffffffff);
			i_8_--;
			i_35_ -= i_26_;
			int i_42_ = i - i_8_;
			i_31_ -= i_26_;
			if (bool) {
				if ((i_24_ ^ 0xffffffff) > -1) {
					while (i_24_ < 0) {
						i_12_++;
						i_24_ += i_32_;
						i_25_ += i_37_;
						i_32_ += i_30_;
						i_37_ += i_30_;
					}
				}
				if ((i_25_ ^ 0xffffffff) > -1) {
					i_12_++;
					i_25_ += i_37_;
					i_37_ += i_30_;
					i_24_ += i_32_;
					i_32_ += i_30_;
				}
				i_24_ += -i_36_;
				i_25_ += -i_34_;
				i_36_ -= i_28_;
				i_34_ -= i_28_;
			}
			int i_43_ = i_8_ + i;
			if ((Class88.anInt1503 ^ 0xffffffff) >= (i_43_ ^ 0xffffffff) && Class23_Sub4_Sub33.anInt3435 >= i_42_) {
				int i_44_ = Class23_Sub4_Sub32.method405(i_4_ ^ ~0x35d1, Class23_Sub13_Sub6.anInt3728, i_7_ + i_5_, Class35.anInt554);
				int i_45_ = Class23_Sub4_Sub32.method405(i_4_ + 13856, Class23_Sub13_Sub6.anInt3728, -i_7_ + i_5_, Class35.anInt554);
				if (!bool) {
					if ((Class88.anInt1503 ^ 0xffffffff) >= (i_42_ ^ 0xffffffff)) {
						Class23_Sub13_Sub6.method632(i_44_, (byte) -30, i_3_, Class4.anIntArrayArray98[i_42_], i_45_);
					}
					if ((Class23_Sub4_Sub33.anInt3435 ^ 0xffffffff) <= (i_43_ ^ 0xffffffff)) {
						Class23_Sub13_Sub6.method632(i_44_, (byte) -30, i_3_, Class4.anIntArrayArray98[i_43_], i_45_);
					}
				} else {
					int i_46_ = Class23_Sub4_Sub32.method405(i_4_ + 13921, Class23_Sub13_Sub6.anInt3728, i_12_ + i_5_, Class35.anInt554);
					int i_47_ = Class23_Sub4_Sub32.method405(75, Class23_Sub13_Sub6.anInt3728, -i_12_ + i_5_, Class35.anInt554);
					if ((Class88.anInt1503 ^ 0xffffffff) >= (i_42_ ^ 0xffffffff)) {
						int[] is = Class4.anIntArrayArray98[i_42_];
						Class23_Sub13_Sub6.method632(i_47_, (byte) -30, i_3_, is, i_45_);
						Class23_Sub13_Sub6.method632(i_46_, (byte) -30, i_1_, is, i_47_);
						Class23_Sub13_Sub6.method632(i_44_, (byte) -30, i_3_, is, i_46_);
					}
					if (i_43_ <= Class23_Sub4_Sub33.anInt3435) {
						int[] is = Class4.anIntArrayArray98[i_43_];
						Class23_Sub13_Sub6.method632(i_47_, (byte) -30, i_3_, is, i_45_);
						Class23_Sub13_Sub6.method632(i_46_, (byte) -30, i_1_, is, i_47_);
						Class23_Sub13_Sub6.method632(i_44_, (byte) -30, i_3_, is, i_46_);
					}
				}
			}
		}
	}
	
	static final void method1468(int i, int i_48_, RSString class16, RSString class16_49_) {
		anInt1616++;
		Class89.method1433(i, i_48_, class16, null, class16_49_, (byte) -100);
	}
	
	public static void method1469(int i) {
		aClass16_1621 = null;
		aClass105_1615 = null;
		if (i == 586448449) {
			aClass16_1620 = null;
			aClass105_1618 = null;
		}
	}
	
	static final int method1470(byte b, int i) {
		int i_50_ = 2 / ((27 - b) / 54);
		anInt1619++;
		return (0xe8405 & i) >> 17;
	}
	
	static {
		aByte1613 = (byte) 0;
		aClass16_1620 = Class38_Sub6.method1076((byte) 86, "Bitte wenden Sie sich an den Kundendienst)3");
		anInt1612 = 0;
		aClass16_1621 = Class38_Sub6.method1076((byte) 86, "<col=ffff00>*V");
	}
}
