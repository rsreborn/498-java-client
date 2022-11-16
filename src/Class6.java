/* Class6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

class Class6
{
	static int anInt126;
	private long aLong127;
	static RSString aClass16_128 = Class38_Sub6.method1076((byte) 86, " weitere Optionen");
	static int anInt129;
	private Class23_Sub10 aClass23_Sub10_130;
	static int anInt131;
	protected int[] anIntArray132;
	static int anInt133;
	static int anInt134;
	static int anInt135;
	static RSString aClass16_136;
	static int anInt137;
	private int anInt138 = 32;
	static int anInt139;
	static int anInt140;
	static RSString aClass16_141 = Class38_Sub6.method1076((byte) 86, "; Max)2Age=");
	static int anInt142;
	static int anInt143;
	static int[] anIntArray144;
	static int anInt145;
	static int anInt146;
	static int anInt147;
	static int anInt148;
	private int anInt149;
	protected int anInt150;
	private boolean aBoolean151;
	private int anInt152;
	private Class23_Sub10[] aClass23_Sub10Array153;
	private int anInt154;
	private Class23_Sub10[] aClass23_Sub10Array155;
	private int anInt156;
	private long aLong157;
	protected int anInt158;
	private int anInt159;
	private long aLong160;
	
	final synchronized void method71(boolean bool) {
		anInt139++;
		aBoolean151 = true;
		try {
			method82();
		} catch (Exception exception) {
			method83();
			aLong157 = 2000L + Class94.method1466(22624);
		}
		if (bool != false) {
			method75(-69);
		}
	}
	
	final synchronized void method72(int i) {
		anInt135++;
		if (Class28.aClass33_428 != null) {
			boolean bool = true;
			for (int i_0_ = 0; i_0_ < 2; i_0_++) {
				if (this == Class28.aClass33_428.aClass6Array512[i_0_]) {
					Class28.aClass33_428.aClass6Array512[i_0_] = null;
				}
				if (Class28.aClass33_428.aClass6Array512[i_0_] != null) {
					bool = false;
				}
			}
			if (bool) {
				Class28.aClass33_428.aBoolean511 = true;
				while (Class28.aClass33_428.aBoolean517)
					Class105.method1545((byte) -110, 50L);
				Class28.aClass33_428 = null;
			}
		}
		method83();
		if (i != 0) {
			method71(false);
		}
		anIntArray132 = null;
	}
	
	private final void method73(byte b, int i, Class23_Sub10 class23_sub10) {
		anInt147++;
		int i_1_ = i >> 5;
		Class23_Sub10 class23_sub10_2_ = aClass23_Sub10Array153[i_1_];
		if (class23_sub10_2_ != null) {
			class23_sub10_2_.aClass23_Sub10_2277 = class23_sub10;
		} else {
			aClass23_Sub10Array155[i_1_] = class23_sub10;
		}
		aClass23_Sub10Array153[i_1_] = class23_sub10;
		if (b == -41) {
			class23_sub10.anInt2275 = i;
		}
	}
	
	private final void method74(byte b, int i) {
		anInt156 -= i;
		anInt148++;
		if ((anInt156 ^ 0xffffffff) > -1) {
			anInt156 = 0;
		}
		if (aClass23_Sub10_130 != null) {
			aClass23_Sub10_130.method507(i);
		}
		if (b >= -126) {
			aLong127 = 37L;
		}
	}
	
	public static void method75(int i) {
		aClass16_141 = null;
		anIntArray144 = null;
		aClass16_136 = null;
		if (i == -15675) {
			aClass16_128 = null;
		}
	}
	
	static final void method76(int i, int i_3_) {
		anInt129++;
		if (Class17.method189(-10924, i_3_) && i == 15532) {
			Class64[] class64s = Class23_Sub4_Sub28.aClass64ArrayArray3350[i_3_];
			for (int i_4_ = 0; (class64s.length ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++) {
				Class64 class64 = class64s[i_4_];
				if (class64 != null) {
					class64.anInt1020 = 0;
					class64.anInt1100 = 0;
				}
			}
		}
	}
	
	final void method77(int i) {
		aBoolean151 = true;
		if (i == 256) {
			anInt140++;
		}
	}
	
	final synchronized void method78(Class23_Sub10 class23_sub10, int i) {
		aClass23_Sub10_130 = class23_sub10;
		anInt145++;
		if (i != -15878) {
			aClass16_128 = null;
		}
	}
	
	void method79() throws Exception {
		anInt146++;
	}
	
	int method80() throws Exception {
		anInt126++;
		return anInt150;
	}
	
	void method81(Component component) throws Exception {
		anInt142++;
	}
	
	void method82() throws Exception {
		anInt143++;
	}
	
	void method83() {
		anInt137++;
	}
	
	static final void method84(boolean bool) {
		anInt134++;
		synchronized (CacheIndex.aClass11_264) {
			Class39.anInt605++;
			Class8.anInt175 = Class19.anInt325;
			Class23_Sub4_Sub14.anInt3126 = Class23_Sub4_Sub34.anInt3449;
			if (bool != true) {
				method76(46, -81);
			}
			Class102.anInt1701 = Class23_Sub26.anInt2469;
			Class23_Sub13_Sub9.anInt3860 = Class59.anInt918;
			Class90.anInt1538 = Class79.anInt1888;
			Class23_Sub13_Sub19.anInt4136 = Class23_Sub4_Sub23.anInt3289;
			Class23_Sub13_Sub12.aLong3975 = Class23_Sub4_Sub37.aLong3497;
			Class59.anInt918 = 0;
		}
	}
	
	final synchronized void method85(byte b) {
		anInt133++;
		if (anIntArray132 != null) {
			long l = Class94.method1466(22624);
			try {
				if ((aLong157 ^ 0xffffffffffffffffL) != -1L) {
					if (aLong157 > l) {
						return;
					}
					method86(anInt150);
					aLong157 = 0L;
					aBoolean151 = true;
				}
				int i = method80();
				int i_5_ = anInt158 + anInt149;
				if (256 + i_5_ > 16384) {
					i_5_ = 16128;
				}
				if ((-i + anInt154 ^ 0xffffffff) < (anInt152 ^ 0xffffffff)) {
					anInt152 = anInt154 - i;
				}
				if ((i_5_ - -256 ^ 0xffffffff) < (anInt150 ^ 0xffffffff)) {
					anInt150 += 1024;
					i = 0;
					if (anInt150 > 16384) {
						anInt150 = 16384;
					}
					method83();
					method86(anInt150);
					aBoolean151 = true;
					if ((anInt150 ^ 0xffffffff) > (i_5_ + 256 ^ 0xffffffff)) {
						i_5_ = anInt150 + -256;
						anInt149 = -anInt158 + i_5_;
					}
				}
				for (/**/; (i_5_ ^ 0xffffffff) < (i ^ 0xffffffff); i += 256) {
					method87(anIntArray132, 256);
					method79();
				}
				if ((aLong160 ^ 0xffffffffffffffffL) > (l ^ 0xffffffffffffffffL)) {
					if (aBoolean151) {
						aBoolean151 = false;
					} else {
						if ((anInt152 ^ 0xffffffff) == -1 && anInt159 == 0) {
							method83();
							aLong157 = 2000L + l;
							return;
						}
						anInt149 = Math.min(anInt159, anInt152);
						anInt159 = anInt152;
					}
					aLong160 = l - -2000L;
					anInt152 = 0;
				}
				if (b != -39) {
					anInt159 = -2;
				}
				anInt154 = i;
			} catch (Exception exception) {
				method83();
				aLong157 = 2000L + l;
			}
			try {
				if ((l ^ 0xffffffffffffffffL) < (500000L + aLong127 ^ 0xffffffffffffffffL)) {
					l = aLong127;
				}
				for (/**/; (l ^ 0xffffffffffffffffL) < (aLong127 - -5000L ^ 0xffffffffffffffffL); aLong127 += (long) (256000 / Class32.anInt498))
					method74((byte) -127, 256);
			} catch (Exception exception) {
				aLong127 = l;
			}
		}
	}
	
	void method86(int i) throws Exception {
		anInt131++;
	}
	
	private final void method87(int[] is, int i) {
		int i_6_ = i;
		if (CacheIndex.aBoolean257) {
			i_6_ <<= 1;
		}
		Class3.method54(is, 0, i_6_);
		anInt156 -= i;
		if (aClass23_Sub10_130 != null && anInt156 <= 0) {
			anInt156 += Class32.anInt498 >> 4;
			client.method40(aClass23_Sub10_130, true);
			method73((byte) -41, aClass23_Sub10_130.method505(), aClass23_Sub10_130);
			int i_7_ = 0;
			int i_8_ = 255;
			int i_9_ = 7;
		while_8_:
			while (i_8_ != 0) {
				int i_10_;
				int i_11_;
				if (i_9_ < 0) {
					i_10_ = i_9_ & 0x3;
					i_11_ = -(i_9_ >> 2);
				} else {
					i_10_ = i_9_;
					i_11_ = 0;
				}
				for (int i_12_ = i_8_ >>> i_10_ & 0x11111111; i_12_ != 0; i_12_ >>>= 4) {
					if ((i_12_ & 0x1) != 0) {
						i_8_ &= 1 << i_10_ ^ 0xffffffff;
						Class23_Sub10 class23_sub10 = null;
						Class23_Sub10 class23_sub10_13_ = aClass23_Sub10Array155[i_10_];
						while (class23_sub10_13_ != null) {
							Class23_Sub6 class23_sub6 = class23_sub10_13_.aClass23_Sub6_2278;
							if (class23_sub6 != null && class23_sub6.anInt2193 > i_11_) {
								i_8_ |= 1 << i_10_;
								class23_sub10 = class23_sub10_13_;
								class23_sub10_13_ = class23_sub10_13_.aClass23_Sub10_2277;
							} else {
								class23_sub10_13_.aBoolean2276 = true;
								int i_14_ = class23_sub10_13_.method501();
								i_7_ += i_14_;
								if (class23_sub6 != null) {
									class23_sub6.anInt2193 += i_14_;
								}
								if (i_7_ >= anInt138) {
									break while_8_;
								}
								Class23_Sub10 class23_sub10_15_ = class23_sub10_13_.method503();
								if (class23_sub10_15_ != null) {
									int i_16_ = class23_sub10_13_.anInt2275;
									for (/**/; class23_sub10_15_ != null; class23_sub10_15_ = class23_sub10_13_.method502())
										method73((byte) -41, i_16_ * class23_sub10_15_.method505() >> 8, class23_sub10_15_);
								}
								Class23_Sub10 class23_sub10_17_ = class23_sub10_13_.aClass23_Sub10_2277;
								class23_sub10_13_.aClass23_Sub10_2277 = null;
								if (class23_sub10 == null) {
									aClass23_Sub10Array155[i_10_] = class23_sub10_17_;
								} else {
									class23_sub10.aClass23_Sub10_2277 = class23_sub10_17_;
								}
								if (class23_sub10_17_ == null) {
									aClass23_Sub10Array153[i_10_] = class23_sub10;
								}
								class23_sub10_13_ = class23_sub10_17_;
							}
						}
					}
					i_10_ += 4;
					i_11_++;
				}
				i_9_--;
			}
			for (int i_18_ = 0; i_18_ < 8; i_18_++) {
				Class23_Sub10 class23_sub10 = aClass23_Sub10Array155[i_18_];
				aClass23_Sub10Array155[i_18_] = aClass23_Sub10Array153[i_18_] = null;
				Class23_Sub10 class23_sub10_19_;
				for (/**/; class23_sub10 != null; class23_sub10 = class23_sub10_19_) {
					class23_sub10_19_ = class23_sub10.aClass23_Sub10_2277;
					class23_sub10.aClass23_Sub10_2277 = null;
				}
			}
		}
		if (anInt156 < 0) {
			anInt156 = 0;
		}
		if (aClass23_Sub10_130 != null) {
			aClass23_Sub10_130.method506(is, 0, i);
		}
		aLong127 = Class94.method1466(22624);
	}
	
	public Class6() {
		aLong127 = Class94.method1466(22624);
		anInt152 = 0;
		anInt156 = 0;
		aClass23_Sub10Array153 = new Class23_Sub10[8];
		anInt159 = 0;
		anInt154 = 0;
		aLong160 = 0L;
		aClass23_Sub10Array155 = new Class23_Sub10[8];
		aLong157 = 0L;
		aBoolean151 = true;
	}
	
	static {
		aClass16_136 = Class38_Sub6.method1076((byte) 86, "Hierhin gehen");
	}
}
