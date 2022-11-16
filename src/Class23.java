/* Class23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class23
{
	static Class53 aClass53_347;
	static RSString aClass16_348;
	static long aLong349;
	static Class23_Sub13_Sub10_Sub1[] aClass23_Sub13_Sub10_Sub1Array350;
	static RSString aClass16_351 = Class38_Sub6.method1076((byte) 86, "null");
	private static RSString aClass16_352;
	static int anInt353 = 0;
	protected Class23 aClass23_354;
	static int anInt355;
	static int anInt356;
	static RSString aClass16_357;
	protected long aLong358;
	static int anInt359;
	protected Class23 aClass23_360;
	
	final boolean method227(int i) {
		anInt355++;
		if (aClass23_360 == null) {
			return false;
		}
		if (i != -18996) {
			return false;
		}
		return true;
	}
	
	final void method228(int i) {
		anInt356++;
		if (i != 0) {
			method227(98);
		}
		if (aClass23_360 != null) {
			aClass23_360.aClass23_354 = aClass23_354;
			aClass23_354.aClass23_360 = aClass23_360;
			aClass23_360 = null;
			aClass23_354 = null;
		}
	}
	
	public static void method229(byte b) {
		aClass16_352 = null;
		aClass23_Sub13_Sub10_Sub1Array350 = null;
		aClass16_351 = null;
		aClass16_348 = null;
		aClass16_357 = null;
		aClass53_347 = null;
		if (b != -11) {
			method229((byte) -75);
		}
	}
	
	static final void method230(byte b) {
		if (b > 115) {
			synchronized (Class39.aClass32_609) {
				Class79.anInt1883++;
				Class103.anInt1724 = Class23_Sub4_Sub7.anInt3011;
				if (Class23_Sub4_Sub6.anInt2986 >= 0) {
					while (Class23_Sub4_Sub6.anInt2986 != Class23_Sub13.anInt2309) {
						int i = Class17_Sub1.anIntArray2001[Class23_Sub13.anInt2309];
						Class23_Sub13.anInt2309 = 1 + Class23_Sub13.anInt2309 & 0x7f;
						if (i >= 0) {
							Class23_Sub13_Sub8_Sub1.aBooleanArray4492[i] = true;
						} else {
							Class23_Sub13_Sub8_Sub1.aBooleanArray4492[i ^ 0xffffffff] = false;
						}
					}
				} else {
					for (int i = 0; i < 112; i++)
						Class23_Sub13_Sub8_Sub1.aBooleanArray4492[i] = false;
					Class23_Sub4_Sub6.anInt2986 = Class23_Sub13.anInt2309;
				}
				Class23_Sub4_Sub7.anInt3011 = Class68.anInt1202;
			}
			anInt359++;
		}
	}
	
	public Class23() {
		/* empty */
	}
	
	static {
		aClass16_352 = Class38_Sub6.method1076((byte) 86, "Unable to connect)3");
		aClass16_348 = aClass16_352;
		aClass16_357 = aClass16_352;
	}
}
