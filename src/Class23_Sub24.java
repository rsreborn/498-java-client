/* Class23_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub24 extends Class23
{
	static CacheFileChannel aClass29_2439;
	static Class34 aClass34_2440;
	static int[] anIntArray2441;
	static Class23_Sub1[][][] aClass23_Sub1ArrayArrayArray2442;
	static RSString aClass16_2443;
	protected int anInt2444;
	static Buffer aClass23_Sub5_2445;
	static boolean aBoolean2446 = true;
	static int anInt2447;
	static int anInt2448;
	static int anInt2449;
	static int anInt2450;
	static int anInt2451;
	protected int anInt2452;
	static int anInt2453;
	static int anInt2454;
	static int anInt2455;
	
	public static void method899(byte b) {
		aClass23_Sub5_2445 = null;
		aClass23_Sub1ArrayArrayArray2442 = null;
		anIntArray2441 = null;
		if (b < -44) {
			aClass34_2440 = null;
			aClass29_2439 = null;
			aClass16_2443 = null;
		}
	}
	
	static final RSString method900(byte b, Buffer class23_sub5) {
		if (b != -80) {
			method903(false, 29, 124, -84);
		}
		anInt2451++;
		return Class63.method1216(class23_sub5, (byte) -26, 32767);
	}
	
	static final void method901(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		anInt2455++;
		if (i_4_ != -4838) {
			aClass23_Sub5_2445 = null;
		}
		if ((i_0_ ^ 0xffffffff) == (i_1_ ^ 0xffffffff)) {
			Class106.method1578(i_0_, true, i_2_, i, i_3_);
		} else if ((-i_0_ + i ^ 0xffffffff) <= (Class23_Sub13_Sub6.anInt3728 ^ 0xffffffff) && (i - -i_0_ ^ 0xffffffff) >= (Class35.anInt554 ^ 0xffffffff) && (-i_1_ + i_3_ ^ 0xffffffff) <= (Class88.anInt1503 ^ 0xffffffff) && (Class23_Sub4_Sub33.anInt3435 ^ 0xffffffff) <= (i_1_ + i_3_ ^ 0xffffffff)) {
			Class46.method1138(i_2_, i_3_, (byte) 58, i_1_, i_0_, i);
		} else {
			Class56.method1185(i_3_, i_1_, i_2_, i, 3, i_0_);
		}
	}
	
	static final void method902(int i, int i_5_, int i_6_, int i_7_, int i_8_) {
		if (i_8_ != -10) {
			method903(false, -8, 101, -80);
		}
		Class35.anInt554 = i;
		anInt2449++;
		Class23_Sub13_Sub6.anInt3728 = i_5_;
		Class88.anInt1503 = i_7_;
		Class23_Sub4_Sub33.anInt3435 = i_6_;
	}
	
	static final RSString method903(boolean bool, int i, int i_9_, int i_10_) {
		anInt2447++;
		if (i < 2 || i > 36) {
			throw new IllegalArgumentException("Invalid radix:" + i);
		}
		int i_11_ = i_10_ / i;
		int i_12_ = 1;
		for (/**/; i_11_ != 0; i_11_ /= i)
			i_12_++;
		if (i_9_ != -23328) {
			aClass23_Sub5_2445 = null;
		}
		int i_13_ = i_12_;
		if (i_10_ < 0 || bool) {
			i_13_++;
		}
		byte[] bs = new byte[i_13_];
		if ((i_10_ ^ 0xffffffff) <= -1) {
			if (bool) {
				bs[0] = (byte) 43;
			}
		} else {
			bs[0] = (byte) 45;
		}
		for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff); i_14_++) {
			int i_15_ = i_10_ % i;
			if (i_15_ < 0) {
				i_15_ = -i_15_;
			}
			if (i_15_ > 9) {
				i_15_ += 39;
			}
			i_10_ /= i;
			bs[-1 + i_13_ + -i_14_] = (byte) (48 + i_15_);
		}
		RSString class16 = new RSString();
		class16.anInt1896 = i_13_;
		class16.aByteArray1906 = bs;
		return class16;
	}
	
	Class23_Sub24(int i, int i_16_) {
		anInt2452 = i;
		anInt2444 = i_16_;
	}
	
	static final byte[] method904(byte[] bs, byte b) {
		anInt2454++;
		int i = bs.length;
		if (b != 118) {
			method905(-112, (byte) -109);
		}
		byte[] bs_17_ = new byte[i];
		Class3.method56(bs, 0, bs_17_, 0, i);
		return bs_17_;
	}
	
	static final Class64 method905(int i, byte b) {
		anInt2450++;
		if (b != 111) {
			aClass23_Sub5_2445 = null;
		}
		int i_18_ = 0xffff & i;
		int i_19_ = i >> 16;
		if (Class23_Sub4_Sub28.aClass64ArrayArray3350[i_19_] == null || Class23_Sub4_Sub28.aClass64ArrayArray3350[i_19_][i_18_] == null) {
			boolean bool = Class17.method189(-10924, i_19_);
			if (!bool) {
				return null;
			}
		}
		return Class23_Sub4_Sub28.aClass64ArrayArray3350[i_19_][i_18_];
	}
	
	static {
		anIntArray2441 = new int[] { 1, 0, -1, 0 };
		aClass16_2443 = Class38_Sub6.method1076((byte) 86, "Hier wechseln");
		aClass23_Sub5_2445 = new Buffer(new byte[5000]);
	}
}
