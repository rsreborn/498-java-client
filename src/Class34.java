/* Class34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Class34 implements Runnable
{
	private OutputStream anOutputStream523;
	static int anInt524;
	static int anInt525;
	private boolean aBoolean526 = false;
	static int anInt527;
	static RSString aClass16_528;
	static RSString aClass16_529;
	private Class60 aClass60_530;
	static int anInt531 = 0;
	static int anInt532;
	private int anInt533;
	static int anInt534;
	static int anInt535;
	private Socket aSocket536;
	static int anInt537;
	private boolean aBoolean538 = false;
	static RSString aClass16_539;
	static RSString aClass16_540 = Class38_Sub6.method1076((byte) 86, "; Expires=");
	private static RSString aClass16_541;
	private int anInt542 = 0;
	static int anInt543;
	private Class9 aClass9_544;
	private byte[] aByteArray545;
	private InputStream anInputStream546;
	static int anInt547;
	
	static final void method970(byte b, int i, int i_0_, int i_1_, int i_2_) {
		int i_3_ = 10 % ((56 - b) / 52);
		for (Class23_Sub8 class23_sub8 = (Class23_Sub8) Class105.aClass89_1767.method1437(-119); class23_sub8 != null; class23_sub8 = (Class23_Sub8) Class105.aClass89_1767.method1431((byte) -89)) {
			if ((class23_sub8.anInt2227 ^ 0xffffffff) != 0 || class23_sub8.anIntArray2239 != null) {
				int i_4_ = 0;
				if (i_0_ > class23_sub8.anInt2254) {
					i_4_ += i_0_ + -class23_sub8.anInt2254;
				} else if (i_0_ < class23_sub8.anInt2246) {
					i_4_ += class23_sub8.anInt2246 - i_0_;
				}
				if ((class23_sub8.anInt2229 ^ 0xffffffff) > (i_1_ ^ 0xffffffff)) {
					i_4_ += i_1_ - class23_sub8.anInt2229;
				} else if (i_1_ < class23_sub8.anInt2240) {
					i_4_ += class23_sub8.anInt2240 - i_1_;
				}
				if (class23_sub8.anInt2233 < -64 + i_4_ || (Class94.anInt1604 ^ 0xffffffff) == -1 || (i_2_ ^ 0xffffffff) != (class23_sub8.anInt2253 ^ 0xffffffff)) {
					if (class23_sub8.aClass23_Sub10_Sub1_2228 != null) {
						Class23_Sub7.aClass23_Sub10_Sub4_2201.method595(class23_sub8.aClass23_Sub10_Sub1_2228);
						class23_sub8.aClass23_Sub10_Sub1_2228 = null;
					}
					if (class23_sub8.aClass23_Sub10_Sub1_2232 != null) {
						Class23_Sub7.aClass23_Sub10_Sub4_2201.method595(class23_sub8.aClass23_Sub10_Sub1_2232);
						class23_sub8.aClass23_Sub10_Sub1_2232 = null;
					}
				} else {
					i_4_ -= 64;
					if ((i_4_ ^ 0xffffffff) > -1) {
						i_4_ = 0;
					}
					int i_5_ = (-i_4_ + class23_sub8.anInt2233) * Class94.anInt1604 / class23_sub8.anInt2233;
					if (class23_sub8.aClass23_Sub10_Sub1_2228 == null) {
						if (class23_sub8.anInt2227 >= 0) {
							Class18 class18 = Class18.method195(Class30.aClass105_Sub1_475, class23_sub8.anInt2227, 0);
							if (class18 != null) {
								Class23_Sub6_Sub1 class23_sub6_sub1 = class18.method196().method493(Class83.aClass45_1462);
								Class23_Sub10_Sub1 class23_sub10_sub1 = Class23_Sub10_Sub1.method510(class23_sub6_sub1, 100, i_5_);
								class23_sub10_sub1.method536(-1);
								Class23_Sub7.aClass23_Sub10_Sub4_2201.method590(class23_sub10_sub1);
								class23_sub8.aClass23_Sub10_Sub1_2228 = class23_sub10_sub1;
							}
						}
					} else {
						class23_sub8.aClass23_Sub10_Sub1_2228.method543(i_5_);
					}
					if (class23_sub8.aClass23_Sub10_Sub1_2232 == null) {
						if (class23_sub8.anIntArray2239 != null && ((class23_sub8.anInt2242 -= i) ^ 0xffffffff) >= -1) {
							int i_6_ = (int) (Math.random() * (double) class23_sub8.anIntArray2239.length);
							Class18 class18 = Class18.method195(Class30.aClass105_Sub1_475, class23_sub8.anIntArray2239[i_6_], 0);
							if (class18 != null) {
								Class23_Sub6_Sub1 class23_sub6_sub1 = class18.method196().method493(Class83.aClass45_1462);
								Class23_Sub10_Sub1 class23_sub10_sub1 = Class23_Sub10_Sub1.method510(class23_sub6_sub1, 100, i_5_);
								class23_sub10_sub1.method536(0);
								Class23_Sub7.aClass23_Sub10_Sub4_2201.method590(class23_sub10_sub1);
								class23_sub8.anInt2242 = class23_sub8.anInt2236 + (int) ((double) (class23_sub8.anInt2241 + -class23_sub8.anInt2236) * Math.random());
								class23_sub8.aClass23_Sub10_Sub1_2232 = class23_sub10_sub1;
							}
						}
					} else {
						class23_sub8.aClass23_Sub10_Sub1_2232.method543(i_5_);
						if (!class23_sub8.aClass23_Sub10_Sub1_2232.method227(-18996)) {
							class23_sub8.aClass23_Sub10_Sub1_2232 = null;
						}
					}
				}
			}
		}
		anInt524++;
	}
	
	final int method971(byte b) throws IOException {
		anInt547++;
		if (aBoolean538) {
			return 0;
		}
		if (b != 10) {
			anInt531 = 97;
		}
		return anInputStream546.read();
	}
	
	public final void run() {
		anInt534++;
		try {
			for (;;) {
				int i;
				int i_7_;
				synchronized (this) {
					if (anInt533 == anInt542) {
						if (aBoolean538) {
							break;
						}
						try {
							this.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
					}
					i = anInt542;
					if ((anInt542 ^ 0xffffffff) < (anInt533 ^ 0xffffffff)) {
						i_7_ = 5000 + -anInt542;
					} else {
						i_7_ = anInt533 - anInt542;
					}
				}
				if ((i_7_ ^ 0xffffffff) < -1) {
					try {
						anOutputStream523.write(aByteArray545, i, i_7_);
					} catch (IOException ioexception) {
						aBoolean526 = true;
					}
					anInt542 = (anInt542 - -i_7_) % 5000;
					try {
						if (anInt542 == anInt533) {
							anOutputStream523.flush();
						}
					} catch (IOException ioexception) {
						aBoolean526 = true;
					}
				}
			}
			try {
				if (anInputStream546 != null) {
					anInputStream546.close();
				}
				if (anOutputStream523 != null) {
					anOutputStream523.close();
				}
				if (aSocket536 != null) {
					aSocket536.close();
				}
			} catch (IOException ioexception) {
				/* empty */
			}
			aByteArray545 = null;
		} catch (Exception exception) {
			Class26.method925(95, exception, null);
		}
	}
	
	public static void method972(byte b) {
		aClass16_539 = null;
		aClass16_540 = null;
		aClass16_528 = null;
		aClass16_541 = null;
		aClass16_529 = null;
		if (b != 25) {
			method975(-110, -52);
		}
	}
	
	protected final void finalize() {
		anInt525++;
		method976(false);
	}
	
	final int read(int i) throws IOException {
		if (i >= -7) {
			return 57;
		}
		anInt527++;
		if (aBoolean538) {
			return 0;
		}
		return anInputStream546.available();
	}
	
	final void method974(int i, int i_8_, int i_9_, byte[] bs) throws IOException {
		if (i_8_ < 98) {
			method976(true);
		}
		anInt537++;
		if (!aBoolean538) {
			int i_10_ = 0;
			for (/**/; (i ^ 0xffffffff) < -1; i -= i_10_) {
				i_10_ = anInputStream546.read(bs, i_9_, i);
				if ((i_10_ ^ 0xffffffff) >= -1) {
					throw new EOFException();
				}
				i_9_ += i_10_;
			}
		}
	}
	
	static final Class23_Sub13_Sub18 method975(int i, int i_11_) {
		anInt543++;
		Class23_Sub13_Sub18 class23_sub13_sub18 = (Class23_Sub13_Sub18) Class87.aClass5_1488.method62(-39, (long) i);
		if (class23_sub13_sub18 != null) {
			return class23_sub13_sub18;
		}
		byte[] bs = Class87_Sub2.aClass105_2801.method1544(i, i_11_ + -100, 3);
		if (i_11_ != 100) {
			method970((byte) 12, 63, -52, 75, 30);
		}
		class23_sub13_sub18 = new Class23_Sub13_Sub18();
		if (bs != null) {
			class23_sub13_sub18.method793(-82, new Buffer(bs));
		}
		Class87.aClass5_1488.method67((long) i, class23_sub13_sub18, true);
		return class23_sub13_sub18;
	}
	
	final void method976(boolean bool) {
		anInt532++;
		if (!aBoolean538) {
			if (bool != false) {
				aBoolean526 = true;
			}
			synchronized (this) {
				aBoolean538 = true;
				this.notifyAll();
			}
			if (aClass60_530 != null) {
				while ((aClass60_530.anInt951 ^ 0xffffffff) == -1)
					Class105.method1545((byte) -88, 1L);
				if (aClass60_530.anInt951 == 1) {
					try {
						((Thread) aClass60_530.anObject955).join();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
			aClass60_530 = null;
		}
	}
	
	final void method977(int i, int i_12_, int i_13_, byte[] bs) throws IOException {
		anInt535++;
		if (!aBoolean538) {
			if (aBoolean526) {
				aBoolean526 = false;
				throw new IOException();
			}
			if (aByteArray545 == null) {
				aByteArray545 = new byte[5000];
			}
			synchronized (this) {
				for (int i_14_ = 0; i_12_ > i_14_; i_14_++) {
					aByteArray545[anInt533] = bs[i_13_ + i_14_];
					anInt533 = (1 + anInt533) % 5000;
					if (anInt533 == (4900 + anInt542) % 5000) {
						throw new IOException();
					}
				}
				if (aClass60_530 == null) {
					aClass60_530 = aClass9_544.method104(3, this, (byte) 72);
				}
				this.notifyAll();
				if (i != 30000) {
					aByteArray545 = null;
				}
			}
		}
	}
	
	Class34(Socket socket, Class9 class9) throws IOException {
		anInt533 = 0;
		aClass9_544 = class9;
		aSocket536 = socket;
		aSocket536.setSoTimeout(30000);
		aSocket536.setTcpNoDelay(true);
		anInputStream546 = aSocket536.getInputStream();
		anOutputStream523 = aSocket536.getOutputStream();
	}
	
	static {
		aClass16_528 = Class38_Sub6.method1076((byte) 86, "mem=");
		aClass16_541 = Class38_Sub6.method1076((byte) 86, "Unable to find ");
		aClass16_539 = Class38_Sub6.method1076((byte) 86, "http:)4)4www)3runescape)3com)4l=");
		aClass16_529 = aClass16_541;
	}
}
