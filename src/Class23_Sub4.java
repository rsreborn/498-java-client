/* Class23_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class23_Sub4 extends Class23
{
	static int anInt2103;
	static int anInt2104;
	static RSString aClass16_2105 = Class38_Sub6.method1076((byte) 86, "welle2:");
	static int anInt2106;
	static int anInt2107;
	protected Class103 aClass103_2108;
	static int anInt2109;
	static long[] aLongArray2110;
	static int anInt2111;
	static int anInt2112;
	static int anInt2113;
	static int[] anIntArray2114 = { -1, -1, 1, 1 };
	protected Class99 aClass99_2115;
	static int anInt2116;
	protected boolean aBoolean2117;
	protected int anInt2118;
	static int anInt2119;
	protected Class23_Sub4[] aClass23_Sub4Array2120;
	static int anInt2121;
	static int anInt2122;
	static int anInt2123;
	static int anInt2124;
	static int anInt2125;
	
	final void method253(int i, int i_0_, int i_1_) {
		int i_2_ = anInt2118 == 255 ? i : anInt2118;
		if (i_1_ != -21809) {
			method261(63, 69, (byte) 5);
		}
		if (aBoolean2117) {
			aClass99_2115 = new Class99(i_2_, i, i_0_);
		} else {
			aClass103_2108 = new Class103(i_2_, i, i_0_);
		}
		anInt2124++;
	}
	
	void method254(int i) {
		if (aBoolean2117) {
			aClass99_2115.method1495((byte) -13);
			aClass99_2115 = null;
		} else {
			aClass103_2108.method1519(-89);
			aClass103_2108 = null;
		}
		anInt2125++;
		if (i != -1339) {
			method264((byte) -128);
		}
	}
	
	void method255(Buffer class23_sub5, int i, int i_3_) {
		anInt2116++;
		if (i_3_ != 1000) {
			anInt2103 = -119;
		}
	}
	
	final int[][] method256(int i, byte b, int i_4_) {
		if (b >= -57) {
			aClass103_2108 = null;
		}
		anInt2112++;
		if (!aClass23_Sub4Array2120[i].aBoolean2117) {
			return aClass23_Sub4Array2120[i].method258(i_4_, (byte) 9);
		}
		int[][] is = new int[3][];
		int[] is_5_ = aClass23_Sub4Array2120[i].method260(0, i_4_);
		is[0] = is_5_;
		is[2] = is_5_;
		is[1] = is_5_;
		return is;
	}
	
	public static void method257(boolean bool) {
		aClass16_2105 = null;
		if (bool != true) {
			method259(null, (byte) 99);
		}
		aLongArray2110 = null;
		anIntArray2114 = null;
	}
	
	int[][] method258(int i, byte b) {
		anInt2111++;
		if (b != 9) {
			aClass103_2108 = null;
		}
		throw new IllegalStateException("This operation does not have a colour output");
	}
	
	static final void method259(Class38_Sub7 class38_sub7, byte b) {
		if ((class38_sub7.anInt2717 ^ 0xffffffff) == -1) {
			class38_sub7.anInt2682 = 1024;
		}
		anInt2106++;
		class38_sub7.anInt2632 = 0;
		int i = -Class89.anInt1511 + class38_sub7.anInt2684;
		int i_6_ = class38_sub7.anInt2650 * 128 + class38_sub7.anInt2668 * 64;
		if (class38_sub7.anInt2717 == 1) {
			class38_sub7.anInt2682 = 1536;
		}
		int i_7_ = 128 * class38_sub7.anInt2688 + class38_sub7.anInt2668 * 64;
		class38_sub7.anInt2674 += (-class38_sub7.anInt2674 + i_6_) / i;
		if (b != 12) {
			method266(75, -65, -36);
		}
		class38_sub7.anInt2659 += (-class38_sub7.anInt2659 + i_7_) / i;
		if (class38_sub7.anInt2717 == 2) {
			class38_sub7.anInt2682 = 0;
		}
		if (class38_sub7.anInt2717 == 3) {
			class38_sub7.anInt2682 = 512;
		}
	}
	
	int[] method260(int i, int i_8_) {
		anInt2122++;
		if (i != 0) {
			return null;
		}
		throw new IllegalStateException("This operation does not have a monochrome output");
	}
	
	final int[] method261(int i, int i_9_, byte b) {
		anInt2107++;
		if (b != 18) {
			anInt2118 = -63;
		}
		if (!aClass23_Sub4Array2120[i_9_].aBoolean2117) {
			return aClass23_Sub4Array2120[i_9_].method258(i, (byte) 9)[0];
		}
		return aClass23_Sub4Array2120[i_9_].method260(0, i);
	}
	
	int method262(int i) {
		int i_10_ = 90 / ((57 - i) / 63);
		anInt2104++;
		return -1;
	}
	
	static final Class43_Sub1[] method263(int i) {
		anInt2121++;
		Class43_Sub1[] class43_sub1s = new Class43_Sub1[Class23_Sub4_Sub20.anInt3229];
		for (int i_11_ = 0; Class23_Sub4_Sub20.anInt3229 > i_11_; i_11_++)
			class43_sub1s[i_11_] = new Class43_Sub1(Class23_Sub12.anInt2301, Class23_Sub13_Sub15.anInt4033, Class23_Sub23.anIntArray2417[i_11_], Class23_Sub13_Sub2.anIntArray3679[i_11_], Class79.anIntArray1875[i_11_], Class105.anIntArray1766[i_11_], Class23_Sub13_Sub23.aByteArrayArray4243[i_11_], Class23_Sub4_Sub1.anIntArray2890);
		Class23_Sub13_Sub9.method684(true);
		int i_12_ = -4 / ((53 - i) / 50);
		return class43_sub1s;
	}
	
	int method264(byte b) {
		anInt2109++;
		if (b != 15) {
			return 6;
		}
		return -1;
	}
	
	Class23_Sub4(int i, boolean bool) {
		aClass23_Sub4Array2120 = new Class23_Sub4[i];
		aBoolean2117 = bool;
	}
	
	void method265(int i) {
		if (i != -21746) {
			aBoolean2117 = true;
		}
		anInt2113++;
	}
	
	static final void method266(int i, int i_13_, int i_14_) {
		if (i != 4096) {
			method266(-114, 1, -91);
		}
		anInt2119++;
		if (Class23_Sub4_Sub33.anInt3428 != i_13_) {
			Class61.anIntArray967 = new int[i_13_];
			for (int i_15_ = 0; i_13_ > i_15_; i_15_++)
				Class61.anIntArray967[i_15_] = (i_15_ << 12) / i_13_;
			Class54.anInt862 = i_13_ != 64 ? 4096 : 2048;
			Class95.anInt1611 = -1 + i_13_;
			Class23_Sub4_Sub33.anInt3428 = i_13_;
		}
		if ((Class102.anInt1706 ^ 0xffffffff) != (i_14_ ^ 0xffffffff)) {
			if ((i_14_ ^ 0xffffffff) != (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff)) {
				Class23_Sub13_Sub16.anIntArray4049 = new int[i_14_];
				for (int i_16_ = 0; (i_14_ ^ 0xffffffff) < (i_16_ ^ 0xffffffff); i_16_++)
					Class23_Sub13_Sub16.anIntArray4049[i_16_] = (i_16_ << 12) / i_14_;
			} else {
				Class23_Sub13_Sub16.anIntArray4049 = Class61.anIntArray967;
			}
			Class102.anInt1706 = i_14_;
			Class23_Sub4_Sub1.anInt2892 = -1 + i_14_;
		}
	}
	
	static final void method267(Class105 class105, Class105 class105_17_, int i, Class105 class105_18_) {
		Class95.aClass105_1618 = class105_18_;
		if (i != 1024) {
			method267(null, null, 77, null);
		}
		Class40.aClass105_630 = class105;
		anInt2123++;
		Class23_Sub4_Sub27.aClass105_3340 = class105_17_;
	}
	
	static {
		aLongArray2110 = new long[1000];
		anInt2103 = 0;
	}
}
