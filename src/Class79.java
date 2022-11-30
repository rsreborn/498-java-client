/* Class79 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Calendar;
import java.util.TimeZone;

public class Class79 implements Interface2
{
	static int[] anIntArray1875;
	static int anInt1876;
	static int anInt1877;
	static RSString[] aClass16Array1878 = new RSString[1000];
	static int anInt1879;
	static int anInt1880;
	static Calendar aCalendar1881;
	static int anInt1882;
	static volatile int anInt1883 = 0;
	static int anInt1884;
	static int[] anIntArray1885;
	static int[] anIntArray1886;
	static RSString aClass16_1887;
	static volatile int anInt1888;
	static RSString aClass16_1889;
	static int[] anIntArray1890;
	
	public final RSString method8(int i, byte b, long l, int[] is) {
		anInt1880++;
		if (i == 0) {
			Class23_Sub13_Sub13 class23_sub13_sub13 = Class23_Sub13_Sub3.method612(is[0], false);
			return class23_sub13_sub13.method764((int) l, -110);
		}
		if (i == 1) {
			Class23_Sub13_Sub11 class23_sub13_sub11 = Class23_Sub13_Sub24.method853(-112, (int) l);
			return class23_sub13_sub11.aClass16_3902;
		}
		if (b != 56) {
			method1363(126);
		}
		if (i == 6) {
			return Class23_Sub13_Sub3.method612(is[0], false).method764((int) l, -120);
		}
		return null;
	}
	
	static final Class42 method1359(Buffer class23_sub5, byte b) {
		anInt1879++;
		Class42 class42 = new Class42();
		class42.anInt645 = class23_sub5.readShortBE();
		if (b <= 8) {
			method1359(null, (byte) -29);
		}
		class42.aClass23_Sub13_Sub12_646 = Class38_Sub7_Sub1.method1094(class42.anInt645, 1);
		return class42;
	}
	
	public static void method1360(boolean bool) {
		aCalendar1881 = null;
		aClass16Array1878 = null;
		anIntArray1885 = null;
		if (bool != true) {
			aClass16Array1878 = null;
		}
		anIntArray1886 = null;
		anIntArray1875 = null;
		aClass16_1887 = null;
		anIntArray1890 = null;
		aClass16_1889 = null;
	}
	
	static final RSString method1361(int i, long l) {
		anInt1877++;
		if (i != -16309) {
			method1361(99, -45L);
		}
		return Class72.method1307(l, 10, (byte) 43, false);
	}
	
	static final boolean method1362(int i) {
		anInt1882++;
		if (i != -51) {
			method1363(-29);
		}
		try {
			return Class23_Sub13.method599(20044);
		} catch (java.io.IOException ioexception) {
			Class44.method1128(-94);
			return true;
		} catch (Exception exception) {
			String string = "T2 - " + Class23_Sub13_Sub24.anInt4275 + "," + Class25.anInt388 + "," + Class25.anInt379 + " - " + Class23_Sub4_Sub2.anInt2925 + "," + (Class42.anInt662 + Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0]) + "," + (Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0] + Class58.anInt903) + " - ";
			for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > (Class23_Sub4_Sub2.anInt2925 ^ 0xffffffff) && i_0_ < 50; i_0_++)
				string += Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.payload[i_0_] + ",";
			Class26.method925(95, exception, string);
			Class23_Sub4_Sub15.method326(true);
			return true;
		}
	}
	
	static final void method1363(int i) {
		for (int i_1_ = 0; i_1_ < Class23_Sub4_Sub18.anInt3191; i_1_++) {
			int i_2_ = Class23_Sub4_Sub17.anIntArray3170[i_1_];
			Class38_Sub7_Sub1 class38_sub7_sub1 = Class31.aClass38_Sub7_Sub1Array483[i_2_];
			if (class38_sub7_sub1 != null) {
				Class27.method928((byte) 84, class38_sub7_sub1, class38_sub7_sub1.aClass23_Sub13_Sub20_4373.anInt4173);
			}
		}
		if (i < 73) {
			aClass16_1889 = null;
		}
		anInt1884++;
	}
	
	static {
		aCalendar1881 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		aClass16_1887 = Class38_Sub6.method1076((byte) 86, ")4slr2)3ws?order=LPWM");
		aClass16_1889 = Class38_Sub6.method1076((byte) 86, "blinken2:");
		anIntArray1886 = new int[32];
		anIntArray1890 = new int[5];
		anInt1888 = 0;
	}
}
