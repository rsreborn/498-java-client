/* Class55 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class55
{
	static int[] anIntArray863;
	static RSString aClass16_864;
	static int[] anIntArray865;
	private static RSString aClass16_866 = Class38_Sub6.method1076((byte) 86, " from your friend list first)3");
	static int anInt867;
	static RSString aClass16_868;
	static RSString aClass16_869;
	static int[] anIntArray870;
	static Class5 aClass5_871;
	static int anInt872;
	static int anInt873;
	static int[] anIntArray874;
	static int anInt875;
	static int[] anIntArray876;
	static int[] anIntArray877;
	static int[] anIntArray878;
	static byte[][][] aByteArrayArrayArray879;
	static int[] anIntArray880;
	static RSString aClass16_881;
	static int[] anIntArray882;
	static int[] anIntArray883;
	static RSString[] aClass16Array884;
	static int[] anIntArray885;
	
	public static void method1179(int i) {
		anIntArray870 = null;
		aClass16Array884 = null;
		aClass16_881 = null;
		anIntArray863 = null;
		aClass16_868 = null;
		anIntArray877 = null;
		anIntArray874 = null;
		anIntArray865 = null;
		anIntArray885 = null;
		aClass16_869 = null;
		aClass5_871 = null;
		anIntArray883 = null;
		aByteArrayArrayArray879 = null;
		anIntArray880 = null;
		if (i != -24181) {
			anIntArray870 = null;
		}
		anIntArray882 = null;
		aClass16_866 = null;
		anIntArray876 = null;
		anIntArray878 = null;
		aClass16_864 = null;
	}
	
	static final void method1180(int i, int i_0_, int i_1_, int i_2_, int i_3_, byte b) {
		anInt867++;
		int i_4_ = i_0_ - i_2_;
		int i_5_ = i + -i_1_;
		if (i_4_ != 0) {
			if ((i_5_ ^ 0xffffffff) == -1) {
				Class23_Sub4_Sub30.method393(1, i_2_, i_1_, i_0_, i_3_);
				return;
			}
		} else {
			if (i_5_ != 0) {
				Class23_Sub13_Sub8_Sub1.method683(i_1_, i_3_, i, -1, i_2_);
			}
			return;
		}
		int i_6_ = (i_5_ << 12) / i_4_;
		int i_7_ = -(i_6_ * i_2_ >> 12) + i_1_;
		if (b >= 115) {
			int i_8_;
			int i_9_;
			if ((i_0_ ^ 0xffffffff) > (Class23_Sub13_Sub6.anInt3728 ^ 0xffffffff)) {
				i_8_ = Class23_Sub13_Sub6.anInt3728;
				i_9_ = (Class23_Sub13_Sub6.anInt3728 * i_6_ >> 12) + i_7_;
			} else if ((i_0_ ^ 0xffffffff) < (Class35.anInt554 ^ 0xffffffff)) {
				i_8_ = Class35.anInt554;
				i_9_ = (i_6_ * Class35.anInt554 >> 12) + i_7_;
			} else {
				i_8_ = i_0_;
				i_9_ = i;
			}
			int i_10_;
			int i_11_;
			if ((Class23_Sub13_Sub6.anInt3728 ^ 0xffffffff) >= (i_2_ ^ 0xffffffff)) {
				if (Class35.anInt554 < i_2_) {
					i_10_ = Class35.anInt554;
					i_11_ = i_7_ - -(i_6_ * Class35.anInt554 >> 12);
				} else {
					i_10_ = i_2_;
					i_11_ = i_1_;
				}
			} else {
				i_10_ = Class23_Sub13_Sub6.anInt3728;
				i_11_ = i_7_ - -(i_6_ * Class23_Sub13_Sub6.anInt3728 >> 12);
			}
			if ((Class88.anInt1503 ^ 0xffffffff) >= (i_11_ ^ 0xffffffff)) {
				if ((i_11_ ^ 0xffffffff) < (Class23_Sub4_Sub33.anInt3435 ^ 0xffffffff)) {
					i_10_ = (Class23_Sub4_Sub33.anInt3435 - i_7_ << 12) / i_6_;
					i_11_ = Class23_Sub4_Sub33.anInt3435;
				}
			} else {
				i_11_ = Class88.anInt1503;
				i_10_ = (-i_7_ + Class88.anInt1503 << 12) / i_6_;
			}
			if (Class88.anInt1503 <= i_9_) {
				if (Class23_Sub4_Sub33.anInt3435 < i_9_) {
					i_8_ = (-i_7_ + Class23_Sub4_Sub33.anInt3435 << 12) / i_6_;
					i_9_ = Class23_Sub4_Sub33.anInt3435;
				}
			} else {
				i_8_ = (-i_7_ + Class88.anInt1503 << 12) / i_6_;
				i_9_ = Class88.anInt1503;
			}
			Class23_Sub14.method863(i_10_, i_9_, i_3_, i_11_, (byte) -88, i_8_);
		}
	}
	
	static final int method1181(byte b, int i, int i_12_, int i_13_) {
		anInt872++;
		i_13_ &= 0x3;
		if ((i_13_ ^ 0xffffffff) == -1) {
			return i;
		}
		int i_14_ = 33 % ((37 - b) / 55);
		if (i_13_ == 1) {
			return i_12_;
		}
		if (i_13_ == 2) {
			return -i + 7;
		}
		return 7 - i_12_;
	}
	
	static {
		anIntArray865 = new int[100];
		aClass16_868 = Class38_Sub6.method1076((byte) 86, "k");
		aClass16_869 = Class38_Sub6.method1076((byte) 86, "Verbindung mit Update)2Server)3)3)3");
		aClass16_864 = aClass16_866;
		anIntArray863 = new int[] { 0, 1, 0, 0, 0, 0, 7, -2, 0, 0, -1, -1, 0, 6, 0, 0, 7, 0, 0, 5, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 20, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, -2, 0, -2, 0, 0, 0, 0, 0, -2, 0, 4, 0, 0, 0, 8, 0, 0, 6, 0, 0, 0, 0, 0, 0, 14, 3, 10, 2, 0, 0, 0, -2, 2, 0, 0, 0, 0, -2, 0, -1, -1, 0, -1, 0, 0, 0, 4, 0, 0, -2, 0, 0, 0, 5, -2, 0, 0, 6, 0, 0, 3, 0, 10, 0, -1, 0, 0, 0, 2, 0, 0, 5, 4, 0, 6, 15, 4, 0, 0, 0, -1, 0, 5, 6, 3, 0, 0, 1, 5, 2, 0, 0, 0, 0, 0, 0, 8, 4, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 4, 0, 0, 0, 0, 0, 0, 4, 10, 0, 0, 0, 2, 0, 2, 0, 0, -2, 12, 0, 0, 0, 9, -1, 0, 0, 0, 0, 15, 0, 0, -1, -1, 0, 0, 0, 0, 6, 7, 0, 0, 0, 8, 8, 0, 1, 0, 0, 0, 0, 0, 24, 5, -1, 6, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 6, 0, 0, 4, 7, 6, 0, -1, 2, 0, 0, 0, 0, 5, 6, 0, 0, 0, 0, 0, 0, 3, -1, 6, 0, 6, 0, 0, 0, 0, 0 };
		aClass5_871 = new Class5(64);
		anInt875 = 50;
		anIntArray876 = new int[anInt875];
		anIntArray877 = new int[anInt875];
		anIntArray882 = new int[anInt875];
		anIntArray874 = new int[] { 0, -1, 0, 1 };
		aClass16_881 = Class38_Sub6.method1076((byte) 86, "Fps:");
		anIntArray885 = new int[anInt875];
		anIntArray878 = new int[anInt875];
		anIntArray880 = new int[anInt875];
		anIntArray883 = new int[anInt875];
		aClass16Array884 = new RSString[anInt875];
	}
}
