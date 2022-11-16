/* Class23_Sub13_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class23_Sub13_Sub9 extends Class23_Sub13
{
	static int anInt3852;
	static RSString aClass16_3853 = Class38_Sub6.method1076((byte) 86, " steht bereits auf Ihrer Freunde)2Liste(Q");
	static int anInt3854;
	static int anInt3855;
	static int anInt3856;
	static int anInt3857;
	static boolean aBoolean3858 = false;
	static int[] anIntArray3859 = new int[4096];
	static int anInt3860 = 0;
	static int anInt3861;
	static int anInt3862;
	static int anInt3863;
	static RSString aClass16_3864 = Class38_Sub6.method1076((byte) 86, "headicons_pk");
	static int anInt3865;
	protected Class38_Sub6 aClass38_Sub6_3866;
	static int anInt3867;
	
	static final void method684(boolean bool) {
		Class23_Sub4_Sub1.anIntArray2890 = null;
		Class23_Sub23.anIntArray2417 = null;
		Class79.anIntArray1875 = null;
		Class105.anIntArray1766 = null;
		Class23_Sub13_Sub2.anIntArray3679 = null;
		Class23_Sub13_Sub23.aByteArrayArray4243 = null;
		if (bool != true) {
			aClass16_3864 = null;
		}
		anInt3867++;
	}
	
	static final RSString method685(int i, Class64 class64, int i_0_) {
		anInt3862++;
		if (!Class63.method1215(13417, Class47.method1142(class64, 105), i) && class64.anObjectArray1116 == null) {
			return null;
		}
		if (i_0_ != 1) {
			aClass16_3853 = null;
		}
		if (class64.aClass16Array1021 == null || (i ^ 0xffffffff) <= (class64.aClass16Array1021.length ^ 0xffffffff) || class64.aClass16Array1021[i] == null || (class64.aClass16Array1021[i].method169(91).method171() ^ 0xffffffff) == -1) {
			if (Class75.aBoolean1373) {
				return Class23_Sub4_Sub14.method322(new RSString[] { Class44.aClass16_673, Class23_Sub4_Sub23.method360((byte) -9, i) }, -30);
			}
			return null;
		}
		return class64.aClass16Array1021[i];
	}
	
	static final int method686(int i, Random random, int i_1_) {
		anInt3861++;
		if ((i_1_ ^ 0xffffffff) >= -1) {
			throw new IllegalArgumentException();
		}
		if (Class25.method921(i_1_, (byte) 120)) {
			return (int) ((0xffffffffL & (long) random.nextInt()) * (long) i_1_ >> 32);
		}
		int i_2_ = -2147483648 + -(int) (4294967296L % (long) i_1_);
		if (i != 12402) {
			return -94;
		}
		int i_3_;
		do
			i_3_ = random.nextInt();
		while (i_3_ >= i_2_);
		return Class23_Sub4_Sub16.method332(1, i_3_, i_1_);
	}
	
	public static void method687(boolean bool) {
		aClass16_3864 = null;
		aClass16_3853 = null;
		if (bool == true) {
			anIntArray3859 = null;
		}
	}
	
	static final Class43 method688(int i, Class105 class105, int i_4_, int i_5_) {
		anInt3856++;
		if (!Class23_Sub4_Sub29.method385(class105, i_5_, i, i_4_)) {
			return null;
		}
		return Class23_Sub2.method240((byte) -69);
	}
	
	static final void method689(boolean bool) {
		Class81.aClass23_Sub10_Sub2_1437.method551((byte) 24);
		if (bool == false) {
			Class87.aClass105_1496 = null;
			Class46.anInt708 = 1;
			anInt3854++;
		}
	}
	
	static final Class64 method690(Class64 class64, int i) {
		anInt3865++;
		Class64 class64_6_ = Class23_Sub4_Sub3.method281((byte) 79, class64);
		int i_7_ = -68 / ((i - 79) / 38);
		if (class64_6_ == null) {
			class64_6_ = class64.aClass64_1121;
		}
		return class64_6_;
	}
	
	static final void method691(int i, boolean bool) {
		if (i != 1848041696) {
			method687(true);
		}
		Class23_Sub13_Sub14.anIntArray4016 = new int[104];
		anInt3855++;
		Class28.anInt424 = 99;
		Class23_Sub12.anIntArray2302 = new int[104];
		Class23_Sub4_Sub3.anIntArray2947 = new int[104];
		Class58.anIntArray910 = new int[104];
		Class38_Sub3.anIntArray2515 = new int[104];
		int i_8_;
		if (!bool) {
			i_8_ = 4;
		} else {
			i_8_ = 1;
		}
		Class23_Sub4_Sub22.aByteArrayArrayArray3257 = new byte[i_8_][104][104];
		Class23_Sub4_Sub18.aByteArrayArrayArray3198 = new byte[i_8_][104][104];
		Class23_Sub4_Sub30.aByteArrayArrayArray3385 = new byte[i_8_][104][104];
		Class23_Sub13_Sub10.aByteArrayArrayArray3872 = new byte[i_8_][104][104];
		Class54.anIntArrayArrayArray861 = new int[i_8_][105][105];
		Class38_Sub7.aByteArrayArrayArray2690 = new byte[i_8_][105][105];
	}
	
	Class23_Sub13_Sub9(Class38_Sub6 class38_sub6) {
		aClass38_Sub6_3866 = class38_sub6;
	}
	
	static {
		anInt3857 = 0;
		anInt3863 = 0;
	}
}
