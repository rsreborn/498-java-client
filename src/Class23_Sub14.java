/* Class23_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub14 extends Class23
{
	protected Class105_Sub1 aClass105_Sub1_2321;
	protected Class13 aClass13_2322;
	static int anInt2323;
	static int anInt2324;
	static Class81 aClass81_2325;
	static RSString aClass16_2326;
	static int anInt2327;
	static int anInt2328;
	private static RSString aClass16_2329 = Class38_Sub6.method1076((byte) 86, "Loading)3)3)3");
	protected int anInt2330;
	static int anInt2331;
	static Class23_Sub13_Sub10[] aClass23_Sub13_Sub10Array2332;
	protected byte[] aByteArray2333;
	static long[] aLongArray2334;
	static int[] anIntArray2335;
	static int anInt2336;
	static RSString[] aClass16Array2337;
	static int anInt2338;
	static RSString aClass16_2339;
	
	static final void method861(int i, int i_0_, int i_1_) {
		int[] is = new int[4];
		is[0] = i_1_;
		int i_2_ = 1;
		if (i_0_ >= -13) {
			aClass16Array2337 = null;
		}
		anInt2327++;
		int[] is_3_ = new int[4];
		is_3_[0] = i;
		for (int i_4_ = 0; i_4_ < 4; i_4_++) {
			if ((i_1_ ^ 0xffffffff) != (Class88.anIntArray1507[i_4_] ^ 0xffffffff)) {
				is[i_2_] = Class88.anIntArray1507[i_4_];
				is_3_[i_2_] = Class23_Sub20.anIntArray2401[i_4_];
				i_2_++;
			}
		}
		Class88.anIntArray1507 = is;
		Class23_Sub20.anIntArray2401 = is_3_;
		Class38_Sub6.method1080(0, 0, Class23_Sub13_Sub1.worldList, Class23_Sub13_Sub1.worldList.length - 1);
	}
	
	public static void method862(byte b) {
		aClass16_2329 = null;
		aClass23_Sub13_Sub10Array2332 = null;
		aClass81_2325 = null;
		aClass16_2326 = null;
		aClass16_2339 = null;
		anIntArray2335 = null;
		aLongArray2334 = null;
		if (b == -93) {
			aClass16Array2337 = null;
		}
	}
	
	static final void method863(int i, int i_5_, int i_6_, int i_7_, byte b, int i_8_) {
		anInt2328++;
		if (b != -88) {
			aClass16_2329 = null;
		}
		int i_9_ = -i + i_8_;
		int i_10_ = i_5_ - i_7_;
		if (i_9_ == 0) {
			if (i_10_ != 0) {
				ISAACCipher.method1264(i_6_, i_5_, i_7_, i, (byte) -119);
			}
		} else if (i_10_ == 0) {
			Class56.method1187(false, i_6_, i_8_, i, i_7_);
		} else {
			if ((i_9_ ^ 0xffffffff) > -1) {
				i_9_ = -i_9_;
			}
			if ((i_10_ ^ 0xffffffff) > -1) {
				i_10_ = -i_10_;
			}
			boolean bool = (i_9_ ^ 0xffffffff) > (i_10_ ^ 0xffffffff);
			if (bool) {
				int i_11_ = i;
				int i_12_ = i_8_;
				i_8_ = i_5_;
				i_5_ = i_12_;
				i = i_7_;
				i_7_ = i_11_;
			}
			if (i_8_ < i) {
				int i_13_ = i;
				i = i_8_;
				int i_14_ = i_7_;
				i_8_ = i_13_;
				i_7_ = i_5_;
				i_5_ = i_14_;
			}
			int i_15_ = i_7_;
			int i_16_ = i_8_ - i;
			int i_17_ = -i_7_ + i_5_;
			if ((i_17_ ^ 0xffffffff) > -1) {
				i_17_ = -i_17_;
			}
			int i_18_ = -(i_16_ >> 1);
			int i_19_ = i_7_ < i_5_ ? 1 : -1;
			if (bool) {
				for (int i_20_ = i; (i_8_ ^ 0xffffffff) <= (i_20_ ^ 0xffffffff); i_20_++) {
					Class4.anIntArrayArray98[i_20_][i_15_] = i_6_;
					i_18_ += i_17_;
					if (i_18_ > 0) {
						i_15_ += i_19_;
						i_18_ -= i_16_;
					}
				}
			} else {
				for (int i_21_ = i; i_8_ >= i_21_; i_21_++) {
					i_18_ += i_17_;
					Class4.anIntArrayArray98[i_15_][i_21_] = i_6_;
					if (i_18_ > 0) {
						i_15_ += i_19_;
						i_18_ -= i_16_;
					}
				}
			}
		}
	}
	
	static final void method864(int i, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_) {
		int i_28_ = -5 / ((i_23_ - 61) / 41);
		anInt2324++;
		int i_29_ = Class23_Sub4_Sub32.method405(57, Class88.anInt1503, i_24_, Class23_Sub4_Sub33.anInt3435);
		int i_30_ = Class23_Sub4_Sub32.method405(65, Class88.anInt1503, i_26_, Class23_Sub4_Sub33.anInt3435);
		int i_31_ = Class23_Sub4_Sub32.method405(60, Class23_Sub13_Sub6.anInt3728, i, Class35.anInt554);
		int i_32_ = Class23_Sub4_Sub32.method405(111, Class23_Sub13_Sub6.anInt3728, i_27_, Class35.anInt554);
		int i_33_ = Class23_Sub4_Sub32.method405(78, Class88.anInt1503, i_24_ - -i_25_, Class23_Sub4_Sub33.anInt3435);
		int i_34_ = Class23_Sub4_Sub32.method405(117, Class88.anInt1503, -i_25_ + i_26_, Class23_Sub4_Sub33.anInt3435);
		for (int i_35_ = i_29_; (i_35_ ^ 0xffffffff) > (i_33_ ^ 0xffffffff); i_35_++)
			Class23_Sub13_Sub6.method632(i_32_, (byte) -30, i_22_, Class4.anIntArrayArray98[i_35_], i_31_);
		for (int i_36_ = i_30_; i_34_ < i_36_; i_36_--)
			Class23_Sub13_Sub6.method632(i_32_, (byte) -30, i_22_, Class4.anIntArrayArray98[i_36_], i_31_);
		int i_37_ = Class23_Sub4_Sub32.method405(89, Class23_Sub13_Sub6.anInt3728, i_25_ + i, Class35.anInt554);
		int i_38_ = Class23_Sub4_Sub32.method405(67, Class23_Sub13_Sub6.anInt3728, i_27_ + -i_25_, Class35.anInt554);
		for (int i_39_ = i_33_; (i_34_ ^ 0xffffffff) <= (i_39_ ^ 0xffffffff); i_39_++) {
			int[] is = Class4.anIntArrayArray98[i_39_];
			Class23_Sub13_Sub6.method632(i_37_, (byte) -30, i_22_, is, i_31_);
			Class23_Sub13_Sub6.method632(i_32_, (byte) -30, i_22_, is, i_38_);
		}
	}
	
	static final void method865(Class13 class13, int i, int i_40_, Class105_Sub1 class105_sub1) {
		anInt2323++;
		byte[] bs = null;
		synchronized (Class23_Sub13_Sub15.aClass89_4018) {
			if (i <= 102) {
				method862((byte) 43);
			}
			for (Class23_Sub14 class23_sub14 = (Class23_Sub14) Class23_Sub13_Sub15.aClass89_4018.method1437(117); class23_sub14 != null; class23_sub14 = (Class23_Sub14) Class23_Sub13_Sub15.aClass89_4018.method1431((byte) -89)) {
				if (class23_sub14.aLong358 == (long) i_40_ && class23_sub14.aClass13_2322 == class13 && class23_sub14.anInt2330 == 0) {
					bs = class23_sub14.aByteArray2333;
					break;
				}
			}
		}
		if (bs != null) {
			class105_sub1.method1569(true, i_40_, class13, bs, -89);
		} else {
			byte[] bs_41_ = class13.method121((byte) -32, i_40_);
			class105_sub1.method1569(true, i_40_, class13, bs_41_, 73);
		}
	}
	
	static final int method866(int i, Class105 class105, Class105 class105_42_) {
		anInt2331++;
		int i_43_ = 0;
		if (class105_42_.method1549(-13114, Class23_Sub4_Sub10.anInt3060)) {
			i_43_++;
		}
		if (i != 27118) {
			method864(-86, 63, 42, -107, 1, -51, 52);
		}
		if (class105.method1549(-13114, anInt2338)) {
			i_43_++;
		}
		if (class105.method1549(-13114, Class23_Sub13_Sub1.anInt3672)) {
			i_43_++;
		}
		if (class105.method1549(-13114, Class23_Sub11.anInt2282)) {
			i_43_++;
		}
		if (class105.method1549(-13114, Class23_Sub10_Sub2.anInt3617)) {
			i_43_++;
		}
		if (class105.method1549(-13114, Class23_Sub20.anInt2398)) {
			i_43_++;
		}
		class105.method1549(i + -40232, Class23_Sub13_Sub1.anInt3671);
		class105.method1549(-13114, Class106.anInt1822);
		class105.method1549(-13114, Class39.anInt604);
		class105.method1549(-13114, Class71.anInt1275);
		class105.method1549(-13114, Class59.anInt935);
		return i_43_;
	}
	
	static {
		aClass16_2326 = aClass16_2329;
		aClass81_2325 = new Class81(30);
		anInt2336 = 3;
		aLongArray2334 = new long[32];
		anIntArray2335 = new int[5];
		aClass16Array2337 = new RSString[100];
		anInt2338 = -1;
		aClass16_2339 = Class38_Sub6.method1076((byte) 86, "Stufe)2");
	}
}
