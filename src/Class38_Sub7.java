/* Class38_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class38_Sub7 extends Class38
{
	static RSString aClass16_2628 = Class38_Sub6.method1076((byte) 86, "Passwort: ");
	static int anInt2629;
	protected int anInt2630 = 32;
	protected int anInt2631;
	protected int anInt2632;
	protected int anInt2633;
	protected int anInt2634;
	protected int anInt2635;
	static int anInt2636;
	static Class23_Sub13_Sub8 aClass23_Sub13_Sub8_2637;
	protected int anInt2638;
	protected int anInt2639 = 100;
	protected int anInt2640;
	protected int anInt2641;
	protected int anInt2642;
	protected int anInt2643;
	protected int anInt2644;
	protected boolean aBoolean2645;
	private static RSString aClass16_2646;
	protected int anInt2647;
	protected int anInt2648;
	static int anInt2649 = 0;
	protected int anInt2650;
	static RSString aClass16_2651;
	protected int[] anIntArray2652;
	protected int anInt2653;
	static RSString[] aClass16Array2654;
	protected int anInt2655;
	protected int anInt2656;
	static int anInt2657;
	static int anInt2658;
	protected int anInt2659;
	protected int anInt2660;
	protected int anInt2661;
	private static RSString aClass16_2662;
	protected int[] anIntArray2663;
	protected int anInt2664;
	private static RSString aClass16_2665 = Class38_Sub6.method1076((byte) 86, "Mar");
	private static RSString aClass16_2666;
	private static RSString aClass16_2667 = Class38_Sub6.method1076((byte) 86, "Feb");
	protected int anInt2668;
	protected int[] anIntArray2669;
	protected RSString aClass16_2670;
	protected int anInt2671;
	private static RSString aClass16_2672;
	protected int anInt2673;
	protected int anInt2674;
	private static RSString aClass16_2675;
	static int anInt2676;
	private static RSString aClass16_2677;
	protected int anInt2678;
	static RSString aClass16_2679;
	protected int anInt2680;
	protected int anInt2681;
	protected int anInt2682;
	private static RSString aClass16_2683;
	protected int anInt2684;
	protected int anInt2685;
	protected int anInt2686;
	protected int[] anIntArray2687;
	protected int anInt2688;
	static int anInt2689;
	static byte[][][] aByteArrayArrayArray2690;
	protected int anInt2691;
	protected int anInt2692;
	protected int anInt2693;
	protected int[] anIntArray2694;
	protected int anInt2695;
	static int anInt2696;
	static int anInt2697;
	protected int anInt2698;
	private static RSString aClass16_2699;
	protected int anInt2700;
	protected int anInt2701;
	private static RSString aClass16_2702;
	static RSString aClass16_2703;
	static int anInt2704;
	static RSString aClass16_2705;
	protected int anInt2706;
	static int anInt2707;
	protected int anInt2708;
	protected int anInt2709;
	protected int anInt2710;
	private static RSString aClass16_2711;
	private static RSString aClass16_2712;
	protected int anInt2713;
	static int anInt2714;
	private static RSString aClass16_2715;
	protected int anInt2716;
	protected int anInt2717;
	protected boolean[] aBooleanArray2718;
	
	final int method1081(byte b) {
		anInt2657++;
		if (b != -41) {
			method1086(52, 48, 52, -85);
		}
		if (anInt2685 == -32768) {
			return 200;
		}
		return -anInt2685;
	}
	
	boolean method1082(byte b) {
		anInt2629++;
		if (b != -108) {
			return true;
		}
		return false;
	}
	
	final void method1083(int i) {
		anInt2658++;
		anInt2660 = 0;
		anInt2640 = 0;
		if (i >= -61) {
			method1081((byte) -43);
		}
	}
	
	final void method1084(int i, boolean bool, int i_0_) {
		anInt2676++;
		int i_1_ = anIntArray2694[0];
		int i_2_ = anIntArray2663[0];
		if ((anInt2693 ^ 0xffffffff) != 0 && Class7.method90(anInt2693, (byte) 93).anInt4219 == 1) {
			anInt2693 = -1;
		}
		if (anInt2660 < 9) {
			anInt2660++;
		}
		if ((i ^ 0xffffffff) == -1) {
			i_2_--;
			i_1_++;
		}
		if (i == 1) {
			i_1_++;
		}
		if (i == 2) {
			i_2_++;
			i_1_++;
		}
		for (int i_3_ = anInt2660; (i_3_ ^ 0xffffffff) < -1; i_3_--) {
			anIntArray2663[i_3_] = anIntArray2663[-1 + i_3_];
			anIntArray2694[i_3_] = anIntArray2694[-1 + i_3_];
			aBooleanArray2718[i_3_] = aBooleanArray2718[-1 + i_3_];
		}
		if (i == 3) {
			i_2_--;
		}
		if (i == 4) {
			i_2_++;
		}
		if (i == 5) {
			i_1_--;
			i_2_--;
		}
		if (i == 6) {
			i_1_--;
		}
		if (i == 7) {
			i_2_++;
			i_1_--;
		}
		if (i_0_ != -30438) {
			method1082((byte) 124);
		}
		anIntArray2663[0] = i_2_;
		anIntArray2694[0] = i_1_;
		aBooleanArray2718[0] = bool;
	}
	
	final void method1085(int i, byte b, boolean bool, int i_4_) {
		anInt2696++;
		if ((anInt2693 ^ 0xffffffff) != 0 && Class7.method90(anInt2693, (byte) 97).anInt4219 == 1) {
			anInt2693 = -1;
		}
		if (!bool) {
			int i_5_ = -anIntArray2694[0] + i_4_;
			int i_6_ = -anIntArray2663[0] + i;
			if (i_6_ >= -8 && i_6_ <= 8 && i_5_ >= -8 && i_5_ <= 8) {
				if (anInt2660 < 9) {
					anInt2660++;
				}
				for (int i_7_ = anInt2660; (i_7_ ^ 0xffffffff) < -1; i_7_--) {
					anIntArray2663[i_7_] = anIntArray2663[-1 + i_7_];
					anIntArray2694[i_7_] = anIntArray2694[i_7_ - 1];
					aBooleanArray2718[i_7_] = aBooleanArray2718[-1 + i_7_];
				}
				anIntArray2663[0] = i;
				anIntArray2694[0] = i_4_;
				aBooleanArray2718[0] = false;
				return;
			}
		}
		anInt2632 = 0;
		anInt2640 = 0;
		anIntArray2663[0] = i;
		anInt2660 = 0;
		anIntArray2694[0] = i_4_;
		anInt2674 = 64 * anInt2668 + 128 * anIntArray2663[0];
		anInt2659 = 64 * anInt2668 + 128 * anIntArray2694[0];
		int i_8_ = -45 / ((-50 - b) / 53);
	}
	
	final void method1086(int i, int i_9_, int i_10_, int i_11_) {
		anInt2689++;
		if (i != 10) {
			method1090((byte) -99, null);
		}
		for (int i_12_ = 0; i_12_ < 4; i_12_++) {
			if (i_11_ >= anIntArray2687[i_12_]) {
				anIntArray2669[i_12_] = i_9_;
				anIntArray2652[i_12_] = i_10_;
				anIntArray2687[i_12_] = i_11_ - -70;
				break;
			}
		}
	}
	
	static final boolean method1087(boolean bool) {
		if (bool != false) {
			aClass16_2675 = null;
		}
		anInt2714++;
		try {
			if (Class46.anInt708 == 2) {
				if (Class23_Sub4_Sub4.aClass23_Sub18_2952 == null) {
					Class23_Sub4_Sub4.aClass23_Sub18_2952 = Class23_Sub18.method875(Class87.aClass105_1496, Class87_Sub4.anInt2837, Class59.anInt931);
					if (Class23_Sub4_Sub4.aClass23_Sub18_2952 == null) {
						return false;
					}
				}
				if (Class23_Sub4_Sub2.aClass14_2911 == null) {
					Class23_Sub4_Sub2.aClass14_2911 = new Class14(Class44.aClass105_674, client.aClass105_1955);
				}
				if (Class81.aClass23_Sub10_Sub2_1437.method582(22050, Class23_Sub4_Sub2.aClass14_2911, (byte) 24, Class23_Sub11.aClass105_2287, Class23_Sub4_Sub4.aClass23_Sub18_2952)) {
					Class81.aClass23_Sub10_Sub2_1437.method564(-2);
					Class81.aClass23_Sub10_Sub2_1437.method579(2, Class23_Sub9.anInt2257);
					Class81.aClass23_Sub10_Sub2_1437.method572(Class23_Sub4_Sub4.aClass23_Sub18_2952, -108, Class23_Sub4_Sub7.aBoolean3018);
					Class87.aClass105_1496 = null;
					Class23_Sub4_Sub2.aClass14_2911 = null;
					Class23_Sub4_Sub4.aClass23_Sub18_2952 = null;
					Class46.anInt708 = 0;
					return true;
				}
			}
		} catch (Exception exception) {
			exception.printStackTrace();
			Class81.aClass23_Sub10_Sub2_1437.method551((byte) 24);
			Class23_Sub4_Sub4.aClass23_Sub18_2952 = null;
			Class87.aClass105_1496 = null;
			Class23_Sub4_Sub2.aClass14_2911 = null;
			Class46.anInt708 = 0;
		}
		return false;
	}
	
	static final void method1088(int i, int i_13_, int i_14_, int i_15_, int i_16_) {
		Class8.anInt179 = i * anInt2697 / i_13_;
		Canvas_Sub1.anInt55 = i_14_ * Class70.anInt1238 / i_15_;
		if (i_16_ != 4096) {
			method1087(false);
		}
		Class68.anInt1203 = -1;
		anInt2707++;
		Class75.anInt1381 = -1;
		Class61.method1198(15);
	}
	
	public static void method1089(int i) {
		aClass16_2651 = null;
		aClass16_2672 = null;
		aClass16Array2654 = null;
		aClass16_2712 = null;
		aClass16_2665 = null;
		aClass16_2703 = null;
		aClass16_2683 = null;
		if (i != -3) {
			method1088(-80, 37, -18, -75, -115);
		}
		aClass16_2662 = null;
		aClass23_Sub13_Sub8_2637 = null;
		aClass16_2667 = null;
		aClass16_2666 = null;
		aByteArrayArrayArray2690 = null;
		aClass16_2628 = null;
		aClass16_2715 = null;
		aClass16_2679 = null;
		aClass16_2702 = null;
		aClass16_2711 = null;
		aClass16_2705 = null;
		aClass16_2699 = null;
		aClass16_2675 = null;
		aClass16_2677 = null;
		aClass16_2646 = null;
	}
	
	static final void method1090(byte b, byte[] bs) {
		int i = 0;
		anInt2704++;
		while (bs.length > i) {
			int i_17_ = bs[i++] * 64 - Class102.anInt1702;
			int i_18_ = bs[i++] * 64 - CacheFileChannel.anInt445;
			if ((i_17_ ^ 0xffffffff) >= -1 || (i_18_ ^ 0xffffffff) >= -1 || (Class70.anInt1238 ^ 0xffffffff) >= (i_17_ + 64 ^ 0xffffffff) || 64 + i_18_ >= anInt2697) {
				for (int i_19_ = 0; i_19_ < 64; i_19_++) {
					for (int i_20_ = -64; (i_20_ ^ 0xffffffff) > -1; i_20_++) {
						int i_21_ = bs[i++];
						if (i_21_ != 0) {
							if ((0x1 & i_21_) == 1) {
								i++;
							}
							if ((i_21_ & 0x2) == 2) {
								i++;
							}
							if ((0x4 & i_21_) == 4) {
								i += 3;
							}
						}
					}
				}
			} else {
				int i_22_ = i_17_ >> 6;
				int i_23_ = -i_18_ + anInt2697 + -1 >> 6;
				for (int i_24_ = 0; i_24_ < 64; i_24_++) {
					for (int i_25_ = -64; (i_25_ ^ 0xffffffff) > -1; i_25_++) {
						int i_26_ = bs[i++];
						if ((i_26_ ^ 0xffffffff) != -1) {
							if ((i_26_ & 0x1) == 1) {
								int i_27_ = bs[i++];
								if (Class83.aByteArrayArrayArray1458[i_22_][i_23_] == null) {
									Class83.aByteArrayArrayArray1458[i_22_][i_23_] = new byte[4096];
								}
								Class83.aByteArrayArrayArray1458[i_22_][i_23_][i_24_ + (-(1 + i_25_) << 6)] = (byte) i_27_;
							}
							if ((0x2 & i_26_) == 2) {
								int i_28_ = bs[i++];
								if (Class32.aByteArrayArrayArray506[i_22_][i_23_] == null) {
									Class32.aByteArrayArrayArray506[i_22_][i_23_] = new byte[4096];
								}
								Class32.aByteArrayArrayArray506[i_22_][i_23_][(-(i_25_ + 1) << 6) + i_24_] = (byte) (i_28_ + -28);
							}
							if ((0x4 & i_26_) == 4) {
								i += 3;
								int i_29_ = ((bs[i - 2] & 0xff) << 8) + (((0xff & bs[i + -3]) << 16) - -(bs[i - 1] & 0xff));
								if (Class23_Sub13_Sub10.anIntArrayArrayArray3881[i_22_][i_23_] == null) {
									Class23_Sub13_Sub10.anIntArrayArrayArray3881[i_22_][i_23_] = new int[4096];
								}
								Class23_Sub13_Sub7 class23_sub13_sub7 = Class38_Sub2.method1037(--i_29_, -21035);
								if (class23_sub13_sub7.anIntArray3746 != null) {
									class23_sub13_sub7 = class23_sub13_sub7.method646(176743434);
									if (class23_sub13_sub7 == null || (class23_sub13_sub7.anInt3751 ^ 0xffffffff) == 0) {
										continue;
									}
								}
								Class23_Sub13_Sub10.anIntArrayArrayArray3881[i_22_][i_23_][i_24_ + (-(1 + i_25_) << 6)] = 1 + class23_sub13_sub7.anInt3791;
								Class23_Sub11 class23_sub11 = new Class23_Sub11();
								class23_sub11.anInt2289 = i_17_;
								class23_sub11.anInt2280 = class23_sub13_sub7.anInt3751;
								class23_sub11.anInt2285 = -i_18_ + anInt2697;
								Class17_Sub1.aClass89_1996.method1439(-128, class23_sub11);
							}
						}
					}
				}
			}
		}
		if (b >= -79) {
			anInt2697 = -45;
		}
	}
	
	Class38_Sub7() {
		anInt2631 = 0;
		anInt2655 = -1;
		anInt2640 = 0;
		anInt2642 = 0;
		anInt2638 = -1000;
		anInt2660 = 0;
		anInt2644 = 0;
		anInt2664 = 0;
		anInt2661 = 0;
		anIntArray2663 = new int[10];
		aClass16_2670 = null;
		anInt2632 = 0;
		aBoolean2645 = false;
		anInt2685 = -32768;
		anIntArray2687 = new int[4];
		anInt2643 = 0;
		anInt2693 = -1;
		anInt2653 = -1;
		anInt2648 = 0;
		anInt2692 = 0;
		anInt2635 = -1;
		anIntArray2694 = new int[10];
		anInt2678 = -1;
		anInt2691 = -1;
		anInt2641 = -1;
		anIntArray2669 = new int[4];
		anInt2695 = 0;
		anIntArray2652 = new int[4];
		anInt2706 = 0;
		anInt2713 = 0;
		anInt2710 = -1;
		anInt2668 = 1;
		anInt2701 = 0;
		anInt2700 = -1;
		anInt2698 = 0;
		anInt2673 = -1;
		anInt2634 = -1;
		anInt2709 = 0;
		anInt2686 = -1;
		aBooleanArray2718 = new boolean[10];
	}
	
	static {
		aClass16_2666 = Class38_Sub6.method1076((byte) 86, "May");
		aClass16_2677 = Class38_Sub6.method1076((byte) 86, "Apr");
		aClass16_2646 = Class38_Sub6.method1076((byte) 86, "Jul");
		aClass16_2675 = Class38_Sub6.method1076((byte) 86, "Aug");
		aClass16_2672 = Class38_Sub6.method1076((byte) 86, "skill)2");
		aClass16_2683 = Class38_Sub6.method1076((byte) 86, "Dec");
		aClass16_2651 = Class38_Sub6.method1076((byte) 86, "Update)2Liste geladen)3");
		aClass16_2702 = Class38_Sub6.method1076((byte) 86, "Nov");
		aClass16_2679 = aClass16_2672;
		aClass16_2705 = Class38_Sub6.method1076((byte) 86, "cookiehost");
		aClass16_2712 = Class38_Sub6.method1076((byte) 86, "Jun");
		aClass16_2699 = Class38_Sub6.method1076((byte) 86, "Jan");
		aClass16_2662 = Class38_Sub6.method1076((byte) 86, "Sep");
		aClass16_2715 = Class38_Sub6.method1076((byte) 86, "Loading fonts )2 ");
		aClass16_2703 = aClass16_2715;
		aClass16_2711 = Class38_Sub6.method1076((byte) 86, "Oct");
		aClass16Array2654 = new RSString[] { aClass16_2699, aClass16_2667, aClass16_2665, aClass16_2677, aClass16_2666, aClass16_2712, aClass16_2646, aClass16_2675, aClass16_2662, aClass16_2711, aClass16_2702, aClass16_2683 };
	}
}
