/* Class82 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class82
{
	static Class51 aClass51_1440;
	static int anInt1441;
	static boolean aBoolean1442 = false;
	protected int anInt1443;
	static int anInt1444;
	static int anInt1445;
	static int anInt1446;
	protected int anInt1447;
	protected int anInt1448;
	protected RSString aClass16_1449;
	protected boolean aBoolean1450;
	protected int anInt1451;
	static int anInt1452;
	static Class89[][][] aClass89ArrayArrayArray1453;
	static int[] anIntArray1454;
	static int[] anIntArray1455;
	static long[] aLongArray1456;
	
	static final int method1372(RSString class16, byte b) {
		anInt1444++;
		if (b <= 17) {
			return 40;
		}
		return class16.method171() - -1;
	}
	
	static final void method1373(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		if (i_5_ == -7593) {
			anInt1452++;
			Class23_Sub23 class23_sub23 = (Class23_Sub23) Class8.aClass89_178.method1437(-119);
			Class23_Sub23 class23_sub23_9_ = null;
			for (/**/; class23_sub23 != null; class23_sub23 = (Class23_Sub23) Class8.aClass89_178.method1431((byte) -89)) {
				if ((i_2_ ^ 0xffffffff) == (class23_sub23.anInt2423 ^ 0xffffffff) && (i_8_ ^ 0xffffffff) == (class23_sub23.anInt2430 ^ 0xffffffff) && (class23_sub23.anInt2433 ^ 0xffffffff) == (i ^ 0xffffffff) && (i_3_ ^ 0xffffffff) == (class23_sub23.anInt2438 ^ 0xffffffff)) {
					class23_sub23_9_ = class23_sub23;
					break;
				}
			}
			if (class23_sub23_9_ == null) {
				class23_sub23_9_ = new Class23_Sub23();
				class23_sub23_9_.anInt2423 = i_2_;
				class23_sub23_9_.anInt2433 = i;
				class23_sub23_9_.anInt2438 = i_3_;
				class23_sub23_9_.anInt2430 = i_8_;
				Class23_Sub4_Sub20.method346(i_5_ ^ 0x49da, class23_sub23_9_);
				Class8.aClass89_178.method1439(i_5_ + 7615, class23_sub23_9_);
			}
			class23_sub23_9_.anInt2436 = i_6_;
			class23_sub23_9_.anInt2428 = i_7_;
			class23_sub23_9_.anInt2419 = i_0_;
			class23_sub23_9_.anInt2437 = i_4_;
			class23_sub23_9_.anInt2429 = i_1_;
		}
	}
	
	public static void method1374(int i) {
		anIntArray1454 = null;
		aClass89ArrayArrayArray1453 = null;
		anIntArray1455 = null;
		aClass51_1440 = null;
		if (i == 32) {
			aLongArray1456 = null;
		}
	}
	
	static final void method1375(int i) {
		anInt1445++;
		Class23_Sub23 class23_sub23 = (Class23_Sub23) Class8.aClass89_178.method1437(93);
		if (i != 30797) {
			method1374(127);
		}
		for (/**/; class23_sub23 != null; class23_sub23 = (Class23_Sub23) Class8.aClass89_178.method1431((byte) -89)) {
			if ((class23_sub23.anInt2437 ^ 0xffffffff) < -1) {
				class23_sub23.anInt2437--;
			}
			if (class23_sub23.anInt2437 == 0) {
				if (class23_sub23.anInt2418 < 0 || Applet_Sub1.method26(class23_sub23.anInt2418, class23_sub23.anInt2434, 101)) {
					Class23_Sub21.method892(class23_sub23.anInt2430, class23_sub23.anInt2418, class23_sub23.anInt2433, class23_sub23.anInt2434, i ^ 0x784d, class23_sub23.anInt2438, class23_sub23.anInt2423, class23_sub23.anInt2431);
					class23_sub23.method228(i + -30797);
				}
			} else {
				if ((class23_sub23.anInt2429 ^ 0xffffffff) < -1) {
					class23_sub23.anInt2429--;
				}
				if (class23_sub23.anInt2429 == 0 && class23_sub23.anInt2430 >= 1 && class23_sub23.anInt2433 >= 1 && class23_sub23.anInt2430 <= 102 && class23_sub23.anInt2433 <= 102 && ((class23_sub23.anInt2419 ^ 0xffffffff) > -1 || Applet_Sub1.method26(class23_sub23.anInt2419, class23_sub23.anInt2428, 73))) {
					Class23_Sub21.method892(class23_sub23.anInt2430, class23_sub23.anInt2419, class23_sub23.anInt2433, class23_sub23.anInt2428, 0, class23_sub23.anInt2438, class23_sub23.anInt2423, class23_sub23.anInt2436);
					class23_sub23.anInt2429 = -1;
					if (class23_sub23.anInt2419 == class23_sub23.anInt2418 && class23_sub23.anInt2418 == -1) {
						class23_sub23.method228(i + -30797);
					} else if ((class23_sub23.anInt2419 ^ 0xffffffff) == (class23_sub23.anInt2418 ^ 0xffffffff) && class23_sub23.anInt2431 == class23_sub23.anInt2436 && (class23_sub23.anInt2428 ^ 0xffffffff) == (class23_sub23.anInt2434 ^ 0xffffffff)) {
						class23_sub23.method228(i ^ 0x784d);
					}
				}
			}
		}
	}
	
	static {
		aClass51_1440 = new Class51();
		anIntArray1454 = new int[32];
		aClass89ArrayArrayArray1453 = new Class89[4][104][104];
		aLongArray1456 = new long[500];
	}
}
