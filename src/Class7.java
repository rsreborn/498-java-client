/* Class7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class7 implements Runnable
{
	static Class81 aClass81_161 = new Class81(260);
	static int anInt162;
	static int anInt163;
	static int anInt164;
	static int anInt165;
	static volatile boolean aBoolean166 = true;
	static int anInt167;
	static int anInt168;
	static int anInt169;
	static boolean aBoolean170 = false;
	
	static final Class23_Sub13_Sub22 method90(int i, byte b) {
		Class23_Sub13_Sub22 class23_sub13_sub22 = (Class23_Sub13_Sub22) Class23_Sub20.aClass5_2399.method62(-107, (long) i);
		if (b < 64) {
			method93(-8);
		}
		anInt162++;
		if (class23_sub13_sub22 != null) {
			return class23_sub13_sub22;
		}
		byte[] bs = Class95.aClass105_1618.method1544(Class87_Sub3.method1418(0, i), 0, Class87_Sub2.method1415(i, (byte) 95));
		class23_sub13_sub22 = new Class23_Sub13_Sub22();
		if (bs != null) {
			class23_sub13_sub22.method837((byte) -87, new Buffer(bs));
		}
		class23_sub13_sub22.method836((byte) 80);
		Class23_Sub20.aClass5_2399.method67((long) i, class23_sub13_sub22, true);
		return class23_sub13_sub22;
	}
	
	public static void method91(int i) {
		if (i > -12) {
			method92(true);
		}
		aClass81_161 = null;
	}
	
	static final int method92(boolean bool) {
		anInt164++;
		if (bool != false) {
			method91(72);
		}
		int i = Class23_Sub4_Sub22.method359(ItemDefinition.anInt3916, Class23_Sub13_Sub1.anInt3673, Class53.anInt838, (byte) 117);
		if (-Class23_Sub23.anInt2424 + i < 800 && (Class23_Sub4_Sub30.aByteArrayArrayArray3379[ItemDefinition.anInt3916][Class23_Sub13_Sub1.anInt3673 >> 7][Class53.anInt838 >> 7] & 0x4) != 0) {
			return ItemDefinition.anInt3916;
		}
		return 3;
	}
	
	static final void method93(int i) {
		if (i == -1385015865) {
			anInt168++;
			Class55.aClass5_871.method68(0);
		}
	}
	
	static final void method94(int i) {
		if (i != 0) {
			method92(true);
		}
		Class23_Sub13_Sub24.aClass81_4267.method1369((byte) -46);
		anInt165++;
	}
	
	Class7() {
		/* empty */
	}
	
	static final void method95(byte b, int i, int i_0_) {
		anInt167++;
		if (b < 85) {
			aClass81_161 = null;
		}
		Class23_Sub13_Sub4.anInt3707++;
		Class23_Sub7.aClass23_Sub5_Sub1_2202.writeOpcode(76, 2976);
		Class23_Sub7.aClass23_Sub5_Sub1_2202.putInt1(i_0_, (byte) 66);
		Class23_Sub7.aClass23_Sub5_Sub1_2202.putShort(i, (byte) 51);
	}
	
	public final void run() {
		anInt163++;
		try {
			for (;;) {
				Class23_Sub14 class23_sub14;
				synchronized (Class23_Sub13_Sub15.aClass89_4018) {
					class23_sub14 = (Class23_Sub14) Class23_Sub13_Sub15.aClass89_4018.method1437(-122);
				}
				if (class23_sub14 != null) {
					if ((class23_sub14.anInt2330 ^ 0xffffffff) != -1) {
						if (class23_sub14.anInt2330 == 1) {
							class23_sub14.aByteArray2333 = class23_sub14.aClass13_2322.method121((byte) -32, (int) class23_sub14.aLong358);
							synchronized (Class23_Sub13_Sub15.aClass89_4018) {
								Class23_Sub4_Sub33.aClass89_3436.method1439(38, class23_sub14);
							}
						}
					} else {
						class23_sub14.aClass13_2322.method122((int) class23_sub14.aLong358, class23_sub14.aByteArray2333, class23_sub14.aByteArray2333.length, -9168);
						synchronized (Class23_Sub13_Sub15.aClass89_4018) {
							class23_sub14.method228(0);
						}
					}
					synchronized (Class21.anObject338) {
						if (Class23.anInt353 <= 1) {
							Class23.anInt353 = 0;
							Class21.anObject338.notifyAll();
							break;
						}
						Class23.anInt353 = 600;
					}
				} else {
					Class105.method1545((byte) -68, 100L);
					synchronized (Class21.anObject338) {
						if (Class23.anInt353 <= 1) {
							Class23.anInt353 = 0;
							Class21.anObject338.notifyAll();
							break;
						}
						Class23.anInt353--;
					}
				}
			}
		} catch (Exception exception) {
			Class26.method925(95, exception, null);
		}
	}
}
