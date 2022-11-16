/* Class23_Sub26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub26 extends Class23
{
	static RSString aClass16_2465 = Class38_Sub6.method1076((byte) 86, "sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");
	static int anInt2466;
	static int anInt2467;
	static RSString aClass16_2468;
	static volatile int anInt2469;
	private static RSString aClass16_2470 = Class38_Sub6.method1076((byte) 86, "Username: ");
	static int anInt2471;
	protected RSString aClass16_2472;
	static int anInt2473;
	
	static final void method909(int i, int i_0_, int i_1_, int i_2_, byte b, int i_3_, int i_4_, int i_5_, int i_6_) {
		anInt2471++;
		if (!Class17.method189(-10924, i_5_)) {
			if (i_2_ != -1) {
				Class23_Sub4_Sub23_Sub1.aBooleanArray4478[i_2_] = true;
			} else {
				for (int i_7_ = 0; i_7_ < 100; i_7_++)
					Class23_Sub4_Sub23_Sub1.aBooleanArray4478[i_7_] = true;
			}
		} else {
			Class31.aClass64Array484 = null;
			Class97.method1490(i_0_, i, Class23_Sub4_Sub28.aClass64ArrayArray3350[i_5_], i_6_, i_1_, -1, i_4_, i_2_, i_3_, -1);
			if (Class31.aClass64Array484 != null) {
				Class97.method1490(i_0_, i, Class31.aClass64Array484, Class58.anInt907, i_1_, -1412584499, i_4_, i_2_, Class13.anInt250, -1);
				Class31.aClass64Array484 = null;
			}
			if (b != 21) {
				aClass16_2465 = null;
			}
		}
	}
	
	static final void method910(boolean bool) {
		if (bool != true) {
			method910(true);
		}
		Class23_Sub5_Sub1.aClass81_3527.method1369((byte) 110);
		anInt2466++;
	}
	
	public Class23_Sub26() {
		/* empty */
	}
	
	Class23_Sub26(RSString class16) {
		aClass16_2472 = class16;
	}
	
	public static void method911(boolean bool) {
		aClass16_2470 = null;
		aClass16_2465 = null;
		aClass16_2468 = null;
		if (bool != true) {
			method911(false);
		}
	}
	
	static {
		anInt2469 = -1;
		aClass16_2468 = aClass16_2470;
		anInt2473 = 0;
	}
}
