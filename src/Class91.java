/* Class91 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class91
{
	private static RSString aClass16_1548 = Class38_Sub6.method1076((byte) 86, "Please subscribe)1 or use a different world)3");
	static int anInt1549;
	static int anInt1550;
	static int anInt1551;
	static RSString aClass16_1552;
	static int anInt1553;
	static Class18[] aClass18Array1554 = new Class18[50];
	static int anInt1555;
	static int anInt1556;
	static int anInt1557;
	static RSString aClass16_1558;
	static RSString aClass16_1559;
	
	static final synchronized byte[] method1449(byte b, int i) {
		anInt1549++;
		if (b >= -114) {
			return null;
		}
		if (i == 100 && Class23_Sub4_Sub35.anInt3453 > 0) {
			byte[] bs = Canvas_Sub1.aByteArrayArray54[--Class23_Sub4_Sub35.anInt3453];
			Canvas_Sub1.aByteArrayArray54[Class23_Sub4_Sub35.anInt3453] = null;
			return bs;
		}
		if (i == 5000 && (Class95.anInt1617 ^ 0xffffffff) < -1) {
			byte[] bs = Class11.aByteArrayArray231[--Class95.anInt1617];
			Class11.aByteArrayArray231[Class95.anInt1617] = null;
			return bs;
		}
		if (i == 30000 && Class34.anInt531 > 0) {
			byte[] bs = Class23_Sub4_Sub16.aByteArrayArray3163[--Class34.anInt531];
			Class23_Sub4_Sub16.aByteArrayArray3163[Class34.anInt531] = null;
			return bs;
		}
		return new byte[i];
	}
	
	static final void method1450(byte b, Class64 class64) {
		if (b == 29) {
			anInt1555++;
			if (Class23_Sub4_Sub14.anInt3120 == class64.anInt1144) {
				Class23_Sub4_Sub23_Sub1.aBooleanArray4478[class64.anInt1078] = true;
			}
		}
	}
	
	static final RSString method1451(int i, int i_0_) {
		anInt1550++;
		if (i < 100000) {
			return Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub10_Sub2.aClass16_3600, Class23_Sub4_Sub23.method360((byte) -9, i), Class38_Sub7_Sub2.aClass16_4406 }, i_0_ + 19937);
		}
		if (i < 10000000) {
			return Class23_Sub4_Sub14.method322(new RSString[] { Class26.aClass16_402, Class23_Sub4_Sub23.method360((byte) -9, i / 1000), Class42.aClass16_652, Class38_Sub7_Sub2.aClass16_4406 }, -118);
		}
		if (i_0_ != -19978) {
			return null;
		}
		return Class23_Sub4_Sub14.method322(new RSString[] { Class104.aClass16_1738, Class23_Sub4_Sub23.method360((byte) -9, i / 1000000), Class2.aClass16_76, Class38_Sub7_Sub2.aClass16_4406 }, i_0_ + 19867);
	}
	
	static final void method1452(Class23_Sub9 class23_sub9, byte b) {
		Class23_Sub23.method896(200000, class23_sub9, true);
		anInt1551++;
		if (b > -87) {
			method1449((byte) -31, -6);
		}
	}
	
	static final boolean method1453(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, Class38 class38, int i_6_, long l) {
		if (class38 == null) {
			return true;
		}
		int i_7_ = i_1_ * 128 + 64 * i_4_;
		int i_8_ = i_2_ * 128 + 64 * i_5_;
		return Class23_Sub4_Sub17.method334(i, i_1_, i_2_, i_4_, i_5_, i_7_, i_8_, i_3_, class38, i_6_, false, l);
	}
	
	static final Class43_Sub1 method1454(Class105 class105, int i, int i_9_, byte b) {
		if (b <= 21) {
			aClass16_1548 = null;
		}
		anInt1553++;
		if (!Class23_Sub4_Sub29.method385(class105, 0, i_9_, i)) {
			return null;
		}
		return Class50.method1158((byte) -106);
	}
	
	static final void method1455(byte b, int i, int i_10_, int i_11_, int i_12_, int i_13_) {
		if (b == -51) {
			if (i_11_ <= Class23_Sub4_Sub33.anInt3435 && i_10_ >= Class88.anInt1503) {
				boolean bool;
				if ((i_13_ ^ 0xffffffff) > (Class23_Sub13_Sub6.anInt3728 ^ 0xffffffff)) {
					i_13_ = Class23_Sub13_Sub6.anInt3728;
					bool = false;
				} else if ((Class35.anInt554 ^ 0xffffffff) <= (i_13_ ^ 0xffffffff)) {
					bool = true;
				} else {
					i_13_ = Class35.anInt554;
					bool = false;
				}
				boolean bool_14_;
				if ((i_12_ ^ 0xffffffff) > (Class23_Sub13_Sub6.anInt3728 ^ 0xffffffff)) {
					bool_14_ = false;
					i_12_ = Class23_Sub13_Sub6.anInt3728;
				} else if (Class35.anInt554 < i_12_) {
					bool_14_ = false;
					i_12_ = Class35.anInt554;
				} else {
					bool_14_ = true;
				}
				if ((i_11_ ^ 0xffffffff) > (Class88.anInt1503 ^ 0xffffffff)) {
					i_11_ = Class88.anInt1503;
				} else {
					Class23_Sub13_Sub6.method632(i_13_, (byte) -30, i, Class4.anIntArrayArray98[i_11_++], i_12_);
				}
				if (i_10_ > Class23_Sub4_Sub33.anInt3435) {
					i_10_ = Class23_Sub4_Sub33.anInt3435;
				} else {
					Class23_Sub13_Sub6.method632(i_13_, (byte) -30, i, Class4.anIntArrayArray98[i_10_--], i_12_);
				}
				if (bool_14_ && bool) {
					for (int i_15_ = i_11_; i_10_ >= i_15_; i_15_++) {
						int[] is = Class4.anIntArrayArray98[i_15_];
						is[i_12_] = is[i_13_] = i;
					}
				} else if (!bool_14_) {
					if (bool) {
						for (int i_16_ = i_11_; (i_10_ ^ 0xffffffff) <= (i_16_ ^ 0xffffffff); i_16_++)
							Class4.anIntArrayArray98[i_16_][i_13_] = i;
					}
				} else {
					for (int i_17_ = i_11_; (i_17_ ^ 0xffffffff) >= (i_10_ ^ 0xffffffff); i_17_++)
						Class4.anIntArrayArray98[i_17_][i_12_] = i;
				}
			}
			anInt1557++;
		}
	}
	
	public static void method1456(int i) {
		aClass16_1548 = null;
		aClass16_1558 = null;
		aClass18Array1554 = null;
		aClass16_1559 = null;
		aClass16_1552 = null;
		if (i != -30192) {
			method1452(null, (byte) 12);
		}
	}
	
	static {
		aClass16_1552 = Class38_Sub6.method1076((byte) 86, "<col=ff3000>");
		anInt1556 = 20;
		aClass16_1558 = Class38_Sub6.method1076((byte) 86, "event_opbase");
		aClass16_1559 = aClass16_1548;
	}
}
