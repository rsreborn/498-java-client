/* Class17_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class17_Sub1 extends Class17
{
	static int anInt1988 = 0;
	static int anInt1989;
	static int anInt1990;
	private int anInt1991;
	static int anInt1992;
	static int anInt1993;
	private long aLong1994;
	private int anInt1995;
	static Class89 aClass89_1996 = new Class89();
	private int anInt1997;
	private int anInt1998;
	static Class89 aClass89_1999;
	private long[] aLongArray2000 = new long[10];
	static int[] anIntArray2001 = new int[128];
	static int anInt2002;
	static boolean aBoolean2003;
	
	public static void method191(byte b) {
		aClass89_1999 = null;
		if (b > -10) {
			method191((byte) -27);
		}
		aClass89_1996 = null;
		anIntArray2001 = null;
	}
	
	static final int method192(int i, int i_0_, Class64 class64) {
		anInt1990++;
		if (class64.anIntArrayArray1058 == null || i_0_ >= class64.anIntArrayArray1058.length) {
			return -2;
		}
		try {
			if (i != -26) {
				aClass89_1999 = null;
			}
			int i_1_ = 0;
			int[] is = class64.anIntArrayArray1058[i_0_];
			int i_2_ = 0;
			int i_3_ = 0;
			for (;;) {
				int i_4_ = is[i_3_++];
				int i_5_ = 0;
				int i_6_ = 0;
				if ((i_4_ ^ 0xffffffff) == -1) {
					return i_1_;
				}
				if (i_4_ == 1) {
					i_5_ = Class105_Sub1.anIntArray2871[is[i_3_++]];
				}
				if (i_4_ == 2) {
					i_5_ = Class23_Sub27.anIntArray2482[is[i_3_++]];
				}
				if (i_4_ == 3) {
					i_5_ = Class51.anIntArray800[is[i_3_++]];
				}
				if (i_4_ == 4) {
					int i_7_ = is[i_3_++] << 16;
					i_7_ += is[i_3_++];
					Class64 class64_8_ = Class23_Sub24.method905(i_7_, (byte) 111);
					int i_9_ = is[i_3_++];
					if (i_9_ != -1 && (!Class23_Sub13_Sub24.method853(-36, i_9_).aBoolean3908 || Class75.aBoolean1378)) {
						for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > (class64_8_.anIntArray1028.length ^ 0xffffffff); i_10_++) {
							if (1 + i_9_ == class64_8_.anIntArray1028[i_10_]) {
								i_5_ += class64_8_.anIntArray1147[i_10_];
							}
						}
					}
				}
				if (i_4_ == 15) {
					i_6_ = 1;
				}
				if (i_4_ == 5) {
					i_5_ = Class23_Sub4_Sub26.anIntArray3323[is[i_3_++]];
				}
				if (i_4_ == 16) {
					i_6_ = 2;
				}
				if (i_4_ == 6) {
					i_5_ = Class36.anIntArray567[Class23_Sub27.anIntArray2482[is[i_3_++]] + -1];
				}
				if (i_4_ == 17) {
					i_6_ = 3;
				}
				if (i_4_ == 7) {
					i_5_ = 100 * Class23_Sub4_Sub26.anIntArray3323[is[i_3_++]] / 46875;
				}
				if (i_4_ == 8) {
					i_5_ = Class105.aClass38_Sub7_Sub2_1812.anInt4383;
				}
				if (i_4_ == 9) {
					for (int i_11_ = 0; i_11_ < 25; i_11_++) {
						if (Class24.aBooleanArray376[i_11_]) {
							i_5_ += Class23_Sub27.anIntArray2482[i_11_];
						}
					}
				}
				if (i_4_ == 10) {
					int i_12_ = is[i_3_++] << 16;
					i_12_ += is[i_3_++];
					Class64 class64_13_ = Class23_Sub24.method905(i_12_, (byte) 111);
					int i_14_ = is[i_3_++];
					if ((i_14_ ^ 0xffffffff) != 0 && (!Class23_Sub13_Sub24.method853(i + -12, i_14_).aBoolean3908 || Class75.aBoolean1378)) {
						for (int i_15_ = 0; i_15_ < class64_13_.anIntArray1028.length; i_15_++) {
							if ((class64_13_.anIntArray1028[i_15_] ^ 0xffffffff) == (1 + i_14_ ^ 0xffffffff)) {
								i_5_ = 999999999;
								break;
							}
						}
					}
				}
				if (i_4_ == 11) {
					i_5_ = Class23_Sub13_Sub17.anInt4071;
				}
				if (i_4_ == 12) {
					i_5_ = Class36.anInt569;
				}
				if (i_4_ == 13) {
					int i_16_ = Class23_Sub4_Sub26.anIntArray3323[is[i_3_++]];
					int i_17_ = is[i_3_++];
					i_5_ = (1 << i_17_ & i_16_ ^ 0xffffffff) == -1 ? 0 : 1;
				}
				if (i_4_ == 14) {
					int i_18_ = is[i_3_++];
					i_5_ = Class103.method1517(-84, i_18_);
				}
				if (i_4_ == 18) {
					i_5_ = Class42.anInt662 + (Class105.aClass38_Sub7_Sub2_1812.anInt2674 >> 7);
				}
				if (i_4_ == 19) {
					i_5_ = Class58.anInt903 + (Class105.aClass38_Sub7_Sub2_1812.anInt2659 >> 7);
				}
				if (i_4_ == 20) {
					i_5_ = is[i_3_++];
				}
				if ((i_6_ ^ 0xffffffff) != -1) {
					i_2_ = i_6_;
				} else {
					if ((i_2_ ^ 0xffffffff) == -1) {
						i_1_ += i_5_;
					}
					if (i_2_ == 1) {
						i_1_ -= i_5_;
					}
					if (i_2_ == 2 && (i_5_ ^ 0xffffffff) != -1) {
						i_1_ /= i_5_;
					}
					if (i_2_ == 3) {
						i_1_ *= i_5_;
					}
					i_2_ = 0;
				}
			}
		} catch (Exception exception) {
			return -1;
		}
	}
	
	final int method186(int i, byte b, int i_19_) {
		anInt1993++;
		int i_20_ = anInt1998;
		anInt1998 = 300;
		int i_21_ = anInt1991;
		int i_22_ = 48 / ((-49 - b) / 45);
		anInt1991 = 1;
		aLong1994 = Class94.method1466(22624);
		if (aLongArray2000[anInt1995] != 0L) {
			if ((aLongArray2000[anInt1995] ^ 0xffffffffffffffffL) > (aLong1994 ^ 0xffffffffffffffffL)) {
				anInt1998 = (int) ((long) (i * 2560) / (-aLongArray2000[anInt1995] + aLong1994));
			}
		} else {
			anInt1998 = i_20_;
			anInt1991 = i_21_;
		}
		if (anInt1998 < 25) {
			anInt1998 = 25;
		}
		if (anInt1998 > 256) {
			anInt1998 = 256;
			anInt1991 = (int) (-((-aLongArray2000[anInt1995] + aLong1994) / 10L) + (long) i);
		}
		if ((anInt1991 ^ 0xffffffff) < (i ^ 0xffffffff)) {
			anInt1991 = i;
		}
		aLongArray2000[anInt1995] = aLong1994;
		anInt1995 = (anInt1995 - -1) % 10;
		if (anInt1991 > 1) {
			for (int i_23_ = 0; i_23_ < 10; i_23_++) {
				if ((aLongArray2000[i_23_] ^ 0xffffffffffffffffL) != -1L) {
					aLongArray2000[i_23_] = (long) anInt1991 + aLongArray2000[i_23_];
				}
			}
		}
		if (i_19_ > anInt1991) {
			anInt1991 = i_19_;
		}
		Class105.method1545((byte) -80, (long) anInt1991);
		int i_24_ = 0;
		for (/**/; anInt1997 < 256; anInt1997 += anInt1998)
			i_24_++;
		anInt1997 &= 0xff;
		return i_24_;
	}
	
	Class17_Sub1() {
		anInt1998 = 256;
		anInt1997 = 0;
		anInt1991 = 1;
		aLong1994 = Class94.method1466(22624);
		for (int i = 0; i < 10; i++)
			aLongArray2000[i] = aLong1994;
	}
	
	final void method188(int i) {
		anInt1992++;
		int i_25_ = 30 / ((i - -80) / 35);
		for (int i_26_ = 0; i_26_ < 10; i_26_++)
			aLongArray2000[i_26_] = 0L;
	}
	
	static {
		aClass89_1999 = new Class89();
		anInt2002 = 0;
		aBoolean2003 = false;
	}
}
