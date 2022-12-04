/* Class53 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

public class Class53
{
	static int anInt831;
	private Class60 aClass60_832;
	static int anInt833;
	private int anInt834;
	static int anInt835;
	static RSString aClass16_836;
	private int anInt837;
	static int anInt838;
	private long aLong839;
	static boolean aBoolean840 = false;
	static Class23_Sub13_Sub10 aClass23_Sub13_Sub10_841;
	static int anInt842;
	static byte[][] aByteArrayArray843;
	private DataInputStream aDataInputStream844;
	private byte[] aByteArray845;
	private byte[] aByteArray846 = new byte[4];
	static Class105 aClass105_847;
	private int anInt848;
	private static RSString aClass16_849 = Class38_Sub6.method1076((byte) 86, "Loaded update list");
	
	final byte[] method1171(int i) throws IOException {
		anInt831++;
		if ((Class94.method1466(22624) ^ 0xffffffffffffffffL) < (aLong839 ^ 0xffffffffffffffffL)) {
			throw new IOException("fdt");
		}
		if (anInt837 == 0) {
			if (aClass60_832.anInt951 == 2) {
				throw new IOException("fds");
			}
			if (aClass60_832.anInt951 == 1) {
				anInt837 = 1;
				aDataInputStream844 = (DataInputStream) aClass60_832.anObject955;
			}
		}
		if (anInt837 == 1) {
			int i_0_ = aDataInputStream844.available();
			if ((i_0_ ^ 0xffffffff) < -1) {
				if (i_0_ - -anInt848 > 4) {
					i_0_ = 4 - anInt848;
				}
				anInt848 += aDataInputStream844.read(aByteArray846, anInt848, i_0_);
				if (anInt848 == 4) {
					int i_1_ = new Buffer(aByteArray846).readUIntBE();
					aByteArray845 = new byte[i_1_];
					anInt837 = 2;
				}
			}
		}
		if (i < 14) {
			aBoolean840 = false;
		}
		if (anInt837 == 2) {
			int i_2_ = aDataInputStream844.available();
			if (i_2_ > 0) {
				if (aByteArray845.length < i_2_ - -anInt834) {
					i_2_ = -anInt834 + aByteArray845.length;
				}
				anInt834 += aDataInputStream844.read(aByteArray845, anInt834, i_2_);
				if (anInt834 == aByteArray845.length) {
					return aByteArray845;
				}
			}
		}
		return null;
	}
	
	public static void method1172(boolean bool) {
		aByteArrayArray843 = null;
		aClass23_Sub13_Sub10_841 = null;
		aClass16_836 = null;
		if (bool == true) {
			aClass16_849 = null;
			aClass105_847 = null;
		}
	}
	
	static final void method1173(int i, RSString class16) {
		anInt842++;
		if (Class23_Sub4_Sub17.anInt3173 >= 2) {
			if (class16.method140(Class23_Sub13_Sub18.aClass16_4080, 40)) {
				for (int i_3_ = 0; i_3_ < 10; i_3_++)
					System.gc();
				Runtime runtime = Runtime.getRuntime();
				int i_4_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class95.method1468(0, -1, Class23_Sub4_Sub14.method322(new RSString[] { Class34.aClass16_528, Class23_Sub4_Sub23.method360((byte) -9, i_4_), Class55.aClass16_868 }, -96), null);
			}
			if (class16.method140(Class23_Sub4_Sub4.aClass16_2964, 40)) {
				Class44.method1128(-104);
			}
			if (class16.method140(Class23_Sub4_Sub17.aClass16_3180, 40)) {
				Class82.aBoolean1442 = true;
			}
			if (class16.method140(Class27.aClass16_403, 40)) {
				Class82.aBoolean1442 = false;
			}
			class16.method140(Class23_Sub4_Sub25.aClass16_3314, 40);
			class16.method140(Class23_Sub12.aClass16_2290, 40);
			if (class16.method140(Class23_Sub19.aClass16_2389, 40)) {
				for (int i_5_ = 0; i_5_ < 4; i_5_++) {
					for (int i_6_ = 1; i_6_ < 103; i_6_++) {
						for (int i_7_ = 1; i_7_ < 103; i_7_++)
							Class4.aClass72Array85[i_5_].anIntArrayArray1290[i_6_][i_7_] = 0;
					}
				}
			}
			if (class16.method176(Class23_Sub11.aClass16_2284, (byte) -127) && (Class23_Sub8.anInt2250 ^ 0xffffffff) != -1) {
				Class71_Sub2_Sub1.method1284(1000, class16.method138((byte) 70, 6).method142(true));
			}
			if (class16.method140(Class71.aClass16_1272, 40) && Class23_Sub8.anInt2250 == 2) {
				throw new RuntimeException();
			}
			if (class16.method176(Class59.aClass16_928, (byte) -95)) {
				Class57.anInt901 = class16.method138((byte) 74, 12).method169(123).method142(true);
				Class95.method1468(0, -1, Class23_Sub4_Sub14.method322(new RSString[] { Class68.aClass16_1198, Class23_Sub4_Sub23.method360((byte) -9, Class57.anInt901) }, -54), null);
			}
			if (class16.method140(Class23_Sub13_Sub10.aClass16_3886, 40)) {
				Class75.aBoolean1373 = true;
			}
		}
		int i_8_ = 71 / ((93 - i) / 32);
		Class61.anInt963++;
		Class23_Sub7.aClass23_Sub5_Sub1_2202.writeOpcode(46, 2976);
		Class23_Sub7.aClass23_Sub5_Sub1_2202.writeByte(class16.method171(-61) - 1);
		Class23_Sub7.aClass23_Sub5_Sub1_2202.method446(class16.method138((byte) 106, 2), -124);
	}
	
	Class53(Class9 class9, URL url) {
		// @todo refactor this to call the game server - Kat 3/Dec/22
		System.out.println("Nice! Found the world button list!");
		/*
		 * //Now do we have it communicate with the server or rig it? I think we should
		 * rig it lmao
		 * aClass60_832 = class9.method102(url, 119); anInt837 = 0;
		 * //This is setting how long it should wait, this is 30 seconds)
		 * aLong839 = 30000L +
		 * Class94.method1466(22624);
		 */
	//TODO Later, just have it send a request to the server and have it send us a real-updated list... until then:
	
	Class51.anInt793 = 1;//Amount of Worlds
	Class23_Sub13_Sub1.worldList = new Class82[Class51.anInt793];
	for (int i_151_ = 0; Class51.anInt793 > i_151_; i_151_++) {
		Class82 class82 = Class23_Sub13_Sub1.worldList[i_151_] = new Class82();
		class82.aBoolean1450 = true;//members world
		class82.anInt1451 = 69;//world number
		class82.aClass16_1449 = Class38_Sub6.method1076((byte) 86, "127)30)30)31");//Server IP lol
		class82.anInt1447 = 420;//number of players
		class82.anInt1448 = i_151_;//world index
		class82.anInt1443 = 1;//country flag!
	}
	Class38_Sub6.method1080(0, 0/*dummy*/, Class23_Sub13_Sub1.worldList, Class23_Sub13_Sub1.worldList.length - 1);
	Class23.aClass53_347 = null;
	Class71_Sub2.isWorldListReady = true;	
