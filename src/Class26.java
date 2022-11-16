/* Class26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.DataInputStream;
import java.net.URL;

public class Class26
{
	static int[] anIntArray393 = new int[1000];
	static boolean aBoolean394 = false;
	static Class5 aClass5_395 = new Class5(64);
	static int anInt396;
	private static RSString aClass16_397 = Class38_Sub6.method1076((byte) 86, "FULL");
	static int[] anIntArray398 = { 1, 1, 0, 0, 0, 8, 0, 0, 8 };
	static RSString aClass16_399 = Class38_Sub6.method1076((byte) 86, "Lade Texturen )2 ");
	static int anInt400;
	static RSString aClass16_401 = aClass16_397;
	static RSString aClass16_402 = Class38_Sub6.method1076((byte) 86, "<col=ffffff>");
	
	public static void method924(int i) {
		if (i >= -78) {
			anIntArray398 = null;
		}
		anIntArray398 = null;
		aClass16_402 = null;
		aClass16_401 = null;
		aClass16_399 = null;
		aClass5_395 = null;
		aClass16_397 = null;
		anIntArray393 = null;
	}
	
	static final void method925(int i, Throwable throwable, String string) {
		anInt396++;
		do {
			try {
				String string_0_ = "";
				if (throwable != null) {
					string_0_ = Class103.method1522((byte) -74, throwable);
				}
				if (string != null) {
					if (throwable != null) {
						string_0_ += " | ";
					}
					string_0_ += (String) string;
				}
				System.out.println("Error: " + string_0_);
				string_0_ = string_0_.replace(':', '.');
				string_0_ = string_0_.replace('@', (char) i);
				string_0_ = string_0_.replace('&', '_');
				string_0_ = string_0_.replace('#', '_');
				if (Class23_Sub4_Sub28.aClass9_3348.anApplet188 != null) {
					Class60 class60 = Class23_Sub4_Sub28.aClass9_3348.method102(new URL(Class23_Sub4_Sub28.aClass9_3348.anApplet188.getCodeBase(), "clienterror.ws?c=" + Class23_Sub13_Sub25.anInt4295 + "&u=" + Class88.aLong1501 + "&v1=" + Class9.aString198 + "&v2=" + Class9.aString184 + "&e=" + string_0_), 127);
					while (class60.anInt951 == 0)
						Class105.method1545((byte) -68, 1L);
					if (class60.anInt951 != 1) {
						break;
					}
					DataInputStream datainputstream = (DataInputStream) class60.anObject955;
					datainputstream.read();
					datainputstream.close();
				}
			} catch (Exception exception) {
				break;
			}
			break;
		} while (false);
	}
	
	static final void method926(Class38_Sub7 class38_sub7, int i) {
		if (i <= 1) {
			method925(-35, null, null);
		}
		if ((Class89.anInt1511 ^ 0xffffffff) == (class38_sub7.anInt2716 ^ 0xffffffff) || (class38_sub7.anInt2693 ^ 0xffffffff) == 0 || (class38_sub7.anInt2706 ^ 0xffffffff) != -1 || class38_sub7.anInt2664 + 1 > Class7.method90(class38_sub7.anInt2693, (byte) 93).anIntArray4204[class38_sub7.anInt2709]) {
			int i_1_ = Class89.anInt1511 - class38_sub7.anInt2684;
			int i_2_ = class38_sub7.anInt2716 - class38_sub7.anInt2684;
			int i_3_ = class38_sub7.anInt2650 * 128 + class38_sub7.anInt2668 * 64;
			int i_4_ = 64 * class38_sub7.anInt2668 + class38_sub7.anInt2633 * 128;
			int i_5_ = class38_sub7.anInt2668 * 64 + class38_sub7.anInt2681 * 128;
			class38_sub7.anInt2674 = (i_1_ * i_4_ + (-i_1_ + i_2_) * i_3_) / i_2_;
			int i_6_ = class38_sub7.anInt2688 * 128 - -(class38_sub7.anInt2668 * 64);
			class38_sub7.anInt2659 = (i_1_ * i_5_ + i_6_ * (i_2_ + -i_1_)) / i_2_;
		}
		anInt400++;
		if ((class38_sub7.anInt2717 ^ 0xffffffff) == -1) {
			class38_sub7.anInt2682 = 1024;
		}
		if (class38_sub7.anInt2717 == 1) {
			class38_sub7.anInt2682 = 1536;
		}
		class38_sub7.anInt2632 = 0;
		if (class38_sub7.anInt2717 == 2) {
			class38_sub7.anInt2682 = 0;
		}
		if (class38_sub7.anInt2717 == 3) {
			class38_sub7.anInt2682 = 512;
		}
		class38_sub7.anInt2680 = class38_sub7.anInt2682;
	}
}
