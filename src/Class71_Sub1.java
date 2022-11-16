/* Class71_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class71_Sub1 extends Class71
{
	static Class23_Sub13_Sub10[] aClass23_Sub13_Sub10Array2723;
	static int anInt2724;
	static int anInt2725;
	static byte[] aByteArray2726 = new byte[520];
	static int anInt2727;
	static RSString aClass16_2728;
	static int anInt2729;
	static RSString aClass16_2730 = Class38_Sub6.method1076((byte) 86, "settings");
	static int anInt2731;
	static RSString aClass16_2732;
	
	static final Class23_Sub13_Sub10 method1268(Class105 class105, RSString class16, int i, RSString class16_0_) {
		int i_1_ = 105 / ((i - -4) / 42);
		anInt2729++;
		int i_2_ = class105.method1540(110, class16);
		int i_3_ = class105.method1543(class16_0_, -85, i_2_);
		return Class47.method1146(i_2_, class105, true, i_3_);
	}
	
	static final Class23_Sub21 method1269(RSString class16, byte b) {
		anInt2731++;
		if (class16.method171() == 0) {
			return null;
		}
		Class23_Sub21 class23_sub21 = (Class23_Sub21) RSString.aClass89_1951.method1437(12);
		if (b != 79) {
			return null;
		}
		for (/**/; class23_sub21 != null; class23_sub21 = (Class23_Sub21) RSString.aClass89_1951.method1431((byte) -89)) {
			if (class23_sub21.aClass16_2411.method150(class16, -22215)) {
				return class23_sub21;
			}
		}
		return null;
	}
	
	public static void method1270(boolean bool) {
		aClass16_2730 = null;
		aByteArray2726 = null;
		aClass16_2728 = null;
		aClass23_Sub13_Sub10Array2723 = null;
		if (bool != false) {
			method1268(null, null, -66, null);
		}
		aClass16_2732 = null;
	}
	
	static {
		aClass16_2728 = Class38_Sub6.method1076((byte) 86, ":clanreq:");
		aClass16_2732 = Class38_Sub6.method1076((byte) 86, "Standort");
	}
}
