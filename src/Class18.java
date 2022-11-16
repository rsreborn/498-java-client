/* Class18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class18
{
	private int anInt318;
	private Class93[] aClass93Array319;
	private int anInt320;
	
	private final byte[] method193() {
		int i = 0;
		for (int i_0_ = 0; i_0_ < 10; i_0_++) {
			if (aClass93Array319[i_0_] != null && aClass93Array319[i_0_].anInt1591 + aClass93Array319[i_0_].anInt1583 > i) {
				i = aClass93Array319[i_0_].anInt1591 + aClass93Array319[i_0_].anInt1583;
			}
		}
		if (i == 0) {
			return new byte[0];
		}
		int i_1_ = 22050 * i / 1000;
		byte[] bs = new byte[i_1_];
		for (int i_2_ = 0; i_2_ < 10; i_2_++) {
			if (aClass93Array319[i_2_] != null) {
				int i_3_ = aClass93Array319[i_2_].anInt1591 * 22050 / 1000;
				int i_4_ = aClass93Array319[i_2_].anInt1583 * 22050 / 1000;
				int[] is = aClass93Array319[i_2_].method1463(i_3_, aClass93Array319[i_2_].anInt1591);
				for (int i_5_ = 0; i_5_ < i_3_; i_5_++) {
					int i_6_ = bs[i_5_ + i_4_] + (is[i_5_] >> 8);
					if ((i_6_ + 128 & ~0xff) != 0) {
						i_6_ = i_6_ >> 31 ^ 0x7f;
					}
					bs[i_5_ + i_4_] = (byte) i_6_;
				}
			}
		}
		return bs;
	}
	
	final int method194() {
		int i = 9999999;
		for (int i_7_ = 0; i_7_ < 10; i_7_++) {
			if (aClass93Array319[i_7_] != null && aClass93Array319[i_7_].anInt1583 / 20 < i) {
				i = aClass93Array319[i_7_].anInt1583 / 20;
			}
		}
		if (anInt320 < anInt318 && anInt320 / 20 < i) {
			i = anInt320 / 20;
		}
		if (i == 9999999 || i == 0) {
			return 0;
		}
		for (int i_8_ = 0; i_8_ < 10; i_8_++) {
			if (aClass93Array319[i_8_] != null) {
				aClass93Array319[i_8_].anInt1583 -= i * 20;
			}
		}
		if (anInt320 < anInt318) {
			anInt320 -= i * 20;
			anInt318 -= i * 20;
		}
		return i;
	}
	
	static final Class18 method195(Class105 class105, int i, int i_9_) {
		byte[] bs = class105.method1544(i_9_, 0, i);
		if (bs == null) {
			return null;
		}
		return new Class18(new Buffer(bs));
	}
	
	final Class23_Sub6_Sub1 method196() {
		byte[] bs = method193();
		return new Class23_Sub6_Sub1(22050, bs, 22050 * anInt320 / 1000, 22050 * anInt318 / 1000);
	}
	
	private Class18(Buffer class23_sub5) {
		aClass93Array319 = new Class93[10];
		for (int i = 0; i < 10; i++) {
			int i_10_ = class23_sub5.method461(-1797813752);
			if (i_10_ != 0) {
				class23_sub5.position--;
				aClass93Array319[i] = new Class93();
				aClass93Array319[i].method1461(class23_sub5);
			}
		}
		anInt320 = class23_sub5.method476((byte) -115);
		anInt318 = class23_sub5.method476((byte) -119);
	}
	
	private Class18() {
		aClass93Array319 = new Class93[10];
	}
}
