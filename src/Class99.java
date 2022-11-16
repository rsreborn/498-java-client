/* Class99 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class99
{
	private int anInt1663;
	static int anInt1664;
	static int anInt1665;
	static int anInt1666;
	static short[] aShortArray1667;
	private int anInt1668;
	private Class23_Sub15[] aClass23_Sub15Array1669;
	static int anInt1670;
	static int anInt1671;
	static RSString aClass16_1672;
	static boolean aBoolean1673 = false;
	private int anInt1674 = 0;
	static int anInt1675;
	private Class89 aClass89_1676;
	static RSString aClass16_1677;
	private int anInt1678 = -1;
	private int[][] anIntArrayArray1679;
	static int anInt1680;
	protected boolean aBoolean1681;
	
	static final void method1494(int i) {
		int i_0_ = Class23_Sub27.anInt2475;
		anInt1680++;
		int i_1_ = Class23_Sub4_Sub3.anInt2950;
		int i_2_ = Class71_Sub3.anInt2746;
		int i_3_ = Class69.anInt1216;
		int i_4_ = 6116423;
		Class20.method222(i_0_, i_1_, i_3_, i_2_, i_4_);
		Class20.method222(1 + i_0_, 1 + i_1_, -2 + i_3_, 16, 0);
		Class20.method215(i_0_ - -1, 18 + i_1_, i_3_ - 2, i + i_2_, 0);
		CacheIndex.aClass23_Sub13_Sub8_240.method650(Class63.aClass16_995, 3 + i_0_, 14 + i_1_, i_4_, -1);
		int i_5_ = Class23_Sub4_Sub14.anInt3126;
		int i_6_ = Class102.anInt1701;
		for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > (Class23_Sub13_Sub9.anInt3863 ^ 0xffffffff); i_7_++) {
			int i_8_ = i_1_ + (31 - -((-i_7_ + -1 + Class23_Sub13_Sub9.anInt3863) * 15));
			int i_9_ = 16777215;
			if ((i_0_ ^ 0xffffffff) > (i_5_ ^ 0xffffffff) && i_5_ < i_3_ + i_0_ && (-13 + i_8_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff) && i_8_ + 3 > i_6_) {
				i_9_ = 16776960;
			}
			CacheIndex.aClass23_Sub13_Sub8_240.method650(Class23_Sub13_Sub18.method800(i_7_, false), i_0_ + 3, i_8_, i_9_, 0);
		}
		Class23_Sub13_Sub4.method618(Class23_Sub27.anInt2475, Class69.anInt1216, Class71_Sub3.anInt2746, i + -698, Class23_Sub4_Sub3.anInt2950);
	}
	
	final void method1495(byte b) {
		anInt1671++;
		for (int i = 0; anInt1663 > i; i++)
			anIntArrayArray1679[i] = null;
		anIntArrayArray1679 = null;
		aClass23_Sub15Array1669 = null;
		aClass89_1676.method1435(b ^ ~0x25);
		if (b != -13) {
			anIntArrayArray1679 = null;
		}
		aClass89_1676 = null;
	}
	
	static final Class23_Sub13_Sub10[] method1496(RSString class16, boolean bool, RSString class16_10_, Class105 class105) {
		if (bool != true) {
			return null;
		}
		anInt1675++;
		int i = class105.method1540(103, class16);
		int i_11_ = class105.method1543(class16_10_, -105, i);
		return method1498(i, class105, i_11_, 0);
	}
	
	static final RSString method1497(byte b, Class64 class64) {
		anInt1665++;
		if (b > -107) {
			method1494(125);
		}
		if ((Class74.method1313(-96, Class47.method1142(class64, 65)) ^ 0xffffffff) == -1) {
			return null;
		}
		if (class64.aClass16_996 == null || class64.aClass16_996.method169(50).method171() == 0) {
			if (Class75.aBoolean1373) {
				return Class102.aClass16_1711;
			}
			return null;
		}
		return class64.aClass16_996;
	}
	
	static final Class23_Sub13_Sub10[] method1498(int i, Class105 class105, int i_12_, int i_13_) {
		anInt1670++;
		if (!Class23_Sub4_Sub29.method385(class105, i_13_ + i_13_, i, i_12_)) {
			return null;
		}
		return Class24.method915(i_13_ ^ ~0x69);
	}
	
	final int[][] method1499(byte b) {
		anInt1664++;
		if (anInt1668 != anInt1663) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		if (b >= -16) {
			aClass16_1672 = null;
		}
		for (int i = 0; (i ^ 0xffffffff) > (anInt1663 ^ 0xffffffff); i++)
			aClass23_Sub15Array1669[i] = client.aClass23_Sub15_1965;
		return anIntArrayArray1679;
	}
	
	final int[] method1500(int i, byte b) {
		anInt1666++;
		if (b >= -100) {
			method1498(7, null, 60, 25);
		}
		if (anInt1663 == anInt1668) {
			aBoolean1681 = aClass23_Sub15Array1669[i] == null;
			aClass23_Sub15Array1669[i] = client.aClass23_Sub15_1965;
			return anIntArrayArray1679[i];
		}
		if (anInt1663 != 1) {
			Class23_Sub15 class23_sub15 = aClass23_Sub15Array1669[i];
			if (class23_sub15 != null) {
				aBoolean1681 = false;
			} else {
				aBoolean1681 = true;
				if ((anInt1674 ^ 0xffffffff) > (anInt1663 ^ 0xffffffff)) {
					class23_sub15 = new Class23_Sub15(i, anInt1674);
					anInt1674++;
				} else {
					Class23_Sub15 class23_sub15_14_ = (Class23_Sub15) aClass89_1676.method1440(124);
					class23_sub15 = new Class23_Sub15(i, class23_sub15_14_.anInt2343);
					aClass23_Sub15Array1669[class23_sub15_14_.anInt2350] = null;
					class23_sub15_14_.method228(0);
				}
				aClass23_Sub15Array1669[i] = class23_sub15;
			}
			aClass89_1676.method1434(class23_sub15, -1);
			return anIntArrayArray1679[class23_sub15.anInt2343];
		}
		aBoolean1681 = (i ^ 0xffffffff) != (anInt1678 ^ 0xffffffff);
		anInt1678 = i;
		return anIntArrayArray1679[0];
	}
	
	public static void method1501(int i) {
		aClass16_1677 = null;
		if (i > -97) {
			aBoolean1673 = true;
		}
		aShortArray1667 = null;
		aClass16_1672 = null;
	}
	
	Class99(int i, int i_15_, int i_16_) {
		aClass89_1676 = new Class89();
		aBoolean1681 = false;
		anInt1668 = i_15_;
		aClass23_Sub15Array1669 = new Class23_Sub15[anInt1668];
		anInt1663 = i;
		anIntArrayArray1679 = new int[anInt1663][i_16_];
	}
	
	static {
		aShortArray1667 = new short[] { -4160, -4163, -8256, -8259, 22461 };
		aClass16_1677 = Class38_Sub6.method1076((byte) 86, " loggt sich ein)3");
		aClass16_1672 = Class38_Sub6.method1076((byte) 86, "; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");
	}
}
