/* Class14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.event.KeyEvent;

public class Class14
{
	static int anInt269;
	static int anInt270;
	private Class105 aClass105_271;
	static int anInt272;
	private Class105 aClass105_273;
	static RSString aClass16_274 = Class38_Sub6.method1076((byte) 86, " )2> <col=ff9040>");
	static int anInt275;
	static RSString aClass16_276 = Class38_Sub6.method1076((byte) 86, "<br>");
	static RSString aClass16_277 = Class38_Sub6.method1076((byte) 86, "title)3jpg");
	static int anInt278;
	static int anInt279;
	static int anInt280;
	private oa anOa281 = new oa(256);
	static int anInt282;
	static int anInt283;
	static int anInt284;
	private oa anOa285 = new oa(256);
	static int anInt286;
	
	final Class23_Sub6_Sub1 method125(int i, int i_0_, int[] is) {
		anInt272++;
		if (i > -39) {
			aClass16_276 = null;
		}
		if (aClass105_271.method1556(-15) == 1) {
			return method133(true, is, i_0_, 0);
		}
		if (aClass105_271.method1558(26143, i_0_) == 1) {
			return method133(true, is, 0, i_0_);
		}
		throw new RuntimeException();
	}
	
	public static void method126(int i) {
		if (i > 0) {
			aClass16_277 = null;
			aClass16_276 = null;
			aClass16_274 = null;
		}
	}
	
	private final Class23_Sub6_Sub1 method127(int[] is, byte b, int i, int i_1_) {
		if (b <= 90) {
			return null;
		}
		anInt286++;
		int i_2_ = (i << 4 & 0xfffd | i >>> 12) ^ i_1_;
		i_2_ |= i << 16;
		long l = 0x100000000L ^ (long) i_2_;
		Class23_Sub6_Sub1 class23_sub6_sub1 = (Class23_Sub6_Sub1) anOa285.a((byte) -33, l);
		if (class23_sub6_sub1 != null) {
			return class23_sub6_sub1;
		}
		if (is != null && (is[0] ^ 0xffffffff) >= -1) {
			return null;
		}
		Class23_Sub3 class23_sub3 = (Class23_Sub3) anOa281.a((byte) -93, l);
		if (class23_sub3 == null) {
			class23_sub3 = Class23_Sub3.method246(aClass105_273, i, i_1_);
			if (class23_sub3 == null) {
				return null;
			}
			anOa281.a(class23_sub3, (byte) -14, l);
		}
		class23_sub6_sub1 = class23_sub3.method247(is);
		if (class23_sub6_sub1 == null) {
			return null;
		}
		class23_sub3.method228(0);
		anOa285.a(class23_sub6_sub1, (byte) -14, l);
		return class23_sub6_sub1;
	}
	
	static final Class23_Sub13_Sub8 method128(byte[] bs, boolean bool) {
		anInt282++;
		if (bool != false) {
			method128(null, false);
		}
		if (bs == null) {
			return null;
		}
		Class23_Sub13_Sub8_Sub1_Sub1 class23_sub13_sub8_sub1_sub1 = new Class23_Sub13_Sub8_Sub1_Sub1(bs, Class23_Sub23.anIntArray2417, Class23_Sub13_Sub2.anIntArray3679, Class79.anIntArray1875, Class105.anIntArray1766, Class23_Sub13_Sub23.aByteArrayArray4243);
		Class23_Sub13_Sub9.method684(!bool);
		return class23_sub13_sub8_sub1_sub1;
	}
	
	static final void method129(byte[] bs, int i) {
		anInt278++;
		Buffer class23_sub5 = new Buffer(bs);
		class23_sub5.position = bs.length - 2;
		Class23_Sub4_Sub20.anInt3229 = class23_sub5.method476((byte) -122);
		Class23_Sub23.anIntArray2417 = new int[Class23_Sub4_Sub20.anInt3229];
		Class23_Sub13_Sub2.anIntArray3679 = new int[Class23_Sub4_Sub20.anInt3229];
		Class105.anIntArray1766 = new int[Class23_Sub4_Sub20.anInt3229];
		Class23_Sub13_Sub23.aByteArrayArray4243 = new byte[Class23_Sub4_Sub20.anInt3229][];
		Class79.anIntArray1875 = new int[Class23_Sub4_Sub20.anInt3229];
		class23_sub5.position = -(8 * Class23_Sub4_Sub20.anInt3229) + -7 + bs.length;
		Class23_Sub12.anInt2301 = class23_sub5.method476((byte) -114);
		Class23_Sub13_Sub15.anInt4033 = class23_sub5.method476((byte) -103);
		int i_3_ = (class23_sub5.method461(i ^ ~0x6b2875f6) & 0xff) + 1;
		for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > (Class23_Sub4_Sub20.anInt3229 ^ 0xffffffff); i_4_++)
			Class23_Sub23.anIntArray2417[i_4_] = class23_sub5.method476((byte) -112);
		for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > (Class23_Sub4_Sub20.anInt3229 ^ 0xffffffff); i_5_++)
			Class23_Sub13_Sub2.anIntArray3679[i_5_] = class23_sub5.method476((byte) -101);
		for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > (Class23_Sub4_Sub20.anInt3229 ^ 0xffffffff); i_6_++)
			Class79.anIntArray1875[i_6_] = class23_sub5.method476((byte) -127);
		for (int i_7_ = 0; Class23_Sub4_Sub20.anInt3229 > i_7_; i_7_++)
			Class105.anIntArray1766[i_7_] = class23_sub5.method476((byte) -113);
		class23_sub5.position = -(Class23_Sub4_Sub20.anInt3229 * 8) + (bs.length + (-7 - (i_3_ - 1) * 3));
		Class23_Sub4_Sub1.anIntArray2890 = new int[i_3_];
		for (int i_8_ = i; i_8_ < i_3_; i_8_++) {
			Class23_Sub4_Sub1.anIntArray2890[i_8_] = class23_sub5.method471(Class104.method1531(i, 67));
			if (Class23_Sub4_Sub1.anIntArray2890[i_8_] == 0) {
				Class23_Sub4_Sub1.anIntArray2890[i_8_] = 1;
			}
		}
		class23_sub5.position = 0;
		for (int i_9_ = 0; i_9_ < Class23_Sub4_Sub20.anInt3229; i_9_++) {
			int i_10_ = Class79.anIntArray1875[i_9_];
			int i_11_ = Class105.anIntArray1766[i_9_];
			int i_12_ = i_11_ * i_10_;
			byte[] bs_13_ = new byte[i_12_];
			Class23_Sub13_Sub23.aByteArrayArray4243[i_9_] = bs_13_;
			int i_14_ = class23_sub5.method461(-1797813752);
			if ((i_14_ ^ 0xffffffff) != -1) {
				if (i_14_ == 1) {
					for (int i_15_ = 0; (i_15_ ^ 0xffffffff) > (i_10_ ^ 0xffffffff); i_15_++) {
						for (int i_16_ = 0; i_16_ < i_11_; i_16_++)
							bs_13_[i_15_ - -(i_10_ * i_16_)] = class23_sub5.method452(Class104.method1531(i, -16933671));
					}
				}
			} else {
				for (int i_17_ = 0; i_17_ < i_12_; i_17_++)
					bs_13_[i_17_] = class23_sub5.method452(-16933672);
			}
		}
	}
	
	static final void method130(Class105 class105, Class105 class105_18_, boolean bool) {
		if (bool == false) {
			Class23_Sub4_Sub11.aClass105_3072 = class105;
			anInt280++;
			Class23_Sub13_Sub21.aClass105_4193 = class105_18_;
		}
	}
	
	final Class23_Sub6_Sub1 method131(int[] is, boolean bool, int i) {
		anInt279++;
		if (bool != false) {
			aClass16_274 = null;
		}
		if (aClass105_273.method1556(112) == 1) {
			return method127(is, (byte) 100, 0, i);
		}
		if (aClass105_273.method1558(26143, i) == 1) {
			return method127(is, (byte) 112, i, 0);
		}
		throw new RuntimeException();
	}
	
	static final void method132(int i, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_) {
		if (i_21_ == 0) {
			Class104 class104 = new Class104(i_28_, i_29_, i_30_, i_31_, -1, i_36_, false);
			for (int i_38_ = i; i_38_ >= 0; i_38_--) {
				if (Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i_38_][i_19_][i_20_] == null) {
					Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i_38_][i_19_][i_20_] = new Class23_Sub1(i_38_, i_19_, i_20_);
				}
			}
			Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i][i_19_][i_20_].aClass104_2025 = class104;
		} else if (i_21_ == 1) {
			Class104 class104 = new Class104(i_32_, i_33_, i_34_, i_35_, i_23_, i_37_, i_24_ == i_25_ && i_24_ == i_26_ && i_24_ == i_27_);
			for (int i_39_ = i; i_39_ >= 0; i_39_--) {
				if (Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i_39_][i_19_][i_20_] == null) {
					Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i_39_][i_19_][i_20_] = new Class23_Sub1(i_39_, i_19_, i_20_);
				}
			}
			Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i][i_19_][i_20_].aClass104_2025 = class104;
		} else {
			Class52 class52 = new Class52(i_21_, i_22_, i_23_, i_19_, i_20_, i_24_, i_25_, i_26_, i_27_, i_28_, i_29_, i_30_, i_31_, i_32_, i_33_, i_34_, i_35_, i_36_, i_37_);
			for (int i_40_ = i; i_40_ >= 0; i_40_--) {
				if (Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i_40_][i_19_][i_20_] == null) {
					Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i_40_][i_19_][i_20_] = new Class23_Sub1(i_40_, i_19_, i_20_);
				}
			}
			Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i][i_19_][i_20_].aClass52_2023 = class52;
		}
	}
	
	private final Class23_Sub6_Sub1 method133(boolean bool, int[] is, int i, int i_41_) {
		anInt283++;
		if (bool != true) {
			anInt275 = -92;
		}
		int i_42_ = (i_41_ >>> 12 | (i_41_ & 0x70000fff) << 4) ^ i;
		i_42_ |= i_41_ << 16;
		long l = (long) i_42_;
		Class23_Sub6_Sub1 class23_sub6_sub1 = (Class23_Sub6_Sub1) anOa285.a((byte) 112, l);
		if (class23_sub6_sub1 != null) {
			return class23_sub6_sub1;
		}
		if (is != null && is[0] <= 0) {
			return null;
		}
		Class18 class18 = Class18.method195(aClass105_271, i_41_, i);
		if (class18 == null) {
			return null;
		}
		class23_sub6_sub1 = class18.method196();
		anOa285.a(class23_sub6_sub1, (byte) -14, l);
		if (is != null) {
			is[0] -= class23_sub6_sub1.aByteArray3544.length;
		}
		return class23_sub6_sub1;
	}
	
	static final int method134(KeyEvent keyevent, int i) {
		int i_43_ = keyevent.getKeyChar();
		anInt270++;
		if (i_43_ == 8364) {
			return 128;
		}
		if ((i_43_ ^ 0xffffffff) >= -1 || i_43_ >= 256) {
			i_43_ = -1;
		}
		if (i <= 95) {
			method132(-104, -64, 83, -66, 52, -98, -26, 111, -43, -91, -34, 92, 87, -31, -21, -40, -34, 122, -79, -74);
		}
		return i_43_;
	}
	
	static final int method135(int i, int i_44_, int i_45_) {
		anInt269++;
		if (i_45_ == -1) {
			return 12345678;
		}
		i_44_ = i_44_ * (i_45_ & 0x7f) >> 7;
		if (i_44_ < 2) {
			i_44_ = 2;
		} else if (i_44_ > 126) {
			i_44_ = 126;
		}
		if (i >= -17) {
			return 4;
		}
		return (i_45_ & 0xff80) - -i_44_;
	}
	
	Class14(Class105 class105, Class105 class105_46_) {
		aClass105_271 = class105;
		aClass105_273 = class105_46_;
	}
	
	static {
		anInt275 = 0;
	}
}
