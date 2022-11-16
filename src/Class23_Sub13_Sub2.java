/* Class23_Sub13_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Class23_Sub13_Sub2 extends Class23_Sub13
{
	static int anInt3675;
	static int anInt3676;
	static boolean aBoolean3677 = false;
	static int anInt3678;
	static int[] anIntArray3679;
	static int anInt3680 = -1;
	static int[] anIntArray3681 = new int[256];
	static int anInt3682;
	protected byte[] aByteArray3683;
	static int anInt3684;
	static int anInt3685;
	static RSString aClass16_3686;
	private static RSString aClass16_3687;
	
	static final void method605(int[] is, int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		Class23_Sub1 class23_sub1 = Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i_1_][i_2_][i_3_];
		if (class23_sub1 != null) {
			Class104 class104 = class23_sub1.aClass104_2025;
			if (class104 != null) {
				int i_4_ = class104.anInt1742;
				if (i_4_ != 0) {
					for (int i_5_ = 0; i_5_ < 4; i_5_++) {
						is[i] = i_4_;
						is[i + 1] = i_4_;
						is[i + 2] = i_4_;
						is[i + 3] = i_4_;
						i += i_0_;
					}
				}
			} else {
				Class52 class52 = class23_sub1.aClass52_2023;
				if (class52 != null) {
					int i_6_ = class52.anInt827;
					int i_7_ = class52.anInt829;
					int i_8_ = class52.anInt826;
					int i_9_ = class52.anInt815;
					int[] is_10_ = Class87.anIntArrayArray1491[i_6_];
					int[] is_11_ = Class23_Sub8.anIntArrayArray2249[i_7_];
					int i_12_ = 0;
					if (i_8_ != 0) {
						for (int i_13_ = 0; i_13_ < 4; i_13_++) {
							is[i] = is_10_[is_11_[i_12_++]] == 0 ? i_8_ : i_9_;
							is[i + 1] = is_10_[is_11_[i_12_++]] == 0 ? i_8_ : i_9_;
							is[i + 2] = is_10_[is_11_[i_12_++]] == 0 ? i_8_ : i_9_;
							is[i + 3] = is_10_[is_11_[i_12_++]] == 0 ? i_8_ : i_9_;
							i += i_0_;
						}
					} else {
						for (int i_14_ = 0; i_14_ < 4; i_14_++) {
							if (is_10_[is_11_[i_12_++]] != 0) {
								is[i] = i_9_;
							}
							if (is_10_[is_11_[i_12_++]] != 0) {
								is[i + 1] = i_9_;
							}
							if (is_10_[is_11_[i_12_++]] != 0) {
								is[i + 2] = i_9_;
							}
							if (is_10_[is_11_[i_12_++]] != 0) {
								is[i + 3] = i_9_;
							}
							i += i_0_;
						}
					}
				}
			}
		}
	}
	
	static final int method606(int i, int i_15_, int i_16_) {
		int i_17_ = i_15_ >>> 31;
		if (i_16_ <= 30) {
			anIntArray3681 = null;
		}
		anInt3684++;
		return -i_17_ + (i_15_ - -i_17_) / i;
	}
	
	public static void method607(boolean bool) {
		aClass16_3687 = null;
		if (bool == true) {
			anIntArray3681 = null;
			anIntArray3679 = null;
			aClass16_3686 = null;
		}
	}
	
	static final void method608(Class23_Sub5_Sub1 class23_sub5_sub1, int i, byte b) {
		anInt3675++;
		if (b == 35) {
			for (;;) {
				Class23_Sub27 class23_sub27 = (Class23_Sub27) Class72.aClass89_1286.method1437(-125);
				if (class23_sub27 == null) {
					break;
				}
				boolean bool = false;
				for (int i_18_ = 0; (class23_sub27.anInt2486 ^ 0xffffffff) < (i_18_ ^ 0xffffffff); i_18_++) {
					if (class23_sub27.aClass60Array2484[i_18_] != null) {
						if (class23_sub27.aClass60Array2484[i_18_].anInt951 == 2) {
							class23_sub27.anIntArray2480[i_18_] = -5;
						}
						if (class23_sub27.aClass60Array2484[i_18_].anInt951 == 0) {
							bool = true;
						}
					}
					if (class23_sub27.aClass60Array2477[i_18_] != null) {
						if (class23_sub27.aClass60Array2477[i_18_].anInt951 == 2) {
							class23_sub27.anIntArray2480[i_18_] = -6;
						}
						if (class23_sub27.aClass60Array2477[i_18_].anInt951 == 0) {
							bool = true;
						}
					}
				}
				if (bool) {
					break;
				}
				class23_sub5_sub1.method486(i, b ^ 0xb83);
				class23_sub5_sub1.writeByte(0);
				int i_19_ = class23_sub5_sub1.position;
				class23_sub5_sub1.writeIntBE(class23_sub27.anInt2478);
				for (int i_20_ = 0; (class23_sub27.anInt2486 ^ 0xffffffff) < (i_20_ ^ 0xffffffff); i_20_++) {
					if ((class23_sub27.anIntArray2480[i_20_] ^ 0xffffffff) != -1) {
						class23_sub5_sub1.writeByte(class23_sub27.anIntArray2480[i_20_]);
					} else {
						try {
							int i_21_ = class23_sub27.anIntArray2485[i_20_];
							if (i_21_ != 0) {
								if (i_21_ != 1) {
									if (i_21_ == 2) {
										Field field = (Field) class23_sub27.aClass60Array2484[i_20_].anObject955;
										int i_22_ = field.getModifiers();
										class23_sub5_sub1.writeByte(0);
										class23_sub5_sub1.writeIntBE(i_22_);
									}
								} else {
									Field field = (Field) class23_sub27.aClass60Array2484[i_20_].anObject955;
									field.setInt(null, class23_sub27.anIntArray2474[i_20_]);
									class23_sub5_sub1.writeByte(0);
								}
							} else {
								Field field = (Field) class23_sub27.aClass60Array2484[i_20_].anObject955;
								int i_23_ = field.getInt(null);
								class23_sub5_sub1.writeByte(0);
								class23_sub5_sub1.writeIntBE(i_23_);
							}
							if (i_21_ != 3) {
								if (i_21_ == 4) {
									Method method = (Method) class23_sub27.aClass60Array2477[i_20_].anObject955;
									int i_24_ = method.getModifiers();
									class23_sub5_sub1.writeByte(0);
									class23_sub5_sub1.writeIntBE(i_24_);
								}
							} else {
								Method method = (Method) class23_sub27.aClass60Array2477[i_20_].anObject955;
								byte[][] bs = class23_sub27.aByteArrayArrayArray2476[i_20_];
								Object[] objects = new Object[bs.length];
								for (int i_25_ = 0; (bs.length ^ 0xffffffff) < (i_25_ ^ 0xffffffff); i_25_++) {
									ObjectInputStream objectinputstream = new ObjectInputStream(new ByteArrayInputStream(bs[i_25_]));
									objects[i_25_] = objectinputstream.readObject();
								}
								Object object = method.invoke(null, objects);
								if (object == null) {
									class23_sub5_sub1.writeByte(0);
								} else if (!(object instanceof Number)) {
									if (object instanceof RSString) {
										class23_sub5_sub1.writeByte(2);
										class23_sub5_sub1.writeString((RSString) object);
									} else {
										class23_sub5_sub1.writeByte(4);
									}
								} else {
									class23_sub5_sub1.writeByte(1);
									class23_sub5_sub1.writeLongBE(((Number) object).longValue());
								}
							}
						} catch (ClassNotFoundException classnotfoundexception) {
							class23_sub5_sub1.writeByte(-10);
						} catch (java.io.InvalidClassException invalidclassexception) {
							class23_sub5_sub1.writeByte(-11);
						} catch (java.io.StreamCorruptedException streamcorruptedexception) {
							class23_sub5_sub1.writeByte(-12);
						} catch (java.io.OptionalDataException optionaldataexception) {
							class23_sub5_sub1.writeByte(-13);
						} catch (IllegalAccessException illegalaccessexception) {
							class23_sub5_sub1.writeByte(-14);
						} catch (IllegalArgumentException illegalargumentexception) {
							class23_sub5_sub1.writeByte(-15);
						} catch (java.lang.reflect.InvocationTargetException invocationtargetexception) {
							class23_sub5_sub1.writeByte(-16);
						} catch (SecurityException securityexception) {
							class23_sub5_sub1.writeByte(-17);
						} catch (java.io.IOException ioexception) {
							class23_sub5_sub1.writeByte(-18);
						} catch (NullPointerException nullpointerexception) {
							class23_sub5_sub1.writeByte(-19);
						} catch (Exception exception) {
							class23_sub5_sub1.writeByte(-20);
						} catch (Throwable throwable) {
							class23_sub5_sub1.writeByte(-21);
						}
					}
				}
				class23_sub5_sub1.method431(32258, i_19_);
				class23_sub5_sub1.method477((byte) 21, -i_19_ + class23_sub5_sub1.position);
				class23_sub27.method228(0);
			}
		}
	}
	
	static final void method609(int i, int i_26_) {
		anInt3676++;
		Class23_Sub20 class23_sub20 = (Class23_Sub20) Class47.anOa722.a((byte) -25);
		if (i != 0) {
			anIntArray3681 = null;
		}
		for (/**/; class23_sub20 != null; class23_sub20 = (Class23_Sub20) Class47.anOa722.a(true)) {
			if ((0xffffL & class23_sub20.aLong358 >> 48 ^ 0xffffffffffffffffL) == ((long) i_26_ ^ 0xffffffffffffffffL)) {
				class23_sub20.method228(i);
			}
		}
	}
	
	static final void method610(int i, byte b) {
		anInt3685++;
		if (b > 101) {
			if (i == -1 && !Class105.aBoolean1806) {
				Class23_Sub13_Sub9.method689(false);
			} else if (i != -1 && (Class83.anInt1460 != i || !Class23_Sub4_Sub19.method343((byte) -37)) && (Class21.anInt342 ^ 0xffffffff) != -1 && !Class105.aBoolean1806) {
				Class23_Sub4_Sub19.method341(i, 13910, 0, false, 2, CacheFileChannel.aClass105_Sub1_457, Class21.anInt342);
			}
			Class83.anInt1460 = i;
		}
	}
	
	Class23_Sub13_Sub2(byte[] bs) {
		aByteArray3683 = bs;
	}
	
	static {
		for (int i = 0; i < 256; i++) {
			int i_27_ = i;
			for (int i_28_ = 0; i_28_ < 8; i_28_++) {
				if ((0x1 & i_27_) == 1) {
					i_27_ = ~0x12477cdf ^ i_27_ >>> 1;
				} else {
					i_27_ >>>= 1;
				}
			}
			anIntArray3681[i] = i_27_;
		}
		aClass16_3687 = Class38_Sub6.method1076((byte) 86, "Please try again)3");
		aClass16_3686 = aClass16_3687;
	}
}
