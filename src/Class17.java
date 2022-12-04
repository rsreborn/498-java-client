/* Class17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class17
{
	static int anInt300;
	static int[][][] anIntArrayArrayArray301;
	static int anInt302;
	static RSString aClass16_303;
	static int anInt304;
	static int anInt305;
	static RSString aClass16_306;
	static RSString aClass16_307;
	static int[] anIntArray308 = new int[128];
	static Class102 aClass102_309;
	static Class105 aClass105_310;
	static int anInt311;
	static int anInt312;
	static Class105 aClass105_313;
	static RSString aClass16_314;
	static short[] aShortArray315 = new short[256];
	static int anInt316;
	private static RSString aClass16_317;
	
	abstract int method186(int i, byte b, int i_0_);
	
	public static void method187(boolean bool) {
		aClass16_314 = null;
		aClass105_313 = null;
		aShortArray315 = null;
		if (bool != true) {
			method190(null, -116);
		}
		aClass16_317 = null;
		aClass16_307 = null;
		anIntArray308 = null;
		aClass102_309 = null;
		aClass105_310 = null;
		aClass16_306 = null;
		anIntArrayArrayArray301 = null;
		aClass16_303 = null;
	}
	
	public Class17() {
		/* empty */
	}
	
	abstract void method188(int i);
	
	static final boolean method189(int i, int i_1_) {
		anInt316++;
		if (Class54.aBooleanArray859[i_1_]) {
			return true;
		}
		if (!Class71_Sub3.aClass105_2745.method1554((byte) -120, i_1_)) {
			return false;
		}
		int i_2_ = Class71_Sub3.aClass105_2745.method1558(26143, i_1_);
		if (i_2_ == 0) {
			Class54.aBooleanArray859[i_1_] = true;
			return true;
		}
		if (Class23_Sub4_Sub28.aClass64ArrayArray3350[i_1_] == null) {
			Class23_Sub4_Sub28.aClass64ArrayArray3350[i_1_] = new Class64[i_2_];
		}
		if (i != -10924) {
			return false;
		}
		for (int i_3_ = 0; (i_2_ ^ 0xffffffff) < (i_3_ ^ 0xffffffff); i_3_++) {
			if (Class23_Sub4_Sub28.aClass64ArrayArray3350[i_1_][i_3_] == null) {
				byte[] bs = Class71_Sub3.aClass105_2745.method1544(i_3_, 0, i_1_);
				if (bs != null) {
					Class23_Sub4_Sub28.aClass64ArrayArray3350[i_1_][i_3_] = new Class64();
					Class23_Sub4_Sub28.aClass64ArrayArray3350[i_1_][i_3_].anInt1098 = (i_1_ << 16) + i_3_;
					if (bs[0] == -1) {
						Class23_Sub4_Sub28.aClass64ArrayArray3350[i_1_][i_3_].method1224(new Buffer(bs), 1);
					} else {
						Class23_Sub4_Sub28.aClass64ArrayArray3350[i_1_][i_3_].method1218(20, new Buffer(bs));
					}
				}
			}
		}
		Class54.aBooleanArray859[i_1_] = true;
		return true;
	}
	
	static final void method190(byte[] bs, int i) {
		anInt312++;
		Buffer class23_sub5 = new Buffer(bs);
		int i_4_ = class23_sub5.getUShortBE();
		for (int i_5_ = 0; i_4_ > i_5_; i_5_++) {
			Class23_Sub21 class23_sub21 = new Class23_Sub21();
			RSString class16 = class23_sub5.readString(2);
			class23_sub21.anInt2412 = class23_sub5.getUShortBE();
			class23_sub21.anInt2415 = class23_sub5.getUShortBE();
			class23_sub21.anInt2405 = class23_sub5.readUByte();
			class23_sub21.aClass16_2411 = class16.method177(32, 47, 0);
			class23_sub21.aClass16Array2408 = class16.method168(false, 47);
			RSString.aClass89_1951.method1439(-100, class23_sub21);
		}
		int i_6_ = -1 % ((-24 - i) / 32);
	}
	
	static {
		anInt305 = 0;
		aClass16_317 = Class38_Sub6.method1076((byte) 86, "Take");
		aClass16_306 = Class38_Sub6.method1076((byte) 86, "settings=");
		aClass16_307 = aClass16_317;
		aClass16_314 = Class38_Sub6.method1076((byte) 86, "mapdots");
		aClass16_303 = Class38_Sub6.method1076((byte) 86, "sl_button");
		aClass102_309 = new Class102();
	}
}
