/* Class23_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub12 extends Class23
{
	static RSString aClass16_2290 = Class38_Sub6.method1076((byte) 86, "::autoshadow off");
	private boolean[] aBooleanArray2291;
	static RSString aClass16_2292;
	static int anInt2293;
	static int anInt2294;
	protected int[] anIntArray2295;
	static Class43[] aClass43Array2296;
	protected int anInt2297;
	static int anInt2298;
	static RSString aClass16_2299;
	private static RSString aClass16_2300 = Class38_Sub6.method1076((byte) 86, "Please wait 1 minute and try again)3");
	static int anInt2301;
	static int[] anIntArray2302;
	static int anInt2303;
	private int anInt2304;
	protected int[][] anIntArrayArray2305;
	
	static final void method597(int i) {
		anInt2298++;
		if (Class38_Sub2.aBoolean2490) {
			Class87_Sub4.anIntArray2828 = null;
			Class23_Sub13_Sub13.aClass43Array3987 = null;
			Class23_Sub4_Sub19.anIntArray3224 = null;
			Class42.aClass43_650 = null;
			Class6.anIntArray144 = null;
			Class67.aClass43Array1171 = null;
			Class39.anIntArray618 = null;
			CacheIndex.aClass43_255 = null;
			aClass43Array2296 = null;
			Class23_Sub5_Sub1.anIntArray3543 = null;
			Class49.aClass23_Sub13_Sub10_Sub1_754 = null;
			Class69.aClass43_1220 = null;
			CacheIndex.aClass43Array258 = null;
			Class35.anIntArray557 = null;
			Class72.aClass43_Sub1Array1303 = null;
			Class66.aClass23_Sub13_Sub10Array1168 = null;
			Class23_Sub20.aClass23_Sub13_Sub10_Sub1_2402 = null;
			Class23_Sub13_Sub10.aClass23_Sub13_Sub10_Sub1_3880 = null;
			Class23_Sub16.aClass43_2352 = null;
			Class23_Sub7.aClass23_Sub13_Sub10_Sub1_2216 = null;
			Class28.anIntArray425 = null;
			Class71_Sub2_Sub1.anIntArray4473 = null;
			Class23_Sub4_Sub16.method333(-257, 2);
			Class23_Sub2.method238(i ^ i, true);
			Class38_Sub2.aBoolean2490 = false;
		}
	}
	
	public static void method598(byte b) {
		aClass16_2300 = null;
		aClass43Array2296 = null;
		if (b != 49) {
			method597(49);
		}
		anIntArray2302 = null;
		aClass16_2299 = null;
		aClass16_2290 = null;
		aClass16_2292 = null;
	}
	
	Class23_Sub12(int i, byte[] bs) {
		anInt2297 = i;
		Buffer class23_sub5 = new Buffer(bs);
		anInt2304 = class23_sub5.method461(-1797813752);
		aBooleanArray2291 = new boolean[anInt2304];
		anIntArray2295 = new int[anInt2304];
		anIntArrayArray2305 = new int[anInt2304][];
		for (int i_0_ = 0; i_0_ < anInt2304; i_0_++)
			anIntArray2295[i_0_] = class23_sub5.method461(-1797813752);
		for (int i_1_ = 0; i_1_ < anInt2304; i_1_++)
			aBooleanArray2291[i_1_] = class23_sub5.method461(-1797813752) == 1;
		for (int i_2_ = 0; anInt2304 > i_2_; i_2_++)
			anIntArrayArray2305[i_2_] = new int[class23_sub5.method461(-1797813752)];
		for (int i_3_ = 0; i_3_ < anInt2304; i_3_++) {
			for (int i_4_ = 0; i_4_ < anIntArrayArray2305[i_3_].length; i_4_++)
				anIntArrayArray2305[i_3_][i_4_] = class23_sub5.method461(-1797813752);
		}
	}
	
	static {
		aClass16_2299 = aClass16_2300;
		aClass16_2292 = aClass16_2300;
	}
}
