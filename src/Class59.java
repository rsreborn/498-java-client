/* Class59 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class59
{
	static Class23_Sub1[][][] aClass23_Sub1ArrayArrayArray912;
	static int anInt913;
	protected int anInt914;
	private static RSString aClass16_915 = Class38_Sub6.method1076((byte) 86, "Please enter your password)3");
	static int anInt916;
	static RSString aClass16_917 = Class38_Sub6.method1076((byte) 86, "Versteckt");
	static volatile int anInt918 = 0;
	static RSString aClass16_919;
	static int anInt920;
	protected int anInt921;
	protected int anInt922;
	protected int anInt923;
	static RSString aClass16_924 = Class38_Sub6.method1076((byte) 86, "da dieser Computer gegen unsere ");
	static RSString aClass16_925;
	static RSString aClass16_926 = aClass16_915;
	protected int anInt927;
	static RSString aClass16_928 = Class38_Sub6.method1076((byte) 86, "::rect_debug");
	protected int anInt929;
	protected int anInt930;
	static int anInt931;
	protected int anInt932;
	private static RSString aClass16_933;
	private static RSString aClass16_934;
	static int anInt935;
	protected int anInt936;
	static RSString aClass16_937;
	protected int anInt938;
	protected int anInt939;
	static RSString aClass16_940 = Class38_Sub6.method1076((byte) 86, ")1 ");
	protected int anInt941;
	protected int anInt942;
	protected int anInt943;
	protected int anInt944;
	static int anInt945;
	static int anInt946 = 0;
	protected int anInt947;
	protected int anInt948;
	protected int anInt949;
	
	public static void method1194(int i) {
		aClass16_917 = null;
		if (i != 2048) {
			aClass16_934 = null;
		}
		aClass16_925 = null;
		aClass16_934 = null;
		aClass16_928 = null;
		aClass16_926 = null;
		aClass16_919 = null;
		aClass16_933 = null;
		aClass23_Sub1ArrayArrayArray912 = null;
		aClass16_937 = null;
		aClass16_940 = null;
		aClass16_924 = null;
		aClass16_915 = null;
	}
	
	static final void method1195(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		int i_7_ = 2048 + -i_0_ & 0x7ff;
		int i_8_ = 0x7ff & 2048 - i_2_;
		int i_9_ = 0;
		int i_10_ = 0;
		anInt945++;
		int i_11_ = i_3_;
		if (i_7_ != 0) {
			int i_12_ = Class76.anIntArray1386[i_7_];
			int i_13_ = Class76.anIntArray1395[i_7_];
			int i_14_ = i_12_ * -i_11_ >> 16;
			i_11_ = i_11_ * i_13_ >> 16;
			i_9_ = i_14_;
		}
		if (i_4_ == -31127) {
			if (i_8_ != 0) {
				int i_15_ = Class76.anIntArray1386[i_8_];
				int i_16_ = Class76.anIntArray1395[i_8_];
				int i_17_ = i_11_ * i_15_ >> 16;
				i_10_ = i_17_;
				i_11_ = i_11_ * i_16_ >> 16;
			}
			Class10.anInt208 = i_2_;
			Class53.anInt838 = -i_11_ + i;
			Class23_Sub13_Sub1.anInt3673 = -i_10_ + i_5_;
			Class23_Sub23.anInt2424 = -i_9_ + i_1_;
			Class23_Sub4_Sub17.anInt3178 = i_0_;
		}
	}
	
	static final Class23_Sub13_Sub23 method1196(int i, int i_18_) {
		Class23_Sub13_Sub23 class23_sub13_sub23 = (Class23_Sub13_Sub23) Class23_Sub10_Sub3.aClass5_3649.method62(-107, (long) i);
		anInt916++;
		if (class23_sub13_sub23 != null) {
			return class23_sub13_sub23;
		}
		byte[] bs = Class69.aClass105_Sub1_1214.method1544(0, 0, i);
		if (bs == null) {
			return null;
		}
		class23_sub13_sub23 = new Class23_Sub13_Sub23();
		if (i_18_ != -17384) {
			method1195(112, 104, -45, -80, 52, -2, 21, -79);
		}
		Buffer class23_sub5 = new Buffer(bs);
		class23_sub5.position = -2 + class23_sub5.payload.length;
		int i_19_ = class23_sub5.method476((byte) -110);
		int i_20_ = -14 + class23_sub5.payload.length - i_19_;
		class23_sub5.position = i_20_;
		int i_21_ = class23_sub5.method472(-5);
		class23_sub13_sub23.anInt4247 = class23_sub5.method476((byte) -101);
		class23_sub13_sub23.anInt4234 = class23_sub5.method476((byte) -108);
		class23_sub13_sub23.anInt4241 = class23_sub5.method476((byte) -120);
		class23_sub13_sub23.anInt4246 = class23_sub5.method476((byte) -118);
		int i_22_ = class23_sub5.method461(-1797813752);
		if (i_22_ > 0) {
			class23_sub13_sub23.anOaArray4235 = new oa[i_22_];
			for (int i_23_ = 0; (i_23_ ^ 0xffffffff) > (i_22_ ^ 0xffffffff); i_23_++) {
				int i_24_ = class23_sub5.method476((byte) -117);
				oa var_oa = new oa(RuntimeException_Sub1.method1586((byte) -51, i_24_));
				class23_sub13_sub23.anOaArray4235[i_23_] = var_oa;
				while ((i_24_-- ^ 0xffffffff) < -1) {
					int i_25_ = class23_sub5.method472(-39);
					int i_26_ = class23_sub5.method472(i_18_ ^ 0x43c6);
					var_oa.a(new Class23_Sub20(i_26_), (byte) -14, (long) i_25_);
				}
			}
		}
		class23_sub5.position = 0;
		class23_sub13_sub23.aClass16_4251 = class23_sub5.method451((byte) -115);
		class23_sub13_sub23.anIntArray4253 = new int[i_21_];
		class23_sub13_sub23.aClass16Array4237 = new RSString[i_21_];
		class23_sub13_sub23.anIntArray4236 = new int[i_21_];
		int i_27_ = 0;
		while (i_20_ > class23_sub5.position) {
			int i_28_ = class23_sub5.method476((byte) -120);
			if (i_28_ != 3) {
				if (i_28_ < 100 && i_28_ != 21 && i_28_ != 38 && i_28_ != 39) {
					class23_sub13_sub23.anIntArray4253[i_27_] = class23_sub5.method472(117);
				} else {
					class23_sub13_sub23.anIntArray4253[i_27_] = class23_sub5.method461(-1797813752);
				}
			} else {
				class23_sub13_sub23.aClass16Array4237[i_27_] = class23_sub5.method426(2);
			}
			class23_sub13_sub23.anIntArray4236[i_27_++] = i_28_;
		}
		Class23_Sub10_Sub3.aClass5_3649.method67((long) i, class23_sub13_sub23, true);
		return class23_sub13_sub23;
	}
	
	Class59() {
		/* empty */
	}
	
	static {
		aClass16_934 = Class38_Sub6.method1076((byte) 86, "Players");
		aClass16_937 = Class38_Sub6.method1076((byte) 86, "bevor Sie den Vorgang wiederholen)3");
		aClass16_925 = aClass16_934;
		aClass16_933 = Class38_Sub6.method1076((byte) 86, "No response from server)3");
		anInt935 = -1;
		aClass16_919 = aClass16_933;
	}
}
