/* Class23_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub17 extends Class23
{
	static Class39[] aClass39Array2362 = new Class39[100];
	static RSString aClass16_2363 = Class38_Sub6.method1076((byte) 86, "RuneScape wurde aktualisiert(Q");
	protected int[] anIntArray2364 = new int[1];
	static RSString aClass16_2365;
	static Class105_Sub1 aClass105_Sub1_2366;
	static RSString aClass16_2367 = Class38_Sub6.method1076((byte) 86, "Bitte versuchen Sie)1");
	static int[] anIntArray2368 = new int[50];
	static int anInt2369 = 0;
	private static RSString aClass16_2370;
	static RSString aClass16_2371 = Class38_Sub6.method1076((byte) 86, "<col=ff7000>");
	static int anInt2372;
	protected int[] anIntArray2373 = { -1 };
	
	static final Class39 method872(int i, int i_0_, int i_1_) {
		Class23_Sub1 class23_sub1 = Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i][i_0_][i_1_];
		if (class23_sub1 == null) {
			return null;
		}
		for (int i_2_ = 0; i_2_ < class23_sub1.anInt2029; i_2_++) {
			Class39 class39 = class23_sub1.aClass39Array2028[i_2_];
			if ((class39.aLong603 >> 29 & 0x3L) == 2L && class39.anInt601 == i_0_ && class39.anInt607 == i_1_) {
				return class39;
			}
		}
		return null;
	}
	
	public static void method873(boolean bool) {
		aClass16_2370 = null;
		anIntArray2368 = null;
		aClass16_2367 = null;
		aClass39Array2362 = null;
		if (bool == false) {
			aClass16_2371 = null;
			aClass16_2363 = null;
			aClass105_Sub1_2366 = null;
			aClass16_2365 = null;
		}
	}
	
	static {
		aClass16_2370 = Class38_Sub6.method1076((byte) 86, "Members only world");
		anInt2372 = 0;
		aClass16_2365 = aClass16_2370;
	}
}
