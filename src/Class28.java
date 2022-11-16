/* Class28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class28
{
	static RSString aClass16_423 = Class38_Sub6.method1076((byte) 86, "<col=ffffff> )4 ");
	static int anInt424;
	static int[] anIntArray425;
	static int anInt426;
	static int anInt427;
	static Class33 aClass33_428;
	static int anInt429;
	private static RSString aClass16_430 = Class38_Sub6.method1076((byte) 86, " has logged in)3");
	static RSString aClass16_431 = aClass16_430;
	static int anInt432;
	
	static final void method937(RSString class16, RSString class16_0_, RSString class16_1_, byte b) {
		Class23_Sub2.aClass16_2061 = class16_0_;
		anInt426++;
		if (b == 98) {
			Class23_Sub2.aClass16_2060 = class16_1_;
			Class23_Sub2.aClass16_2063 = class16;
		}
	}
	
	public static void method938(int i) {
		aClass16_423 = null;
		aClass16_431 = null;
		aClass33_428 = null;
		aClass16_430 = null;
		anIntArray425 = null;
		if (i < 53) {
			aClass16_431 = null;
		}
	}
	
	static final void method939(int i, int i_2_, boolean bool, int i_3_, byte b, Class105_Sub1 class105_sub1, int i_4_) {
		long l = (long) ((i_4_ << 16) - -i_3_);
		Class23_Sub13_Sub26 class23_sub13_sub26 = (Class23_Sub13_Sub26) Class8.anOa172.a((byte) -127, l);
		anInt427++;
		if (class23_sub13_sub26 == null) {
			class23_sub13_sub26 = (Class23_Sub13_Sub26) Class42.anOa649.a((byte) 126, l);
			if (class23_sub13_sub26 == null) {
				class23_sub13_sub26 = (Class23_Sub13_Sub26) Class29.anOa451.a((byte) 97, l);
				if (class23_sub13_sub26 != null) {
					if (bool) {
						class23_sub13_sub26.method601(false);
						Class8.anOa172.a(class23_sub13_sub26, (byte) -14, l);
						Buffer.anInt2166++;
						Class68.anInt1190--;
					}
				} else {
					if (!bool) {
						class23_sub13_sub26 = (Class23_Sub13_Sub26) Class87_Sub3.anOa2812.a((byte) 97, l);
						if (class23_sub13_sub26 != null) {
							return;
						}
					}
					if (i_2_ != 6024) {
						method940(31, -84, -77, -41, (byte) 69, 5, 61, 85);
					}
					class23_sub13_sub26 = new Class23_Sub13_Sub26();
					class23_sub13_sub26.aClass105_Sub1_4304 = class105_sub1;
					class23_sub13_sub26.aByte4302 = b;
					class23_sub13_sub26.anInt4303 = i;
					if (bool) {
						Class8.anOa172.a(class23_sub13_sub26, (byte) -14, l);
						Buffer.anInt2166++;
					} else {
						Class23_Sub4_Sub39.aClass27_3520.method931(class23_sub13_sub26, (byte) 92);
						Class29.anOa451.a(class23_sub13_sub26, (byte) -14, l);
						Class68.anInt1190++;
					}
				}
			}
		}
	}
	
	static final void method940(int i, int i_5_, int i_6_, int i_7_, byte b, int i_8_, int i_9_, int i_10_) {
		anInt429++;
		if ((i_7_ ^ 0xffffffff) == (i_5_ ^ 0xffffffff)) {
			Class104.method1528(i_10_, i_9_, i_6_, i_8_, i, true, i_7_);
		} else if (b == 120) {
			if (-i_7_ + i >= Class23_Sub13_Sub6.anInt3728 && i_7_ + i <= Class35.anInt554 && (i_9_ + -i_5_ ^ 0xffffffff) <= (Class88.anInt1503 ^ 0xffffffff) && Class23_Sub4_Sub33.anInt3435 >= i_5_ + i_9_) {
				Class56.method1186(i_6_, true, i, i_10_, i_7_, i_9_, i_8_, i_5_);
			} else {
				Class95.method1467(i_9_, i_5_, i_8_, i_7_, i_6_, -13805, i, i_10_);
			}
		}
	}
	
	static {
		anInt424 = 99;
	}
}
