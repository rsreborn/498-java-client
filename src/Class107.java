/* Class107 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class107
{
	private static RSString aClass16_1832 = Class38_Sub6.method1076((byte) 86, "wave2:");
	static int anInt1833;
	static RSString aClass16_1834 = aClass16_1832;
	static RSString aClass16_1835;
	static int anInt1836;
	private static RSString aClass16_1837;
	static double aDouble1838;
	static RSString aClass16_1839 = aClass16_1832;
	static int anInt1840;
	static boolean aBoolean1841;
	
	static final boolean method1580(int i, int i_0_) {
		if (i_0_ != -26304) {
			method1583((byte) 30);
		}
		anInt1840++;
		if ((0x1 & i >> 30) == 0) {
			return false;
		}
		return true;
	}
	
	static final void method1581(int i, int i_1_, byte b, int i_2_, int i_3_, int i_4_, int i_5_) {
		if (Class23_Sub13_Sub6.anInt3728 <= i_2_ && (i_1_ ^ 0xffffffff) >= (Class35.anInt554 ^ 0xffffffff) && (i_4_ ^ 0xffffffff) <= (Class88.anInt1503 ^ 0xffffffff) && Class23_Sub4_Sub33.anInt3435 >= i_3_) {
			if (i_5_ == 1) {
				Class66.method1237(i_2_, i_4_, i_3_, i_1_, i, 8622);
			} else {
				Class50.method1156(i_3_, i_5_, i_1_, i_2_, 28, i, i_4_);
			}
		} else if (i_5_ == 1) {
			Class91.method1455((byte) -51, i, i_3_, i_4_, i_2_, i_1_);
		} else {
			Class23_Sub14.method864(i_2_, i, 117, i_4_, i_5_, i_3_, i_1_);
		}
		anInt1833++;
		if (b != -40) {
			aClass16_1839 = null;
		}
	}
	
	static final Class43_Sub1[] method1582(RSString class16, Class105 class105, byte b, RSString class16_6_) {
		anInt1836++;
		if (b > -65) {
			return null;
		}
		int i = class105.method1540(91, class16);
		int i_7_ = class105.method1543(class16_6_, -84, i);
		return Class71_Sub1_Sub1.method1273(i, class105, true, i_7_);
	}
	
	public static void method1583(byte b) {
		aClass16_1834 = null;
		aClass16_1835 = null;
		aClass16_1837 = null;
		aClass16_1832 = null;
		if (b != -126) {
			method1580(-113, 87);
		}
		aClass16_1839 = null;
	}
	
	static final long method1584(int i, int i_8_, int i_9_) {
		Class23_Sub1 class23_sub1 = Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i][i_8_][i_9_];
		if (class23_sub1 == null || class23_sub1.aClass69_2034 == null) {
			return 0L;
		}
		return class23_sub1.aClass69_2034.aLong1209;
	}
	
	static {
		aClass16_1837 = Class38_Sub6.method1076((byte) 86, " is already on your friend list)3");
		aBoolean1841 = true;
		aClass16_1835 = aClass16_1837;
	}
}
