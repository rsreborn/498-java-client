/* Class23_Sub4_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.CRC32;

public class Class23_Sub4_Sub27 extends Class23_Sub4
{
	static int anInt3326;
	static int anInt3327 = 0;
	static int anInt3328;
	static int anInt3329;
	private int anInt3330;
	private int anInt3331 = 0;
	private int anInt3332 = 1;
	static int anInt3333;
	static int anInt3334;
	static int anInt3335;
	static RSString aClass16_3336 = Class38_Sub6.method1076((byte) 86, "Bitte warten Sie)3)3)3");
	static CRC32 aCRC32_3337 = new CRC32();
	static RSString aClass16_3338;
	static CacheArchive aClass105_Sub1_3339;
	static Class105 aClass105_3340;
	static boolean aBoolean3341;
	static long aLong3342;
	static int anInt3343 = 0;
	private static RSString aClass16_3344;
	static RSString aClass16_3345;
	
	final void method265(int i) {
		Class33.method968(2);
		anInt3329++;
		if (i != -21746) {
			aClass16_3344 = null;
		}
	}
	
	final void method255(Buffer class23_sub5, int i, int i_0_) {
		if (i_0_ != 1000) {
			aBoolean3341 = true;
		}
		int i_1_ = i;
	while_103_:
		do {
			do {
				if ((i_1_ ^ 0xffffffff) != -1) {
					if (i_1_ != 1) {
						if (i_1_ == 3) {
							break;
						}
						break while_103_;
					}
				} else {
					anInt3330 = class23_sub5.method461(-1797813752);
					break while_103_;
				}
				anInt3331 = class23_sub5.method461(-1797813752);
				break while_103_;
			} while (false);
			anInt3332 = class23_sub5.method461(-1797813752);
		} while (false);
		anInt3334++;
	}
	
	static final void method380(RSString class16, byte b, int i, int i_2_, int i_3_) {
		Class64 class64 = Class23_Sub13_Sub8_Sub1.method679(i_2_, i, (byte) -92);
		anInt3333++;
		if (class64 != null) {
			int i_4_ = -4 % ((b - 9) / 58);
			if (class64.anObjectArray1116 != null) {
				Class23_Sub9 class23_sub9 = new Class23_Sub9();
				class23_sub9.aClass16_2260 = class16;
				class23_sub9.anObjectArray2274 = class64.anObjectArray1116;
				class23_sub9.anInt2270 = i_3_;
				class23_sub9.aClass64_2263 = class64;
				Class91.method1452(class23_sub9, (byte) -126);
			}
			boolean bool = true;
			if (class64.anInt1149 > 0) {
				bool = Class38_Sub7_Sub1.method1092(class64, 205);
			}
			if (bool && Class63.method1215(13417, Class47.method1142(class64, 67), i_3_ - 1)) {
				if (i_3_ == 1) {
					Class23_Sub7.outBuffer.method486(230, 2976);
					Class23_Sub13_Sub25.anInt4286++;
					Class23_Sub7.outBuffer.writeIntBE(i_2_);
					Class23_Sub7.outBuffer.method443(i, (byte) 51);
				}
				if (i_3_ == 2) {
					Class71_Sub1_Sub1.anInt4449++;
					Class23_Sub7.outBuffer.method486(205, 2976);
					Class23_Sub7.outBuffer.writeIntBE(i_2_);
					Class23_Sub7.outBuffer.method443(i, (byte) 51);
				}
				if (i_3_ == 3) {
					Class63.anInt980++;
					Class23_Sub7.outBuffer.method486(127, 2976);
					Class23_Sub7.outBuffer.writeIntBE(i_2_);
					Class23_Sub7.outBuffer.method443(i, (byte) 51);
				}
				if (i_3_ == 4) {
					Class23_Sub7.outBuffer.method486(211, 2976);
					Class75.anInt1379++;
					Class23_Sub7.outBuffer.writeIntBE(i_2_);
					Class23_Sub7.outBuffer.method443(i, (byte) 51);
				}
				if (i_3_ == 5) {
					Class23_Sub7.outBuffer.method486(203, 2976);
					Class8.anInt171++;
					Class23_Sub7.outBuffer.writeIntBE(i_2_);
					Class23_Sub7.outBuffer.method443(i, (byte) 51);
				}
				if (i_3_ == 6) {
					Class23_Sub13_Sub6.anInt3731++;
					Class23_Sub7.outBuffer.method486(39, 2976);
					Class23_Sub7.outBuffer.writeIntBE(i_2_);
					Class23_Sub7.outBuffer.method443(i, (byte) 51);
				}
				if (i_3_ == 7) {
					Class23_Sub7.outBuffer.method486(187, 2976);
					Class23_Sub7.outBuffer.writeIntBE(i_2_);
					Class23_Sub7.outBuffer.method443(i, (byte) 51);
					Class23_Sub1.anInt2005++;
				}
				if (i_3_ == 8) {
					Class23_Sub7.outBuffer.method486(156, 2976);
					Class23_Sub7.outBuffer.writeIntBE(i_2_);
					Class23_Sub7.outBuffer.method443(i, (byte) 51);
					Class63.anInt979++;
				}
				if (i_3_ == 9) {
					Class71_Sub1.anInt2724++;
					Class23_Sub7.outBuffer.method486(128, 2976);
					Class23_Sub7.outBuffer.writeIntBE(i_2_);
					Class23_Sub7.outBuffer.method443(i, (byte) 51);
				}
				if (i_3_ == 10) {
					Class50.anInt781++;
					Class23_Sub7.outBuffer.method486(235, 2976);
					Class23_Sub7.outBuffer.writeIntBE(i_2_);
					Class23_Sub7.outBuffer.method443(i, (byte) 51);
				}
			}
		}
	}
	
	public Class23_Sub4_Sub27() {
		super(0, true);
		anInt3330 = 0;
	}
	
	final int[] method260(int i, int i_5_) {
		if (i != 0) {
			anInt3327 = -74;
		}
		int[] is = aClass99_2115.method1500(i_5_, (byte) -111);
		anInt3335++;
		if (aClass99_2115.aBoolean1681) {
			int i_6_ = Class23_Sub13_Sub16.anIntArray4049[i_5_];
			int i_7_ = i_6_ + -2048 >> 1;
			for (int i_8_ = 0; Class23_Sub4_Sub33.anInt3428 > i_8_; i_8_++) {
				int i_9_ = Class61.anIntArray967[i_8_];
				int i_10_ = i_9_ - 2048 >> 1;
				int i_11_;
				if (anInt3330 != 0) {
					int i_12_ = i_10_ * i_10_ - -(i_7_ * i_7_) >> 12;
					i_11_ = (int) (Math.sqrt((double) ((float) i_12_ / 4096.0F)) * 4096.0);
					i_11_ = (int) ((double) (anInt3332 * i_11_) * 3.141592653589793);
				} else {
					i_11_ = (i_9_ + -i_6_) * anInt3332;
				}
				i_11_ -= i_11_ & ~0xfff;
				if (anInt3331 != 0) {
					if (anInt3331 == 2) {
						i_11_ -= 2048;
						if (i_11_ < 0) {
							i_11_ = -i_11_;
						}
						i_11_ = -i_11_ + 2048 << 1;
					}
				} else {
					i_11_ = Class47.anIntArray739[i_11_ >> 4 & 0xff] + 4096 >> 1;
				}
				is[i_8_] = i_11_;
			}
		}
		return is;
	}
	
	public static void method381(boolean bool) {
		aClass105_Sub1_3339 = null;
		aClass16_3344 = null;
		aClass16_3336 = null;
		aClass105_3340 = null;
		aClass16_3338 = null;
		aClass16_3345 = null;
		if (bool == true) {
			aCRC32_3337 = null;
		}
	}
	
	static {
		aLong3342 = 0L;
		aClass16_3344 = Class38_Sub6.method1076((byte) 86, "Cancel");
		aClass16_3338 = aClass16_3344;
		aClass16_3345 = Class38_Sub6.method1076((byte) 86, " ");
	}
}
