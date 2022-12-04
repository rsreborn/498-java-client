/* Class23_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub15 extends Class23
{
	static int anInt2340;
	static int anInt2341;
	private static RSString aClass16_2342 = Class38_Sub6.method1076((byte) 86, "Starting 3d library");
	protected int anInt2343;
	static int anInt2344;
	static RSString aClass16_2345 = aClass16_2342;
	static int anInt2346;
	static RSString aClass16_2347 = Class38_Sub6.method1076((byte) 86, "Die Adresse dieses Computers wurde gesperrt)1");
	static RSString aClass16_2348 = Class38_Sub6.method1076((byte) 86, "Bitte versuchen Sie es erneut)3");
	static RSString aClass16_2349 = Class38_Sub6.method1076((byte) 86, "weiss:");
	protected int anInt2350;
	
	static final void method867(Class105 class105, int i) {
		Class25.aClass105_380 = class105;
		if (i != 0) {
			method867(null, -37);
		}
		anInt2340++;
	}
	
	public static void method868(int i) {
		aClass16_2347 = null;
		int i_0_ = -125 % ((-33 - i) / 63);
		aClass16_2349 = null;
		aClass16_2345 = null;
		aClass16_2348 = null;
		aClass16_2342 = null;
	}
	
	static final void method869(int i) {
		Class29.anInt446++;
		if (i != -2415) {
			method867(null, -17);
		}
		Class23_Sub7.aClass23_Sub5_Sub1_2202.writeOpcode(244, 2976);
		Class23_Sub7.aClass23_Sub5_Sub1_2202.putLong(0L, (byte) -114);
		anInt2346++;
	}
	
	Class23_Sub15(int i, int i_1_) {
		anInt2350 = i;
		anInt2343 = i_1_;
	}
	
	static final int method870(int i, int i_2_, int i_3_) {
		anInt2341++;
		if (i != 4) {
			method869(105);
		}
		int i_4_ = Class71_Sub3.method1288(-128, i_2_ + -1, i_3_ + -1) - -Class71_Sub3.method1288(-128, -1 + i_2_, 1 + i_3_) - -Class71_Sub3.method1288(-123, 1 + i_2_, i_3_ + -1) + Class71_Sub3.method1288(-124, 1 + i_2_, i_3_ - -1);
		int i_5_ = Class71_Sub3.method1288(-123, i_2_, -1 + i_3_) + (Class71_Sub3.method1288(-128, i_2_, i_3_ + 1) + Class71_Sub3.method1288(-122, -1 + i_2_, i_3_)) + Class71_Sub3.method1288(-125, i_2_ - -1, i_3_);
		int i_6_ = Class71_Sub3.method1288(-126, i_2_, i_3_);
		return i_6_ / 4 + (i_5_ / 8 + i_4_ / 16);
	}
}
