/* Class58 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class58
{
	static int anInt903;
	static int[] anIntArray904 = new int[50];
	static int anInt905;
	static int anInt906;
	static int anInt907;
	static RSString aClass16_908;
	static int anInt909;
	static int[] anIntArray910;
	private static RSString aClass16_911 = Class38_Sub6.method1076((byte) 86, "RuneScape has been updated(Q");
	
	static final void method1192(boolean bool, int i, Class38_Sub7_Sub2 class38_sub7_sub2, int i_0_) {
		anInt909++;
		if ((0x400 & i_0_ ^ 0xffffffff) != -1) {
			class38_sub7_sub2.anInt2710 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method453(65280);
			int i_1_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method465((byte) -127);
			class38_sub7_sub2.anInt2647 = i_1_ >> 16;
			if (class38_sub7_sub2.anInt2710 == 65535) {
				class38_sub7_sub2.anInt2710 = -1;
			}
			class38_sub7_sub2.anInt2671 = (i_1_ & 0xffff) + Class89.anInt1511;
			class38_sub7_sub2.anInt2661 = 0;
			class38_sub7_sub2.anInt2695 = 0;
			if ((class38_sub7_sub2.anInt2671 ^ 0xffffffff) < (Class89.anInt1511 ^ 0xffffffff)) {
				class38_sub7_sub2.anInt2695 = -1;
			}
		}
		if ((0x40 & i_0_ ^ 0xffffffff) != -1) {
			int i_2_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method442(123);
			int i_3_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(-1797813752);
			int i_4_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method458(125);
			int i_5_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.position;
			boolean bool_6_ = (i_2_ & 0x8000) != 0;
			if (class38_sub7_sub2.aClass16_4389 != null && class38_sub7_sub2.aClass51_4393 != null) {
				long l = class38_sub7_sub2.aClass16_4389.method184(120);
				boolean bool_7_ = false;
				if (i_3_ <= 1) {
					if (!bool_6_ && (Class67.anInt1176 == 1 || Class23_Sub4_Sub12.anInt3075 == 1)) {
						bool_7_ = true;
					} else {
						for (int i_8_ = 0; Class25.anInt383 > i_8_; i_8_++) {
							if (Class23_Sub4_Sub30.aLongArray3383[i_8_] == l) {
								bool_7_ = true;
								break;
							}
						}
					}
				}
				if (!bool_7_ && (Class23_Sub4_Sub39.anInt3519 ^ 0xffffffff) == -1) {
					int i_9_ = -1;
					Class23_Sub24.aClass23_Sub5_2445.position = 0;
					Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method478(-1, 0, i_4_, Class23_Sub24.aClass23_Sub5_2445.payload);
					Class23_Sub24.aClass23_Sub5_2445.position = 0;
					RSString class16;
					if (bool_6_) {
						i_2_ &= 0x7fff;
						Class42 class42 = Class79.method1359(Class23_Sub24.aClass23_Sub5_2445, (byte) 38);
						i_9_ = class42.anInt645;
						class16 = class42.aClass23_Sub13_Sub12_646.method752(Class23_Sub24.aClass23_Sub5_2445, 0);
					} else {
						class16 = Class23_Sub13_Sub8.method674(Class23_Sub24.method900((byte) -80, Class23_Sub24.aClass23_Sub5_2445).method149(1));
					}
					class38_sub7_sub2.aClass16_2670 = class16.method169(41);
					class38_sub7_sub2.anInt2701 = 0xff & i_2_;
					class38_sub7_sub2.anInt2713 = i_2_ >> 8;
					class38_sub7_sub2.anInt2639 = 150;
					if (i_3_ != 2) {
						if (i_3_ == 1) {
							Class89.method1433(!bool_6_ ? 1 : 17, i_9_, class16, null, Class23_Sub4_Sub14.method322(new RSString[] { Class33.aClass16_519, class38_sub7_sub2.aClass16_4389 }, -41), (byte) -119);
						} else {
							Class89.method1433(!bool_6_ ? 2 : 17, i_9_, class16, null, class38_sub7_sub2.aClass16_4389, (byte) -117);
						}
					} else {
						Class89.method1433(bool_6_ ? 17 : 1, i_9_, class16, null, Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub7.aClass16_2203, class38_sub7_sub2.aClass16_4389 }, -74), (byte) -116);
					}
				}
			}
			Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.position = i_4_ + i_5_;
		}
		if ((i_0_ & 0x80) != 0) {
			int i_10_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method473(-112);
			int i_11_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method435((byte) 121);
			class38_sub7_sub2.method1086(10, i_10_, i_11_, Class89.anInt1511);
			class38_sub7_sub2.anInt2638 = Class89.anInt1511 - -300;
			class38_sub7_sub2.anInt2708 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(-1797813752);
		}
		if ((0x10 & i_0_ ^ 0xffffffff) != -1) {
			class38_sub7_sub2.aClass16_2670 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method426(2);
			if (class38_sub7_sub2.aClass16_2670.method166((byte) 95, 0) == 126) {
				class38_sub7_sub2.aClass16_2670 = class38_sub7_sub2.aClass16_2670.method138((byte) 73, 1);
				Class95.method1468(2, -1, class38_sub7_sub2.aClass16_2670, class38_sub7_sub2.aClass16_4389);
			} else if (Class105.aClass38_Sub7_Sub2_1812 == class38_sub7_sub2) {
				Class95.method1468(2, -1, class38_sub7_sub2.aClass16_2670, class38_sub7_sub2.aClass16_4389);
			}
			class38_sub7_sub2.anInt2713 = 0;
			class38_sub7_sub2.anInt2701 = 0;
			class38_sub7_sub2.anInt2639 = 150;
		}
		if ((0x1 & i_0_) != 0) {
			int i_12_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method476((byte) -126);
			int i_13_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method473(-111);
			if ((i_12_ ^ 0xffffffff) == -65536) {
				i_12_ = -1;
			}
			Class23_Sub4_Sub22.method356(0, i_13_, i_12_, class38_sub7_sub2);
		}
		if (bool == true) {
			if ((0x20 & i_0_) != 0) {
				class38_sub7_sub2.anInt2686 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method480((byte) 82);
				if ((class38_sub7_sub2.anInt2686 ^ 0xffffffff) == -65536) {
					class38_sub7_sub2.anInt2686 = -1;
				}
			}
			if ((0x4 & i_0_) != 0) {
				class38_sub7_sub2.anInt2648 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method480((byte) 82);
				class38_sub7_sub2.anInt2692 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method476((byte) -117);
			}
			if ((i_0_ & 0x100) != 0) {
				class38_sub7_sub2.anInt2650 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method435((byte) 86);
				class38_sub7_sub2.anInt2688 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(-1797813752);
				class38_sub7_sub2.anInt2633 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method473(-100);
				class38_sub7_sub2.anInt2681 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method435((byte) 80);
				class38_sub7_sub2.anInt2684 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method476((byte) -121) - -Class89.anInt1511;
				class38_sub7_sub2.anInt2716 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method480((byte) 82) - -Class89.anInt1511;
				class38_sub7_sub2.anInt2717 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method458(127);
				class38_sub7_sub2.anInt2660 = 1;
				class38_sub7_sub2.anInt2640 = 0;
			}
			if ((0x200 & i_0_) != 0) {
				int i_14_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(-1797813752);
				int i_15_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(-1797813752);
				class38_sub7_sub2.method1086(10, i_14_, i_15_, Class89.anInt1511);
			}
			if ((i_0_ & 0x2) != 0) {
				int i_16_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(-1797813752);
				byte[] bs = new byte[i_16_];
				Buffer class23_sub5 = new Buffer(bs);
				Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method464(0, bs, -32083, i_16_);
				Class38_Sub7_Sub1.aClass23_Sub5Array4377[i] = class23_sub5;
				class38_sub7_sub2.method1098(12, class23_sub5);
			}
		}
	}
	
	public static void method1193(int i) {
		aClass16_911 = null;
		aClass16_908 = null;
		anIntArray910 = null;
		if (i != 17) {
			method1192(true, -13, null, 81);
		}
		anIntArray904 = null;
	}
	
	static {
		aClass16_908 = aClass16_911;
	}
}