//	PacketBuffer class23_sub5 = new PacketBuffer(bs);
//	Class51.anInt793 = class23_sub5.getShort((byte) -105);
	
//	Class23_Sub13_Sub1.worldList = new Class82[Class51.anInt793];
//	for (int i_151_ = 0; Class51.anInt793 > i_151_; i_151_++) {
//		Class82 class82 = Class23_Sub13_Sub1.worldList[i_151_] = new Class82();
//		int i_152_ = class23_sub5.getShort((byte) -126);
//		class82.aBoolean1450 = (0x8000 & i_152_) != 0;
//		class82.anInt1451 = i_152_ & 0x7fff;
//		class82.aClass16_1449 = class23_sub5.readString(i + -2872);
//		class82.anInt1447 = class23_sub5.method474(true);
//		class82.anInt1448 = i_151_;
//		class82.anInt1443 = NPCDefinition.method814(class23_sub5.getShort((byte) -120), true);
//	}
//	Class38_Sub6.method1080(0, i ^ 0xb3a, Class23_Sub13_Sub1.worldList, Class23_Sub13_Sub1.worldList.length - 1);
//	Class23.aClass53_347 = null;
//	Class71_Sub2.isWorldListReady = true;
	}
	
	static {
		aClass16_836 = aClass16_849;
	}
}
