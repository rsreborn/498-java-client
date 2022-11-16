/* Class23_Sub10_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub10_Sub4 extends Class23_Sub10
{
	private Class89 aClass89_3661 = new Class89();
	private Class89 aClass89_3662 = new Class89();
	private int anInt3663 = -1;
	private int anInt3664 = 0;
	
	private final void method589(int[] is, int i, int i_0_) {
		for (Class23_Sub10 class23_sub10 = (Class23_Sub10) aClass89_3661.method1437(4); class23_sub10 != null; class23_sub10 = (Class23_Sub10) aClass89_3661.method1431((byte) -89))
			class23_sub10.method504(is, i, i_0_);
	}
	
	final synchronized void method590(Class23_Sub10 class23_sub10) {
		aClass89_3661.method1434(class23_sub10, -1);
	}
	
	private final void method591(Class23_Sub22 class23_sub22) {
		class23_sub22.method228(0);
		class23_sub22.method893();
		Class23 class23 = aClass89_3662.aClass23_1520.aClass23_354;
		if (class23 == aClass89_3662.aClass23_1520) {
			anInt3663 = -1;
		} else {
			anInt3663 = ((Class23_Sub22) class23).anInt2416;
		}
	}
	
	final int method501() {
		return 0;
	}
	
	final synchronized void method506(int[] is, int i, int i_1_) {
		do {
			if (anInt3663 < 0) {
				method589(is, i, i_1_);
				break;
			}
			if (anInt3664 + i_1_ < anInt3663) {
				anInt3664 += i_1_;
				method589(is, i, i_1_);
				break;
			}
			int i_2_ = anInt3663 - anInt3664;
			method589(is, i, i_2_);
			i += i_2_;
			i_1_ -= i_2_;
			anInt3664 += i_2_;
			method592();
			Class23_Sub22 class23_sub22 = (Class23_Sub22) aClass89_3662.method1437(29);
			synchronized (class23_sub22) {
				int i_3_ = class23_sub22.method894(this);
				if (i_3_ < 0) {
					class23_sub22.anInt2416 = 0;
					method591(class23_sub22);
				} else {
					class23_sub22.anInt2416 = i_3_;
					method594(class23_sub22.aClass23_354, class23_sub22);
				}
			}
		} while (i_1_ != 0);
	}
	
	final Class23_Sub10 method503() {
		return (Class23_Sub10) aClass89_3661.method1437(127);
	}
	
	private final void method592() {
		if (anInt3664 > 0) {
			for (Class23_Sub22 class23_sub22 = (Class23_Sub22) aClass89_3662.method1437(95); class23_sub22 != null; class23_sub22 = (Class23_Sub22) aClass89_3662.method1431((byte) -89))
				class23_sub22.anInt2416 -= anInt3664;
			anInt3663 -= anInt3664;
			anInt3664 = 0;
		}
	}
	
	private final void method593(int i) {
		for (Class23_Sub10 class23_sub10 = (Class23_Sub10) aClass89_3661.method1437(100); class23_sub10 != null; class23_sub10 = (Class23_Sub10) aClass89_3661.method1431((byte) -89))
			class23_sub10.method507(i);
	}
	
	final Class23_Sub10 method502() {
		return (Class23_Sub10) aClass89_3661.method1431((byte) -89);
	}
	
	final synchronized void method507(int i) {
		do {
			if (anInt3663 < 0) {
				method593(i);
				break;
			}
			if (anInt3664 + i < anInt3663) {
				anInt3664 += i;
				method593(i);
				break;
			}
			int i_4_ = anInt3663 - anInt3664;
			method593(i_4_);
			i -= i_4_;
			anInt3664 += i_4_;
			method592();
			Class23_Sub22 class23_sub22 = (Class23_Sub22) aClass89_3662.method1437(16);
			synchronized (class23_sub22) {
				int i_5_ = class23_sub22.method894(this);
				if (i_5_ < 0) {
					class23_sub22.anInt2416 = 0;
					method591(class23_sub22);
				} else {
					class23_sub22.anInt2416 = i_5_;
					method594(class23_sub22.aClass23_354, class23_sub22);
				}
			}
		} while (i != 0);
	}
	
	private final void method594(Class23 class23, Class23_Sub22 class23_sub22) {
		for (/**/; class23 != aClass89_3662.aClass23_1520 && ((Class23_Sub22) class23).anInt2416 <= class23_sub22.anInt2416; class23 = class23.aClass23_354) {
			/* empty */
		}
		aClass89_3662.method1441(class23, 0, class23_sub22);
		anInt3663 = ((Class23_Sub22) aClass89_3662.aClass23_1520.aClass23_354).anInt2416;
	}
	
	final synchronized void method595(Class23_Sub10 class23_sub10) {
		class23_sub10.method228(0);
	}
}
