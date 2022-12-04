/* Class23_Sub4_Sub37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class23_Sub4_Sub37 extends Class23_Sub4
{
	private int anInt3473;
	private int anInt3474 = 2048;
	static RSString aClass16_3475;
	static int anInt3476;
	static int anInt3477;
	static RSString aClass16_3478;
	static int anInt3479;
	static int anInt3480;
	static RSString aClass16_3481 = Class38_Sub6.method1076((byte) 86, "http:)4)4");
	static RSString aClass16_3482;
	private int anInt3483;
	static int anInt3484;
	private int anInt3485;
	private static RSString aClass16_3486 = Class38_Sub6.method1076((byte) 86, "Discard");
	private byte[] aByteArray3487;
	static int anInt3488;
	static int anInt3489;
	static Class105_Sub1 aClass105_Sub1_3490;
	private int anInt3491;
	static int anInt3492;
	static int anInt3493;
	private short[] aShortArray3494;
	private int anInt3495;
	static RSString aClass16_3496;
	static volatile long aLong3497;
	static boolean aBoolean3498;
	
	final void method255(Buffer class23_sub5, int i, int i_0_) {
		if (i_0_ != 1000) {
			method418(-34, -65, 51, 124, -30, -40);
		}
		int i_1_ = i;
	while_157_:
		do {
		while_156_:
			do {
			while_155_:
				do {
				while_154_:
					do {
					while_153_:
						do {
							do {
								if ((i_1_ ^ 0xffffffff) != -1) {
									if (i_1_ != 1) {
										if (i_1_ != 2) {
											if (i_1_ != 3) {
												if (i_1_ != 4) {
													if (i_1_ != 5) {
														if (i_1_ == 6) {
															break while_156_;
														}
														break while_157_;
													}
												} else {
													break while_154_;
												}
												break while_155_;
											}
										} else {
											break;
										}
										break while_153_;
									}
								} else {
									anInt3485 = anInt3491 = class23_sub5.readUByte();
									break while_157_;
								}
								anInt3473 = class23_sub5.readUByte();
								break while_157_;
							} while (false);
							anInt3474 = class23_sub5.getUShortBE();
							break while_157_;
						} while (false);
						anInt3483 = class23_sub5.readUByte();
						break while_157_;
					} while (false);
					anInt3495 = class23_sub5.readUByte();
					break while_157_;
				} while (false);
				anInt3485 = class23_sub5.readUByte();
				break while_157_;
			} while (false);
			anInt3491 = class23_sub5.readUByte();
		} while (false);
		anInt3477++;
	}
	
	public static void method416(byte b) {
		if (b != -23) {
			aClass16_3481 = null;
		}
		aClass105_Sub1_3490 = null;
		aClass16_3496 = null;
		aClass16_3482 = null;
		aClass16_3486 = null;
		aClass16_3475 = null;
		aClass16_3478 = null;
		aClass16_3481 = null;
	}
	
	final int[] method260(int i, int i_2_) {
		int[] is = aClass99_2115.method1500(i_2_, (byte) -122);
		if (i != 0) {
			return null;
		}
		anInt3479++;
		if (aClass99_2115.aBoolean1681) {
			int i_3_ = 2048 + Class23_Sub13_Sub16.anIntArray4049[i_2_] * anInt3491;
			int i_4_ = i_3_ >> 12;
			int i_5_ = 1 + i_4_;
			int i_6_ = 0;
		while_165_:
			for (/**/; (i_6_ ^ 0xffffffff) > (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff); i_6_++) {
				Class23_Sub13_Sub13.anInt3990 = Class32.anInt505 = Class68.anInt1199 = Class23_Sub9.anInt2268 = 2147483647;
				int i_7_ = Class61.anIntArray967[i_6_] * anInt3485 + 2048;
				int i_8_ = i_7_ >> 12;
				int i_9_ = i_8_ - -1;
				for (int i_10_ = i_4_ + -1; i_5_ >= i_10_; i_10_++) {
					int i_11_ = 0xff & aByteArray3487[(anInt3491 <= i_10_ ? -anInt3491 + i_10_ : i_10_) & 0xff];
					for (int i_12_ = -1 + i_8_; (i_12_ ^ 0xffffffff) >= (i_9_ ^ 0xffffffff); i_12_++) {
						int i_13_ = (aByteArray3487[i_11_ - -((i_12_ ^ 0xffffffff) > (anInt3485 ^ 0xffffffff) ? i_12_ : -anInt3485 + i_12_) & 0xff] & 0xff) * 2;
						int i_14_ = -aShortArray3494[i_13_++] - ((i_12_ << 12) - i_7_);
						int i_15_ = -aShortArray3494[i_13_] - ((i_10_ << 12) - i_3_);
						int i_16_ = anInt3495;
						int i_17_;
					while_161_:
						do {
						while_160_:
							do {
							while_159_:
								do {
								while_158_:
									do {
										do {
											if (i_16_ != 1) {
												if (i_16_ != 3) {
													if (i_16_ != 4) {
														if (i_16_ != 5) {
															if (i_16_ == 2) {
																break while_159_;
															}
															break while_160_;
														}
													} else {
														break;
													}
													break while_158_;
												}
											} else {
												i_17_ = i_15_ * i_15_ + i_14_ * i_14_ >> 12;
												break while_161_;
											}
											i_15_ = (i_15_ ^ 0xffffffff) > -1 ? -i_15_ : i_15_;
											i_14_ = i_14_ < 0 ? -i_14_ : i_14_;
											i_17_ = (i_15_ ^ 0xffffffff) <= (i_14_ ^ 0xffffffff) ? i_15_ : i_14_;
											break while_161_;
										} while (false);
										i_14_ = (int) (Math.sqrt((double) ((float) (i_14_ < 0 ? -i_14_ : i_14_) / 4096.0F)) * 4096.0);
										i_15_ = (int) (Math.sqrt((double) ((float) (i_15_ >= 0 ? i_15_ : -i_15_) / 4096.0F)) * 4096.0);
										i_17_ = i_15_ + i_14_;
										i_17_ = i_17_ * i_17_ >> 12;
										break while_161_;
									} while (false);
									i_14_ *= i_14_;
									i_15_ *= i_15_;
									i_17_ = (int) (4096.0 * Math.sqrt(Math.sqrt((double) ((float) (i_15_ + i_14_) / 1.6777216E7F))));
									break while_161_;
								} while (false);
								i_17_ = ((i_14_ ^ 0xffffffff) > -1 ? -i_14_ : i_14_) - -((i_15_ ^ 0xffffffff) <= -1 ? i_15_ : -i_15_);
								break while_161_;
							} while (false);
							i_17_ = (int) (4096.0 * Math.sqrt((double) ((float) (i_14_ * i_14_ - -(i_15_ * i_15_)) / 1.6777216E7F)));
						} while (false);
						if ((i_17_ ^ 0xffffffff) > (Class23_Sub13_Sub13.anInt3990 ^ 0xffffffff)) {
							Class23_Sub9.anInt2268 = Class68.anInt1199;
							Class68.anInt1199 = Class32.anInt505;
							Class32.anInt505 = Class23_Sub13_Sub13.anInt3990;
							Class23_Sub13_Sub13.anInt3990 = i_17_;
						} else if ((Class32.anInt505 ^ 0xffffffff) >= (i_17_ ^ 0xffffffff)) {
							if ((i_17_ ^ 0xffffffff) <= (Class68.anInt1199 ^ 0xffffffff)) {
								if ((Class23_Sub9.anInt2268 ^ 0xffffffff) < (i_17_ ^ 0xffffffff)) {
									Class23_Sub9.anInt2268 = i_17_;
								}
							} else {
								Class23_Sub9.anInt2268 = Class68.anInt1199;
								Class68.anInt1199 = i_17_;
							}
						} else {
							Class23_Sub9.anInt2268 = Class68.anInt1199;
							Class68.anInt1199 = Class32.anInt505;
							Class32.anInt505 = i_17_;
						}
					}
				}
				int i_18_ = anInt3483;
			while_163_:
				do {
				while_162_:
					do {
						do {
							if ((i_18_ ^ 0xffffffff) != -1) {
								if (i_18_ != 1) {
									if (i_18_ != 3) {
										if (i_18_ != 4) {
											if (i_18_ == 2) {
												break while_163_;
											}
											continue while_165_;
										}
									} else {
										break;
									}
									break while_162_;
								}
							} else {
								is[i_6_] = Class23_Sub13_Sub13.anInt3990;
								continue while_165_;
							}
							is[i_6_] = Class32.anInt505;
							continue while_165_;
						} while (false);
						is[i_6_] = Class68.anInt1199;
						continue while_165_;
					} while (false);
					is[i_6_] = Class23_Sub9.anInt2268;
					continue while_165_;
				} while (false);
				is[i_6_] = -Class23_Sub13_Sub13.anInt3990 + Class32.anInt505;
			}
		}
		return is;
	}
	
	static final Class method417(String string, byte b) throws ClassNotFoundException {
		anInt3476++;
		if (string.equals("B")) {
			return Byte.TYPE;
		}
		if (string.equals("I")) {
			return Integer.TYPE;
		}
		if (b != -65) {
			method418(76, 4, 40, 112, 52, 16);
		}
		if (string.equals("S")) {
			return Short.TYPE;
		}
		if (string.equals("J")) {
			return Long.TYPE;
		}
		if (string.equals("Z")) {
			return Boolean.TYPE;
		}
		if (string.equals("F")) {
			return Float.TYPE;
		}
		if (string.equals("D")) {
			return Double.TYPE;
		}
		if (string.equals("C")) {
			return Character.TYPE;
		}
		return Class.forName(string);
	}
	
	static final void method418(int i, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_) {
		anInt3480++;
		for (int i_24_ = i_23_; i_22_ >= i_24_; i_24_++)
			Class23_Sub13_Sub6.method632(i_20_, (byte) -30, i_19_, Class4.anIntArrayArray98[i_24_], i);
		if (i_21_ != 0) {
			aClass16_3475 = null;
		}
	}
	
	public Class23_Sub4_Sub37() {
		super(0, true);
		anInt3473 = 0;
		anInt3483 = 2;
		anInt3485 = 5;
		anInt3495 = 1;
		aByteArray3487 = new byte[512];
		anInt3491 = 5;
		aShortArray3494 = new short[512];
	}
	
	final void method265(int i) {
		if (i != -21746) {
			anInt3493 = 3;
		}
		aByteArray3487 = Class92.method1460(anInt3473, true);
		anInt3484++;
		method419(true);
	}
	
	private final void method419(boolean bool) {
		anInt3488++;
		if (bool == true) {
			Random random = new Random((long) anInt3473);
			aShortArray3494 = new short[512];
			if (anInt3474 > 0) {
				for (int i = 0; i < 512; i++)
					aShortArray3494[i] = (short) Class23_Sub13_Sub9.method686(12402, random, anInt3474);
			}
		}
	}
	
	static {
		aClass16_3478 = Class38_Sub6.method1076((byte) 86, "Wordpack geladen)3");
		anInt3489 = 0;
		aClass16_3475 = aClass16_3486;
		anInt3492 = 128;
		aClass16_3496 = Class38_Sub6.method1076((byte) 86, "Willkommen auf RuneScape");
		aClass16_3482 = Class38_Sub6.method1076((byte) 86, "hint_mapmarkers");
		aLong3497 = 0L;
		aBoolean3498 = false;
	}
}
