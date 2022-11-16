/* Class23_Sub13_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub13_Sub12 extends Class23_Sub13
{
	static int anInt3962;
	static int anInt3963;
	static int anInt3964;
	static int anInt3965;
	protected int[] anIntArray3966;
	static Class64 aClass64_3967;
	static RSString aClass16_3968 = Class38_Sub6.method1076((byte) 86, "Der Anmelde)2Server ist offline)3");
	private RSString[] aClass16Array3969;
	static int anInt3970;
	static short aShort3971 = 205;
	static int anInt3972;
	static int anInt3973;
	private int[][] anIntArrayArray3974;
	static long aLong3975 = 0L;
	static int anInt3976;
	static int anInt3977;
	static int anInt3978;
	static int anInt3979;
	static int anInt3980;
	private int[] anIntArray3981;
	static int anInt3982;
	
	static final int method744(int i, int i_0_) {
		if (i != 1782395528) {
			method756(-117, -101);
		}
		anInt3964++;
		return i_0_ >>> 8;
	}
	
	final int method745(int i, int i_1_, int i_2_) {
		if (i_1_ > -119) {
			return 34;
		}
		anInt3982++;
		if (anIntArray3981 == null || i < 0 || i > anIntArray3981.length) {
			return -1;
		}
		if (anIntArrayArray3974[i] == null || i_2_ < 0 || anIntArrayArray3974[i].length < i_2_) {
			return -1;
		}
		return anIntArrayArray3974[i][i_2_];
	}
	
	static final Object method746(byte[] bs, boolean bool, boolean bool_3_) {
		if (bool != true) {
			return null;
		}
		anInt3980++;
		if (bs == null) {
			return null;
		}
		if (bs.length > 136 && !Class23_Sub13_Sub2.aBoolean3677) {
			try {
				Class63 class63 = (Class63) Class.forName("Class63_Sub1").newInstance();
				class63.method1207(bs, bool);
				return class63;
			} catch (Throwable throwable) {
				Class23_Sub13_Sub2.aBoolean3677 = true;
			}
		}
		if (!bool_3_) {
			return bs;
		}
		return Class23_Sub24.method904(bs, (byte) 118);
	}
	
	private final void method747(byte b, Buffer class23_sub5, int i) {
		anInt3978++;
		if (b >= -115) {
			method747((byte) 49, null, -8);
		}
		if (i != 1) {
			if (i != 2) {
				if (i == 3) {
					int i_4_ = class23_sub5.method461(-1797813752);
					anIntArrayArray3974 = new int[i_4_][];
					anIntArray3981 = new int[i_4_];
					for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
						int i_6_ = class23_sub5.method476((byte) -98);
						anIntArray3981[i_5_] = i_6_;
						anIntArrayArray3974[i_5_] = new int[Class23_Sub13_Sub14.anIntArray4001[i_6_]];
						for (int i_7_ = 0; (Class23_Sub13_Sub14.anIntArray4001[i_6_] ^ 0xffffffff) < (i_7_ ^ 0xffffffff); i_7_++)
							anIntArrayArray3974[i_5_][i_7_] = class23_sub5.method476((byte) -118);
					}
				}
			} else {
				int i_8_ = class23_sub5.method461(-1797813752);
				anIntArray3966 = new int[i_8_];
				for (int i_9_ = 0; i_8_ > i_9_; i_9_++)
					anIntArray3966[i_9_] = class23_sub5.method476((byte) -120);
			}
		} else {
			aClass16Array3969 = class23_sub5.method426(2).method168(false, 60);
		}
	}
	
	static final void method748(int i, Class72[] class72s, int i_10_, byte b, boolean bool, byte[] bs) {
		anInt3963++;
		Buffer class23_sub5 = new Buffer(bs);
		int i_11_ = -1;
		for (;;) {
			int i_12_ = class23_sub5.method447((byte) -121);
			if (i_12_ == 0) {
				break;
			}
			int i_13_ = 0;
			i_11_ += i_12_;
			for (;;) {
				int i_14_ = class23_sub5.method432((byte) 20);
				if (i_14_ == 0) {
					break;
				}
				i_13_ += -1 + i_14_;
				int i_15_ = i_13_ >> 12;
				int i_16_ = i_13_ & 0x3f;
				int i_17_ = class23_sub5.method461(-1797813752);
				int i_18_ = i_16_ + i;
				int i_19_ = i_17_ >> 2;
				int i_20_ = (0xfd8 & i_13_) >> 6;
				int i_21_ = 0x3 & i_17_;
				int i_22_ = i_20_ - -i_10_;
				if (i_22_ > 0 && (i_18_ ^ 0xffffffff) < -1 && i_22_ < 103 && i_18_ < 103) {
					Class72 class72 = null;
					if (!bool) {
						int i_23_ = i_15_;
						if ((Class23_Sub4_Sub30.aByteArrayArrayArray3379[1][i_22_][i_18_] & 0x2) == 2) {
							i_23_--;
						}
						if ((i_23_ ^ 0xffffffff) <= -1) {
							class72 = class72s[i_23_];
						}
					}
					Class35.method984(i_18_, class72, i_21_, Class7.aBoolean170, i_15_, !bool, i_19_, 105, i_15_, i_22_, bool, i_11_);
				}
			}
		}
		if (b > -52) {
			aClass64_3967 = null;
		}
	}
	
	final RSString method749(byte b) {
		int i = 99 / ((-58 - b) / 42);
		anInt3972++;
		RSString class16 = Class38_Sub6.method1075(80, 0);
		class16.method157(aClass16Array3969[0], (byte) 122);
		for (int i_24_ = 1; (aClass16Array3969.length ^ 0xffffffff) < (i_24_ ^ 0xffffffff); i_24_++) {
			class16.method157(Class23_Sub13_Sub11.aClass16_3958, (byte) 109);
			class16.method157(aClass16Array3969[i_24_], (byte) 102);
		}
		return class16.method178((byte) -11);
	}
	
	final void method750(Buffer class23_sub5, int i, int[] is) {
		anInt3970++;
		if (anIntArray3981 != null) {
			if (i != 4056) {
				method752(null, -88);
			}
			for (int i_25_ = 0; i_25_ < anIntArray3981.length && (i_25_ ^ 0xffffffff) > (is.length ^ 0xffffffff); i_25_++) {
				int i_26_ = Applet_Sub1.anIntArray42[method751(0, i_25_)];
				if ((i_26_ ^ 0xffffffff) < -1) {
					class23_sub5.method448(44, i_26_, (long) is[i_25_]);
				}
			}
		}
	}
	
	final int method751(int i, int i_27_) {
		anInt3977++;
		if (anIntArray3981 == null || i_27_ < 0 || (anIntArray3981.length ^ 0xffffffff) > (i_27_ ^ 0xffffffff)) {
			return -1;
		}
		if (i != 0) {
			return -23;
		}
		return anIntArray3981[i_27_];
	}
	
	final RSString method752(Buffer class23_sub5, int i) {
		RSString class16 = Class38_Sub6.method1075(80, i);
		if (anIntArray3981 != null) {
			for (int i_28_ = 0; (anIntArray3981.length ^ 0xffffffff) < (i_28_ ^ 0xffffffff); i_28_++) {
				class16.method157(aClass16Array3969[i_28_], (byte) 101);
				class16.method157(Class71.method1265(-6, anIntArray3981[i_28_], class23_sub5.method449(Class44.anIntArray672[anIntArray3981[i_28_]], 0), anIntArrayArray3974[i_28_]), (byte) 100);
			}
		}
		class16.method157(aClass16Array3969[-1 + aClass16Array3969.length], (byte) 116);
		anInt3976++;
		return class16.method178((byte) -11);
	}
	
	final int method753(int i) {
		if (i != 0) {
			aShort3971 = (short) 13;
		}
		anInt3965++;
		if (anIntArray3981 == null) {
			return 0;
		}
		return anIntArray3981.length;
	}
	
	public static void method754(int i) {
		aClass16_3968 = null;
		aClass64_3967 = null;
		if (i != -4) {
			aClass16_3968 = null;
		}
	}
	
	final void method755(Buffer class23_sub5, int i) {
		if (i != -28386) {
			aClass16Array3969 = null;
		}
		for (;;) {
			int i_29_ = class23_sub5.method461(-1797813752);
			if ((i_29_ ^ 0xffffffff) == -1) {
				break;
			}
			method747((byte) -125, class23_sub5, i_29_);
		}
		anInt3979++;
	}
	
	static final int method756(int i, int i_30_) {
		anInt3973++;
		if (i_30_ != 1) {
			return -53;
		}
		return 0x3ff & i;
	}
}
