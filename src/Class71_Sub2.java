/* Class71_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class71_Sub2 extends Class71
{
	static int anInt2733;
	static int anInt2734;
	static RSString aClass16_2735 = Class38_Sub6.method1076((byte) 86, "<br>(X");
	static boolean aBoolean2736 = false;
	static int anInt2737;
	static RSString aClass16_2738 = Class38_Sub6.method1076((byte) 86, "blinken1:");
	static Class43[] aClass43Array2739;
	
	public static void method1277(int i) {
		aClass43Array2739 = null;
		aClass16_2738 = null;
		if (i != 29277) {
			method1280(null, (byte) 112);
		}
		aClass16_2735 = null;
	}
	
	static final void method1278(boolean bool) {
		Class23_Sub24.aBoolean2446 = false;
		if (bool == true) {
			anInt2737++;
			Class7.aBoolean170 = false;
		}
	}
	
	static final void method1279(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		anInt2733++;
		if (i_4_ != 3) {
			method1278(false);
		}
		long l = client.method35(i_3_, i, i_2_);
		if (l != 0L) {
			int i_5_ = ((int) l & 0x32a695) >> 20;
			int i_6_ = 0x1f & (int) l >> 14;
			int i_7_ = i_1_;
			if (l > 0L) {
				i_7_ = i_0_;
			}
			int[] is = Class20.anIntArray328;
			int i_8_ = 0x7fffffff & (int) (l >>> 32);
			int i_9_ = 4 * (-i_2_ + 103) * 512 + (24624 - -(4 * i));
			Class23_Sub13_Sub7 class23_sub13_sub7 = Class38_Sub2.method1037(i_8_, -21035);
			if (class23_sub13_sub7.anInt3744 != -1) {
				Class43_Sub1 class43_sub1 = Class23_Sub13_Sub23.aClass43_Sub1Array4245[class23_sub13_sub7.anInt3744];
				if (class43_sub1 != null) {
					int i_10_ = (-class43_sub1.anInt669 + 4 * class23_sub13_sub7.anInt3752) / 2;
					int i_11_ = (-class43_sub1.anInt671 + 4 * class23_sub13_sub7.anInt3754) / 2;
					class43_sub1.method1119(4 * i + (48 - -i_10_), i_11_ + (104 - (i_2_ - -class23_sub13_sub7.anInt3754)) * 4 + 48);
				}
			} else {
				if ((i_6_ ^ 0xffffffff) == -1 || i_6_ == 2) {
					if (i_5_ != 0) {
						if (i_5_ != 1) {
							if (i_5_ == 2) {
								is[3 + i_9_] = i_7_;
								is[512 + (3 + i_9_)] = i_7_;
								is[1024 + (3 + i_9_)] = i_7_;
								is[1536 + (3 + i_9_)] = i_7_;
							} else if (i_5_ == 3) {
								is[i_9_ + 1536] = i_7_;
								is[1 + i_9_ + 1536] = i_7_;
								is[2 + (1536 + i_9_)] = i_7_;
								is[i_9_ - -1536 - -3] = i_7_;
							}
						} else {
							is[i_9_] = i_7_;
							is[i_9_ - -1] = i_7_;
							is[2 + i_9_] = i_7_;
							is[3 + i_9_] = i_7_;
						}
					} else {
						is[i_9_] = i_7_;
						is[512 + i_9_] = i_7_;
						is[1024 + i_9_] = i_7_;
						is[1536 + i_9_] = i_7_;
					}
				}
				if (i_6_ == 3) {
					if (i_5_ != 0) {
						if (i_5_ != 1) {
							if (i_5_ != 2) {
								if (i_5_ == 3) {
									is[i_9_ - -1536] = i_7_;
								}
							} else {
								is[i_9_ - -1539] = i_7_;
							}
						} else {
							is[i_9_ - -3] = i_7_;
						}
					} else {
						is[i_9_] = i_7_;
					}
				}
				if (i_6_ == 2) {
					if (i_5_ != 3) {
						if (i_5_ == 0) {
							is[i_9_] = i_7_;
							is[i_9_ + 1] = i_7_;
							is[2 + i_9_] = i_7_;
							is[3 + i_9_] = i_7_;
						} else if (i_5_ == 1) {
							is[i_9_ - -3] = i_7_;
							is[512 + (i_9_ - -3)] = i_7_;
							is[1024 + (3 + i_9_)] = i_7_;
							is[1536 + (3 + i_9_)] = i_7_;
						} else if (i_5_ == 2) {
							is[i_9_ - -1536] = i_7_;
							is[1 + (1536 + i_9_)] = i_7_;
							is[2 + (1536 + i_9_)] = i_7_;
							is[3 + (1536 + i_9_)] = i_7_;
						}
					} else {
						is[i_9_] = i_7_;
						is[512 + i_9_] = i_7_;
						is[i_9_ - -1024] = i_7_;
						is[1536 + i_9_] = i_7_;
					}
				}
			}
		}
		l = Class87_Sub3.method1416(i_3_, i, i_2_);
		if (l != 0L) {
			int i_12_ = (int) l >> 20 & 0x3;
			int i_13_ = (int) (l >>> 32) & 0x7fffffff;
			Class23_Sub13_Sub7 class23_sub13_sub7 = Class38_Sub2.method1037(i_13_, -21035);
			int i_14_ = (int) l >> 14 & 0x1f;
			if ((class23_sub13_sub7.anInt3744 ^ 0xffffffff) != 0) {
				Class43_Sub1 class43_sub1 = Class23_Sub13_Sub23.aClass43_Sub1Array4245[class23_sub13_sub7.anInt3744];
				if (class43_sub1 != null) {
					int i_15_ = (-class43_sub1.anInt669 + 4 * class23_sub13_sub7.anInt3752) / 2;
					int i_16_ = (class23_sub13_sub7.anInt3754 * 4 + -class43_sub1.anInt671) / 2;
					class43_sub1.method1119(i_15_ + 4 * i + 48, i_16_ + 48 + 4 * (-i_2_ + 104 + -class23_sub13_sub7.anInt3754));
				}
			} else if (i_14_ == 9) {
				int i_17_ = 15658734;
				int[] is = Class20.anIntArray328;
				int i_18_ = 24624 + 4 * i - -(4 * (52736 - i_2_ * 512));
				if ((l ^ 0xffffffffffffffffL) < -1L) {
					i_17_ = 15597568;
				}
				if (i_12_ == 0 || i_12_ == 2) {
					is[1536 + i_18_] = i_17_;
					is[1025 + i_18_] = i_17_;
					is[512 + i_18_ - -2] = i_17_;
					is[3 + i_18_] = i_17_;
				} else {
					is[i_18_] = i_17_;
					is[512 + (i_18_ - -1)] = i_17_;
					is[2 + i_18_ + 1024] = i_17_;
					is[i_18_ - -1539] = i_17_;
				}
			}
		}
		l = Class107.method1584(i_3_, i, i_2_);
		if (l != 0L) {
			int i_19_ = 0x7fffffff & (int) (l >>> 32);
			Class23_Sub13_Sub7 class23_sub13_sub7 = Class38_Sub2.method1037(i_19_, i_4_ + -21038);
			if ((class23_sub13_sub7.anInt3744 ^ 0xffffffff) != 0) {
				Class43_Sub1 class43_sub1 = Class23_Sub13_Sub23.aClass43_Sub1Array4245[class23_sub13_sub7.anInt3744];
				if (class43_sub1 != null) {
					int i_20_ = (-class43_sub1.anInt669 + 4 * class23_sub13_sub7.anInt3752) / 2;
					int i_21_ = (-class43_sub1.anInt671 + 4 * class23_sub13_sub7.anInt3754) / 2;
					class43_sub1.method1119(i_20_ + (48 - -(4 * i)), (-class23_sub13_sub7.anInt3754 + 104 - i_2_) * 4 + (48 - -i_21_));
				}
			}
		}
	}
	
	static final void method1280(Applet_Sub1 applet_sub1, byte b) {
		anInt2734++;
		if (b != -21) {
			aClass16_2738 = null;
		}
		do {
			if (Class23_Sub13_Sub9.anInt3860 == 1) {
				int i = 280;
				if (i <= Class90.anInt1538 && (i - -14 ^ 0xffffffff) <= (Class90.anInt1538 ^ 0xffffffff) && Class23_Sub13_Sub19.anInt4136 >= 4 && Class23_Sub13_Sub19.anInt4136 <= 18) {
					Class23_Sub14.method861(0, -61, 0);
					break;
				}
				if (15 + i <= Class90.anInt1538 && Class90.anInt1538 <= i - -80 && Class23_Sub13_Sub19.anInt4136 >= 4 && Class23_Sub13_Sub19.anInt4136 <= 18) {
					Class23_Sub14.method861(1, -50, 0);
					break;
				}
				int i_22_ = 390;
				if ((i_22_ ^ 0xffffffff) >= (Class90.anInt1538 ^ 0xffffffff) && (Class90.anInt1538 ^ 0xffffffff) >= (i_22_ - -14 ^ 0xffffffff) && Class23_Sub13_Sub19.anInt4136 >= 4 && Class23_Sub13_Sub19.anInt4136 <= 18) {
					Class23_Sub14.method861(0, -22, 1);
					break;
				}
				if (15 + i_22_ <= Class90.anInt1538 && (Class90.anInt1538 ^ 0xffffffff) >= (80 + i_22_ ^ 0xffffffff) && Class23_Sub13_Sub19.anInt4136 >= 4 && Class23_Sub13_Sub19.anInt4136 <= 18) {
					Class23_Sub14.method861(1, -51, 1);
					break;
				}
				int i_23_ = 500;
				if (Class90.anInt1538 >= i_23_ && (Class90.anInt1538 ^ 0xffffffff) >= (14 + i_23_ ^ 0xffffffff) && Class23_Sub13_Sub19.anInt4136 >= 4 && Class23_Sub13_Sub19.anInt4136 <= 18) {
					Class23_Sub14.method861(0, -24, 2);
					break;
				}
				if ((i_23_ + 15 ^ 0xffffffff) >= (Class90.anInt1538 ^ 0xffffffff) && i_23_ - -80 >= Class90.anInt1538 && Class23_Sub13_Sub19.anInt4136 >= 4 && Class23_Sub13_Sub19.anInt4136 <= 18) {
					Class23_Sub14.method861(1, -97, 2);
					break;
				}
				int i_24_ = 610;
				if ((Class90.anInt1538 ^ 0xffffffff) <= (i_24_ ^ 0xffffffff) && (Class90.anInt1538 ^ 0xffffffff) >= (14 + i_24_ ^ 0xffffffff) && Class23_Sub13_Sub19.anInt4136 >= 4 && Class23_Sub13_Sub19.anInt4136 <= 18) {
					Class23_Sub14.method861(0, -55, 3);
					break;
				}
				if ((Class90.anInt1538 ^ 0xffffffff) <= (i_24_ + 15 ^ 0xffffffff) && (Class90.anInt1538 ^ 0xffffffff) >= (80 + i_24_ ^ 0xffffffff) && Class23_Sub13_Sub19.anInt4136 >= 4 && Class23_Sub13_Sub19.anInt4136 <= 18) {
					Class23_Sub14.method861(1, b + -77, 3);
					break;
				}
				if (Class90.anInt1538 >= 700 && Class23_Sub13_Sub19.anInt4136 >= 4 && Class90.anInt1538 <= 758 && Class23_Sub13_Sub19.anInt4136 <= 20) {
					aBoolean2736 = false;
					Class104.method1529(b + -83);
					break;
				}
				if (Class23_Sub13_Sub2.anInt3680 != -1) {
					Class82 class82 = Class23_Sub13_Sub1.aClass82Array3669[Class23_Sub13_Sub2.anInt3680];
					if (Class75.aBoolean1378 == class82.aBoolean1450) {
						byte[] bs = Class23_Sub4_Sub14.method322(new RSString[] { class82.aClass16_1449, Class39.aClass16_600 }, -95).method147(true);
						Class23_Sub4_Sub34.aString3444 = new String(bs, 0, bs.length);
						if (Class23_Sub8.anInt2250 != 0) {
							Class23_Sub13.anInt2320 = Class23_Sub4_Sub27.anInt3328 = 43594;
							Class38_Sub2.anInt2498 = 443;
							Class23_Sub8.anInt2250 = 0;
						}
						Class19.anInt321 = class82.anInt1451;
						aBoolean2736 = false;
						Class104.method1529(b ^ 0x77);
					} else {
						RSString class16 = Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub4_Sub37.aClass16_3481, class82.aClass16_1449, Class23_Sub11.aClass16_2283, Class23_Sub4_Sub23.method360((byte) -9, Class23_Sub13_Sub15.anInt4036), Class23_Sub4_Sub23.aClass16_3288, Class23_Sub4_Sub23.method360((byte) -9, Class7.aBoolean170 ? 1 : 0), Class23_Sub13_Sub10.aClass16_3875, Class23_Sub4_Sub23.method360((byte) -9, Class47.anInt741), CacheArchive.aClass16_2856, Class23_Sub4_Sub23.method360((byte) -9, Class38_Sub7_Sub1.anInt4376) }, -58);
						try {
							applet_sub1.getAppletContext().showDocument(class16.method153((byte) -74), "_self");
						} catch (Exception exception) {
							break;
						}
						break;
					}
					break;
				}
			}
		} while (false);
	}
}
