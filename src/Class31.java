/* Class31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Calendar;

public class Class31
{
	static RSString aClass16_481 = Class38_Sub6.method1076((byte) 86, "Bitte entfernen Sie ");
	private static RSString aClass16_482;
	static Class38_Sub7_Sub1[] aClass38_Sub7_Sub1Array483 = new Class38_Sub7_Sub1[32768];
	static Class64[] aClass64Array484;
	static Calendar aCalendar485;
	static RSString aClass16_486 = Class38_Sub6.method1076((byte) 86, "");
	static RSString aClass16_487;
	static int anInt488;
	static short[] aShortArray489 = { -10304, 9104, -1, -1, -1 };
	static int anInt490;
	private static RSString aClass16_491;
	static RSString aClass16_492;
	static RSString aClass16_493;
	
	static final void method960(int i, int i_0_, int i_1_, int i_2_, Class38 class38, Class38 class38_3_, int i_4_, int i_5_, long l) {
		if (class38 != null || class38_3_ != null) {
			Class83 class83 = new Class83();
			class83.aLong1473 = l;
			class83.anInt1457 = i_0_ * 128 + 64;
			class83.anInt1465 = i_1_ * 128 + 64;
			class83.anInt1469 = i_2_;
			class83.aClass38_1463 = class38;
			class83.aClass38_1468 = class38_3_;
			class83.anInt1461 = i_4_;
			class83.anInt1472 = i_5_;
			for (int i_6_ = i; i_6_ >= 0; i_6_--) {
				if (Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i_6_][i_0_][i_1_] == null) {
					Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i_6_][i_0_][i_1_] = new Class23_Sub1(i_6_, i_0_, i_1_);
				}
			}
			Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i][i_0_][i_1_].aClass83_2031 = class83;
		}
	}
	
	public static void method961(byte b) {
		aCalendar485 = null;
		aClass16_491 = null;
		aClass38_Sub7_Sub1Array483 = null;
		aClass16_481 = null;
		aClass16_492 = null;
		aClass16_487 = null;
		aClass16_493 = null;
		aClass16_486 = null;
		aClass64Array484 = null;
		aShortArray489 = null;
		if (b <= -122) {
			aClass16_482 = null;
		}
	}
	
	static {
		aClass16_482 = Class38_Sub6.method1076((byte) 86, "Attack");
		aClass16_487 = aClass16_482;
		aCalendar485 = Calendar.getInstance();
		aClass16_491 = Class38_Sub6.method1076((byte) 86, "red:");
		aClass16_493 = aClass16_491;
		aClass16_492 = aClass16_491;
	}
}
