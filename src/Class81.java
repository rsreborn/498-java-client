/* Class81 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class81
{
	static int[] anIntArray1424;
	static int anInt1425;
	static int anInt1426;
	static Class105 aClass105_1427;
	private static RSString aClass16_1428 = Class38_Sub6.method1076((byte) 86, "purple:");
	static int anInt1429;
	static RSString aClass16_1430 = aClass16_1428;
	static RSString aClass16_1431;
	static int anInt1432;
	static int[] anIntArray1433;
	static int anInt1434;
	private Class5 aClass5_1435;
	static RSString aClass16_1436 = aClass16_1428;
	static Class23_Sub10_Sub2 aClass23_Sub10_Sub2_1437;
	static int anInt1438;
	private static RSString aClass16_1439 = Class38_Sub6.method1076((byte) 86, " is already on your ignore list)3");
	
	final void method1365(int i, long l, Class38 class38) {
		anInt1426++;
		if (i != 0) {
			aClass16_1439 = null;
		}
		aClass5_1435.method67(l, new Class23_Sub13_Sub25(class38), true);
	}
	
	final Class38 method1366(long l, byte b) {
		Class23_Sub13_Sub25 class23_sub13_sub25 = (Class23_Sub13_Sub25) aClass5_1435.method62(-101, l);
		anInt1429++;
		if (class23_sub13_sub25 != null) {
			return class23_sub13_sub25.aClass38_4284;
		}
		if (b < 95) {
			anIntArray1424 = null;
		}
		return null;
	}
	
	static final void method1367(int i, int i_0_, int i_1_, int i_2_) {
		Class23_Sub1 class23_sub1 = Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i][i_0_][i_1_];
		if (class23_sub1 != null) {
			Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i][i_0_][i_1_].anInt2032 = i_2_;
		}
	}
	
	static final void method1368(byte b) {
		Class25.anInt388 = -1;
		Class106.anInt1819 = 0;
		anInt1432++;
		Class23_Sub13_Sub9.anInt3863 = 0;
		Class43.anInt666 = -1;
		Class23_Sub13_Sub24.anInt4275 = -1;
		if (b == 41) {
			Class53.aBoolean840 = false;
			Class23_Sub13_Sub17.anInt4077 = 0;
			Class25.anInt379 = -1;
			Class23_Sub7.aClass23_Sub5_Sub1_2202.pos = 0;
			Class23_Sub13_Sub4.inBuffer.pos = 0;
			Class63.anInt992 = 0;
			Class23_Sub4_Sub2.anInt2925 = 0;
			Class23_Sub13.anInt2316 = 0;
			for (int i = 0; i < Class23_Sub4_Sub2.aClass38_Sub7_Sub2Array2932.length; i++) {
				if (Class23_Sub4_Sub2.aClass38_Sub7_Sub2Array2932[i] != null) {
					Class23_Sub4_Sub2.aClass38_Sub7_Sub2Array2932[i].anInt2686 = -1;
				}
			}
			for (int i = 0; Class31.aClass38_Sub7_Sub1Array483.length > i; i++) {
				if (Class31.aClass38_Sub7_Sub1Array483[i] != null) {
					Class31.aClass38_Sub7_Sub1Array483[i].anInt2686 = -1;
				}
			}
			Class23_Sub4_Sub23_Sub1.method366(32);
			Class103.method1521(30, 27172);
			for (int i = 0; i < 100; i++)
				Class23_Sub4_Sub23_Sub1.aBooleanArray4478[i] = true;
		}
	}
	
	final void method1369(byte b) {
		int i = 27 / ((31 - b) / 46);
		anInt1434++;
		aClass5_1435.method68(0);
	}
	
	final void method1370(int i, long l) {
		int i_3_ = -127 % ((i - -21) / 60);
		aClass5_1435.method70(l, 2047);
		anInt1425++;
	}
	
	Class81(int i) {
		aClass5_1435 = new Class5(i);
	}
	
	public static void method1371(int i) {
		if (i != -1) {
			method1371(116);
		}
		anIntArray1424 = null;
		anIntArray1433 = null;
		aClass105_1427 = null;
		aClass16_1436 = null;
		aClass16_1428 = null;
		aClass16_1430 = null;
		aClass16_1431 = null;
		aClass16_1439 = null;
		aClass23_Sub10_Sub2_1437 = null;
	}
	
	static {
		aClass16_1431 = aClass16_1439;
	}
}
