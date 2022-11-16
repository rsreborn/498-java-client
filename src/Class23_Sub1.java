/* Class23_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub1 extends Class23
{
	static int anInt2005;
	static int anInt2006;
	static short[] aShortArray2007;
	static int anInt2008;
	static Class23_Sub13_Sub10[] aClass23_Sub13_Sub10Array2009;
	static RSString aClass16_2010;
	static int anInt2011;
	static int anInt2012 = 2301979;
	protected int anInt2013;
	protected int anInt2014;
	protected int anInt2015;
	static Class23_Sub13_Sub10 aClass23_Sub13_Sub10_2016;
	protected int anInt2017;
	protected int anInt2018;
	static int anInt2019;
	protected int anInt2020;
	protected boolean aBoolean2021;
	protected Class23_Sub1 aClass23_Sub1_2022;
	protected Class52 aClass52_2023;
	protected int[] anIntArray2024 = new int[5];
	protected Class104 aClass104_2025;
	protected Class46 aClass46_2026;
	protected int anInt2027;
	protected Class39[] aClass39Array2028 = new Class39[5];
	protected int anInt2029;
	static int anInt2030;
	protected Class83 aClass83_2031;
	protected int anInt2032;
	protected boolean aBoolean2033;
	protected Class69 aClass69_2034;
	static int anInt2035;
	protected boolean aBoolean2036;
	static CacheArchive aClass105_Sub1_2037;
	protected Class24 aClass24_2038;
	static int[] anIntArray2039;
	protected int anInt2040 = 0;
	protected int anInt2041;
	
	static final boolean method231(int i, int i_0_) {
		anInt2008++;
		if (i_0_ != -128) {
			anIntArray2039 = null;
		}
		if (((0x374ce055 & i) >> 29 ^ 0xffffffff) == -1) {
			return false;
		}
		return true;
	}
	
	Class23_Sub1(int i, int i_1_, int i_2_) {
		anInt2020 = i_1_;
		anInt2017 = anInt2041 = i;
		anInt2018 = i_2_;
	}
	
	static final boolean method232(int i, int i_3_) {
		int i_4_ = -77 % ((53 - i_3_) / 40);
		anInt2019++;
		if (i < 48 || i > 57) {
			return false;
		}
		return true;
	}
	
	static final void method233(byte b, Class105 class105, Class105 class105_5_) {
		Class23_Sub13.aClass105_2312 = class105_5_;
		int i = 36 / ((b - -3) / 56);
		Class87_Sub2.aClass105_2801 = class105;
		anInt2030++;
		Class23_Sub4_Sub10.anInt3046 = Class87_Sub2.aClass105_2801.method1558(26143, 3);
	}
	
	static final void method234(Class38 class38, int i, int i_6_, int i_7_) {
		if (i_6_ < Class105.anInt1802) {
			Class23_Sub1 class23_sub1 = Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i][i_6_ + 1][i_7_];
			if (class23_sub1 != null && class23_sub1.aClass69_2034 != null && class23_sub1.aClass69_2034.aClass38_1219.method998()) {
				class38.method992(class23_sub1.aClass69_2034.aClass38_1219, 128, 0, 0, true);
			}
		}
		if (i_7_ < Class105.anInt1802) {
			Class23_Sub1 class23_sub1 = Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i][i_6_][i_7_ + 1];
			if (class23_sub1 != null && class23_sub1.aClass69_2034 != null && class23_sub1.aClass69_2034.aClass38_1219.method998()) {
				class38.method992(class23_sub1.aClass69_2034.aClass38_1219, 0, 0, 128, true);
			}
		}
		if (i_6_ < Class105.anInt1802 && i_7_ < client.anInt1974) {
			Class23_Sub1 class23_sub1 = Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i][i_6_ + 1][i_7_ + 1];
			if (class23_sub1 != null && class23_sub1.aClass69_2034 != null && class23_sub1.aClass69_2034.aClass38_1219.method998()) {
				class38.method992(class23_sub1.aClass69_2034.aClass38_1219, 128, 0, 128, true);
			}
		}
		if (i_6_ < Class105.anInt1802 && i_7_ > 0) {
			Class23_Sub1 class23_sub1 = Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i][i_6_ + 1][i_7_ - 1];
			if (class23_sub1 != null && class23_sub1.aClass69_2034 != null && class23_sub1.aClass69_2034.aClass38_1219.method998()) {
				class38.method992(class23_sub1.aClass69_2034.aClass38_1219, 128, 0, -128, true);
			}
		}
	}
	
	static final RSString method235(String string, byte b) {
		anInt2011++;
		byte[] bs;
		try {
			bs = string.getBytes("ISO-8859-1");
		} catch (java.io.UnsupportedEncodingException unsupportedencodingexception) {
			bs = string.getBytes();
		}
		RSString class16 = new RSString();
		class16.anInt1896 = 0;
		class16.aByteArray1906 = bs;
		int i = 127 / ((-11 - b) / 59);
		for (int i_8_ = 0; i_8_ < bs.length; i_8_++) {
			if (bs[i_8_] != 0) {
				bs[class16.anInt1896++] = bs[i_8_];
			}
		}
		return class16;
	}
	
	public static void method236(int i) {
		aShortArray2007 = null;
		if (i == 255) {
			aClass23_Sub13_Sub10_2016 = null;
			anIntArray2039 = null;
			aClass16_2010 = null;
			aClass23_Sub13_Sub10Array2009 = null;
			aClass105_Sub1_2037 = null;
		}
	}
	
	static {
		aClass16_2010 = Class38_Sub6.method1076((byte) 86, "Okay");
		anIntArray2039 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
	}
}
