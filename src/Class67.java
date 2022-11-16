/* Class67 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67
{
	static RSString aClass16_1170 = Class38_Sub6.method1076((byte) 86, "Die Verbindung konnte");
	static Class43[] aClass43Array1171;
	static int anInt1172;
	static Class5 aClass5_1173;
	static int anInt1174;
	static int anInt1175;
	static int anInt1176 = 0;
	private static RSString aClass16_1177;
	private static RSString aClass16_1178;
	private static RSString aClass16_1179;
	private static RSString aClass16_1180;
	static Class105_Sub1 aClass105_Sub1_1181;
	private static RSString aClass16_1182;
	private static RSString aClass16_1183;
	private static RSString aClass16_1184;
	static RSString[] aClass16Array1185;
	
	static final Class69 method1242(int i, int i_0_, int i_1_) {
		Class23_Sub1 class23_sub1 = Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i][i_0_][i_1_];
		if (class23_sub1 == null || class23_sub1.aClass69_2034 == null) {
			return null;
		}
		return class23_sub1.aClass69_2034;
	}
	
	static final void method1243(int i) {
		int i_2_ = 0;
		if (i < 116) {
			aClass16_1184 = null;
		}
		for (/**/; (Class23_Sub2.anInt2048 ^ 0xffffffff) < (i_2_ ^ 0xffffffff); i_2_++) {
			int i_3_ = Class94.anIntArray1603[i_2_];
			Class38_Sub7_Sub2 class38_sub7_sub2 = Class23_Sub4_Sub2.aClass38_Sub7_Sub2Array2932[i_3_];
			int i_4_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(-1797813752);
			if ((i_4_ & 0x8) != 0) {
				i_4_ += Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(-1797813752) << 8;
			}
			Class58.method1192(true, i_3_, class38_sub7_sub2, i_4_);
		}
		anInt1175++;
	}
	
	static final void method1244(int i) {
		anInt1172++;
		Class23_Sub20.aClass5_2399.method68(0);
		aClass5_1173.method68(0);
		int i_5_ = 114 % ((-36 - i) / 43);
	}
	
	public static void method1245(byte b) {
		aClass105_Sub1_1181 = null;
		aClass16_1184 = null;
		aClass16_1180 = null;
		if (b > 34) {
			aClass16_1177 = null;
			aClass16Array1185 = null;
			aClass16_1170 = null;
			aClass16_1182 = null;
			aClass16_1183 = null;
			aClass16_1179 = null;
			aClass16_1178 = null;
			aClass5_1173 = null;
			aClass43Array1171 = null;
		}
	}
	
	static final int method1246(byte b, int i) {
		anInt1174++;
		if (b != 47) {
			return 19;
		}
		return 0xff & i;
	}
	
	static {
		aClass5_1173 = new Class5(100);
		aClass16_1177 = Class38_Sub6.method1076((byte) 86, "Fri");
		aClass16_1178 = Class38_Sub6.method1076((byte) 86, "Thu");
		aClass16_1182 = Class38_Sub6.method1076((byte) 86, "Wed");
		aClass16_1183 = Class38_Sub6.method1076((byte) 86, "Tue");
		aClass16_1179 = Class38_Sub6.method1076((byte) 86, "Sun");
		aClass16_1184 = Class38_Sub6.method1076((byte) 86, "Sat");
		aClass16_1180 = Class38_Sub6.method1076((byte) 86, "Mon");
		aClass16Array1185 = new RSString[] { aClass16_1179, aClass16_1180, aClass16_1183, aClass16_1182, aClass16_1178, aClass16_1177, aClass16_1184 };
	}
}
