/* Class27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class27
{
	static RSString aClass16_403;
	static int anInt404;
	static int anInt405;
	static int anInt406;
	static int anInt407;
	static int anInt408;
	static RSString aClass16_409 = Class38_Sub6.method1076((byte) 86, "Null");
	static int anInt410;
	static int anInt411;
	private Class23_Sub13 aClass23_Sub13_412 = new Class23_Sub13();
	static RSString aClass16_413 = Class38_Sub6.method1076((byte) 86, "(U1");
	static RSString aClass16_414;
	static int anInt415;
	static int anInt416;
	static long aLong417;
	static int anInt418;
	static int anInt419;
	static int[] anIntArray420 = new int[100];
	static long[] aLongArray421;
	static int anInt422;
	
	static final void method927(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		if (i_4_ != -2265) {
			aClass16_403 = null;
		}
		anInt410++;
		Class10[] class10s = Class23_Sub27.aClass10Array2488;
		for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > (class10s.length ^ 0xffffffff); i_6_++) {
			Class10 class10 = class10s[i_6_];
			if (class10 != null && class10.anInt203 == 2) {
				Class74.method1314(i_3_ >> 1, 2 * class10.anInt204, i_5_, class10.anInt210 + (class10.anInt211 + -Class42.anInt662 << 7), i, -16734, i_2_ >> 1, class10.anInt207 + (-Class58.anInt903 + class10.anInt212 << 7));
				if ((Class23_Sub4_Sub6.anInt2989 ^ 0xffffffff) < 0 && Class89.anInt1511 % 20 < 10) {
					Class23_Sub13_Sub4.aClass23_Sub13_Sub10Array3718[class10.anInt205].method694(Class23_Sub4_Sub6.anInt2989 + i_1_ + -12, i_0_ - (-Class97.anInt1645 - -28));
				}
			}
		}
	}
	
	static final void method928(byte b, Class38_Sub7 class38_sub7, int i) {
		anInt407++;
		if (b <= 5) {
			aLongArray421 = null;
		}
		if ((class38_sub7.anInt2684 ^ 0xffffffff) >= (Class89.anInt1511 ^ 0xffffffff)) {
			if (class38_sub7.anInt2716 >= Class89.anInt1511) {
				Class26.method926(class38_sub7, 106);
			} else {
				Class23_Sub13_Sub25.method855(2, class38_sub7);
			}
		} else {
			Class23_Sub4.method259(class38_sub7, (byte) 12);
		}
		if (class38_sub7.anInt2674 < 128 || class38_sub7.anInt2659 < 128 || class38_sub7.anInt2674 >= 13184 || class38_sub7.anInt2659 >= 13184) {
			class38_sub7.anInt2684 = 0;
			class38_sub7.anInt2674 = class38_sub7.anIntArray2663[0] * 128 + class38_sub7.anInt2668 * 64;
			class38_sub7.anInt2693 = -1;
			class38_sub7.anInt2710 = -1;
			class38_sub7.anInt2659 = class38_sub7.anIntArray2694[0] * 128 - -(class38_sub7.anInt2668 * 64);
			class38_sub7.anInt2716 = 0;
			class38_sub7.method1083(-84);
		}
		if (class38_sub7 == Class105.aClass38_Sub7_Sub2_1812 && (class38_sub7.anInt2674 < 1536 || class38_sub7.anInt2659 < 1536 || class38_sub7.anInt2674 >= 11776 || class38_sub7.anInt2659 >= 11776)) {
			class38_sub7.anInt2659 = class38_sub7.anInt2668 * 64 + 128 * class38_sub7.anIntArray2694[0];
			class38_sub7.anInt2674 = class38_sub7.anIntArray2663[0] * 128 - -(class38_sub7.anInt2668 * 64);
			class38_sub7.anInt2710 = -1;
			class38_sub7.anInt2716 = 0;
			class38_sub7.anInt2693 = -1;
			class38_sub7.anInt2684 = 0;
			class38_sub7.method1083(-82);
		}
		Class56.method1184((byte) -77, class38_sub7);
		Class105.method1538(1, class38_sub7);
	}
	
	static final void method929(Class72[] class72s, byte[] bs, int i, int i_7_, int i_8_, boolean bool, int i_9_, int i_10_) {
		anInt422++;
		int i_11_;
		if (bool) {
			i_11_ = 1;
		} else {
			i_11_ = 4;
		}
		if (!bool) {
			for (int i_12_ = 0; i_12_ < 4; i_12_++) {
				for (int i_13_ = 0; i_13_ < 64; i_13_++) {
					for (int i_14_ = 0; i_14_ < 64; i_14_++) {
						if (i_13_ + i_10_ > 0 && i_10_ - -i_13_ < 103 && (i_7_ - -i_14_ ^ 0xffffffff) < -1 && i_7_ - -i_14_ < 103) {
							class72s[i_12_].anIntArrayArray1290[i_13_ + i_10_][i_14_ + i_7_] = Class24.method919(class72s[i_12_].anIntArrayArray1290[i_13_ + i_10_][i_14_ + i_7_], -16777217);
						}
					}
				}
			}
		}
		if (i_8_ >= -123) {
			aLong417 = -119L;
		}
		Buffer class23_sub5 = new Buffer(bs);
		for (int i_15_ = 0; (i_11_ ^ 0xffffffff) < (i_15_ ^ 0xffffffff); i_15_++) {
			for (int i_16_ = 0; i_16_ < 64; i_16_++) {
				for (int i_17_ = 0; i_17_ < 64; i_17_++)
					Class72.method1301(i_17_ - -i_7_, class23_sub5, i_15_, i_16_ - -i_10_, bool, i_9_, (byte) -121, 0, i);
			}
		}
	}
	
	final Class23_Sub13 method930(int i) {
		if (i >= -84) {
			return null;
		}
		Class23_Sub13 class23_sub13 = aClass23_Sub13_412.aClass23_Sub13_2310;
		anInt406++;
		if (aClass23_Sub13_412 == class23_sub13) {
			return null;
		}
		class23_sub13.method601(false);
		return class23_sub13;
	}
	
	final void method931(Class23_Sub13 class23_sub13, byte b) {
		anInt419++;
		if (class23_sub13.aClass23_Sub13_2314 != null) {
			class23_sub13.method601(false);
		}
		class23_sub13.aClass23_Sub13_2314 = aClass23_Sub13_412.aClass23_Sub13_2314;
		class23_sub13.aClass23_Sub13_2310 = aClass23_Sub13_412;
		if (b >= 53) {
			class23_sub13.aClass23_Sub13_2314.aClass23_Sub13_2310 = class23_sub13;
			class23_sub13.aClass23_Sub13_2310.aClass23_Sub13_2314 = class23_sub13;
		}
	}
	
	static final void method932(int i, int i_18_, int i_19_, int i_20_) {
		anInt418++;
		if (Class17.method189(-10924, i_20_)) {
			int i_21_ = 72 % ((-54 - i_18_) / 51);
			Class23_Sub4_Sub31.method399(Class23_Sub4_Sub28.aClass64ArrayArray3350[i_20_], i_19_, i, -1, true);
		}
	}
	
	final Class23_Sub13 method933(int i) {
		anInt416++;
		if (i != 128) {
			return null;
		}
		Class23_Sub13 class23_sub13 = aClass23_Sub13_412.aClass23_Sub13_2310;
		if (aClass23_Sub13_412 == class23_sub13) {
			return null;
		}
		return class23_sub13;
	}
	
	final void method934(int i, Class23_Sub13 class23_sub13) {
		if (class23_sub13.aClass23_Sub13_2314 != null) {
			class23_sub13.method601(false);
		}
		class23_sub13.aClass23_Sub13_2310 = aClass23_Sub13_412.aClass23_Sub13_2310;
		if (i == 0) {
			anInt405++;
			class23_sub13.aClass23_Sub13_2314 = aClass23_Sub13_412;
			class23_sub13.aClass23_Sub13_2314.aClass23_Sub13_2310 = class23_sub13;
			class23_sub13.aClass23_Sub13_2310.aClass23_Sub13_2314 = class23_sub13;
		}
	}
	
	public static void method935(int i) {
		anIntArray420 = null;
		aClass16_409 = null;
		aClass16_413 = null;
		aClass16_414 = null;
		aLongArray421 = null;
		if (i == 0) {
			aClass16_403 = null;
		}
	}
	
	public Class27() {
		aClass23_Sub13_412.aClass23_Sub13_2314 = aClass23_Sub13_412;
		aClass23_Sub13_412.aClass23_Sub13_2310 = aClass23_Sub13_412;
	}
	
	static final int method936(boolean bool) {
		if (bool != true) {
			method929(null, null, -126, -113, 64, true, 49, -2);
		}
		anInt404++;
		return Class79.anInt1883;
	}
	
	static {
		aLong417 = 0L;
		aClass16_414 = Class38_Sub6.method1076((byte) 86, "(Z");
		aClass16_403 = Class38_Sub6.method1076((byte) 86, "::fpsoff");
		anInt415 = 500;
		aLongArray421 = new long[32];
	}
}
