/* Class50 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class50
{
	static RSString aClass16_767;
	private static RSString aClass16_768;
	private static RSString aClass16_769;
	static int anInt770;
	static RSString aClass16_771;
	protected int anInt772 = -1;
	static RSString aClass16_773;
	static int[] anIntArray774;
	static int anInt775;
	static int anInt776 = 0;
	private static RSString aClass16_777;
	protected Class23_Sub13_Sub23 aClass23_Sub13_Sub23_778;
	static int anInt779;
	static int[] anIntArray780;
	static int anInt781;
	protected RSString[] aClass16Array782;
	static int anInt783;
	static RSString aClass16_784;
	protected int[] anIntArray785;
	
	public static void method1155(int i) {
		anIntArray780 = null;
		aClass16_777 = null;
		aClass16_767 = null;
		aClass16_784 = null;
		aClass16_769 = null;
		anIntArray774 = null;
		aClass16_771 = null;
		if (i < 22) {
			aClass16_769 = null;
		}
		aClass16_773 = null;
		aClass16_768 = null;
	}
	
	static final void method1156(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		int i_6_ = i_0_ + i_5_;
		anInt783++;
		int i_7_ = -i_0_ + i;
		int i_8_ = i_2_ - -i_0_;
		int i_9_ = i_1_ - i_0_;
		for (int i_10_ = i_5_; (i_10_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff); i_10_++)
			Class23_Sub13_Sub6.method632(i_1_, (byte) -30, i_4_, Class4.anIntArrayArray98[i_10_], i_2_);
		int i_11_ = i;
		if (i_3_ >= 24) {
			for (/**/; (i_7_ ^ 0xffffffff) > (i_11_ ^ 0xffffffff); i_11_--)
				Class23_Sub13_Sub6.method632(i_1_, (byte) -30, i_4_, Class4.anIntArrayArray98[i_11_], i_2_);
			for (int i_12_ = i_6_; (i_7_ ^ 0xffffffff) <= (i_12_ ^ 0xffffffff); i_12_++) {
				int[] is = Class4.anIntArrayArray98[i_12_];
				Class23_Sub13_Sub6.method632(i_8_, (byte) -30, i_4_, is, i_2_);
				Class23_Sub13_Sub6.method632(i_1_, (byte) -30, i_4_, is, i_9_);
			}
		}
	}
	
	static final Class23_Sub13_Sub21 method1157(int i, boolean bool) {
		Class23_Sub13_Sub21 class23_sub13_sub21 = (Class23_Sub13_Sub21) Class23_Sub13_Sub3.aClass5_3691.method62(125, (long) i);
		anInt770++;
		if (class23_sub13_sub21 != null) {
			return class23_sub13_sub21;
		}
		byte[] bs = Class75.aClass105_1380.method1544(i, 0, 5);
		class23_sub13_sub21 = new Class23_Sub13_Sub21();
		if (bs != null) {
			class23_sub13_sub21.method829(new Buffer(bs), 128);
		}
		Class23_Sub13_Sub3.aClass5_3691.method67((long) i, class23_sub13_sub21, bool);
		return class23_sub13_sub21;
	}
	
	static final Class43_Sub1 method1158(byte b) {
		int i = -22 / ((b - -27) / 57);
		Class43_Sub1 class43_sub1 = new Class43_Sub1(Class23_Sub12.anInt2301, Class23_Sub13_Sub15.anInt4033, Class23_Sub23.anIntArray2417[0], Class23_Sub13_Sub2.anIntArray3679[0], Class79.anIntArray1875[0], Class105.anIntArray1766[0], Class23_Sub13_Sub23.aByteArrayArray4243[0], Class23_Sub4_Sub1.anIntArray2890);
		anInt775++;
		Class23_Sub13_Sub9.method684(true);
		return class43_sub1;
	}
	
	static final void method1159(byte b) {
		anInt779++;
		Class23_Sub13_Sub9 class23_sub13_sub9 = (Class23_Sub13_Sub9) Class23_Sub13_Sub17.aClass89_4066.method1437(-109);
		if (b == 32) {
			for (/**/; class23_sub13_sub9 != null; class23_sub13_sub9 = (Class23_Sub13_Sub9) Class23_Sub13_Sub17.aClass89_4066.method1431((byte) -89)) {
				Class38_Sub6 class38_sub6 = class23_sub13_sub9.aClass38_Sub6_3866;
				if ((Class23_Sub13_Sub11.anInt3916 ^ 0xffffffff) == (class38_sub6.anInt2619 ^ 0xffffffff) && !class38_sub6.aBoolean2622) {
					if (Class89.anInt1511 >= class38_sub6.anInt2612) {
						class38_sub6.method1079(Class23_Sub25.anInt2459, -2);
						if (!class38_sub6.aBoolean2622) {
							Class38.method993(class38_sub6.anInt2619, class38_sub6.anInt2626, class38_sub6.anInt2621, class38_sub6.anInt2624, 60, class38_sub6, 0, -1L, false);
						} else {
							class23_sub13_sub9.method228(0);
						}
					}
				} else {
					class23_sub13_sub9.method228(0);
				}
			}
		}
	}
	
	static {
		aClass16_768 = Class38_Sub6.method1076((byte) 86, "To play on this world move to a free area first)3");
		aClass16_769 = Class38_Sub6.method1076((byte) 86, "Error loading your profile)3");
		anIntArray774 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };
		anIntArray780 = new int[32];
		aClass16_777 = Class38_Sub6.method1076((byte) 86, "Loading textures )2 ");
		aClass16_771 = aClass16_777;
		aClass16_773 = aClass16_769;
		aClass16_784 = Class38_Sub6.method1076((byte) 86, "Starte 3D)2Softwarebibliothek)3");
		aClass16_767 = aClass16_768;
	}
}
