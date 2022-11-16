/* Class23_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub8 extends Class23
{
	protected int anInt2227;
	protected Class23_Sub10_Sub1 aClass23_Sub10_Sub1_2228;
	protected int anInt2229;
	static Class23_Sub5_Sub1 loginBuffer = new Class23_Sub5_Sub1(5000);
	static int anInt2231;
	protected Class23_Sub10_Sub1 aClass23_Sub10_Sub1_2232;
	protected int anInt2233;
	protected Class23_Sub13_Sub7 aClass23_Sub13_Sub7_2234;
	static byte[][] aByteArrayArray2235;
	protected int anInt2236;
	static int anInt2237;
	static RSString aClass16_2238;
	protected int[] anIntArray2239;
	protected int anInt2240;
	protected int anInt2241;
	protected int anInt2242;
	private static RSString aClass16_2243 = Class38_Sub6.method1076((byte) 86, "You can(Wt add yourself to your own friend list)3");
	static Class84 aClass84_2244;
	static int[] anIntArray2245 = { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1 };
	protected int anInt2246;
	static int anInt2247;
	static RSString aClass16_2248 = null;
	static int[][] anIntArrayArray2249;
	static int anInt2250;
	static int anInt2251;
	static int anInt2252;
	protected int anInt2253;
	protected int anInt2254;
	
	final void method497(byte b) {
		anInt2252++;
		if (b >= 12) {
			int i = anInt2227;
			Class23_Sub13_Sub7 class23_sub13_sub7 = aClass23_Sub13_Sub7_2234.method646(176743434);
			if (class23_sub13_sub7 != null) {
				anInt2241 = class23_sub13_sub7.anInt3782;
				anInt2227 = class23_sub13_sub7.anInt3743;
				anInt2233 = class23_sub13_sub7.anInt3788 * 128;
				anIntArray2239 = class23_sub13_sub7.anIntArray3801;
				anInt2236 = class23_sub13_sub7.anInt3755;
			} else {
				anIntArray2239 = null;
				anInt2227 = -1;
				anInt2233 = 0;
				anInt2236 = 0;
				anInt2241 = 0;
			}
			if ((anInt2227 ^ 0xffffffff) != (i ^ 0xffffffff) && aClass23_Sub10_Sub1_2228 != null) {
				Class23_Sub7.aClass23_Sub10_Sub4_2201.method595(aClass23_Sub10_Sub1_2228);
				aClass23_Sub10_Sub1_2228 = null;
			}
		}
	}
	
	static final int method498(byte b) {
		anInt2247++;
		int i = -26 / ((43 - b) / 61);
		return 6;
	}
	
	public static void method499(byte b) {
		aClass84_2244 = null;
		anIntArrayArray2249 = null;
		aByteArrayArray2235 = null;
		loginBuffer = null;
		aClass16_2238 = null;
		aClass16_2243 = null;
		anIntArray2245 = null;
		aClass16_2248 = null;
		if (b != -3) {
			method499((byte) -101);
		}
	}
	
	Class23_Sub8() {
		/* empty */
	}
	
	static {
		aClass16_2238 = aClass16_2243;
		anInt2251 = 0;
		anInt2250 = 0;
		anIntArrayArray2249 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };
	}
}
