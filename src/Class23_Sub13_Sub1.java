/* Class23_Sub13_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub13_Sub1 extends Class23_Sub13
{
	static boolean aBoolean3665;
	static Class5 aClass5_3666;
	static int anInt3667 = 1;
	protected Class38_Sub2 aClass38_Sub2_3668;
	static Class82[] worldList;
	static Class59[] aClass59Array3670;
	static int anInt3671;
	static int anInt3672;
	static int anInt3673;
	static RSString aClass16_3674;
	
	static final void method603() {
		for (int i = 0; i < Class23_Sub4_Sub18.anInt3196; i++) {
			for (int i_0_ = 0; i_0_ < Class105.anInt1802; i_0_++) {
				for (int i_1_ = 0; i_1_ < client.anInt1974; i_1_++)
					Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i][i_0_][i_1_] = null;
			}
		}
		for (int i = 0; i < Class38.anInt592; i++) {
			for (int i_2_ = 0; i_2_ < Class38.anIntArray595[i]; i_2_++)
				Class38.aClass59ArrayArray591[i][i_2_] = null;
			Class38.anIntArray595[i] = 0;
		}
		for (int i = 0; i < Class23_Sub4.anInt2103; i++)
			Class23_Sub4_Sub38.aClass39Array3502[i] = null;
		Class23_Sub4.anInt2103 = 0;
		for (int i = 0; i < Class23_Sub17.aClass39Array2362.length; i++)
			Class23_Sub17.aClass39Array2362[i] = null;
	}
	
	public static void method604(int i) {
		worldList = null;
		aClass5_3666 = null;
		aClass16_3674 = null;
		if (i != 128) {
			aClass59Array3670 = null;
		}
		aClass59Array3670 = null;
	}
	
	Class23_Sub13_Sub1(Class38_Sub2 class38_sub2) {
		aClass38_Sub2_3668 = class38_sub2;
	}
	
	static {
		aBoolean3665 = false;
		aClass59Array3670 = new Class59[500];
		aClass5_3666 = new Class5(128);
		anInt3672 = -1;
		anInt3671 = -1;
		aClass16_3674 = Class38_Sub6.method1076((byte) 86, "Fehler bei der Verbindung zum Server)3");
	}
}
