/* Class36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class36
{
	static int anInt560;
	static int anInt561;
	static Class89 aClass89_562 = new Class89();
	static int anInt563;
	static int anInt564;
	static oa anOa565 = new oa(8);
	static RSString aClass16_566;
	static int[] anIntArray567;
	private static RSString aClass16_568 = Class38_Sub6.method1076((byte) 86, " has logged out)3");
	static int anInt569;
	static RSString aClass16_570;
	static boolean[] aBooleanArray571;
	static oa anOa572;
	private static RSString aClass16_573;
	
	static final void method986(boolean bool) {
		int i = Class13.aClass23_Sub13_Sub8_240.method649(Class63.aClass16_995);
		for (int i_0_ = 0; (Class23_Sub13_Sub9.anInt3863 ^ 0xffffffff) < (i_0_ ^ 0xffffffff); i_0_++) {
			int i_1_ = Class13.aClass23_Sub13_Sub8_240.method649(Class23_Sub13_Sub18.method800(i_0_, bool));
			if ((i ^ 0xffffffff) > (i_1_ ^ 0xffffffff)) {
				i = i_1_;
			}
		}
		Class53.aBoolean840 = true;
		anInt564++;
		Class71_Sub3.anInt2746 = 15 * Class23_Sub13_Sub9.anInt3863 + 22;
		int i_2_ = 21 + Class23_Sub13_Sub9.anInt3863 * 15;
		int i_3_ = Class23_Sub13_Sub19.anInt4136;
		if (Class23_Sub4_Sub19.anInt3205 < i_3_ + i_2_) {
			i_3_ = Class23_Sub4_Sub19.anInt3205 - i_2_;
		}
		i += 8;
		int i_4_ = -(i / 2) + Class90.anInt1538;
		if (bool != false) {
			anOa572 = null;
		}
		if (i + i_4_ > Class51.anInt801) {
			i_4_ = -i + Class51.anInt801;
		}
		if ((i_4_ ^ 0xffffffff) > -1) {
			i_4_ = 0;
		}
		if (i_3_ < 0) {
			i_3_ = 0;
		}
		Class23_Sub4_Sub3.anInt2950 = i_3_;
		Class23_Sub27.anInt2475 = i_4_;
		Class69.anInt1216 = i;
	}
	
	static final boolean method987(int i, byte b) {
		if (b < 121) {
			return true;
		}
		anInt561++;
		if ((i >> 21 & 0x1) == 0) {
			return false;
		}
		return true;
	}
	
	public static void method988(byte b) {
		if (b == 87) {
			aClass89_562 = null;
			aClass16_573 = null;
			aClass16_568 = null;
			aClass16_570 = null;
			anOa572 = null;
			anIntArray567 = null;
			aClass16_566 = null;
			anOa565 = null;
			aBooleanArray571 = null;
		}
	}
	
	static final int method989(int i, int i_5_, byte b, byte[] bs) {
		anInt560++;
		int i_6_ = -1;
		int i_7_ = 75 % ((b - -61) / 35);
		for (int i_8_ = i; i_5_ > i_8_; i_8_++)
			i_6_ = i_6_ >>> 8 ^ Class23_Sub13_Sub2.anIntArray3681[(i_6_ ^ bs[i_8_]) & 0xff];
		i_6_ ^= 0xffffffff;
		return i_6_;
	}
	
	static final void method990(byte b, int i, int i_9_) {
		if (Class21.anInt342 != 0 && i_9_ != -1) {
			Class23_Sub13_Sub16.method778(i_9_, Class23_Sub1.aClass105_Sub1_2037, 1, 0, Class21.anInt342, false);
			Class105.aBoolean1806 = true;
		}
		anInt563++;
		if (b <= 84) {
			method988((byte) -105);
		}
	}
	
	static {
		aClass16_566 = aClass16_568;
		anIntArray567 = new int[99];
		int i = 0;
		for (int i_10_ = 0; i_10_ < 99; i_10_++) {
			int i_11_ = 1 + i_10_;
			int i_12_ = (int) (Math.pow(2.0, (double) i_11_ / 7.0) * 300.0 + (double) i_11_);
			i += i_12_;
			anIntArray567[i_10_] = i / 4;
		}
		anInt569 = 0;
		aBooleanArray571 = new boolean[100];
		aClass16_573 = Class38_Sub6.method1076((byte) 86, " seconds)3");
		aClass16_570 = aClass16_573;
	}
}
